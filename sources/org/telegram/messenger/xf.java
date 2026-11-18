package org.telegram.messenger;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class xf implements Runnable {
    public final int f27871a;
    public final boolean f27872b;
    public final Object f27873c;
    public final Object d;

    public xf(Object obj, Object obj2, boolean z10, int i7) {
        this.f27871a = i7;
        this.f27873c = obj;
        this.d = obj2;
        this.f27872b = z10;
    }

    private final void a() {
        y8 y8Var;
        w7 w7Var = (w7) this.f27873c;
        boolean z10 = this.f27872b;
        String str = (String) this.d;
        if (!z10) {
            y8Var = (y8) w7Var.h.get(str);
        } else {
            y8Var = (y8) w7Var.f27654n.get(str);
        }
        w7Var.f27659y.remove(str);
        if (y8Var != null) {
            w7Var.f27654n.remove(str);
            w7Var.f27652e.remove(y8Var);
            w7Var.f27653f.remove(y8Var);
            if (y8Var.f28096m != 3) {
                y8Var.f28096m = 2;
                Utilities.d.c(new u8(y8Var, 1));
                String str2 = y8Var.f28095l;
                if (str2 == null) {
                    Set set = z0.f28238a;
                } else {
                    z0.f28238a.remove(str2);
                }
                y8Var.f28098o.a();
                y8Var.b();
            }
        }
    }

    private final void b() {
        ec ecVar = (ec) this.f27873c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i7 = 0;
        while (true) {
            int i10 = 3;
            if (i7 < 3) {
                if (i7 <= 0 || this.f27872b) {
                    if (i7 == 0) {
                        i10 = 1;
                    } else if (i7 == 1) {
                        i10 = 0;
                    }
                    int G = imageReceiver.G(i10);
                    if (G != 0) {
                        if (i7 == 0) {
                            HashMap hashMap = ecVar.f23688l;
                            SparseArray sparseArray = ecVar.f23689m;
                            String str = (String) sparseArray.get(G);
                            if (str != null) {
                                cc ccVar = (cc) hashMap.get(str);
                                if (ccVar != null) {
                                    ArrayList arrayList = ccVar.f23329c;
                                    int indexOf = arrayList.indexOf(imageReceiver);
                                    if (indexOf >= 0) {
                                        arrayList.remove(indexOf);
                                        ccVar.d.remove(indexOf);
                                    }
                                    if (arrayList.isEmpty()) {
                                        hashMap.remove(str);
                                    }
                                }
                                sparseArray.remove(G);
                            }
                        }
                        sb sbVar = (sb) ecVar.f23687k.get(G);
                        if (sbVar != null) {
                            sbVar.b(imageReceiver);
                        }
                    }
                    i7++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void c() {
        int i7;
        int position;
        int writeFrame;
        j6.o oVar = (j6.o) this.f27873c;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        MediaController mediaController = (MediaController) oVar.f17271b;
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = mediaController.f22755z1;
            if (remaining > byteBuffer2.remaining()) {
                i7 = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + byteBuffer2.remaining());
            } else {
                i7 = -1;
            }
            byteBuffer2.put(byteBuffer);
            int position2 = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            boolean z10 = this.f27872b;
            if (position2 == limit || z10) {
                if (!z10) {
                    position = byteBuffer2.limit();
                } else {
                    position = byteBuffer.position();
                }
                writeFrame = mediaController.writeFrame(byteBuffer2, position);
                if (writeFrame != 0) {
                    byteBuffer2.rewind();
                    mediaController.l1 += (byteBuffer2.limit() / 2) / (mediaController.B1 / 1000);
                    mediaController.f22724m1++;
                } else {
                    a8.d("writing frame failed");
                }
            }
            if (i7 != -1) {
                byteBuffer.limit(i7);
            }
        }
        mediaController.N1.c(new z4(24, oVar, byteBuffer));
    }

    private final void d() {
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        ri riVar = (ri) this.f27873c;
        sr srVar = (sr) this.d;
        try {
            if (srVar.f26848b != 0) {
                SQLiteDatabase sQLiteDatabase = riVar.getMessagesStorage().f27056b;
                Locale locale = Locale.US;
                long j3 = srVar.f26847a;
                long j10 = srVar.f26848b;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + j3 + " AND tid = " + j10, new Object[0]);
            } else {
                SQLiteDatabase sQLiteDatabase2 = riVar.getMessagesStorage().f27056b;
                Locale locale2 = Locale.US;
                long j11 = srVar.f26847a;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + j11, new Object[0]);
            }
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            } else {
                message = null;
            }
            queryFinalized.dispose();
            if (message == null && !this.f27872b) {
                return;
            }
            g0.g3(new og(riVar, message, srVar));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xf.f():void");
    }

    private final void g() {
        tr trVar = (tr) this.f27873c;
        trVar.x1((ro) this.d, this.f27872b);
        trVar.j(false);
        g0.g3(new pq(trVar, 15));
    }

    private final void h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xf.h():void");
    }

    private final void i() {
        int i7;
        tr trVar = (tr) this.f27873c;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = trVar.f27056b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, encryptedChat.f28413id);
                sQLitePreparedStatement.step();
                if (this.f27872b && (i7 = encryptedChat.in_seq_no) != 0) {
                    long j3 = (int) (encryptedChat.f28413id & 4294967295L);
                    SQLiteDatabase sQLiteDatabase = trVar.f27056b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j3 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i7 + ") AND uid = " + j3).stepThis().dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                trVar.o(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private final void j() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xf.j():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xf.run():void");
    }

    public xf(Object obj, boolean z10, Object obj2, int i7) {
        this.f27871a = i7;
        this.f27873c = obj;
        this.f27872b = z10;
        this.d = obj2;
    }
}
