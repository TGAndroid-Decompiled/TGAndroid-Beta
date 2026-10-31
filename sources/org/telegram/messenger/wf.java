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
public final class wf implements Runnable {
    public final int f19089a;
    public final boolean f19090b;
    public final Object f19091c;
    public final Object d;

    public wf(Object obj, Object obj2, boolean z10, int i10) {
        this.f19089a = i10;
        this.f19091c = obj;
        this.d = obj2;
        this.f19090b = z10;
    }

    private final void a() {
        d9 d9Var;
        b8 b8Var = (b8) this.f19091c;
        boolean z10 = this.f19090b;
        String str = (String) this.d;
        if (!z10) {
            d9Var = (d9) b8Var.h.get(str);
        } else {
            d9Var = (d9) b8Var.f14743n.get(str);
        }
        b8Var.f14748y.remove(str);
        if (d9Var != null) {
            b8Var.f14743n.remove(str);
            b8Var.e.remove(d9Var);
            b8Var.f14742f.remove(d9Var);
            if (d9Var.f15204m != 3) {
                d9Var.f15204m = 2;
                Utilities.d.c(new z8(d9Var, 1));
                String str2 = d9Var.f15203l;
                if (str2 == null) {
                    Set set = c1.f14889a;
                } else {
                    c1.f14889a.remove(str2);
                }
                d9Var.f15206o.a();
                d9Var.b();
            }
        }
    }

    private final void b() {
        hc hcVar = (hc) this.f19091c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i10 = 0;
        while (true) {
            int i11 = 3;
            if (i10 < 3) {
                if (i10 <= 0 || this.f19090b) {
                    if (i10 == 0) {
                        i11 = 1;
                    } else if (i10 == 1) {
                        i11 = 0;
                    }
                    int G = imageReceiver.G(i11);
                    if (G != 0) {
                        if (i10 == 0) {
                            HashMap hashMap = hcVar.f15861l;
                            SparseArray sparseArray = hcVar.f15862m;
                            String str = (String) sparseArray.get(G);
                            if (str != null) {
                                fc fcVar = (fc) hashMap.get(str);
                                if (fcVar != null) {
                                    ArrayList arrayList = fcVar.f15537c;
                                    int indexOf = arrayList.indexOf(imageReceiver);
                                    if (indexOf >= 0) {
                                        arrayList.remove(indexOf);
                                        fcVar.d.remove(indexOf);
                                    }
                                    if (arrayList.isEmpty()) {
                                        hashMap.remove(str);
                                    }
                                }
                                sparseArray.remove(G);
                            }
                        }
                        vb vbVar = (vb) hcVar.f15860k.get(G);
                        if (vbVar != null) {
                            vbVar.b(imageReceiver);
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void c() {
        int i10;
        int position;
        int writeFrame;
        mg.c2 c2Var = (mg.c2) this.f19091c;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        MediaController mediaController = (MediaController) c2Var.f13086b;
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = mediaController.f14491x1;
            if (remaining > byteBuffer2.remaining()) {
                i10 = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + byteBuffer2.remaining());
            } else {
                i10 = -1;
            }
            byteBuffer2.put(byteBuffer);
            int position2 = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            boolean z10 = this.f19090b;
            if (position2 == limit || z10) {
                if (!z10) {
                    position = byteBuffer2.limit();
                } else {
                    position = byteBuffer.position();
                }
                writeFrame = mediaController.writeFrame(byteBuffer2, position);
                if (writeFrame != 0) {
                    byteBuffer2.rewind();
                    mediaController.f14460j1 += (byteBuffer2.limit() / 2) / (mediaController.f14496z1 / 1000);
                    mediaController.f14462k1++;
                } else {
                    f8.d("writing frame failed");
                }
            }
            if (i10 != -1) {
                byteBuffer.limit(i10);
            }
        }
        mediaController.L1.c(new t6(22, c2Var, byteBuffer));
    }

    private final void d() {
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        ui uiVar = (ui) this.f19091c;
        gs gsVar = (gs) this.d;
        try {
            if (gsVar.f15761b != 0) {
                SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f15940b;
                Locale locale = Locale.US;
                long j10 = gsVar.f15760a;
                long j11 = gsVar.f15761b;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + j10 + " AND tid = " + j11, new Object[0]);
            } else {
                SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().f15940b;
                Locale locale2 = Locale.US;
                long j12 = gsVar.f15760a;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + j12, new Object[0]);
            }
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            } else {
                message = null;
            }
            queryFinalized.dispose();
            if (message == null && !this.f19090b) {
                return;
            }
            i0.g3(new pg(uiVar, message, gsVar));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wf.f():void");
    }

    private final void g() {
        hs hsVar = (hs) this.f19091c;
        hsVar.x1((ap) this.d, this.f19090b);
        hsVar.j(false);
        i0.g3(new br(hsVar, 17));
    }

    private final void h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wf.h():void");
    }

    private final void i() {
        int i10;
        hs hsVar = (hs) this.f19091c;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = hsVar.f15940b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, encryptedChat.f19801id);
                sQLitePreparedStatement.step();
                if (this.f19090b && (i10 = encryptedChat.in_seq_no) != 0) {
                    long j10 = (int) (encryptedChat.f19801id & 4294967295L);
                    SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j10 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i10 + ") AND uid = " + j10).stepThis().dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                hsVar.o(e, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wf.j():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wf.run():void");
    }

    public wf(Object obj, boolean z10, Object obj2, int i10) {
        this.f19089a = i10;
        this.f19091c = obj;
        this.f19090b = z10;
        this.d = obj2;
    }
}
