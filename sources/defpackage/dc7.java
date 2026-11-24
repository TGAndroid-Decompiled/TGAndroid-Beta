package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class dc7 implements Runnable {
    public final byte a;
    public final ad7 b;
    public final long c;
    public final uc7 d;

    public dc7(ad7 ad7Var, long j, uc7 uc7Var, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = j;
        this.d = uc7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        final uc7 uc7Var = this.d;
        long j = this.c;
        ad7 ad7Var = this.b;
        final int i = 0;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7Var.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                        if (sQLiteCursor.next()) {
                            i = sQLiteCursor.intValue(0);
                        }
                        sQLiteCursor.dispose();
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                int i2 = i;
                                uc7 uc7Var2 = uc7Var;
                                switch (b2) {
                                    case 0:
                                        uc7Var2.a(i2);
                                        return;
                                    default:
                                        uc7Var2.a(i2);
                                        return;
                                }
                            }
                        });
                    } catch (Exception e) {
                        ad7Var.n(e, true);
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
                        if (ad7Var.K.f(j) == null) {
                            sQLiteCursor = ad7Var.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                            if (sQLiteCursor.next()) {
                                i2 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                        }
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                int i22 = i2;
                                uc7 uc7Var2 = uc7Var;
                                switch (b2) {
                                    case 0:
                                        uc7Var2.a(i22);
                                        return;
                                    default:
                                        uc7Var2.a(i22);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        ad7Var.n(e2, true);
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
