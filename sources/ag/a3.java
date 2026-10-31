package ag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.dt;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.o5;
import org.telegram.messenger.ot;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import th.e5;
import th.w5;
import vh.r6;
public final class a3 implements Runnable {
    public final int f460a;
    public final Object f461b;
    public final Object f462c;
    public final long d;
    public final Object e;

    public a3(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f460a = i10;
        this.f461b = obj;
        this.d = j10;
        this.f462c = obj2;
        this.e = obj3;
    }

    private final void a() {
        org.telegram.ui.Wallet.h0 h0Var;
        String message;
        byte[] bArr;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr2;
        byte[] bArr3;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f461b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.f462c;
        long j10 = this.d;
        org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.e;
        byte[] bArr4 = null;
        for (int i10 = 0; i10 < encryptedsecretphrasepartArr.length; i10++) {
            try {
                byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i10].data, 0, 32);
                byte[] bArr5 = encryptedsecretphrasepartArr[i10].data;
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, 32, bArr5.length);
                long key_from_public_key = ConferenceCall.key_from_public_key(copyOfRange);
                byte[] decrypt_message_for_one = ConferenceCall.decrypt_message_for_one(ConferenceCall.key_from_ecdh(j10, key_from_public_key), copyOfRange2);
                ConferenceCall.key_destroy(key_from_public_key);
                SerializedData serializedData = new SerializedData(decrypt_message_for_one);
                try {
                    mnemonic_decryptedkeypart = TL_wallet.mnemonic_decryptedKeyPart.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    if (mnemonic_decryptedkeypart != null) {
                        try {
                            byte[] bArr6 = mnemonic_decryptedkeypart.share;
                            if (bArr6 != null) {
                                if (bArr4 == null) {
                                    bArr4 = (byte[]) bArr6.clone();
                                } else if (bArr6.length != bArr4.length) {
                                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: part " + i10 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
                                    jVar.a(null, "WALLET_PART_SHARE_UNEQUAL_LENGHTS");
                                    byte[] bArr7 = mnemonic_decryptedkeypart.share;
                                    if (bArr7 != null) {
                                        Arrays.fill(bArr7, (byte) 0);
                                    }
                                    Arrays.fill(decrypt_message_for_one, (byte) 0);
                                    serializedData.cleanup();
                                    Arrays.fill(bArr4, (byte) 0);
                                    return;
                                } else {
                                    for (int i11 = 0; i11 < bArr4.length; i11++) {
                                        bArr4[i11] = (byte) (bArr4[i11] ^ mnemonic_decryptedkeypart.share[i11]);
                                    }
                                }
                                byte[] bArr8 = mnemonic_decryptedkeypart.share;
                                if (bArr8 != null) {
                                    Arrays.fill(bArr8, (byte) 0);
                                }
                                Arrays.fill(decrypt_message_for_one, (byte) 0);
                                serializedData.cleanup();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (mnemonic_decryptedkeypart != null && (bArr2 = mnemonic_decryptedkeypart.share) != null) {
                                Arrays.fill(bArr2, (byte) 0);
                            }
                            Arrays.fill(decrypt_message_for_one, (byte) 0);
                            serializedData.cleanup();
                            throw th;
                        }
                    }
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: couldn't decrypt " + i10 + " part");
                    jVar.a(null, "WALLET_PART_" + i10 + "_CANT_DECRYPT");
                    if (mnemonic_decryptedkeypart != null && (bArr3 = mnemonic_decryptedkeypart.share) != null) {
                        Arrays.fill(bArr3, (byte) 0);
                    }
                    Arrays.fill(decrypt_message_for_one, (byte) 0);
                    serializedData.cleanup();
                    if (bArr4 != null) {
                        Arrays.fill(bArr4, (byte) 0);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    mnemonic_decryptedkeypart = null;
                }
            } catch (Throwable th4) {
                th = th4;
                h0Var = null;
            }
        }
        if (bArr4 == null) {
            org.telegram.ui.Wallet.k0.j("getSecretPhrase: no parts???");
            jVar.a(null, "WALLET_NO_PARTS");
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
                return;
            }
            return;
        }
        h0Var = new org.telegram.ui.Wallet.h0(bArr4);
        try {
            Arrays.fill(bArr4, (byte) 0);
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(h0Var);
            TL_wallet.WalletState walletState = k0Var.e;
            if (walletState instanceof TL_wallet.TL_walletState) {
                bArr = ((TL_wallet.TL_walletState) walletState).public_key;
            } else {
                bArr = null;
            }
            if (secretPhraseToPublicKey != null && bArr != null && Arrays.equals(secretPhraseToPublicKey, bArr)) {
                Arrays.fill(bArr4, (byte) 0);
                org.telegram.ui.Wallet.k0.H("getSecretPhrase, received the phrase!");
                jVar.a(h0Var, null);
                return;
            }
            org.telegram.ui.Wallet.k0.j("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr) + " derived=" + Utilities.f(secretPhraseToPublicKey));
            h0Var.close();
            jVar.a(null, "WALLET_WORDS_DONT_MATCH");
            Arrays.fill(bArr4, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            if (h0Var != null) {
                try {
                    h0Var.close();
                } catch (Throwable th6) {
                    if (bArr4 != null) {
                        Arrays.fill(bArr4, (byte) 0);
                    }
                    throw th6;
                }
            }
            if (th.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = th.getMessage();
            }
            jVar.a(null, message);
            org.telegram.ui.Wallet.k0.k("getSecretPhrase: encryption error", th);
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
            }
        }
    }

    private final void b() {
        int i10;
        char c10;
        boolean z10;
        int i11;
        TL_stories.TL_updateStory tL_updateStory;
        TL_stories.PeerStories peerStories;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        boolean z11;
        boolean z12;
        boolean z13;
        e5 e5Var = (e5) this.f461b;
        TL_stories.TL_updateStory tL_updateStory2 = (TL_stories.TL_updateStory) this.f462c;
        TLRPC.User user = (TLRPC.User) this.e;
        ArrayList arrayList2 = e5Var.h;
        ArrayList arrayList3 = e5Var.f48908g;
        int i12 = e5Var.f48904a;
        StringBuilder sb2 = new StringBuilder("StoriesController update stories for dialog ");
        long j10 = this.d;
        sb2.append(j10);
        f8.b(sb2.toString());
        e5Var.q0(j10, Collections.singletonList(tL_updateStory2.story), false);
        e5Var.o0(j10, Collections.singletonList(tL_updateStory2.story), true);
        a0.h hVar = e5Var.f48909i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        ArrayList arrayList4 = new ArrayList();
        int i13 = e5Var.f48921u;
        if (peerStories2 != null) {
            TL_stories.StoryItem storyItem3 = tL_updateStory2.story;
            c10 = 1;
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                i10 = i13;
                peerStories = peerStories2;
                tL_updateStory = tL_updateStory2;
                arrayList = arrayList4;
                storyItem = storyItem3;
                ot.f17304k0.c(new dt(ot.t(i12), j10, storyItem3.f20031id, 0));
            } else {
                tL_updateStory = tL_updateStory2;
                peerStories = peerStories2;
                arrayList = arrayList4;
                i10 = i13;
                storyItem = storyItem3;
            }
            int i14 = 0;
            while (true) {
                if (i14 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i14).f20031id == storyItem.f20031id) {
                        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i14);
                            i0.a.p(storyItem.f20031id, new StringBuilder("StoriesController remove story id="));
                            storyItem2 = storyItem;
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem4 = peerStories.stories.get(i14);
                            storyItem2 = e5.f(storyItem4, storyItem);
                            arrayList.add(storyItem2);
                            peerStories.stories.set(i14, storyItem2);
                            if (storyItem2.attachPath == null) {
                                storyItem2.attachPath = storyItem4.attachPath;
                            }
                            if (storyItem2.firstFramePath == null) {
                                storyItem2.firstFramePath = storyItem4.firstFramePath;
                            }
                            i0.a.p(storyItem2.f20031id, new StringBuilder("StoriesController update story id="));
                            z11 = true;
                        }
                    } else {
                        i14++;
                    }
                } else {
                    storyItem2 = storyItem;
                    z11 = false;
                    break;
                }
            }
            z12 = false;
            if (!z11) {
                if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                    f8.b("StoriesController can't add new story DELETED");
                    return;
                } else if (w5.w(i12, storyItem2)) {
                    f8.b("StoriesController can't add new story isExpired");
                    return;
                } else if (j10 > 0 && (user == null || (!user.self && !e5Var.O(user)))) {
                    f8.b("StoriesController can't add new story user is not contact");
                    return;
                } else {
                    arrayList.add(storyItem2);
                    peerStories.stories.add(storyItem2);
                    f8.b("StoriesController add new story id=" + storyItem2.f20031id + " total stories count " + peerStories.stories.size());
                    e5Var.Z(j10, storyItem2);
                    e5Var.g(peerStories);
                    z13 = true;
                    z12 = true;
                }
            } else {
                z13 = false;
            }
            if (z12) {
                if (peerStories.stories.isEmpty() && !e5Var.M(j10)) {
                    arrayList3.remove(peerStories);
                    arrayList2.remove(peerStories);
                    hVar.l(o5.o(peerStories.peer));
                    e5Var.f48921u--;
                } else {
                    Collections.sort(peerStories.stories, e5.X);
                }
                z13 = true;
            }
            z10 = z13;
            tL_updateStory2 = tL_updateStory;
        } else {
            i10 = i13;
            c10 = 1;
            TL_stories.StoryItem storyItem5 = tL_updateStory2.story;
            if (storyItem5 instanceof TL_stories.TL_storyItemDeleted) {
                f8.b("StoriesController can't add user " + j10 + " with new story DELETED");
                return;
            } else if (w5.w(i12, storyItem5)) {
                f8.b("StoriesController can't add user " + j10 + " with new story isExpired");
                return;
            } else if (j10 > 0 && (user == null || (!user.self && !e5Var.O(user)))) {
                f8.b("StoriesController can't add user cause is not contact");
                return;
            } else {
                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                tL_peerStories.peer = tL_updateStory2.peer;
                tL_peerStories.stories.add(tL_updateStory2.story);
                i0.a.p(tL_updateStory2.story.f20031id, new StringBuilder("StoriesController add new user with story id="));
                long o10 = o5.o(tL_peerStories.peer);
                e5Var.e0(o10, tL_peerStories);
                if (o10 != d20.i(d20.f15147s0).f15165n) {
                    TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(o10));
                    e5Var.g(tL_peerStories);
                    if (Z1 != null && !Z1.stories_hidden) {
                        e5Var.a0(tL_peerStories);
                    }
                }
                f8.b("StoriesController applyNewStories " + o10);
                e5Var.q0(o10, tL_peerStories.stories, false);
                e5Var.f48921u = e5Var.f48921u + 1;
                e5Var.R(j10);
                z10 = true;
            }
        }
        if (i10 != e5Var.f48921u) {
            e5Var.f48912l.edit().putInt("total_stores", e5Var.f48921u).apply();
        }
        e5Var.v(arrayList3);
        e5Var.v(arrayList2);
        if (z10) {
            if (tL_updateStory2.story instanceof TL_stories.TL_storyItemDeleted) {
                zs f7 = zs.f(i12);
                Long valueOf = Long.valueOf(j10);
                Integer valueOf2 = Integer.valueOf(tL_updateStory2.story.f20031id);
                Object[] objArr = new Object[2];
                i11 = 0;
                objArr[0] = valueOf;
                objArr[c10] = valueOf2;
                f7.k(zs.f19716w5, objArr);
            } else {
                i11 = 0;
            }
            zs.f(i12).k(zs.f19709v5, new Object[i11]);
        }
        vp.r1(i12).D();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ag.a3.run():void");
    }

    public a3(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f460a = i10;
        this.f461b = obj;
        this.f462c = obj2;
        this.d = j10;
        this.e = obj3;
    }

    public a3(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f460a = i10;
        this.f461b = obj;
        this.f462c = obj2;
        this.e = obj3;
        this.d = j10;
    }

    public a3(r6 r6Var, TLRPC.Chat chat, hs hsVar, long j10) {
        this.f460a = 27;
        this.f461b = r6Var;
        this.e = chat;
        this.f462c = hsVar;
        this.d = j10;
    }
}
