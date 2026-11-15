package org.telegram.messenger;

import android.util.SparseArray;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xv implements RequestDelegate {
    public final int f27608a;
    public final bw f27609b;
    public final TLRPC.EncryptedChat f27610c;

    public xv(bw bwVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f27608a = i7;
        this.f27609b = bwVar;
        this.f27610c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        vr messagesStorage;
        byte[] bArr;
        int i7 = this.f27608a;
        TLRPC.EncryptedChat encryptedChat = this.f27610c;
        bw bwVar = this.f27609b;
        switch (i7) {
            case 0:
                SparseArray sparseArray = bwVar.f22764e;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr2 = messages_dhconfig.f28208p;
                        int i10 = messages_dhconfig.f28207g;
                        Pattern pattern = Utilities.f22413a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr2, i10)) {
                            sparseArray.remove(encryptedChat.f28059id);
                            bwVar.f(encryptedChat.f28059id, false);
                            return;
                        }
                        vr messagesStorage2 = bwVar.getMessagesStorage();
                        byte[] bArr3 = messages_dhconfig.f28208p;
                        messagesStorage2.H();
                        messagesStorage2.f27234y = bArr3;
                        vr messagesStorage3 = bwVar.getMessagesStorage();
                        int i11 = messages_dhconfig.f28207g;
                        messagesStorage3.H();
                        messagesStorage3.E = i11;
                        vr messagesStorage4 = bwVar.getMessagesStorage();
                        int i12 = messages_dhconfig.version;
                        messagesStorage4.H();
                        messagesStorage4.f27233x = i12;
                        vr messagesStorage5 = bwVar.getMessagesStorage();
                        vr messagesStorage6 = bwVar.getMessagesStorage();
                        messagesStorage6.H();
                        int i13 = messagesStorage6.f27233x;
                        vr messagesStorage7 = bwVar.getMessagesStorage();
                        messagesStorage7.H();
                        int i14 = messagesStorage7.E;
                        vr messagesStorage8 = bwVar.getMessagesStorage();
                        messagesStorage8.H();
                        messagesStorage5.f27219a.c(new l2.x(messagesStorage5, i13, i14, messagesStorage8.f27234y, 7));
                    }
                    byte[] bArr4 = new byte[256];
                    for (int i15 = 0; i15 < 256; i15++) {
                        bArr4[i15] = (byte) (((byte) (Utilities.f22414b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i15]);
                    }
                    encryptedChat.a_or_b = bArr4;
                    encryptedChat.seq_in = -1;
                    encryptedChat.seq_out = 0;
                    vr messagesStorage9 = bwVar.getMessagesStorage();
                    messagesStorage9.H();
                    BigInteger bigInteger = new BigInteger(1, messagesStorage9.f27234y);
                    bwVar.getMessagesStorage().H();
                    BigInteger modPow = BigInteger.valueOf(messagesStorage.E).modPow(new BigInteger(1, bArr4), bigInteger);
                    BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a);
                    if (!Utilities.w(bigInteger2, bigInteger)) {
                        sparseArray.remove(encryptedChat.f28059id);
                        bwVar.f(encryptedChat.f28059id, false);
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
                        encryptedChat.key_create_date = bwVar.getConnectionsManager().getCurrentTime();
                        TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption = new TLRPC.TL_messages_acceptEncryption();
                        tL_messages_acceptEncryption.g_b = byteArray;
                        TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                        tL_messages_acceptEncryption.peer = tL_inputEncryptedChat;
                        tL_inputEncryptedChat.chat_id = encryptedChat.f28059id;
                        tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                        tL_messages_acceptEncryption.key_fingerprint = Utilities.g(bArr6);
                        bwVar.getConnectionsManager().sendRequest(tL_messages_acceptEncryption, new xv(bwVar, encryptedChat, 1), 64);
                        return;
                    }
                    byteArray2 = bArr;
                    byte[] n102 = Utilities.n(byteArray2);
                    byte[] bArr62 = new byte[8];
                    System.arraycopy(n102, n102.length - 8, bArr62, 0, 8);
                    encryptedChat.auth_key = byteArray2;
                    encryptedChat.key_create_date = bwVar.getConnectionsManager().getCurrentTime();
                    TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption2 = new TLRPC.TL_messages_acceptEncryption();
                    tL_messages_acceptEncryption2.g_b = byteArray;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_acceptEncryption2.peer = tL_inputEncryptedChat2;
                    tL_inputEncryptedChat2.chat_id = encryptedChat.f28059id;
                    tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                    tL_messages_acceptEncryption2.key_fingerprint = Utilities.g(bArr62);
                    bwVar.getConnectionsManager().sendRequest(tL_messages_acceptEncryption2, new xv(bwVar, encryptedChat, 1), 64);
                    return;
                }
                sparseArray.remove(encryptedChat.f28059id);
                return;
            default:
                bwVar.f22764e.remove(encryptedChat.f28059id);
                if (tL_error == null) {
                    TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) tLObject;
                    encryptedChat2.auth_key = encryptedChat.auth_key;
                    encryptedChat2.user_id = encryptedChat.user_id;
                    encryptedChat2.seq_in = encryptedChat.seq_in;
                    encryptedChat2.seq_out = encryptedChat.seq_out;
                    encryptedChat2.key_create_date = encryptedChat.key_create_date;
                    encryptedChat2.key_use_count_in = encryptedChat.key_use_count_in;
                    encryptedChat2.key_use_count_out = encryptedChat.key_use_count_out;
                    bwVar.getMessagesStorage().V1(encryptedChat2);
                    bwVar.getMessagesController().U3(encryptedChat2, false);
                    g0.h3(new uv(bwVar, encryptedChat2, 2));
                    return;
                }
                return;
        }
    }
}
