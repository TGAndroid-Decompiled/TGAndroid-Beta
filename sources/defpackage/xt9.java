package defpackage;

import android.util.SparseArray;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xt9 implements RequestDelegate {
    public final byte a;
    public final bu9 b;
    public final TLRPC.EncryptedChat c;

    public xt9(bu9 bu9Var, TLRPC.EncryptedChat encryptedChat, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ad7 messagesStorage;
        byte[] bArr;
        byte b = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                SparseArray sparseArray = bu9Var.e;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr2 = messages_dhconfig.p;
                        int i = messages_dhconfig.g;
                        Pattern pattern = Utilities.a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr2, i)) {
                            sparseArray.remove(encryptedChat.id);
                            bu9Var.f(encryptedChat.id, false);
                            return;
                        }
                        ad7 messagesStorage2 = bu9Var.getMessagesStorage();
                        byte[] bArr3 = messages_dhconfig.p;
                        messagesStorage2.G();
                        messagesStorage2.y = bArr3;
                        ad7 messagesStorage3 = bu9Var.getMessagesStorage();
                        int i2 = messages_dhconfig.g;
                        messagesStorage3.G();
                        messagesStorage3.E = i2;
                        ad7 messagesStorage4 = bu9Var.getMessagesStorage();
                        int i3 = messages_dhconfig.version;
                        messagesStorage4.G();
                        messagesStorage4.x = i3;
                        ad7 messagesStorage5 = bu9Var.getMessagesStorage();
                        ad7 messagesStorage6 = bu9Var.getMessagesStorage();
                        messagesStorage6.G();
                        int i4 = messagesStorage6.x;
                        ad7 messagesStorage7 = bu9Var.getMessagesStorage();
                        messagesStorage7.G();
                        int i5 = messagesStorage7.E;
                        ad7 messagesStorage8 = bu9Var.getMessagesStorage();
                        messagesStorage8.G();
                        messagesStorage5.a.c(new mp1(messagesStorage5, i4, i5, messagesStorage8.y, (byte) 10));
                    }
                    byte[] bArr4 = new byte[256];
                    for (int i6 = 0; i6 < 256; i6++) {
                        bArr4[i6] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i6]);
                    }
                    encryptedChat.a_or_b = bArr4;
                    encryptedChat.seq_in = -1;
                    encryptedChat.seq_out = 0;
                    ad7 messagesStorage9 = bu9Var.getMessagesStorage();
                    messagesStorage9.G();
                    BigInteger bigInteger = new BigInteger(1, messagesStorage9.y);
                    bu9Var.getMessagesStorage().G();
                    BigInteger modPow = BigInteger.valueOf(messagesStorage.E).modPow(new BigInteger(1, bArr4), bigInteger);
                    BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a);
                    if (!Utilities.w(bigInteger2, bigInteger)) {
                        sparseArray.remove(encryptedChat.id);
                        bu9Var.f(encryptedChat.id, false);
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
                            for (int i7 = 0; i7 < 256 - byteArray2.length; i7++) {
                                bArr[i7] = 0;
                            }
                        }
                        byte[] n = Utilities.n(byteArray2);
                        byte[] bArr6 = new byte[8];
                        System.arraycopy(n, n.length - 8, bArr6, 0, 8);
                        encryptedChat.auth_key = byteArray2;
                        encryptedChat.key_create_date = bu9Var.getConnectionsManager().getCurrentTime();
                        TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption = new TLRPC.TL_messages_acceptEncryption();
                        tL_messages_acceptEncryption.g_b = byteArray;
                        TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                        tL_messages_acceptEncryption.peer = tL_inputEncryptedChat;
                        tL_inputEncryptedChat.chat_id = encryptedChat.id;
                        tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                        tL_messages_acceptEncryption.key_fingerprint = Utilities.g(bArr6);
                        bu9Var.getConnectionsManager().sendRequest(tL_messages_acceptEncryption, new xt9(bu9Var, encryptedChat, (byte) 1), 64);
                        return;
                    }
                    byteArray2 = bArr;
                    byte[] n2 = Utilities.n(byteArray2);
                    byte[] bArr62 = new byte[8];
                    System.arraycopy(n2, n2.length - 8, bArr62, 0, 8);
                    encryptedChat.auth_key = byteArray2;
                    encryptedChat.key_create_date = bu9Var.getConnectionsManager().getCurrentTime();
                    TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption2 = new TLRPC.TL_messages_acceptEncryption();
                    tL_messages_acceptEncryption2.g_b = byteArray;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_acceptEncryption2.peer = tL_inputEncryptedChat2;
                    tL_inputEncryptedChat2.chat_id = encryptedChat.id;
                    tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                    tL_messages_acceptEncryption2.key_fingerprint = Utilities.g(bArr62);
                    bu9Var.getConnectionsManager().sendRequest(tL_messages_acceptEncryption2, new xt9(bu9Var, encryptedChat, (byte) 1), 64);
                    return;
                }
                sparseArray.remove(encryptedChat.id);
                return;
            default:
                bu9Var.e.remove(encryptedChat.id);
                if (tL_error == null) {
                    TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) tLObject;
                    encryptedChat2.auth_key = encryptedChat.auth_key;
                    encryptedChat2.user_id = encryptedChat.user_id;
                    encryptedChat2.seq_in = encryptedChat.seq_in;
                    encryptedChat2.seq_out = encryptedChat.seq_out;
                    encryptedChat2.key_create_date = encryptedChat.key_create_date;
                    encryptedChat2.key_use_count_in = encryptedChat.key_use_count_in;
                    encryptedChat2.key_use_count_out = encryptedChat.key_use_count_out;
                    bu9Var.getMessagesStorage().S1(encryptedChat2);
                    bu9Var.getMessagesController().W3(encryptedChat2, false);
                    gl.d3(new ut9(bu9Var, encryptedChat2, (byte) 2));
                    return;
                }
                return;
        }
    }
}
