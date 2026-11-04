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
public final class qf implements Runnable {
    public final int f24884a;
    public final boolean f24885b;
    public final Object f24886c;
    public final Object d;

    public qf(Object obj, Object obj2, boolean z10, int i3) {
        this.f24884a = i3;
        this.f24886c = obj;
        this.d = obj2;
        this.f24885b = z10;
    }

    private final void a() {
        y8 y8Var;
        w7 w7Var = (w7) this.f24886c;
        boolean z10 = this.f24885b;
        String str = (String) this.d;
        if (!z10) {
            y8Var = (y8) w7Var.h.get(str);
        } else {
            y8Var = (y8) w7Var.f26171n.get(str);
        }
        w7Var.f26176y.remove(str);
        if (y8Var != null) {
            w7Var.f26171n.remove(str);
            w7Var.f26169e.remove(y8Var);
            w7Var.f26170f.remove(y8Var);
            if (y8Var.f26544m != 3) {
                y8Var.f26544m = 2;
                Utilities.d.c(new u8(y8Var, 1));
                String str2 = y8Var.f26543l;
                if (str2 == null) {
                    Set set = z0.f26694a;
                } else {
                    z0.f26694a.remove(str2);
                }
                y8Var.f26546o.a();
                y8Var.b();
            }
        }
    }

    private final void b() {
        zb zbVar = (zb) this.f24886c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i3 = 0;
        while (true) {
            int i10 = 3;
            if (i3 < 3) {
                if (i3 <= 0 || this.f24885b) {
                    if (i3 == 0) {
                        i10 = 1;
                    } else if (i3 == 1) {
                        i10 = 0;
                    }
                    int G = imageReceiver.G(i10);
                    if (G != 0) {
                        if (i3 == 0) {
                            HashMap hashMap = zbVar.f26766l;
                            SparseArray sparseArray = zbVar.f26767m;
                            String str = (String) sparseArray.get(G);
                            if (str != null) {
                                xb xbVar = (xb) hashMap.get(str);
                                if (xbVar != null) {
                                    ArrayList arrayList = xbVar.f26359c;
                                    int indexOf = arrayList.indexOf(imageReceiver);
                                    if (indexOf >= 0) {
                                        arrayList.remove(indexOf);
                                        xbVar.d.remove(indexOf);
                                    }
                                    if (arrayList.isEmpty()) {
                                        hashMap.remove(str);
                                    }
                                }
                                sparseArray.remove(G);
                            }
                        }
                        nb nbVar = (nb) zbVar.f26765k.get(G);
                        if (nbVar != null) {
                            nbVar.b(imageReceiver);
                        }
                    }
                    i3++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void c() {
        int i3;
        int position;
        int writeFrame;
        mi.b0 b0Var = (mi.b0) this.f24886c;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        MediaController mediaController = (MediaController) b0Var.f19470b;
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = mediaController.f21360z1;
            if (remaining > byteBuffer2.remaining()) {
                i3 = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + byteBuffer2.remaining());
            } else {
                i3 = -1;
            }
            byteBuffer2.put(byteBuffer);
            int position2 = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            boolean z10 = this.f24885b;
            if (position2 == limit || z10) {
                if (!z10) {
                    position = byteBuffer2.limit();
                } else {
                    position = byteBuffer.position();
                }
                writeFrame = mediaController.writeFrame(byteBuffer2, position);
                if (writeFrame != 0) {
                    byteBuffer2.rewind();
                    mediaController.f21328l1 += (byteBuffer2.limit() / 2) / (mediaController.B1 / 1000);
                    mediaController.m1++;
                } else {
                    a8.d("writing frame failed");
                }
            }
            if (i3 != -1) {
                byteBuffer.limit(i3);
            }
        }
        mediaController.N1.c(new y4(24, b0Var, byteBuffer));
    }

    private final void e() {
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        li liVar = (li) this.f24886c;
        pr prVar = (pr) this.d;
        try {
            if (prVar.f24798b != 0) {
                SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().f24936b;
                Locale locale = Locale.US;
                long j10 = prVar.f24797a;
                long j11 = prVar.f24798b;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + j10 + " AND tid = " + j11, new Object[0]);
            } else {
                SQLiteDatabase sQLiteDatabase2 = liVar.getMessagesStorage().f24936b;
                Locale locale2 = Locale.US;
                long j12 = prVar.f24797a;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + j12, new Object[0]);
            }
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            } else {
                message = null;
            }
            queryFinalized.dispose();
            if (message == null && !this.f24885b) {
                return;
            }
            g0.h3(new ig(liVar, message, prVar));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qf.f():void");
    }

    private final void g() {
        qr qrVar = (qr) this.f24886c;
        qrVar.x1((mo) this.d, this.f24885b);
        qrVar.j(false);
        g0.h3(new hq(qrVar, 17));
    }

    private final void h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qf.h():void");
    }

    private final void i() {
        int i3;
        qr qrVar = (qr) this.f24886c;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = qrVar.f24936b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, encryptedChat.f27009id);
                sQLitePreparedStatement.step();
                if (this.f24885b && (i3 = encryptedChat.in_seq_no) != 0) {
                    long j10 = (int) (encryptedChat.f27009id & 4294967295L);
                    SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j10 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i3 + ") AND uid = " + j10).stepThis().dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                qrVar.o(e10, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qf.j():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qf.run():void");
    }

    public qf(Object obj, boolean z10, Object obj2, int i3) {
        this.f24884a = i3;
        this.f24886c = obj;
        this.f24885b = z10;
        this.d = obj2;
    }
}
