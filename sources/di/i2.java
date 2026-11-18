package di;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ef;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.x10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.s20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.f40;
import org.telegram.ui.o80;
import org.telegram.ui.p80;
import org.telegram.ui.ve0;
public final class i2 implements Runnable {
    public final int f9002a;
    public final Object f9003b;
    public final long f9004c;
    public final Object d;
    public final Object f9005e;

    public i2(x8 x8Var, Object obj, long j3, Object obj2, int i7) {
        this.f9002a = i7;
        this.d = x8Var;
        this.f9003b = obj;
        this.f9004c = j3;
        this.f9005e = obj2;
    }

    private final void a() {
        f40 f40Var = (f40) this.f9003b;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
        TLRPC.User user = (TLRPC.User) this.f9005e;
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        if (t3Var != null && !f40Var.f47494n2) {
            t3Var.a(this.f9004c);
            f40Var.R0(true);
            s20 s20Var = f40Var.D3;
            if (s20Var != null) {
                s20Var.dismiss();
            }
            try {
                u1VarArr[0].dismiss();
            } catch (Throwable unused) {
            }
            u1VarArr[0] = null;
            f40Var.o1().k(0L, 34, user, f40Var.U2, null, null);
        }
    }

    private final void b() {
        p80 p80Var = (p80) this.f9003b;
        LaunchActivity launchActivity = p80Var.h;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f9005e;
        if (str != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(launchActivity.P);
            int i7 = a10.f23221a;
            mp u12 = mp.u1(i7);
            long j3 = this.f9004c;
            long j10 = -j3;
            org.telegram.messenger.t3 i12 = u12.i1(j10, false, null);
            if (i12 != null) {
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(j10));
                mp.u1(i7).l1(j3);
                org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf(!i12.f26937b.rtmp_stream), launchActivity, h2Var, a10);
                return;
            }
            TLRPC.ChatFull P0 = mp.u1(i7).P0(j10);
            if (P0 != null) {
                if (P0.call == null) {
                    if (h2Var.getParentActivity() != null) {
                        org.telegram.messenger.f3.n(null, 2131748960, org.telegram.ui.Components.lc.b0(h2Var), 2131624080, 36);
                        return;
                    }
                    return;
                }
                mp.u1(i7).i1(j10, true, new o80(p80Var, a10, j3, h2Var, 0));
            }
        }
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.f9003b;
        String str = (String) this.d;
        ef efVar = (ef) this.f9005e;
        Drawable[] drawableArr = PhotoViewer.Z8;
        long j3 = this.f9004c;
        bi.e2 e2Var = new bi.e2(photoViewer, str, efVar, j3, 7);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            org.telegram.messenger.g0.A0(photoViewer.D2, createBitmap, new ve0(20, e2Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            e2Var.a(zy.s(efVar.I, j3, null, true));
        } else {
            e2Var.a(bitmap);
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.r0 r0Var;
        String message;
        byte[] bArr;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr2;
        byte[] bArr3;
        org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.f9003b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j3 = this.f9004c;
        org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.f9005e;
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
                                    org.telegram.ui.Wallet.u0.n("getSecretPhrase: part " + i7 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
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
                    org.telegram.ui.Wallet.u0.n("getSecretPhrase: couldn't decrypt " + i7 + " part");
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
                r0Var = null;
            }
        }
        if (bArr4 == null) {
            org.telegram.ui.Wallet.u0.n("getSecretPhrase: no parts???");
            jVar.a(null, "WALLET_NO_PARTS");
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
                return;
            }
            return;
        }
        r0Var = new org.telegram.ui.Wallet.r0(bArr4);
        try {
            Arrays.fill(bArr4, (byte) 0);
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(r0Var);
            TL_wallet.WalletState walletState = u0Var.f45086e;
            if (walletState instanceof TL_wallet.TL_walletState) {
                bArr = ((TL_wallet.TL_walletState) walletState).public_key;
            } else {
                bArr = null;
            }
            if (secretPhraseToPublicKey != null && bArr != null && Arrays.equals(secretPhraseToPublicKey, bArr)) {
                Arrays.fill(bArr4, (byte) 0);
                org.telegram.ui.Wallet.u0.P("getSecretPhrase, received the phrase!");
                jVar.a(r0Var, null);
                return;
            }
            org.telegram.ui.Wallet.u0.n("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr) + " derived=" + Utilities.f(secretPhraseToPublicKey));
            r0Var.close();
            jVar.a(null, "WALLET_WORDS_DONT_MATCH");
            Arrays.fill(bArr4, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            if (r0Var != null) {
                try {
                    r0Var.close();
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
            org.telegram.ui.Wallet.u0.o("getSecretPhrase: encryption error", th);
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
            }
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.f9003b;
        x10 x10Var = (x10) this.f9005e;
        String str = (String) this.d;
        if (x10Var != null) {
            if (this.f9004c != z0Var.l()) {
                str = "STORAGE_CANCELED";
            }
            x10Var.a(str);
            return;
        }
        z0Var.getClass();
    }

    private final void g() {
        org.telegram.ui.Wallet.r0 r0Var;
        org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.f9003b;
        org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.d;
        x10 x10Var = (x10) this.f9005e;
        try {
            if (this.f9004c == z0Var.l()) {
                r0Var = r0Var2;
            } else {
                r0Var = null;
            }
            x10Var.a(r0Var);
        } finally {
            if (r0Var2 != null) {
                r0Var2.close();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.i2.run():void");
    }

    public i2(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f9002a = i7;
        this.f9003b = obj;
        this.f9004c = j3;
        this.d = obj2;
        this.f9005e = obj3;
    }

    public i2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f9002a = i7;
        this.f9003b = obj;
        this.d = obj2;
        this.f9004c = j3;
        this.f9005e = obj3;
    }

    public i2(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f9002a = i7;
        this.f9003b = obj;
        this.d = obj2;
        this.f9005e = obj3;
        this.f9004c = j3;
    }

    public i2(org.telegram.ui.Wallet.z0 z0Var, x10 x10Var, long j3, String str) {
        this.f9002a = 24;
        this.f9003b = z0Var;
        this.f9005e = x10Var;
        this.f9004c = j3;
        this.d = str;
    }
}
