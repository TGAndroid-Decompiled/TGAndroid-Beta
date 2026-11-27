package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class le7 implements Runnable {
    public final byte a;
    public final jf7 b;
    public final long c;

    public le7(jf7 jf7Var, long j, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = j;
    }

    @Override
    public final void run() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        zh6 zh6Var;
        uc7 messagesController;
        byte b = this.a;
        SQLiteCursor sQLiteCursor3 = null;
        long j = this.c;
        jf7 jf7Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLiteDatabase sQLiteDatabase = jf7Var.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j).stepThis().dispose();
                    return;
                } catch (SQLiteException e) {
                    e.printStackTrace();
                    return;
                }
            case 1:
                jf7 jf7Var2 = this.b;
                try {
                    try {
                        long e2 = jf7Var2.getUserConfig().e();
                        SQLiteDatabase sQLiteDatabase2 = jf7Var2.b;
                        Long valueOf = Long.valueOf(e2);
                        Long valueOf2 = Long.valueOf(j);
                        Object[] objArr = new Object[2];
                        try {
                            objArr[0] = valueOf;
                            objArr[1] = valueOf2;
                            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", objArr);
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (queryFinalized.next()) {
                                    arrayList.add(Integer.valueOf(queryFinalized.intValue(0)));
                                }
                                queryFinalized.dispose();
                                SQLiteCursor queryFinalized2 = jf7Var2.b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e2));
                                while (queryFinalized2.next()) {
                                    int intValue = queryFinalized2.intValue(0);
                                    if (!arrayList.contains(Integer.valueOf(intValue))) {
                                        NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                                        if (r47.Q1(e2, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j) {
                                            arrayList.add(Integer.valueOf(intValue));
                                        }
                                        byteBufferValue.reuse();
                                    }
                                }
                                queryFinalized2.dispose();
                                if (!arrayList.isEmpty()) {
                                    jf7Var2.N0(0, 0, e2, arrayList, true);
                                    jf7Var2.O1(e2, -e2, arrayList, null);
                                    try {
                                        se7 se7Var = new se7(jf7Var2, e2, arrayList, (byte) 9);
                                        jf7Var2 = jf7Var2;
                                        hl.c3(se7Var);
                                        return;
                                    } catch (Exception e3) {
                                        e = e3;
                                        jf7Var2 = jf7Var2;
                                        jf7Var2.n(e, true);
                                        if (sQLiteCursor3 != null) {
                                            sQLiteCursor3.dispose();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            } catch (Exception e4) {
                                e = e4;
                                sQLiteCursor3 = sQLiteCursor2;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor3 = sQLiteCursor;
                                if (sQLiteCursor3 != null) {
                                    sQLiteCursor3.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            case 2:
                try {
                    SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
                    sQLiteDatabase3.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    jf7Var.n(e7, true);
                    return;
                }
            case 3:
                try {
                    SQLiteDatabase sQLiteDatabase4 = jf7Var.b;
                    sQLiteDatabase4.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e8) {
                    jf7Var.n(e8, true);
                    return;
                }
            case 4:
                try {
                    SQLiteDatabase sQLiteDatabase5 = jf7Var.b;
                    sQLiteDatabase5.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    jf7Var.n(e9, true);
                    return;
                }
            case 5:
                try {
                    SQLiteDatabase sQLiteDatabase6 = jf7Var.b;
                    sQLiteDatabase6.executeFast("DELETE FROM pending_tasks WHERE id = " + j).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    jf7Var.n(e10, true);
                    return;
                }
            case 6:
                long j2 = this.c;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase7 = jf7Var.b;
                        SQLiteCursor queryFinalized3 = sQLiteDatabase7.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j2, new Object[0]);
                        try {
                            zh6Var = new zh6();
                            while (queryFinalized3.next()) {
                                NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(1);
                                if (byteBufferValue2 != null) {
                                    TLRPC.ChannelParticipant TLdeserialize = TLRPC.ChannelParticipant.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    byteBufferValue2.reuse();
                                    if (TLdeserialize != null) {
                                        zh6Var.k(queryFinalized3.longValue(0), TLdeserialize);
                                    }
                                }
                            }
                            queryFinalized3.dispose();
                            messagesController = jf7Var.getMessagesController();
                            messagesController.getClass();
                        } catch (Exception e11) {
                            e = e11;
                            sQLiteCursor3 = queryFinalized3;
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor3 = queryFinalized3;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    hl.c3(new j61((Object) messagesController, j2, (Object) zh6Var, true, (byte) 6));
                    return;
                } catch (Exception e13) {
                    e = e13;
                    jf7Var.n(e, true);
                    if (sQLiteCursor3 != null) {
                        sQLiteCursor3.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    if (sQLiteCursor3 != null) {
                        sQLiteCursor3.dispose();
                    }
                    throw th;
                }
            default:
                try {
                    SQLiteDatabase sQLiteDatabase8 = jf7Var.b;
                    sQLiteDatabase8.executeFast("DELETE FROM dialog_photos WHERE uid = " + j).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase9 = jf7Var.b;
                    sQLiteDatabase9.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    jf7Var.n(e14, true);
                    return;
                }
        }
    }
}
