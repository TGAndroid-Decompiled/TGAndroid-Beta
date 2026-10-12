package ai;

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
import org.telegram.ui.eo;
import org.telegram.ui.vy;
public final class r8 implements Runnable {
    public final int f1663a;
    public final long f1664b;
    public final Object f1665c;
    public final Object d;
    public final Object f1666e;

    public r8(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f1663a = i10;
        this.f1665c = obj;
        this.f1664b = j3;
        this.d = obj2;
        this.f1666e = obj3;
    }

    private final void a() {
        org.telegram.ui.Wallet.i0 i0Var;
        String message;
        byte[] bArr;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr2;
        byte[] bArr3;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f1665c;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j3 = this.f1664b;
        org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.f1666e;
        byte[] bArr4 = null;
        for (int i10 = 0; i10 < encryptedsecretphrasepartArr.length; i10++) {
            try {
                byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i10].data, 0, 32);
                byte[] bArr5 = encryptedsecretphrasepartArr[i10].data;
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
                                    org.telegram.ui.Wallet.l0.i("getSecretPhrase: part " + i10 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
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
                    org.telegram.ui.Wallet.l0.i("getSecretPhrase: couldn't decrypt " + i10 + " part");
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
                i0Var = null;
            }
        }
        if (bArr4 == null) {
            org.telegram.ui.Wallet.l0.i("getSecretPhrase: no parts???");
            jVar.run(null, "WALLET_NO_PARTS");
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
            TL_wallet.WalletState walletState = l0Var.f34999e;
            if (walletState instanceof TL_wallet.TL_walletState) {
                bArr = ((TL_wallet.TL_walletState) walletState).public_key;
            } else {
                bArr = null;
            }
            if (secretPhraseToPublicKey != null && bArr != null && Arrays.equals(secretPhraseToPublicKey, bArr)) {
                Arrays.fill(bArr4, (byte) 0);
                org.telegram.ui.Wallet.l0.E("getSecretPhrase, received the phrase!");
                jVar.run(i0Var, null);
                return;
            }
            org.telegram.ui.Wallet.l0.i("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.bytesToHex(bArr) + " derived=" + Utilities.bytesToHex(secretPhraseToPublicKey));
            i0Var.close();
            jVar.run(null, "WALLET_WORDS_DONT_MATCH");
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
            jVar.run(null, message);
            org.telegram.ui.Wallet.l0.j("getSecretPhrase: encryption error", th);
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
            }
        }
    }

    private final void b() {
        pi.t tVar = (pi.t) this.f1665c;
        pi.n nVar = (pi.n) this.d;
        long j3 = this.f1664b;
        byte[] bArr = (byte[]) this.f1666e;
        if (tVar.f45830m != pi.r.h) {
            return;
        }
        long length = nVar.f45802b.length();
        tVar.a(nVar, length);
        synchronized (tVar.f45828k) {
            if (nVar.d && !nVar.f45804e) {
                nVar.f45804e = true;
                tVar.f45827j.execute(new pi.g(tVar, nVar, length, j3, 1));
                tVar.C = new pi.q(nVar.f45802b, j3, bArr);
                tVar.u(pi.r.f45816n);
                tVar.t();
                tVar.n("completed");
                tVar.f45823e.onCompleted(tVar.C);
            }
        }
    }

    private final void c() {
        yh.s3.e0((yh.s3) this.f1665c, this.f1664b, (TL_stars.TL_starGiftUnique) this.d, (vy) this.f1666e);
    }

    private final void e() {
        yh.s3 s3Var = (yh.s3) this.f1665c;
        s3Var.getClass();
        ((boolean[]) this.d)[0] = true;
        s3Var.f53415k0.setLoading(false);
        s3Var.w1(this.f1664b, (Utilities.Callback) this.f1666e);
    }

    private final void f() {
        ((yh.n5) this.d).d0((MessageObject) this.f1666e, ((yh.w3) this.f1665c).f53567a, this.f1664b, true, true, null);
    }

    private final void g() {
        yh.n5 n5Var = (yh.n5) this.f1665c;
        TLObject tLObject = (TLObject) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f1666e;
        if (tLObject instanceof TL_stars.starGiftUpgradePreview) {
            TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
            n5Var.M.put(Long.valueOf(this.f1664b), stargiftupgradepreview);
            callback.run(stargiftupgradepreview);
            return;
        }
        n5Var.getClass();
        callback.run(null);
    }

    private final void h() {
        yh.n5 n5Var = (yh.n5) this.f1665c;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        TL_stars.StarGift starGift = (TL_stars.StarGift) this.f1666e;
        if (!n5Var.f53149e) {
            yh.n5.e("NO_BALANCE");
            callback.run(null);
            return;
        }
        n5Var.H(starGift, this.f1664b, null, true, callback);
    }

    private final void i() {
        CharSequence charSequence = (CharSequence) this.f1666e;
        zc a02 = zc.a0((eo) this.f1665c);
        TLRPC.Document document = ((TL_stars.StarGift) this.d).sticker;
        String string = LocaleController.getString(R.string.StarsGiftCompleted);
        if (charSequence == null) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) this.f1664b, new Object[0]));
        }
        a02.s(document, string, charSequence).k(true);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.r8.run():void");
    }

    public r8(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f1663a = i10;
        this.f1665c = obj;
        this.d = obj2;
        this.f1664b = j3;
        this.f1666e = obj3;
    }

    public r8(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f1663a = i10;
        this.f1665c = obj;
        this.d = obj2;
        this.f1666e = obj3;
        this.f1664b = j3;
    }
}
