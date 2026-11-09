package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class xp implements Runnable {
    public final int f26512a;
    public final yr f26513b;
    public final long f26514c;

    public xp(yr yrVar, long j3, int i7) {
        this.f26512a = i7;
        this.f26513b = yrVar;
        this.f26514c = j3;
    }

    @Override
    public final void run() {
        long e10;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor queryFinalized2;
        int i7 = this.f26512a;
        SQLiteCursor sQLiteCursor3 = null;
        long j3 = this.f26514c;
        yr yrVar = this.f26513b;
        switch (i7) {
            case 0:
                yrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = yrVar.f26721b;
                    sQLiteDatabase.executeFast("DELETE FROM dialog_photos WHERE uid = " + j3).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase2 = yrVar.f26721b;
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    yrVar.o(e11, true);
                    return;
                }
            case 1:
                yrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase3 = yrVar.f26721b;
                    sQLiteDatabase3.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    yrVar.o(e12, true);
                    return;
                }
            case 2:
                yrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase4 = yrVar.f26721b;
                    Locale locale = Locale.US;
                    sQLiteDatabase4.executeFast("DELETE FROM topics WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (SQLiteException e13) {
                    e13.printStackTrace();
                    return;
                }
            case 3:
                yr yrVar2 = this.f26513b;
                try {
                    try {
                        e10 = yrVar2.getUserConfig().e();
                        queryFinalized = yrVar2.f26721b.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(e10), Long.valueOf(j3));
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
                    SQLiteCursor queryFinalized3 = yrVar2.f26721b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e10));
                    while (queryFinalized3.next()) {
                        int intValue = queryFinalized3.intValue(0);
                        if (!arrayList.contains(Integer.valueOf(intValue))) {
                            NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(1);
                            if (ij.Q1(e10, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j3) {
                                arrayList.add(Integer.valueOf(intValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized3.dispose();
                    if (!arrayList.isEmpty()) {
                        yrVar2.Q0(0, 0, e10, arrayList, true);
                        yrVar2.R1(e10, -e10, arrayList, null);
                        try {
                            lr lrVar = new lr(yrVar2, e10, arrayList, 7);
                            yrVar2 = yrVar2;
                            g0.h3(lrVar);
                            return;
                        } catch (Exception e15) {
                            e = e15;
                            yrVar2 = yrVar2;
                            yrVar2.o(e, true);
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
                yrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase5 = yrVar.f26721b;
                    sQLiteDatabase5.executeFast("DELETE FROM story_pushes WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    yrVar.o(e17, true);
                    return;
                }
            case 5:
                yrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase6 = yrVar.f26721b;
                    sQLiteDatabase6.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    yrVar.o(e18, true);
                    return;
                }
            case 6:
                yrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase7 = yrVar.f26721b;
                    sQLiteDatabase7.executeFast("DELETE FROM pending_tasks WHERE id = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e19) {
                    yrVar.o(e19, true);
                    return;
                }
            default:
                long j10 = this.f26514c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase8 = yrVar.f26721b;
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
                    qp messagesController = yrVar.getMessagesController();
                    messagesController.getClass();
                    g0.h3(new rg(messagesController, j10, hVar, true));
                    return;
                } catch (Exception e21) {
                    e = e21;
                    sQLiteCursor3 = queryFinalized2;
                    yrVar.o(e, true);
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
