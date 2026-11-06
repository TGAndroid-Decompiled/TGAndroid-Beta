package bi;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.gf;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.h20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.c40;
import org.telegram.ui.m80;
import org.telegram.ui.n80;
import org.telegram.ui.rp;
import org.telegram.ui.zc0;
public final class w2 implements Runnable {
    public final int f4952a;
    public final Object f4953b;
    public final long f4954c;
    public final Object d;
    public final Object f4955e;

    public w2(ea eaVar, Object obj, long j3, Object obj2, int i7) {
        this.f4952a = i7;
        this.d = eaVar;
        this.f4953b = obj;
        this.f4954c = j3;
        this.f4955e = obj2;
    }

    private final void a() {
        c40 c40Var = (c40) this.f4953b;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
        TLRPC.User user = (TLRPC.User) this.f4955e;
        org.telegram.messenger.r3 r3Var = c40Var.R2;
        if (r3Var != null && !c40Var.f44562j2) {
            r3Var.a(this.f4954c);
            c40Var.Q0(true);
            h20 h20Var = c40Var.f44617v3;
            if (h20Var != null) {
                h20Var.dismiss();
            }
            try {
                u1VarArr[0].dismiss();
            } catch (Throwable unused) {
            }
            u1VarArr[0] = null;
            c40Var.n1().k(0L, 34, user, c40Var.Q2, null, null);
        }
    }

    private final void b() {
        TLObject tLObject = (TLObject) this.f4953b;
        qp qpVar = (qp) this.d;
        rp rpVar = (rp) this.f4955e;
        String str = LaunchActivity.B1;
        if (tLObject instanceof TL_stories.TL_stories_peerStories) {
            TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
            qpVar.Y3(tL_stories_peerStories.users, false);
            qpVar.P1().d0(this.f4954c, tL_stories_peerStories.stories);
            rpVar.run();
            return;
        }
        rpVar.run();
    }

    private final void c() {
        n80 n80Var = (n80) this.f4953b;
        LaunchActivity launchActivity = n80Var.h;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f4955e;
        if (str != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(launchActivity.O);
            int i7 = a10.f21723a;
            qp s12 = qp.s1(i7);
            long j3 = this.f4954c;
            long j10 = -j3;
            org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
            if (g12 != null) {
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(j10));
                qp.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.y1.l(M0, null, false, Boolean.valueOf(!g12.f25201b.rtmp_stream), launchActivity, f2Var, a10);
                return;
            }
            TLRPC.ChatFull N0 = qp.s1(i7).N0(j10);
            if (N0 != null) {
                if (N0.call == null) {
                    if (f2Var.getParentActivity() != null) {
                        org.telegram.messenger.k5.o(null, 2131749151, org.telegram.ui.Components.hc.a0(f2Var), 2131624079, 36);
                        return;
                    }
                    return;
                }
                qp.s1(i7).g1(j10, true, new m80(n80Var, a10, j3, f2Var, 0));
            }
        }
    }

    private final void d() {
        PhotoViewer photoViewer = (PhotoViewer) this.f4953b;
        String str = (String) this.d;
        gf gfVar = (gf) this.f4955e;
        Drawable[] drawableArr = PhotoViewer.Y8;
        long j3 = this.f4954c;
        r2 r2Var = new r2(photoViewer, str, gfVar, j3, 6);
        if (photoViewer.D2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
            org.telegram.messenger.g0.A0(photoViewer.C2, createBitmap, new zc0(29, r2Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.B2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
        if (bitmap == null) {
            r2Var.a(gz.s(gfVar.I, j3, null, true));
        } else {
            r2Var.a(bitmap);
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.k0 k0Var;
        String message;
        byte[] bArr;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr2;
        byte[] bArr3;
        org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) this.f4953b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j3 = this.f4954c;
        org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.f4955e;
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
                                    org.telegram.ui.Wallet.n0.j("getSecretPhrase: part " + i7 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
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
                    org.telegram.ui.Wallet.n0.j("getSecretPhrase: couldn't decrypt " + i7 + " part");
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
                k0Var = null;
            }
        }
        if (bArr4 == null) {
            org.telegram.ui.Wallet.n0.j("getSecretPhrase: no parts???");
            jVar.a(null, "WALLET_NO_PARTS");
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
                return;
            }
            return;
        }
        k0Var = new org.telegram.ui.Wallet.k0(bArr4);
        try {
            Arrays.fill(bArr4, (byte) 0);
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(k0Var);
            TL_wallet.WalletState walletState = n0Var.f42771e;
            if (walletState instanceof TL_wallet.TL_walletState) {
                bArr = ((TL_wallet.TL_walletState) walletState).public_key;
            } else {
                bArr = null;
            }
            if (secretPhraseToPublicKey != null && bArr != null && Arrays.equals(secretPhraseToPublicKey, bArr)) {
                Arrays.fill(bArr4, (byte) 0);
                org.telegram.ui.Wallet.n0.H("getSecretPhrase, received the phrase!");
                jVar.a(k0Var, null);
                return;
            }
            org.telegram.ui.Wallet.n0.j("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr) + " derived=" + Utilities.f(secretPhraseToPublicKey));
            k0Var.close();
            jVar.a(null, "WALLET_WORDS_DONT_MATCH");
            Arrays.fill(bArr4, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            if (k0Var != null) {
                try {
                    k0Var.close();
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
            org.telegram.ui.Wallet.n0.k("getSecretPhrase: encryption error", th);
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
            }
        }
    }

    private final void g() {
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f4953b;
        c20 c20Var = (c20) this.f4955e;
        String str = (String) this.d;
        if (c20Var != null) {
            if (this.f4954c != r0Var.l()) {
                str = "STORAGE_CANCELED";
            }
            c20Var.a(str);
            return;
        }
        r0Var.getClass();
    }

    private final void h() {
        org.telegram.ui.Wallet.k0 k0Var;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f4953b;
        org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.d;
        c20 c20Var = (c20) this.f4955e;
        try {
            if (this.f4954c == r0Var.l()) {
                k0Var = k0Var2;
            } else {
                k0Var = null;
            }
            c20Var.a(k0Var);
        } finally {
            if (k0Var2 != null) {
                k0Var2.close();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.w2.run():void");
    }

    public w2(ea eaVar, c20 c20Var, TL_stars.StarGift starGift, long j3) {
        this.f4952a = 4;
        this.d = eaVar;
        this.f4955e = c20Var;
        this.f4953b = starGift;
        this.f4954c = j3;
    }

    public w2(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f4952a = i7;
        this.f4953b = obj;
        this.f4954c = j3;
        this.d = obj2;
        this.f4955e = obj3;
    }

    public w2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f4952a = i7;
        this.f4953b = obj;
        this.d = obj2;
        this.f4954c = j3;
        this.f4955e = obj3;
    }

    public w2(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f4952a = i7;
        this.f4953b = obj;
        this.d = obj2;
        this.f4955e = obj3;
        this.f4954c = j3;
    }

    public w2(org.telegram.ui.Wallet.r0 r0Var, c20 c20Var, long j3, String str) {
        this.f4952a = 25;
        this.f4953b = r0Var;
        this.f4955e = c20Var;
        this.f4954c = j3;
        this.d = str;
    }
}
