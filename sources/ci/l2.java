package ci;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.ye;
import org.telegram.messenger.yy;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.hk0;
import org.telegram.ui.j80;
import org.telegram.ui.k80;
import org.telegram.ui.pp;
import org.telegram.ui.x30;
public final class l2 implements Runnable {
    public final int f5433a;
    public final Object f5434b;
    public final long f5435c;
    public final Object d;
    public final Object f5436e;

    public l2(e9 e9Var, Object obj, long j10, Object obj2, int i3) {
        this.f5433a = i3;
        this.d = e9Var;
        this.f5434b = obj;
        this.f5435c = j10;
        this.f5436e = obj2;
    }

    private final void a() {
        x30 x30Var = (x30) this.f5434b;
        org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.d;
        TLRPC.User user = (TLRPC.User) this.f5436e;
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        if (r3Var != null && !x30Var.f51755k2) {
            r3Var.a(this.f5435c);
            x30Var.Q0(true);
            d20 d20Var = x30Var.f51812w3;
            if (d20Var != null) {
                d20Var.dismiss();
            }
            try {
                s1VarArr[0].dismiss();
            } catch (Throwable unused) {
            }
            s1VarArr[0] = null;
            x30Var.m1().k(0L, 34, user, x30Var.R2, null, null);
        }
    }

    private final void b() {
        TLObject tLObject = (TLObject) this.f5434b;
        hp hpVar = (hp) this.d;
        pp ppVar = (pp) this.f5436e;
        String str = LaunchActivity.E1;
        if (tLObject instanceof TL_stories.TL_stories_peerStories) {
            TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
            hpVar.Y3(tL_stories_peerStories.users, false);
            hpVar.P1().d0(this.f5435c, tL_stories_peerStories.stories);
            ppVar.run();
            return;
        }
        ppVar.run();
    }

    private final void c() {
        k80 k80Var = (k80) this.f5434b;
        LaunchActivity launchActivity = k80Var.h;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f5436e;
        if (str != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(launchActivity.P);
            int i3 = a10.f21919a;
            hp s12 = hp.s1(i3);
            long j10 = this.f5435c;
            long j11 = -j10;
            org.telegram.messenger.r3 g12 = s12.g1(j11, false, null);
            if (g12 != null) {
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(j11));
                hp.s1(i3).j1(j10);
                org.telegram.ui.Components.voip.n1.l(M0, null, false, Boolean.valueOf(!g12.f25049b.rtmp_stream), launchActivity, d2Var, a10);
                return;
            }
            TLRPC.ChatFull N0 = hp.s1(i3).N0(j11);
            if (N0 != null) {
                if (N0.call == null) {
                    if (d2Var.getParentActivity() != null) {
                        org.telegram.messenger.k5.o(null, 2131749160, org.telegram.ui.Components.fc.a0(d2Var), 2131624079, 36);
                        return;
                    }
                    return;
                }
                hp.s1(i3).g1(j11, true, new j80(k80Var, a10, j10, d2Var, 0));
            }
        }
    }

    private final void e() {
        PhotoViewer photoViewer = (PhotoViewer) this.f5434b;
        String str = (String) this.d;
        ye yeVar = (ye) this.f5436e;
        Drawable[] drawableArr = PhotoViewer.V8;
        long j10 = this.f5435c;
        ai.m1 m1Var = new ai.m1(photoViewer, str, yeVar, j10, 7);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            org.telegram.messenger.g0.A0(photoViewer.D2, createBitmap, new hk0(3, m1Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            m1Var.a(yy.s(yeVar.I, j10, null, true));
        } else {
            m1Var.a(bitmap);
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.h0 h0Var;
        String message;
        byte[] bArr;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr2;
        byte[] bArr3;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f5434b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j10 = this.f5435c;
        org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.f5436e;
        byte[] bArr4 = null;
        for (int i3 = 0; i3 < encryptedsecretphrasepartArr.length; i3++) {
            try {
                byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i3].data, 0, 32);
                byte[] bArr5 = encryptedsecretphrasepartArr[i3].data;
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
                                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: part " + i3 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
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
                                    for (int i10 = 0; i10 < bArr4.length; i10++) {
                                        bArr4[i10] = (byte) (bArr4[i10] ^ mnemonic_decryptedkeypart.share[i10]);
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
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: couldn't decrypt " + i3 + " part");
                    jVar.a(null, "WALLET_PART_" + i3 + "_CANT_DECRYPT");
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
            TL_wallet.WalletState walletState = k0Var.f42721e;
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

    private final void g() {
        org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.f5434b;
        u10 u10Var = (u10) this.f5436e;
        String str = (String) this.d;
        if (u10Var != null) {
            if (this.f5435c != o0Var.l()) {
                str = "STORAGE_CANCELED";
            }
            u10Var.a(str);
            return;
        }
        o0Var.getClass();
    }

    private final void h() {
        org.telegram.ui.Wallet.h0 h0Var;
        org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.f5434b;
        org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.d;
        u10 u10Var = (u10) this.f5436e;
        try {
            if (this.f5435c == o0Var.l()) {
                h0Var = h0Var2;
            } else {
                h0Var = null;
            }
            u10Var.a(h0Var);
        } finally {
            if (h0Var2 != null) {
                h0Var2.close();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.l2.run():void");
    }

    public l2(e9 e9Var, u10 u10Var, TL_stars.StarGift starGift, long j10) {
        this.f5433a = 4;
        this.d = e9Var;
        this.f5436e = u10Var;
        this.f5434b = starGift;
        this.f5435c = j10;
    }

    public l2(Object obj, long j10, Object obj2, Object obj3, int i3) {
        this.f5433a = i3;
        this.f5434b = obj;
        this.f5435c = j10;
        this.d = obj2;
        this.f5436e = obj3;
    }

    public l2(Object obj, Object obj2, long j10, Object obj3, int i3) {
        this.f5433a = i3;
        this.f5434b = obj;
        this.d = obj2;
        this.f5435c = j10;
        this.f5436e = obj3;
    }

    public l2(Object obj, Object obj2, Object obj3, long j10, int i3) {
        this.f5433a = i3;
        this.f5434b = obj;
        this.d = obj2;
        this.f5436e = obj3;
        this.f5435c = j10;
    }

    public l2(org.telegram.ui.Wallet.o0 o0Var, u10 u10Var, long j10, String str) {
        this.f5433a = 25;
        this.f5434b = o0Var;
        this.f5436e = u10Var;
        this.f5435c = j10;
        this.d = str;
    }
}
