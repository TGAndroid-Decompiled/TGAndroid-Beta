package bi;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import java.util.Arrays;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.am0;
import org.telegram.ui.ka0;
import org.telegram.ui.la0;
import org.telegram.ui.x50;
public final class y2 implements Runnable {
    public final int f5750a;
    public final Object f5751b;
    public final long f5752c;
    public final Object d;
    public final Object e;

    public y2(ca caVar, Object obj, long j10, Object obj2, int i10) {
        this.f5750a = i10;
        this.d = caVar;
        this.f5751b = obj;
        this.f5752c = j10;
        this.e = obj2;
    }

    private final void a() {
        x50 x50Var = (x50) this.f5751b;
        org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        ChatObject.Call call = x50Var.f45491a1;
        if (call != null && !x50Var.f45565s0) {
            call.addInvitedUser(this.f5752c);
            x50Var.O0(true);
            c40 c40Var = x50Var.E1;
            if (c40Var != null) {
                c40Var.dismiss();
            }
            try {
                e2VarArr[0].dismiss();
            } catch (Throwable unused) {
            }
            e2VarArr[0] = null;
            x50Var.k1().k(0L, 34, user, x50Var.Z0, null, null);
        }
    }

    private final void b() {
        la0 la0Var = (la0) this.f5751b;
        LaunchActivity launchActivity = la0Var.f41066g;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.e;
        if (str != null) {
            AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
            MessagesController messagesController = accountInstance.getMessagesController();
            long j10 = this.f5752c;
            long j11 = -j10;
            ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
            if (groupCall != null) {
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf(!groupCall.call.rtmp_stream), launchActivity, r2Var, accountInstance);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j11);
            if (chatFull != null) {
                if (chatFull.call == null) {
                    if (r2Var.getParentActivity() != null) {
                        org.telegram.messenger.t.q(R.string.InviteExpired, org.telegram.ui.Components.wc.b0(r2Var), R.raw.linkbroken, 36);
                        return;
                    }
                    return;
                }
                accountInstance.getMessagesController().getGroupCall(j11, true, new ka0(la0Var, accountInstance, j10, r2Var, 0));
            }
        }
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.f5751b;
        String str = (String) this.d;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.e;
        Drawable[] drawableArr = PhotoViewer.U8;
        long j10 = this.f5752c;
        t2 t2Var = new t2(photoViewer, str, photoEntry, j10, 6);
        if (photoViewer.D2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
            AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new am0(10, t2Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.B2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
        if (bitmap == null) {
            t2Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j10, null, true));
        } else {
            t2Var.run(bitmap);
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.i0 i0Var;
        String message;
        byte[] bArr;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr2;
        byte[] bArr3;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f5751b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j10 = this.f5752c;
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
                                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: part " + i10 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
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
                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: couldn't decrypt " + i10 + " part");
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
            org.telegram.ui.Wallet.l0.j("getSecretPhrase: no parts???");
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
            TL_wallet.WalletState walletState = l0Var.e;
            if (walletState instanceof TL_wallet.TL_walletState) {
                bArr = ((TL_wallet.TL_walletState) walletState).public_key;
            } else {
                bArr = null;
            }
            if (secretPhraseToPublicKey != null && bArr != null && Arrays.equals(secretPhraseToPublicKey, bArr)) {
                Arrays.fill(bArr4, (byte) 0);
                org.telegram.ui.Wallet.l0.H("getSecretPhrase, received the phrase!");
                jVar.run(i0Var, null);
                return;
            }
            org.telegram.ui.Wallet.l0.j("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.bytesToHex(bArr) + " derived=" + Utilities.bytesToHex(secretPhraseToPublicKey));
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
            org.telegram.ui.Wallet.l0.k("getSecretPhrase: encryption error", th);
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
            }
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.f5751b;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        String str = (String) this.d;
        if (callback != null) {
            if (this.f5752c != p0Var.l()) {
                str = "STORAGE_CANCELED";
            }
            callback.run(str);
            return;
        }
        p0Var.getClass();
    }

    private final void g() {
        org.telegram.ui.Wallet.i0 i0Var;
        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.f5751b;
        org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        try {
            if (this.f5752c == p0Var.l()) {
                i0Var = i0Var2;
            } else {
                i0Var = null;
            }
            callback.run(i0Var);
        } finally {
            if (i0Var2 != null) {
                i0Var2.close();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.y2.run():void");
    }

    public y2(ca caVar, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.f5750a = 5;
        this.d = caVar;
        this.e = callback;
        this.f5751b = starGift;
        this.f5752c = j10;
    }

    public y2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f5750a = i10;
        this.f5751b = obj;
        this.f5752c = j10;
        this.d = obj2;
        this.e = obj3;
    }

    public y2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f5750a = i10;
        this.f5751b = obj;
        this.d = obj2;
        this.f5752c = j10;
        this.e = obj3;
    }

    public y2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f5750a = i10;
        this.f5751b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5752c = j10;
    }

    public y2(org.telegram.ui.Wallet.p0 p0Var, Utilities.Callback callback, long j10, String str) {
        this.f5750a = 25;
        this.f5751b = p0Var;
        this.e = callback;
        this.f5752c = j10;
        this.d = str;
    }
}
