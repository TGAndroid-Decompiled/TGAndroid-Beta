package ai;

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
import org.telegram.ui.Components.a40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ca0;
import org.telegram.ui.da0;
import org.telegram.ui.q50;
import org.telegram.ui.xg0;
public final class c3 implements Runnable {
    public final int f1070a;
    public final Object f1071b;
    public final long f1072c;
    public final Object d;
    public final Object e;

    public c3(ga gaVar, Object obj, long j10, Object obj2, int i10) {
        this.f1070a = i10;
        this.d = gaVar;
        this.f1071b = obj;
        this.f1072c = j10;
        this.e = obj2;
    }

    private final void a() {
        q50 q50Var = (q50) this.f1071b;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        ChatObject.Call call = q50Var.f40376a1;
        if (call != null && !q50Var.f40450s0) {
            call.addInvitedUser(this.f1072c);
            q50Var.P0(true);
            a40 a40Var = q50Var.E1;
            if (a40Var != null) {
                a40Var.dismiss();
            }
            try {
                b2VarArr[0].dismiss();
            } catch (Throwable unused) {
            }
            b2VarArr[0] = null;
            q50Var.l1().k(0L, 34, user, q50Var.Z0, null, null);
        }
    }

    private final void b() {
        da0 da0Var = (da0) this.f1071b;
        LaunchActivity launchActivity = da0Var.f36319g;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.e;
        if (str != null) {
            AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
            MessagesController messagesController = accountInstance.getMessagesController();
            long j10 = this.f1072c;
            long j11 = -j10;
            ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
            if (groupCall != null) {
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf(!groupCall.call.rtmp_stream), launchActivity, n2Var, accountInstance);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j11);
            if (chatFull != null) {
                if (chatFull.call == null) {
                    if (n2Var.getParentActivity() != null) {
                        org.telegram.messenger.g0.q(R.string.InviteExpired, org.telegram.ui.Components.xc.a0(n2Var), R.raw.linkbroken, 36);
                        return;
                    }
                    return;
                }
                accountInstance.getMessagesController().getGroupCall(j11, true, new ca0(da0Var, accountInstance, j10, n2Var, 0));
            }
        }
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.f1071b;
        String str = (String) this.d;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.e;
        Drawable[] drawableArr = PhotoViewer.U8;
        long j10 = this.f1072c;
        x2 x2Var = new x2(photoViewer, str, photoEntry, j10, 6);
        if (photoViewer.D2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
            AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new xg0(20, x2Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.B2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
        if (bitmap == null) {
            x2Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j10, null, true));
        } else {
            x2Var.run(bitmap);
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.j0 j0Var;
        String message;
        byte[] bArr;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr2;
        byte[] bArr3;
        org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.f1071b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j10 = this.f1072c;
        org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) this.e;
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
                                    org.telegram.ui.Wallet.m0.i("getSecretPhrase: part " + i10 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
                                    kVar.run(null, "WALLET_PART_SHARE_UNEQUAL_LENGHTS");
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
                    org.telegram.ui.Wallet.m0.i("getSecretPhrase: couldn't decrypt " + i10 + " part");
                    kVar.run(null, "WALLET_PART_" + i10 + "_CANT_DECRYPT");
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
                j0Var = null;
            }
        }
        if (bArr4 == null) {
            org.telegram.ui.Wallet.m0.i("getSecretPhrase: no parts???");
            kVar.run(null, "WALLET_NO_PARTS");
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
                return;
            }
            return;
        }
        j0Var = new org.telegram.ui.Wallet.j0(bArr4);
        try {
            Arrays.fill(bArr4, (byte) 0);
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(j0Var);
            TL_wallet.WalletState walletState = m0Var.e;
            if (walletState instanceof TL_wallet.TL_walletState) {
                bArr = ((TL_wallet.TL_walletState) walletState).public_key;
            } else {
                bArr = null;
            }
            if (secretPhraseToPublicKey != null && bArr != null && Arrays.equals(secretPhraseToPublicKey, bArr)) {
                Arrays.fill(bArr4, (byte) 0);
                org.telegram.ui.Wallet.m0.F("getSecretPhrase, received the phrase!");
                kVar.run(j0Var, null);
                return;
            }
            org.telegram.ui.Wallet.m0.i("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.bytesToHex(bArr) + " derived=" + Utilities.bytesToHex(secretPhraseToPublicKey));
            j0Var.close();
            kVar.run(null, "WALLET_WORDS_DONT_MATCH");
            Arrays.fill(bArr4, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            if (j0Var != null) {
                try {
                    j0Var.close();
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
            kVar.run(null, message);
            org.telegram.ui.Wallet.m0.j("getSecretPhrase: encryption error", th);
            if (bArr4 != null) {
                Arrays.fill(bArr4, (byte) 0);
            }
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) this.f1071b;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        String str = (String) this.d;
        if (callback != null) {
            if (this.f1072c != q0Var.l()) {
                str = "STORAGE_CANCELED";
            }
            callback.run(str);
            return;
        }
        q0Var.getClass();
    }

    private final void g() {
        org.telegram.ui.Wallet.j0 j0Var;
        org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) this.f1071b;
        org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        try {
            if (this.f1072c == q0Var.l()) {
                j0Var = j0Var2;
            } else {
                j0Var = null;
            }
            callback.run(j0Var);
        } finally {
            if (j0Var2 != null) {
                j0Var2.close();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.c3.run():void");
    }

    public c3(ga gaVar, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.f1070a = 5;
        this.d = gaVar;
        this.e = callback;
        this.f1071b = starGift;
        this.f1072c = j10;
    }

    public c3(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f1070a = i10;
        this.f1071b = obj;
        this.f1072c = j10;
        this.d = obj2;
        this.e = obj3;
    }

    public c3(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f1070a = i10;
        this.f1071b = obj;
        this.d = obj2;
        this.f1072c = j10;
        this.e = obj3;
    }

    public c3(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f1070a = i10;
        this.f1071b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1072c = j10;
    }

    public c3(org.telegram.ui.Wallet.q0 q0Var, Utilities.Callback callback, long j10, String str) {
        this.f1070a = 25;
        this.f1071b = q0Var;
        this.e = callback;
        this.f1072c = j10;
        this.d = str;
    }
}
