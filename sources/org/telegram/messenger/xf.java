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
    public final int f19432a;
    public final boolean f19433b;
    public final Object f19434c;
    public final Object d;

    public xf(Object obj, Object obj2, boolean z10, int i10) {
        this.f19432a = i10;
        this.f19434c = obj;
        this.d = obj2;
        this.f19433b = z10;
    }

    private final void a() {
        d9 d9Var;
        b8 b8Var = (b8) this.f19434c;
        boolean z10 = this.f19433b;
        String str = (String) this.d;
        if (!z10) {
            d9Var = (d9) b8Var.h.get(str);
        } else {
            d9Var = (d9) b8Var.f14943n.get(str);
        }
        b8Var.f14948y.remove(str);
        if (d9Var != null) {
            b8Var.f14943n.remove(str);
            b8Var.e.remove(d9Var);
            b8Var.f14942f.remove(d9Var);
            if (d9Var.f15319m != 3) {
                d9Var.f15319m = 2;
                Utilities.d.c(new z8(d9Var, 1));
                String str2 = d9Var.f15318l;
                if (str2 == null) {
                    Set set = c1.f15048a;
                } else {
                    c1.f15048a.remove(str2);
                }
                d9Var.f15321o.a();
                d9Var.b();
            }
        }
    }

    private final void b() {
        ic icVar = (ic) this.f19434c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i10 = 0;
        while (true) {
            int i11 = 3;
            if (i10 < 3) {
                if (i10 <= 0 || this.f19433b) {
                    if (i10 == 0) {
                        i11 = 1;
                    } else if (i10 == 1) {
                        i11 = 0;
                    }
                    int G = imageReceiver.G(i11);
                    if (G != 0) {
                        if (i10 == 0) {
                            HashMap hashMap = icVar.f16254l;
                            SparseArray sparseArray = icVar.f16255m;
                            String str = (String) sparseArray.get(G);
                            if (str != null) {
                                gc gcVar = (gc) hashMap.get(str);
                                if (gcVar != null) {
                                    ArrayList arrayList = gcVar.f15878c;
                                    int indexOf = arrayList.indexOf(imageReceiver);
                                    if (indexOf >= 0) {
                                        arrayList.remove(indexOf);
                                        gcVar.d.remove(indexOf);
                                    }
                                    if (arrayList.isEmpty()) {
                                        hashMap.remove(str);
                                    }
                                }
                                sparseArray.remove(G);
                            }
                        }
                        wb wbVar = (wb) icVar.f16253k.get(G);
                        if (wbVar != null) {
                            wbVar.b(imageReceiver);
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
        mg.c2 c2Var = (mg.c2) this.f19434c;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        MediaController mediaController = (MediaController) c2Var.f13087b;
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = mediaController.f14492x1;
            if (remaining > byteBuffer2.remaining()) {
                i10 = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + byteBuffer2.remaining());
            } else {
                i10 = -1;
            }
            byteBuffer2.put(byteBuffer);
            int position2 = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            boolean z10 = this.f19433b;
            if (position2 == limit || z10) {
                if (!z10) {
                    position = byteBuffer2.limit();
                } else {
                    position = byteBuffer.position();
                }
                writeFrame = mediaController.writeFrame(byteBuffer2, position);
                if (writeFrame != 0) {
                    byteBuffer2.rewind();
                    mediaController.f14461j1 += (byteBuffer2.limit() / 2) / (mediaController.f14497z1 / 1000);
                    mediaController.f14463k1++;
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
        vi viVar = (vi) this.f19434c;
        hs hsVar = (hs) this.d;
        try {
            if (hsVar.f16110b != 0) {
                SQLiteDatabase sQLiteDatabase = viVar.getMessagesStorage().f16333b;
                Locale locale = Locale.US;
                long j10 = hsVar.f16109a;
                long j11 = hsVar.f16110b;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + j10 + " AND tid = " + j11, new Object[0]);
            } else {
                SQLiteDatabase sQLiteDatabase2 = viVar.getMessagesStorage().f16333b;
                Locale locale2 = Locale.US;
                long j12 = hsVar.f16109a;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + j12, new Object[0]);
            }
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            } else {
                message = null;
            }
            queryFinalized.dispose();
            if (message == null && !this.f19433b) {
                return;
            }
            i0.g3(new qg(viVar, message, hsVar));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xf.f():void");
    }

    private final void g() {
        is isVar = (is) this.f19434c;
        isVar.x1((bp) this.d, this.f19433b);
        isVar.j(false);
        i0.g3(new cr(isVar, 17));
    }

    private final void h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xf.h():void");
    }

    private final void i() {
        int i10;
        is isVar = (is) this.f19434c;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = isVar.f16333b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, encryptedChat.f19802id);
                sQLitePreparedStatement.step();
                if (this.f19433b && (i10 = encryptedChat.in_seq_no) != 0) {
                    long j10 = (int) (encryptedChat.f19802id & 4294967295L);
                    SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j10 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i10 + ") AND uid = " + j10).stepThis().dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                isVar.o(e, true);
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

    public xf(Object obj, boolean z10, Object obj2, int i10) {
        this.f19432a = i10;
        this.f19434c = obj;
        this.f19433b = z10;
        this.d = obj2;
    }
}
