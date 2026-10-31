package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class cq implements Runnable {
    public final int f15062a;
    public final hs f15063b;
    public final long f15064c;

    public cq(hs hsVar, long j10, int i10) {
        this.f15062a = i10;
        this.f15063b = hsVar;
        this.f15064c = j10;
    }

    @Override
    public final void run() {
        long e;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor queryFinalized2;
        int i10 = this.f15062a;
        SQLiteCursor sQLiteCursor3 = null;
        long j10 = this.f15064c;
        hs hsVar = this.f15063b;
        switch (i10) {
            case 0:
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
                    sQLiteDatabase.executeFast("DELETE FROM dialog_photos WHERE uid = " + j10).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase2 = hsVar.f15940b;
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    hsVar.o(e7, true);
                    return;
                }
            case 1:
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase3 = hsVar.f15940b;
                    sQLiteDatabase3.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    hsVar.o(e10, true);
                    return;
                }
            case 2:
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase4 = hsVar.f15940b;
                    Locale locale = Locale.US;
                    sQLiteDatabase4.executeFast("DELETE FROM topics WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (SQLiteException e11) {
                    e11.printStackTrace();
                    return;
                }
            case 3:
                hs hsVar2 = this.f15063b;
                try {
                    try {
                        e = hsVar2.getUserConfig().e();
                        queryFinalized = hsVar2.f15940b.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(e), Long.valueOf(j10));
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
                    SQLiteCursor queryFinalized3 = hsVar2.f15940b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e));
                    while (queryFinalized3.next()) {
                        int intValue = queryFinalized3.intValue(0);
                        if (!arrayList.contains(Integer.valueOf(intValue))) {
                            NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(1);
                            if (jj.R1(e, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j10) {
                                arrayList.add(Integer.valueOf(intValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized3.dispose();
                    if (!arrayList.isEmpty()) {
                        hsVar2.Q0(0, 0, e, arrayList, true);
                        hsVar2.R1(e, -e, arrayList, null);
                        try {
                            tr trVar = new tr(hsVar2, e, arrayList, 7);
                            hsVar2 = hsVar2;
                            i0.g3(trVar);
                            return;
                        } catch (Exception e13) {
                            e = e13;
                            hsVar2 = hsVar2;
                            hsVar2.o(e, true);
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
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase5 = hsVar.f15940b;
                    sQLiteDatabase5.executeFast("DELETE FROM story_pushes WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    hsVar.o(e15, true);
                    return;
                }
            case 5:
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase6 = hsVar.f15940b;
                    sQLiteDatabase6.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    hsVar.o(e16, true);
                    return;
                }
            case 6:
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase7 = hsVar.f15940b;
                    sQLiteDatabase7.executeFast("DELETE FROM pending_tasks WHERE id = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    hsVar.o(e17, true);
                    return;
                }
            default:
                long j11 = this.f15064c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase8 = hsVar.f15940b;
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
                    vp messagesController = hsVar.getMessagesController();
                    messagesController.getClass();
                    i0.g3(new qg(messagesController, j11, hVar, true));
                    return;
                } catch (Exception e19) {
                    e = e19;
                    sQLiteCursor3 = queryFinalized2;
                    hsVar.o(e, true);
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
