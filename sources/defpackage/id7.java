package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class id7 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final int c;
    public final long d;

    public id7(kf7 kf7Var, int i, long j, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = i;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        long j = this.d;
        int i = this.c;
        kf7 kf7Var = this.b;
        try {
            try {
                try {
                    switch (b) {
                        case 0:
                            kf7Var.A0(i, j);
                            return;
                        case 1:
                            try {
                                SQLiteDatabase sQLiteDatabase = kf7Var.b;
                                Locale locale = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i + " WHERE did = " + j).stepThis().dispose();
                                return;
                            } catch (SQLiteException e) {
                                kf7Var.p(e, true);
                                return;
                            }
                        case 2:
                            try {
                                sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, i);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                                return;
                            } catch (Exception e2) {
                                kf7Var.p(e2, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        case 3:
                            try {
                                sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                                sQLitePreparedStatement.bindInteger(1, i);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                                return;
                            } catch (Exception e3) {
                                kf7Var.p(e3, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        case 4:
                            kf7Var.getClass();
                            try {
                                SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
                                Locale locale2 = Locale.US;
                                sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i + " AND uid = " + j).stepThis().dispose();
                                return;
                            } catch (Exception e4) {
                                kf7Var.p(e4, true);
                                return;
                            }
                        case 5:
                            try {
                                SQLitePreparedStatement executeFast = kf7Var.b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                                executeFast.bindInteger(1, i);
                                executeFast.bindLong(2, -j);
                                executeFast.step();
                                executeFast.dispose();
                                return;
                            } catch (Exception e5) {
                                kf7Var.p(e5, true);
                                return;
                            }
                        case 6:
                            try {
                                SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
                                Locale locale3 = Locale.US;
                                sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j + " AND type = " + i).stepThis().dispose();
                                return;
                            } catch (Exception e6) {
                                kf7Var.p(e6, true);
                                return;
                            }
                        default:
                            try {
                                sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, i);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                                return;
                            } catch (Exception e7) {
                                kf7Var.p(e7, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                    }
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th3;
        }
    }
}
