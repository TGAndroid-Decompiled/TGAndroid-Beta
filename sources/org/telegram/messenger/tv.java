package org.telegram.messenger;

import android.util.SparseArray;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tv implements RequestDelegate {
    public final int f27072a;
    public final xv f27073b;
    public final TLRPC.EncryptedChat f27074c;

    public tv(xv xvVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f27072a = i7;
        this.f27073b = xvVar;
        this.f27074c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        tr messagesStorage;
        byte[] bArr;
        int i7 = this.f27072a;
        TLRPC.EncryptedChat encryptedChat = this.f27074c;
        xv xvVar = this.f27073b;
        switch (i7) {
            case 0:
                SparseArray sparseArray = xvVar.f28010e;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr2 = messages_dhconfig.f28560p;
                        int i10 = messages_dhconfig.f28559g;
                        Pattern pattern = Utilities.f22776a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr2, i10)) {
                            sparseArray.remove(encryptedChat.f28411id);
                            xvVar.f(encryptedChat.f28411id, false);
                            return;
                        }
                        tr messagesStorage2 = xvVar.getMessagesStorage();
                        byte[] bArr3 = messages_dhconfig.f28560p;
                        messagesStorage2.H();
                        messagesStorage2.f27067y = bArr3;
                        tr messagesStorage3 = xvVar.getMessagesStorage();
                        int i11 = messages_dhconfig.f28559g;
                        messagesStorage3.H();
                        messagesStorage3.E = i11;
                        tr messagesStorage4 = xvVar.getMessagesStorage();
                        int i12 = messages_dhconfig.version;
                        messagesStorage4.H();
                        messagesStorage4.f27066x = i12;
                        tr messagesStorage5 = xvVar.getMessagesStorage();
                        tr messagesStorage6 = xvVar.getMessagesStorage();
                        messagesStorage6.H();
                        int i13 = messagesStorage6.f27066x;
                        tr messagesStorage7 = xvVar.getMessagesStorage();
                        messagesStorage7.H();
                        int i14 = messagesStorage7.E;
                        tr messagesStorage8 = xvVar.getMessagesStorage();
                        messagesStorage8.H();
                        messagesStorage5.f27052a.c(new l2.x(messagesStorage5, i13, i14, messagesStorage8.f27067y, 7));
                    }
                    byte[] bArr4 = new byte[256];
                    for (int i15 = 0; i15 < 256; i15++) {
                        bArr4[i15] = (byte) (((byte) (Utilities.f22777b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i15]);
                    }
                    encryptedChat.a_or_b = bArr4;
                    encryptedChat.seq_in = -1;
                    encryptedChat.seq_out = 0;
                    tr messagesStorage9 = xvVar.getMessagesStorage();
                    messagesStorage9.H();
                    BigInteger bigInteger = new BigInteger(1, messagesStorage9.f27067y);
                    xvVar.getMessagesStorage().H();
                    BigInteger modPow = BigInteger.valueOf(messagesStorage.E).modPow(new BigInteger(1, bArr4), bigInteger);
                    BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a);
                    if (!Utilities.w(bigInteger2, bigInteger)) {
                        sparseArray.remove(encryptedChat.f28411id);
                        xvVar.f(encryptedChat.f28411id, false);
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
                            for (int i16 = 0; i16 < 256 - byteArray2.length; i16++) {
                                bArr[i16] = 0;
                            }
                        }
                        byte[] n10 = Utilities.n(byteArray2);
                        byte[] bArr6 = new byte[8];
                        System.arraycopy(n10, n10.length - 8, bArr6, 0, 8);
                        encryptedChat.auth_key = byteArray2;
                        encryptedChat.key_create_date = xvVar.getConnectionsManager().getCurrentTime();
                        TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption = new TLRPC.TL_messages_acceptEncryption();
                        tL_messages_acceptEncryption.g_b = byteArray;
                        TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                        tL_messages_acceptEncryption.peer = tL_inputEncryptedChat;
                        tL_inputEncryptedChat.chat_id = encryptedChat.f28411id;
                        tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                        tL_messages_acceptEncryption.key_fingerprint = Utilities.g(bArr6);
                        xvVar.getConnectionsManager().sendRequest(tL_messages_acceptEncryption, new tv(xvVar, encryptedChat, 1), 64);
                        return;
                    }
                    byteArray2 = bArr;
                    byte[] n102 = Utilities.n(byteArray2);
                    byte[] bArr62 = new byte[8];
                    System.arraycopy(n102, n102.length - 8, bArr62, 0, 8);
                    encryptedChat.auth_key = byteArray2;
                    encryptedChat.key_create_date = xvVar.getConnectionsManager().getCurrentTime();
                    TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption2 = new TLRPC.TL_messages_acceptEncryption();
                    tL_messages_acceptEncryption2.g_b = byteArray;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_acceptEncryption2.peer = tL_inputEncryptedChat2;
                    tL_inputEncryptedChat2.chat_id = encryptedChat.f28411id;
                    tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                    tL_messages_acceptEncryption2.key_fingerprint = Utilities.g(bArr62);
                    xvVar.getConnectionsManager().sendRequest(tL_messages_acceptEncryption2, new tv(xvVar, encryptedChat, 1), 64);
                    return;
                }
                sparseArray.remove(encryptedChat.f28411id);
                return;
            default:
                xvVar.f28010e.remove(encryptedChat.f28411id);
                if (tL_error == null) {
                    TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) tLObject;
                    encryptedChat2.auth_key = encryptedChat.auth_key;
                    encryptedChat2.user_id = encryptedChat.user_id;
                    encryptedChat2.seq_in = encryptedChat.seq_in;
                    encryptedChat2.seq_out = encryptedChat.seq_out;
                    encryptedChat2.key_create_date = encryptedChat.key_create_date;
                    encryptedChat2.key_use_count_in = encryptedChat.key_use_count_in;
                    encryptedChat2.key_use_count_out = encryptedChat.key_use_count_out;
                    xvVar.getMessagesStorage().V1(encryptedChat2);
                    xvVar.getMessagesController().b4(encryptedChat2, false);
                    g0.g3(new qv(xvVar, encryptedChat2, 2));
                    return;
                }
                return;
        }
    }
}
