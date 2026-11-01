package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class dq implements Runnable {
    public final int f15418a;
    public final is f15419b;
    public final long f15420c;

    public dq(is isVar, long j10, int i10) {
        this.f15418a = i10;
        this.f15419b = isVar;
        this.f15420c = j10;
    }

    @Override
    public final void run() {
        long e;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor queryFinalized2;
        int i10 = this.f15418a;
        SQLiteCursor sQLiteCursor3 = null;
        long j10 = this.f15420c;
        is isVar = this.f15419b;
        switch (i10) {
            case 0:
                isVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                    sQLiteDatabase.executeFast("DELETE FROM dialog_photos WHERE uid = " + j10).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase2 = isVar.f16333b;
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    isVar.o(e7, true);
                    return;
                }
            case 1:
                isVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase3 = isVar.f16333b;
                    sQLiteDatabase3.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    isVar.o(e10, true);
                    return;
                }
            case 2:
                isVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase4 = isVar.f16333b;
                    Locale locale = Locale.US;
                    sQLiteDatabase4.executeFast("DELETE FROM topics WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (SQLiteException e11) {
                    e11.printStackTrace();
                    return;
                }
            case 3:
                is isVar2 = this.f15419b;
                try {
                    try {
                        e = isVar2.getUserConfig().e();
                        queryFinalized = isVar2.f16333b.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(e), Long.valueOf(j10));
                    } catch (Exception e12) {
                        e = e12;
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
                    SQLiteCursor queryFinalized3 = isVar2.f16333b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e));
                    while (queryFinalized3.next()) {
                        int intValue = queryFinalized3.intValue(0);
                        if (!arrayList.contains(Integer.valueOf(intValue))) {
                            NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(1);
                            if (kj.R1(e, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j10) {
                                arrayList.add(Integer.valueOf(intValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized3.dispose();
                    if (!arrayList.isEmpty()) {
                        isVar2.Q0(0, 0, e, arrayList, true);
                        isVar2.R1(e, -e, arrayList, null);
                        try {
                            ur urVar = new ur(isVar2, e, arrayList, 7);
                            isVar2 = isVar2;
                            i0.g3(urVar);
                            return;
                        } catch (Exception e13) {
                            e = e13;
                            isVar2 = isVar2;
                            isVar2.o(e, true);
                            if (sQLiteCursor3 != null) {
                                sQLiteCursor3.dispose();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Exception e14) {
                    e = e14;
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
                isVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase5 = isVar.f16333b;
                    sQLiteDatabase5.executeFast("DELETE FROM story_pushes WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    isVar.o(e15, true);
                    return;
                }
            case 5:
                isVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase6 = isVar.f16333b;
                    sQLiteDatabase6.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    isVar.o(e16, true);
                    return;
                }
            case 6:
                isVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase7 = isVar.f16333b;
                    sQLiteDatabase7.executeFast("DELETE FROM pending_tasks WHERE id = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    isVar.o(e17, true);
                    return;
                }
            default:
                long j11 = this.f15420c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase8 = isVar.f16333b;
                        queryFinalized2 = sQLiteDatabase8.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j11, new Object[0]);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e18) {
                    e = e18;
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
                    wp messagesController = isVar.getMessagesController();
                    messagesController.getClass();
                    i0.g3(new rg(messagesController, j11, hVar, true));
                    return;
                } catch (Exception e19) {
                    e = e19;
                    sQLiteCursor3 = queryFinalized2;
                    isVar.o(e, true);
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
