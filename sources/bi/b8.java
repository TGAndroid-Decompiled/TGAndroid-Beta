package bi;

import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.fo;
import org.telegram.ui.yy;
public final class b8 implements Runnable {
    public final int f2877a;
    public final long f2878b;
    public final Object f2879c;
    public final Object d;
    public final Object e;

    public b8(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f2877a = i10;
        this.f2879c = obj;
        this.f2878b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    private final void a() {
        org.telegram.ui.Wallet.h0 h0Var;
        String message;
        byte[] bArr;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr2;
        byte[] bArr3;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f2879c;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j10 = this.f2878b;
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
                                    org.telegram.ui.Wallet.k0.i("getSecretPhrase: part " + i10 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
                                    jVar.run(null, "WALLET_PART_SHARE_UNEQUAL_LENGHTS");
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
                    org.telegram.ui.Wallet.k0.i("getSecretPhrase: couldn't decrypt " + i10 + " part");
                    jVar.run(null, "WALLET_PART_" + i10 + "_CANT_DECRYPT");
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
            org.telegram.ui.Wallet.k0.i("getSecretPhrase: no parts???");
            jVar.run(null, "WALLET_NO_PARTS");
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
                org.telegram.ui.Wallet.k0.E("getSecretPhrase, received the phrase!");
                jVar.run(h0Var, null);
                return;
            }
            org.telegram.ui.Wallet.k0.i("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.bytesToHex(bArr) + " derived=" + Utilities.bytesToHex(secretPhraseToPublicKey));
            h0Var.close();
            jVar.run(null, "WALLET_WORDS_DONT_MATCH");
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
            jVar.run(null, message);
            org.telegram.ui.Wallet.k0.j("getSecretPhrase: encryption error", th);
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
            }
        }
    }

    private final void b() {
        qi.q qVar = (qi.q) this.f2879c;
        qi.k kVar = (qi.k) this.d;
        long j10 = this.f2878b;
        byte[] bArr = (byte[]) this.e;
        if (qVar.f43438m != qi.o.h) {
            return;
        }
        long length = kVar.f43413b.length();
        qVar.a(kVar, length);
        synchronized (qVar.f43436k) {
            if (kVar.d && !kVar.e) {
                kVar.e = true;
                qVar.f43435j.execute(new qi.c(qVar, kVar, length, j10, 2));
                qVar.C = new qi.n(kVar.f43413b, j10, bArr);
                qVar.r(qi.o.f43425n);
                qVar.e.onCompleted(qVar.C);
                qVar.c();
                qVar.s();
                qVar.l("completed");
            }
        }
    }

    private final void c() {
        zh.r3.e0((zh.r3) this.f2879c, this.f2878b, (TL_stars.TL_starGiftUnique) this.d, (yy) this.e);
    }

    private final void d() {
        zh.r3 r3Var = (zh.r3) this.f2879c;
        r3Var.getClass();
        ((boolean[]) this.d)[0] = true;
        r3Var.f51089k0.setLoading(false);
        r3Var.w1(this.f2878b, (Utilities.Callback) this.e);
    }

    private final void f() {
        ((zh.n5) this.d).d0((MessageObject) this.e, ((zh.v3) this.f2879c).f51237a, this.f2878b, true, true, null);
    }

    private final void g() {
        zh.n5 n5Var = (zh.n5) this.f2879c;
        TLObject tLObject = (TLObject) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        if (tLObject instanceof TL_stars.starGiftUpgradePreview) {
            TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
            n5Var.M.put(Long.valueOf(this.f2878b), stargiftupgradepreview);
            callback.run(stargiftupgradepreview);
            return;
        }
        n5Var.getClass();
        callback.run(null);
    }

    private final void h() {
        zh.n5 n5Var = (zh.n5) this.f2879c;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
        if (!n5Var.e) {
            zh.n5.e("NO_BALANCE");
            callback.run(null);
            return;
        }
        n5Var.H(starGift, this.f2878b, null, true, callback);
    }

    private final void i() {
        CharSequence charSequence = (CharSequence) this.e;
        zc a02 = zc.a0((fo) this.f2879c);
        TLRPC.Document document = ((TL_stars.StarGift) this.d).sticker;
        String string = LocaleController.getString(R.string.StarsGiftCompleted);
        if (charSequence == null) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) this.f2878b, new Object[0]));
        }
        a02.s(document, string, charSequence).k(true);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.b8.run():void");
    }

    public b8(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f2877a = i10;
        this.f2879c = obj;
        this.d = obj2;
        this.f2878b = j10;
        this.e = obj3;
    }

    public b8(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f2877a = i10;
        this.f2879c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2878b = j10;
    }
}
