package di;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ez;
import org.telegram.messenger.ff;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.z10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.c40;
import org.telegram.ui.jd0;
import org.telegram.ui.m80;
import org.telegram.ui.n80;
import org.telegram.ui.tp;
public final class f2 implements Runnable {
    public final int f8527a;
    public final Object f8528b;
    public final long f8529c;
    public final Object d;
    public final Object f8530e;

    public f2(u8 u8Var, Object obj, long j3, Object obj2, int i7) {
        this.f8527a = i7;
        this.d = u8Var;
        this.f8528b = obj;
        this.f8529c = j3;
        this.f8530e = obj2;
    }

    private final void a() {
        c40 c40Var = (c40) this.f8528b;
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
        TLRPC.User user = (TLRPC.User) this.f8530e;
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        if (r3Var != null && !c40Var.f45936n2) {
            r3Var.a(this.f8529c);
            c40Var.Q0(true);
            k20 k20Var = c40Var.D3;
            if (k20Var != null) {
                k20Var.dismiss();
            }
            try {
                t1VarArr[0].dismiss();
            } catch (Throwable unused) {
            }
            t1VarArr[0] = null;
            c40Var.n1().k(0L, 34, user, c40Var.U2, null, null);
        }
    }

    private final void b() {
        TLObject tLObject = (TLObject) this.f8528b;
        np npVar = (np) this.d;
        tp tpVar = (tp) this.f8530e;
        String str = LaunchActivity.C1;
        if (tLObject instanceof TL_stories.TL_stories_peerStories) {
            TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
            npVar.Y3(tL_stories_peerStories.users, false);
            npVar.P1().d0(this.f8529c, tL_stories_peerStories.stories);
            tpVar.run();
            return;
        }
        tpVar.run();
    }

    private final void c() {
        n80 n80Var = (n80) this.f8528b;
        LaunchActivity launchActivity = n80Var.h;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f8530e;
        if (str != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(launchActivity.P);
            int i7 = a10.f22782a;
            np s12 = np.s1(i7);
            long j3 = this.f8529c;
            long j10 = -j3;
            org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
            if (g12 != null) {
                TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(j10));
                np.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.c2.l(M0, null, false, Boolean.valueOf(!g12.f26216b.rtmp_stream), launchActivity, e2Var, a10);
                return;
            }
            TLRPC.ChatFull N0 = np.s1(i7).N0(j10);
            if (N0 != null) {
                if (N0.call == null) {
                    if (e2Var.getParentActivity() != null) {
                        org.telegram.messenger.k5.n(null, 2131749152, org.telegram.ui.Components.cc.a0(e2Var), 2131624080, 36);
                        return;
                    }
                    return;
                }
                np.s1(i7).g1(j10, true, new m80(n80Var, a10, j3, e2Var, 0));
            }
        }
    }

    private final void d() {
        PhotoViewer photoViewer = (PhotoViewer) this.f8528b;
        String str = (String) this.d;
        ff ffVar = (ff) this.f8530e;
        Drawable[] drawableArr = PhotoViewer.Z8;
        long j3 = this.f8529c;
        bi.i1 i1Var = new bi.i1(photoViewer, str, ffVar, j3, 7);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            org.telegram.messenger.g0.A0(photoViewer.D2, createBitmap, new jd0(25, i1Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            i1Var.a(ez.s(ffVar.I, j3, null, true));
        } else {
            i1Var.a(bitmap);
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.i0 i0Var;
        String message;
        byte[] bArr;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr2;
        byte[] bArr3;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f8528b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j3 = this.f8529c;
        org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.f8530e;
        byte[] bArr4 = null;
        for (int i7 = 0; i7 < encryptedsecretphrasepartArr.length; i7++) {
            try {
                byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i7].data, 0, 32);
                byte[] bArr5 = encryptedsecretphrasepartArr[i7].data;
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, 32, bArr5.length);
                long key_from_public_key = ConferenceCall.key_from_public_key(copyOfRange);
                byte[] decrypt_message_for_one = ConferenceCall.decrypt_message_for_one(ConferenceCall.key_from_ecdh(j3, key_from_public_key), copyOfRange2);
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
                                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: part " + i7 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
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
                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: couldn't decrypt " + i7 + " part");
                    jVar.a(null, "WALLET_PART_" + i7 + "_CANT_DECRYPT");
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
                i0Var = null;
            }
        }
        if (bArr4 == null) {
            org.telegram.ui.Wallet.l0.j("getSecretPhrase: no parts???");
            jVar.a(null, "WALLET_NO_PARTS");
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
                return;
            }
            return;
        }
        i0Var = new org.telegram.ui.Wallet.i0(bArr4);
        try {
            Arrays.fill(bArr4, (byte) 0);
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(i0Var);
            TL_wallet.WalletState walletState = l0Var.f44081e;
            if (walletState instanceof TL_wallet.TL_walletState) {
                bArr = ((TL_wallet.TL_walletState) walletState).public_key;
            } else {
                bArr = null;
            }
            if (secretPhraseToPublicKey != null && bArr != null && Arrays.equals(secretPhraseToPublicKey, bArr)) {
                Arrays.fill(bArr4, (byte) 0);
                org.telegram.ui.Wallet.l0.H("getSecretPhrase, received the phrase!");
                jVar.a(i0Var, null);
                return;
            }
            org.telegram.ui.Wallet.l0.j("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr) + " derived=" + Utilities.f(secretPhraseToPublicKey));
            i0Var.close();
            jVar.a(null, "WALLET_WORDS_DONT_MATCH");
            Arrays.fill(bArr4, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            if (i0Var != null) {
                try {
                    i0Var.close();
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
            org.telegram.ui.Wallet.l0.k("getSecretPhrase: encryption error", th);
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
            }
        }
    }

    private final void g() {
        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.f8528b;
        z10 z10Var = (z10) this.f8530e;
        String str = (String) this.d;
        if (z10Var != null) {
            if (this.f8529c != p0Var.l()) {
                str = "STORAGE_CANCELED";
            }
            z10Var.a(str);
            return;
        }
        p0Var.getClass();
    }

    private final void h() {
        org.telegram.ui.Wallet.i0 i0Var;
        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.f8528b;
        org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.d;
        z10 z10Var = (z10) this.f8530e;
        try {
            if (this.f8529c == p0Var.l()) {
                i0Var = i0Var2;
            } else {
                i0Var = null;
            }
            z10Var.a(i0Var);
        } finally {
            if (i0Var2 != null) {
                i0Var2.close();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.f2.run():void");
    }

    public f2(u8 u8Var, z10 z10Var, TL_stars.StarGift starGift, long j3) {
        this.f8527a = 4;
        this.d = u8Var;
        this.f8530e = z10Var;
        this.f8528b = starGift;
        this.f8529c = j3;
    }

    public f2(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f8527a = i7;
        this.f8528b = obj;
        this.f8529c = j3;
        this.d = obj2;
        this.f8530e = obj3;
    }

    public f2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f8527a = i7;
        this.f8528b = obj;
        this.d = obj2;
        this.f8529c = j3;
        this.f8530e = obj3;
    }

    public f2(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f8527a = i7;
        this.f8528b = obj;
        this.d = obj2;
        this.f8530e = obj3;
        this.f8529c = j3;
    }

    public f2(org.telegram.ui.Wallet.p0 p0Var, z10 z10Var, long j3, String str) {
        this.f8527a = 25;
        this.f8528b = p0Var;
        this.f8530e = z10Var;
        this.f8529c = j3;
        this.d = str;
    }
}
