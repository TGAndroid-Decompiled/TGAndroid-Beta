package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class le7 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final long c;
    public final ef7 d;

    public le7(kf7 kf7Var, long j, ef7 ef7Var, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = j;
        this.d = ef7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        final ef7 ef7Var = this.d;
        long j = this.c;
        kf7 kf7Var = this.b;
        final int i = 0;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = kf7Var.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                        if (sQLiteCursor.next()) {
                            i = sQLiteCursor.intValue(0);
                        }
                        sQLiteCursor.dispose();
                        hl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                int i2 = i;
                                ef7 ef7Var2 = ef7Var;
                                switch (b2) {
                                    case 0:
                                        ef7Var2.a(i2);
                                        return;
                                    default:
                                        ef7Var2.a(i2);
                                        return;
                                }
                            }
                        });
                    } catch (Exception e) {
                        kf7Var.p(e, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            default:
                try {
                    try {
                        final int i2 = -1;
                        if (kf7Var.K.f(j) == null) {
                            sQLiteCursor = kf7Var.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                            if (sQLiteCursor.next()) {
                                i2 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                        }
                        hl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                int i22 = i2;
                                ef7 ef7Var2 = ef7Var;
                                switch (b2) {
                                    case 0:
                                        ef7Var2.a(i22);
                                        return;
                                    default:
                                        ef7Var2.a(i22);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        kf7Var.p(e2, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
        }
    }
}
