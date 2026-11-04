package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class op implements Runnable {
    public final int f24583a;
    public final qr f24584b;
    public final long f24585c;

    public op(qr qrVar, long j10, int i3) {
        this.f24583a = i3;
        this.f24584b = qrVar;
        this.f24585c = j10;
    }

    @Override
    public final void run() {
        long e10;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor queryFinalized2;
        int i3 = this.f24583a;
        SQLiteCursor sQLiteCursor3 = null;
        long j10 = this.f24585c;
        qr qrVar = this.f24584b;
        switch (i3) {
            case 0:
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                    sQLiteDatabase.executeFast("DELETE FROM dialog_photos WHERE uid = " + j10).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase2 = qrVar.f24936b;
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    qrVar.o(e11, true);
                    return;
                }
            case 1:
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase3 = qrVar.f24936b;
                    sQLiteDatabase3.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    qrVar.o(e12, true);
                    return;
                }
            case 2:
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase4 = qrVar.f24936b;
                    Locale locale = Locale.US;
                    sQLiteDatabase4.executeFast("DELETE FROM topics WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (SQLiteException e13) {
                    e13.printStackTrace();
                    return;
                }
            case 3:
                qr qrVar2 = this.f24584b;
                try {
                    try {
                        e10 = qrVar2.getUserConfig().e();
                        queryFinalized = qrVar2.f24936b.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(e10), Long.valueOf(j10));
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    while (queryFinalized.next()) {
                        arrayList.add(Integer.valueOf(queryFinalized.intValue(0)));
                    }
                    queryFinalized.dispose();
                    SQLiteCursor queryFinalized3 = qrVar2.f24936b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e10));
                    while (queryFinalized3.next()) {
                        int intValue = queryFinalized3.intValue(0);
                        if (!arrayList.contains(Integer.valueOf(intValue))) {
                            NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(1);
                            if (zi.R1(e10, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j10) {
                                arrayList.add(Integer.valueOf(intValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized3.dispose();
                    if (!arrayList.isEmpty()) {
                        qrVar2.Q0(0, 0, e10, arrayList, true);
                        qrVar2.R1(e10, -e10, arrayList, null);
                        try {
                            dr drVar = new dr(qrVar2, e10, arrayList, 7);
                            qrVar2 = qrVar2;
                            g0.h3(drVar);
                            return;
                        } catch (Exception e15) {
                            e = e15;
                            qrVar2 = qrVar2;
                            qrVar2.o(e, true);
                            if (sQLiteCursor3 != null) {
                                sQLiteCursor3.dispose();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Exception e16) {
                    e = e16;
                    sQLiteCursor3 = sQLiteCursor2;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor3 = sQLiteCursor;
                    if (sQLiteCursor3 != null) {
                        sQLiteCursor3.dispose();
                    }
                    throw th;
                }
            case 4:
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase5 = qrVar.f24936b;
                    sQLiteDatabase5.executeFast("DELETE FROM story_pushes WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    qrVar.o(e17, true);
                    return;
                }
            case 5:
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase6 = qrVar.f24936b;
                    sQLiteDatabase6.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    qrVar.o(e18, true);
                    return;
                }
            case 6:
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase7 = qrVar.f24936b;
                    sQLiteDatabase7.executeFast("DELETE FROM pending_tasks WHERE id = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e19) {
                    qrVar.o(e19, true);
                    return;
                }
            default:
                long j11 = this.f24585c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase8 = qrVar.f24936b;
                        queryFinalized2 = sQLiteDatabase8.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j11, new Object[0]);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e20) {
                    e = e20;
                }
                try {
                    a0.h hVar = new a0.h();
                    while (queryFinalized2.next()) {
                        NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(1);
                        if (byteBufferValue2 != null) {
                            TLRPC.ChannelParticipant TLdeserialize = TLRPC.ChannelParticipant.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                            byteBufferValue2.reuse();
                            if (TLdeserialize != null) {
                                hVar.k(TLdeserialize, queryFinalized2.longValue(0));
                            }
                        }
                    }
                    queryFinalized2.dispose();
                    hp messagesController = qrVar.getMessagesController();
                    messagesController.getClass();
                    g0.h3(new jg(messagesController, j11, hVar, true));
                    return;
                } catch (Exception e21) {
                    e = e21;
                    sQLiteCursor3 = queryFinalized2;
                    qrVar.o(e, true);
                    if (sQLiteCursor3 != null) {
                        sQLiteCursor3.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor3 = queryFinalized2;
                    if (sQLiteCursor3 != null) {
                        sQLiteCursor3.dispose();
                    }
                    throw th;
                }
        }
    }
}
