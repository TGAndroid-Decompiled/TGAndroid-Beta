package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class pp implements Runnable {
    public final int f26284a;
    public final tr f26285b;
    public final long f26286c;

    public pp(tr trVar, long j3, int i7) {
        this.f26284a = i7;
        this.f26285b = trVar;
        this.f26286c = j3;
    }

    @Override
    public final void run() {
        long e10;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor queryFinalized2;
        int i7 = this.f26284a;
        SQLiteCursor sQLiteCursor3 = null;
        long j3 = this.f26286c;
        tr trVar = this.f26285b;
        switch (i7) {
            case 0:
                trVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = trVar.f27054b;
                    sQLiteDatabase.executeFast("DELETE FROM dialog_photos WHERE uid = " + j3).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase2 = trVar.f27054b;
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    trVar.o(e11, true);
                    return;
                }
            case 1:
                trVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase3 = trVar.f27054b;
                    sQLiteDatabase3.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    trVar.o(e12, true);
                    return;
                }
            case 2:
                trVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase4 = trVar.f27054b;
                    Locale locale = Locale.US;
                    sQLiteDatabase4.executeFast("DELETE FROM topics WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (SQLiteException e13) {
                    e13.printStackTrace();
                    return;
                }
            case 3:
                tr trVar2 = this.f26285b;
                try {
                    try {
                        e10 = trVar2.getUserConfig().e();
                        queryFinalized = trVar2.f27054b.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(e10), Long.valueOf(j3));
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
                    SQLiteCursor queryFinalized3 = trVar2.f27054b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e10));
                    while (queryFinalized3.next()) {
                        int intValue = queryFinalized3.intValue(0);
                        if (!arrayList.contains(Integer.valueOf(intValue))) {
                            NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(1);
                            if (fj.Q1(e10, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j3) {
                                arrayList.add(Integer.valueOf(intValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized3.dispose();
                    if (!arrayList.isEmpty()) {
                        trVar2.Q0(0, 0, e10, arrayList, true);
                        trVar2.R1(e10, -e10, arrayList, null);
                        try {
                            gr grVar = new gr(trVar2, e10, arrayList, 8);
                            trVar2 = trVar2;
                            g0.g3(grVar);
                            return;
                        } catch (Exception e15) {
                            e = e15;
                            trVar2 = trVar2;
                            trVar2.o(e, true);
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
                trVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase5 = trVar.f27054b;
                    sQLiteDatabase5.executeFast("DELETE FROM story_pushes WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    trVar.o(e17, true);
                    return;
                }
            case 5:
                trVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase6 = trVar.f27054b;
                    sQLiteDatabase6.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    trVar.o(e18, true);
                    return;
                }
            case 6:
                trVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase7 = trVar.f27054b;
                    sQLiteDatabase7.executeFast("DELETE FROM pending_tasks WHERE id = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e19) {
                    trVar.o(e19, true);
                    return;
                }
            default:
                long j10 = this.f26286c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase8 = trVar.f27054b;
                        queryFinalized2 = sQLiteDatabase8.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j10, new Object[0]);
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
                    mp messagesController = trVar.getMessagesController();
                    messagesController.getClass();
                    g0.g3(new pg(messagesController, j10, hVar, true));
                    return;
                } catch (Exception e21) {
                    e = e21;
                    sQLiteCursor3 = queryFinalized2;
                    trVar.o(e, true);
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
