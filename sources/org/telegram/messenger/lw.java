package org.telegram.messenger;

import android.util.SparseArray;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lw implements RequestDelegate {
    public final int f17004a;
    public final pw f17005b;
    public final TLRPC.EncryptedChat f17006c;

    public lw(pw pwVar, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17004a = i10;
        this.f17005b = pwVar;
        this.f17006c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        is messagesStorage;
        byte[] bArr;
        int i10 = this.f17004a;
        TLRPC.EncryptedChat encryptedChat = this.f17006c;
        pw pwVar = this.f17005b;
        switch (i10) {
            case 0:
                SparseArray sparseArray = pwVar.e;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr2 = messages_dhconfig.f19951p;
                        int i11 = messages_dhconfig.f19950g;
                        Pattern pattern = Utilities.f14519a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr2, i11)) {
                            sparseArray.remove(encryptedChat.f19802id);
                            pwVar.f(encryptedChat.f19802id, false);
                            return;
                        }
                        is messagesStorage2 = pwVar.getMessagesStorage();
                        byte[] bArr3 = messages_dhconfig.f19951p;
                        messagesStorage2.H();
                        messagesStorage2.f16344y = bArr3;
                        is messagesStorage3 = pwVar.getMessagesStorage();
                        int i12 = messages_dhconfig.f19950g;
                        messagesStorage3.H();
                        messagesStorage3.D = i12;
                        is messagesStorage4 = pwVar.getMessagesStorage();
                        int i13 = messages_dhconfig.version;
                        messagesStorage4.H();
                        messagesStorage4.f16343x = i13;
                        is messagesStorage5 = pwVar.getMessagesStorage();
                        is messagesStorage6 = pwVar.getMessagesStorage();
                        messagesStorage6.H();
                        int i14 = messagesStorage6.f16343x;
                        is messagesStorage7 = pwVar.getMessagesStorage();
                        messagesStorage7.H();
                        int i15 = messagesStorage7.D;
                        is messagesStorage8 = pwVar.getMessagesStorage();
                        messagesStorage8.H();
                        messagesStorage5.f16331a.c(new i2.a0(messagesStorage5, i14, i15, messagesStorage8.f16344y, 7));
                    }
                    byte[] bArr4 = new byte[256];
                    for (int i16 = 0; i16 < 256; i16++) {
                        bArr4[i16] = (byte) (((byte) (Utilities.f14520b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i16]);
                    }
                    encryptedChat.a_or_b = bArr4;
                    encryptedChat.seq_in = -1;
                    encryptedChat.seq_out = 0;
                    is messagesStorage9 = pwVar.getMessagesStorage();
                    messagesStorage9.H();
                    BigInteger bigInteger = new BigInteger(1, messagesStorage9.f16344y);
                    pwVar.getMessagesStorage().H();
                    BigInteger modPow = BigInteger.valueOf(messagesStorage.D).modPow(new BigInteger(1, bArr4), bigInteger);
                    BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a);
                    if (!Utilities.w(bigInteger2, bigInteger)) {
                        sparseArray.remove(encryptedChat.f19802id);
                        pwVar.f(encryptedChat.f19802id, false);
                        return;
                    }
                    byte[] byteArray = modPow.toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr5 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr5, 0, 256);
                        byteArray = bArr5;
                    }
                    byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr4), bigInteger).toByteArray();
                    if (byteArray2.length > 256) {
                        bArr = new byte[256];
                        System.arraycopy(byteArray2, byteArray2.length - 256, bArr, 0, 256);
                    } else {
                        if (byteArray2.length < 256) {
                            bArr = new byte[256];
                            System.arraycopy(byteArray2, 0, bArr, 256 - byteArray2.length, byteArray2.length);
                            for (int i17 = 0; i17 < 256 - byteArray2.length; i17++) {
                                bArr[i17] = 0;
                            }
                        }
                        byte[] n10 = Utilities.n(byteArray2);
                        byte[] bArr6 = new byte[8];
                        System.arraycopy(n10, n10.length - 8, bArr6, 0, 8);
                        encryptedChat.auth_key = byteArray2;
                        encryptedChat.key_create_date = pwVar.getConnectionsManager().getCurrentTime();
                        TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption = new TLRPC.TL_messages_acceptEncryption();
                        tL_messages_acceptEncryption.g_b = byteArray;
                        TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                        tL_messages_acceptEncryption.peer = tL_inputEncryptedChat;
                        tL_inputEncryptedChat.chat_id = encryptedChat.f19802id;
                        tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                        tL_messages_acceptEncryption.key_fingerprint = Utilities.g(bArr6);
                        pwVar.getConnectionsManager().sendRequest(tL_messages_acceptEncryption, new lw(pwVar, encryptedChat, 1), 64);
                        return;
                    }
                    byteArray2 = bArr;
                    byte[] n102 = Utilities.n(byteArray2);
                    byte[] bArr62 = new byte[8];
                    System.arraycopy(n102, n102.length - 8, bArr62, 0, 8);
                    encryptedChat.auth_key = byteArray2;
                    encryptedChat.key_create_date = pwVar.getConnectionsManager().getCurrentTime();
                    TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption2 = new TLRPC.TL_messages_acceptEncryption();
                    tL_messages_acceptEncryption2.g_b = byteArray;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_acceptEncryption2.peer = tL_inputEncryptedChat2;
                    tL_inputEncryptedChat2.chat_id = encryptedChat.f19802id;
                    tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                    tL_messages_acceptEncryption2.key_fingerprint = Utilities.g(bArr62);
                    pwVar.getConnectionsManager().sendRequest(tL_messages_acceptEncryption2, new lw(pwVar, encryptedChat, 1), 64);
                    return;
                }
                sparseArray.remove(encryptedChat.f19802id);
                return;
            default:
                pwVar.e.remove(encryptedChat.f19802id);
                if (tL_error == null) {
                    TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) tLObject;
                    encryptedChat2.auth_key = encryptedChat.auth_key;
                    encryptedChat2.user_id = encryptedChat.user_id;
                    encryptedChat2.seq_in = encryptedChat.seq_in;
                    encryptedChat2.seq_out = encryptedChat.seq_out;
                    encryptedChat2.key_create_date = encryptedChat.key_create_date;
                    encryptedChat2.key_use_count_in = encryptedChat.key_use_count_in;
                    encryptedChat2.key_use_count_out = encryptedChat.key_use_count_out;
                    pwVar.getMessagesStorage().V1(encryptedChat2);
                    pwVar.getMessagesController().R3(encryptedChat2, false);
                    i0.g3(new iw(pwVar, encryptedChat2, 2));
                    return;
                }
                return;
        }
    }
}
