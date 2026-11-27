package defpackage;

import android.graphics.Typeface;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class kd7 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final TLRPC.EncryptedChat c;

    public kd7(kf7 kf7Var, TLRPC.EncryptedChat encryptedChat, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = encryptedChat;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        TLRPC.EncryptedChat encryptedChat = this.c;
        kf7 kf7Var = this.b;
        try {
            try {
                switch (b) {
                    case 0:
                        try {
                            try {
                                sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE enc_chats SET ttl = ? WHERE uid = ?");
                                sQLitePreparedStatement.bindInteger(1, encryptedChat.ttl);
                                sQLitePreparedStatement.bindInteger(2, encryptedChat.id);
                                sQLitePreparedStatement.step();
                            } catch (Exception e) {
                                kf7Var.p(e, true);
                                if (sQLitePreparedStatement == null) {
                                    return;
                                }
                            }
                            sQLitePreparedStatement.dispose();
                            return;
                        } catch (Throwable th) {
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    case 1:
                        try {
                            byte[] bArr2 = encryptedChat.key_hash;
                            if ((bArr2 == null || bArr2.length < 16) && (bArr = encryptedChat.auth_key) != null) {
                                Typeface typeface = hl.a;
                                byte[] bArr3 = new byte[16];
                                System.arraycopy(Utilities.n(bArr), 0, bArr3, 0, 16);
                                encryptedChat.key_hash = bArr3;
                            }
                            sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE enc_chats SET data = ?, g = ?, authkey = ?, ttl = ?, layer = ?, seq_in = ?, seq_out = ?, use_count = ?, exchange_id = ?, key_date = ?, fprint = ?, fauthkey = ?, khash = ?, in_seq_no = ?, admin_id = ?, mtproto_seq = ? WHERE uid = ?");
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedChat.getObjectSize());
                            byte[] bArr4 = encryptedChat.a_or_b;
                            if (bArr4 != null) {
                                i = bArr4.length;
                            } else {
                                i = 1;
                            }
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i);
                            byte[] bArr5 = encryptedChat.auth_key;
                            if (bArr5 != null) {
                                i2 = bArr5.length;
                            } else {
                                i2 = 1;
                            }
                            NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(i2);
                            byte[] bArr6 = encryptedChat.future_auth_key;
                            if (bArr6 != null) {
                                i3 = bArr6.length;
                            } else {
                                i3 = 1;
                            }
                            NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(i3);
                            byte[] bArr7 = encryptedChat.key_hash;
                            if (bArr7 != null) {
                                i4 = bArr7.length;
                            } else {
                                i4 = 1;
                            }
                            NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(i4);
                            encryptedChat.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            byte[] bArr8 = encryptedChat.a_or_b;
                            if (bArr8 != null) {
                                nativeByteBuffer2.writeBytes(bArr8);
                            }
                            byte[] bArr9 = encryptedChat.auth_key;
                            if (bArr9 != null) {
                                nativeByteBuffer3.writeBytes(bArr9);
                            }
                            byte[] bArr10 = encryptedChat.future_auth_key;
                            if (bArr10 != null) {
                                nativeByteBuffer4.writeBytes(bArr10);
                            }
                            byte[] bArr11 = encryptedChat.key_hash;
                            if (bArr11 != null) {
                                nativeByteBuffer5.writeBytes(bArr11);
                            }
                            sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer2);
                            sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer3);
                            sQLitePreparedStatement.bindInteger(4, encryptedChat.ttl);
                            sQLitePreparedStatement.bindInteger(5, encryptedChat.layer);
                            sQLitePreparedStatement.bindInteger(6, encryptedChat.seq_in);
                            sQLitePreparedStatement.bindInteger(7, encryptedChat.seq_out);
                            sQLitePreparedStatement.bindInteger(8, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                            sQLitePreparedStatement.bindLong(9, encryptedChat.exchange_id);
                            sQLitePreparedStatement.bindInteger(10, encryptedChat.key_create_date);
                            sQLitePreparedStatement.bindLong(11, encryptedChat.future_key_fingerprint);
                            sQLitePreparedStatement.bindByteBuffer(12, nativeByteBuffer4);
                            sQLitePreparedStatement.bindByteBuffer(13, nativeByteBuffer5);
                            sQLitePreparedStatement.bindInteger(14, encryptedChat.in_seq_no);
                            sQLitePreparedStatement.bindLong(15, encryptedChat.admin_id);
                            sQLitePreparedStatement.bindInteger(16, encryptedChat.mtproto_seq);
                            sQLitePreparedStatement.bindInteger(17, encryptedChat.id);
                            sQLitePreparedStatement.step();
                            nativeByteBuffer.reuse();
                            nativeByteBuffer2.reuse();
                            nativeByteBuffer3.reuse();
                            nativeByteBuffer4.reuse();
                            nativeByteBuffer5.reuse();
                        } catch (Exception e2) {
                            kf7Var.p(e2, true);
                            if (sQLitePreparedStatement == null) {
                                return;
                            }
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    default:
                        try {
                            sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE enc_chats SET layer = ? WHERE uid = ?");
                            sQLitePreparedStatement.bindInteger(1, encryptedChat.layer);
                            sQLitePreparedStatement.bindInteger(2, encryptedChat.id);
                            sQLitePreparedStatement.step();
                        } catch (Exception e3) {
                            kf7Var.p(e3, true);
                            if (sQLitePreparedStatement == null) {
                                return;
                            }
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                }
            } catch (Throwable th2) {
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th3;
        }
    }
}
