package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class gd7 implements Runnable {
    public final byte a;
    public final jf7 b;
    public final int c;
    public final long d;

    public gd7(jf7 jf7Var, int i, long j, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = i;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        long j = this.d;
        int i = this.c;
        jf7 jf7Var = this.b;
        try {
            try {
                try {
                    switch (b) {
                        case 0:
                            jf7Var.x0(i, j);
                            return;
                        case 1:
                            try {
                                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                                Locale locale = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i + " WHERE did = " + j).stepThis().dispose();
                                return;
                            } catch (SQLiteException e) {
                                jf7Var.n(e, true);
                                return;
                            }
                        case 2:
                            try {
                                sQLitePreparedStatement = jf7Var.b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, i);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                                return;
                            } catch (Exception e2) {
                                jf7Var.n(e2, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        case 3:
                            try {
                                sQLitePreparedStatement = jf7Var.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                                sQLitePreparedStatement.bindInteger(1, i);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                                return;
                            } catch (Exception e3) {
                                jf7Var.n(e3, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        case 4:
                            jf7Var.getClass();
                            try {
                                SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
                                Locale locale2 = Locale.US;
                                sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i + " AND uid = " + j).stepThis().dispose();
                                return;
                            } catch (Exception e4) {
                                jf7Var.n(e4, true);
                                return;
                            }
                        case 5:
                            try {
                                SQLitePreparedStatement executeFast = jf7Var.b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                                executeFast.bindInteger(1, i);
                                executeFast.bindLong(2, -j);
                                executeFast.step();
                                executeFast.dispose();
                                return;
                            } catch (Exception e5) {
                                jf7Var.n(e5, true);
                                return;
                            }
                        case 6:
                            try {
                                SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
                                Locale locale3 = Locale.US;
                                sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j + " AND type = " + i).stepThis().dispose();
                                return;
                            } catch (Exception e6) {
                                jf7Var.n(e6, true);
                                return;
                            }
                        default:
                            try {
                                sQLitePreparedStatement = jf7Var.b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, i);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                                return;
                            } catch (Exception e7) {
                                jf7Var.n(e7, true);
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
