package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class ke7 implements Runnable {
    public final byte a;
    public final jf7 b;
    public final long c;
    public final df7 d;

    public ke7(jf7 jf7Var, long j, df7 df7Var, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = j;
        this.d = df7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        final df7 df7Var = this.d;
        long j = this.c;
        jf7 jf7Var = this.b;
        final int i = 0;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = jf7Var.b;
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
                                df7 df7Var2 = df7Var;
                                switch (b2) {
                                    case 0:
                                        df7Var2.a(i2);
                                        return;
                                    default:
                                        df7Var2.a(i2);
                                        return;
                                }
                            }
                        });
                    } catch (Exception e) {
                        jf7Var.n(e, true);
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
                        if (jf7Var.K.f(j) == null) {
                            sQLiteCursor = jf7Var.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
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
                                df7 df7Var2 = df7Var;
                                switch (b2) {
                                    case 0:
                                        df7Var2.a(i22);
                                        return;
                                    default:
                                        df7Var2.a(i22);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        jf7Var.n(e2, true);
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
