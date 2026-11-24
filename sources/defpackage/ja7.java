package defpackage;

import android.graphics.Typeface;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ja7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public ja7(dz7 dz7Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, ez7 ez7Var, TLRPC.TL_error tL_error, wm4 wm4Var) {
        this.a = (byte) 16;
        this.b = dz7Var;
        this.f = tLObject;
        this.h = str;
        this.c = tL_secureRequiredType;
        this.e = ez7Var;
        this.d = tL_error;
        this.n = wm4Var;
    }

    private final void a() {
        boolean z;
        int i;
        boolean z2;
        int i2;
        TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile;
        dw9 dw9Var = (dw9) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f;
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) this.h;
        TLRPC.Message message = (TLRPC.Message) this.c;
        TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.d;
        k47 k47Var = (k47) this.e;
        String str = (String) this.n;
        try {
            TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = new TLRPC.TL_decryptedMessageLayer();
            int i3 = encryptedChat.layer;
            Typeface typeface = gm.a;
            tL_decryptedMessageLayer.layer = Math.min(Math.max(46, i3 & 65535), Math.max(46, gm.W0(encryptedChat.layer)));
            tL_decryptedMessageLayer.message = decryptedMessage;
            byte[] bArr = new byte[15];
            tL_decryptedMessageLayer.random_bytes = bArr;
            SecureRandom secureRandom = Utilities.b;
            secureRandom.nextBytes(bArr);
            int i4 = encryptedChat.seq_in;
            if (i4 == 0) {
                try {
                    if (encryptedChat.seq_out == 0) {
                        if (encryptedChat.admin_id == dw9Var.getUserConfig().e()) {
                            encryptedChat.seq_out = 1;
                            i4 = -2;
                            encryptedChat.seq_in = -2;
                        } else {
                            i4 = -1;
                            encryptedChat.seq_in = -1;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    z = true;
                    fc4.g(e, z);
                    return;
                }
            }
            int i5 = message.seq_in;
            if (i5 == 0 && message.seq_out == 0) {
                if (i4 <= 0) {
                    i4 += 2;
                }
                tL_decryptedMessageLayer.in_seq_no = i4;
                int i6 = encryptedChat.seq_out;
                tL_decryptedMessageLayer.out_seq_no = i6;
                encryptedChat.seq_out = i6 + 2;
                int i7 = encryptedChat.key_create_date;
                if (i7 == 0) {
                    i7 = dw9Var.getConnectionsManager().getCurrentTime();
                    encryptedChat.key_create_date = i7;
                }
                short s = (short) (encryptedChat.key_use_count_out + 1);
                encryptedChat.key_use_count_out = s;
                if ((s >= 100 || i7 < dw9Var.getConnectionsManager().getCurrentTime() - 604800) && encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0) {
                    dw9Var.o(encryptedChat);
                }
                cf7 messagesStorage = dw9Var.getMessagesStorage();
                messagesStorage.a.c(new yl6((Object) messagesStorage, (Object) encryptedChat, false, (byte) 5));
                message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                cf7 messagesStorage2 = dw9Var.getMessagesStorage();
                messagesStorage2.a.c(new zl2(messagesStorage2, message.id, message.seq_in, message.seq_out, (byte) 1));
            } else {
                tL_decryptedMessageLayer.in_seq_no = i5;
                tL_decryptedMessageLayer.out_seq_no = message.seq_out;
            }
            if (e21.a) {
                fc4.b(decryptedMessage + " send message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
            }
            int objectSize = tL_decryptedMessageLayer.getObjectSize();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize + 4);
            nativeByteBuffer.writeInt32(objectSize);
            tL_decryptedMessageLayer.serializeToStream(nativeByteBuffer);
            int length = nativeByteBuffer.length();
            if (length % 16 != 0) {
                i = 16 - (length % 16);
            } else {
                i = 0;
            }
            int nextInt = i + ((secureRandom.nextInt(3) + 2) << 4);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length + nextInt);
            nativeByteBuffer.position(0);
            nativeByteBuffer2.writeBytes(nativeByteBuffer);
            if (nextInt != 0) {
                byte[] bArr2 = new byte[nextInt];
                secureRandom.nextBytes(bArr2);
                nativeByteBuffer2.writeBytes(bArr2);
            }
            byte[] bArr3 = new byte[16];
            if (encryptedChat.admin_id != dw9Var.getUserConfig().e()) {
                z2 = true;
            } else {
                z2 = false;
            }
            byte[] bArr4 = encryptedChat.auth_key;
            if (z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
            System.arraycopy(Utilities.p(bArr4, 88 + i2, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
            nativeByteBuffer.reuse();
            wm4 U = wm4.U(2, z2, encryptedChat.auth_key, bArr3);
            Utilities.c(nativeByteBuffer2.buffer, (byte[]) U.b, (byte[]) U.c, true, false, 0, nativeByteBuffer2.limit());
            NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(24 + nativeByteBuffer2.length());
            nativeByteBuffer2.position(0);
            nativeByteBuffer3.writeInt64(encryptedChat.key_fingerprint);
            nativeByteBuffer3.writeBytes(bArr3);
            nativeByteBuffer3.writeBytes(nativeByteBuffer2);
            nativeByteBuffer2.reuse();
            nativeByteBuffer3.position(0);
            if (inputEncryptedFile == null) {
                if (decryptedMessage instanceof TLRPC.TL_decryptedMessageService) {
                    TLRPC.TL_messages_sendEncryptedService tL_messages_sendEncryptedService = new TLRPC.TL_messages_sendEncryptedService();
                    tL_messages_sendEncryptedService.data = nativeByteBuffer3;
                    tL_messages_sendEncryptedService.random_id = decryptedMessage.random_id;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_sendEncryptedService.peer = tL_inputEncryptedChat;
                    tL_inputEncryptedChat.chat_id = encryptedChat.id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    tL_messages_sendEncryptedFile = tL_messages_sendEncryptedService;
                } else {
                    TLRPC.TL_messages_sendEncrypted tL_messages_sendEncrypted = new TLRPC.TL_messages_sendEncrypted();
                    tL_messages_sendEncrypted.silent = message.silent;
                    tL_messages_sendEncrypted.data = nativeByteBuffer3;
                    tL_messages_sendEncrypted.random_id = decryptedMessage.random_id;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_sendEncrypted.peer = tL_inputEncryptedChat2;
                    tL_inputEncryptedChat2.chat_id = encryptedChat.id;
                    tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                    tL_messages_sendEncryptedFile = tL_messages_sendEncrypted;
                }
            } else {
                TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile2 = new TLRPC.TL_messages_sendEncryptedFile();
                tL_messages_sendEncryptedFile2.silent = message.silent;
                tL_messages_sendEncryptedFile2.data = nativeByteBuffer3;
                tL_messages_sendEncryptedFile2.random_id = decryptedMessage.random_id;
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat3 = new TLRPC.TL_inputEncryptedChat();
                tL_messages_sendEncryptedFile2.peer = tL_inputEncryptedChat3;
                tL_inputEncryptedChat3.chat_id = encryptedChat.id;
                tL_inputEncryptedChat3.access_hash = encryptedChat.access_hash;
                tL_messages_sendEncryptedFile2.file = inputEncryptedFile;
                tL_messages_sendEncryptedFile = tL_messages_sendEncryptedFile2;
            }
            dw9Var.getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new fo0(dw9Var, decryptedMessage, encryptedChat, message, k47Var, str), 64);
        } catch (Exception e2) {
            e = e2;
            z = true;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja7.run():void");
    }

    public ja7(jm7 jm7Var, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = jm7Var;
        this.d = tL_error;
        this.f = tLObject;
        this.h = obj;
        this.c = obj2;
        this.e = obj3;
        this.n = obj4;
    }

    public ja7(iv1 iv1Var, he heVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, k47 k47Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.b = iv1Var;
        this.c = heVar;
        this.f = tLObject;
        this.h = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.n = k47Var;
        this.d = tL_error;
    }

    public ja7(jva jvaVar, TLObject tLObject, k47 k47Var, TLRPC.InputInvoice inputInvoice, qac qacVar, c41 c41Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 20;
        this.b = jvaVar;
        this.f = tLObject;
        this.h = k47Var;
        this.c = inputInvoice;
        this.e = qacVar;
        this.n = c41Var;
        this.d = tL_error;
    }

    public ja7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.f = obj2;
        this.h = obj3;
        this.c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.n = obj7;
    }

    public ja7(TLRPC.TL_error tL_error, qac qacVar, TLObject tLObject, oc7 oc7Var, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, d dVar, qac qacVar2, byte b) {
        this.a = b;
        this.d = tL_error;
        this.f = qacVar;
        this.h = tLObject;
        this.b = oc7Var;
        this.c = tL_inputInvoicePremiumGiftCode;
        this.e = dVar;
        this.n = qacVar2;
    }

    public ja7(LaunchActivity launchActivity, he heVar, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = (byte) 12;
        this.b = launchActivity;
        this.c = heVar;
        this.d = tL_error;
        this.f = str;
        this.h = bundle;
        this.e = tLObject;
        this.n = sendconfirmphonecode;
    }
}
