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
public final class i87 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public i87(ax7 ax7Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, bx7 bx7Var, TLRPC.TL_error tL_error, wk4 wk4Var) {
        this.a = (byte) 16;
        this.b = ax7Var;
        this.f = tLObject;
        this.h = str;
        this.c = tL_secureRequiredType;
        this.e = bx7Var;
        this.d = tL_error;
        this.n = wk4Var;
    }

    private final void a() {
        boolean z;
        int i;
        boolean z2;
        int i2;
        TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile;
        bu9 bu9Var = (bu9) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f;
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) this.h;
        TLRPC.Message message = (TLRPC.Message) this.c;
        TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.d;
        k27 k27Var = (k27) this.e;
        String str = (String) this.n;
        try {
            TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = new TLRPC.TL_decryptedMessageLayer();
            int i3 = encryptedChat.layer;
            Typeface typeface = gl.a;
            tL_decryptedMessageLayer.layer = Math.min(Math.max(46, i3 & 65535), Math.max(46, gl.W0(encryptedChat.layer)));
            tL_decryptedMessageLayer.message = decryptedMessage;
            byte[] bArr = new byte[15];
            tL_decryptedMessageLayer.random_bytes = bArr;
            SecureRandom secureRandom = Utilities.b;
            secureRandom.nextBytes(bArr);
            int i4 = encryptedChat.seq_in;
            if (i4 == 0) {
                try {
                    if (encryptedChat.seq_out == 0) {
                        if (encryptedChat.admin_id == bu9Var.getUserConfig().e()) {
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
                    fa4.g(e, z);
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
                    i7 = bu9Var.getConnectionsManager().getCurrentTime();
                    encryptedChat.key_create_date = i7;
                }
                short s = (short) (encryptedChat.key_use_count_out + 1);
                encryptedChat.key_use_count_out = s;
                if ((s >= 100 || i7 < bu9Var.getConnectionsManager().getCurrentTime() - 604800) && encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0) {
                    bu9Var.o(encryptedChat);
                }
                ad7 messagesStorage = bu9Var.getMessagesStorage();
                messagesStorage.a.c(new vj6((Object) messagesStorage, (Object) encryptedChat, false, (byte) 5));
                message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                ad7 messagesStorage2 = bu9Var.getMessagesStorage();
                messagesStorage2.a.c(new nk2(messagesStorage2, message.id, message.seq_in, message.seq_out, (byte) 1));
            } else {
                tL_decryptedMessageLayer.in_seq_no = i5;
                tL_decryptedMessageLayer.out_seq_no = message.seq_out;
            }
            if (w01.a) {
                fa4.b(decryptedMessage + " send message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
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
            if (encryptedChat.admin_id != bu9Var.getUserConfig().e()) {
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
            wk4 W = wk4.W(2, z2, encryptedChat.auth_key, bArr3);
            Utilities.c(nativeByteBuffer2.buffer, (byte[]) W.b, (byte[]) W.c, true, false, 0, nativeByteBuffer2.limit());
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
            bu9Var.getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new fn0(bu9Var, decryptedMessage, encryptedChat, message, k27Var, str), 64);
        } catch (Exception e2) {
            e = e2;
            z = true;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i87.run():void");
    }

    public i87(gk7 gk7Var, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = gk7Var;
        this.d = tL_error;
        this.f = tLObject;
        this.h = obj;
        this.c = obj2;
        this.e = obj3;
        this.n = obj4;
    }

    public i87(wt1 wt1Var, hd hdVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, k27 k27Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.b = wt1Var;
        this.c = hdVar;
        this.f = tLObject;
        this.h = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.n = k27Var;
        this.d = tL_error;
    }

    public i87(gta gtaVar, TLObject tLObject, k27 k27Var, TLRPC.InputInvoice inputInvoice, p8c p8cVar, u21 u21Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 20;
        this.b = gtaVar;
        this.f = tLObject;
        this.h = k27Var;
        this.c = inputInvoice;
        this.e = p8cVar;
        this.n = u21Var;
        this.d = tL_error;
    }

    public i87(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.f = obj2;
        this.h = obj3;
        this.c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.n = obj7;
    }

    public i87(TLRPC.TL_error tL_error, p8c p8cVar, TLObject tLObject, na7 na7Var, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, d dVar, p8c p8cVar2, byte b) {
        this.a = b;
        this.d = tL_error;
        this.f = p8cVar;
        this.h = tLObject;
        this.b = na7Var;
        this.c = tL_inputInvoicePremiumGiftCode;
        this.e = dVar;
        this.n = p8cVar2;
    }

    public i87(LaunchActivity launchActivity, hd hdVar, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = (byte) 12;
        this.b = launchActivity;
        this.c = hdVar;
        this.d = tL_error;
        this.f = str;
        this.h = bundle;
        this.e = tLObject;
        this.n = sendconfirmphonecode;
    }
}
