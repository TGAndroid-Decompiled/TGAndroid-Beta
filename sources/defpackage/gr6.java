package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
public final class gr6 implements Runnable {
    public final ls6 a;
    public final long b;
    public final byte c;

    public gr6(ls6 ls6Var, long j, int i) {
        this.a = ls6Var;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run() {
        ls6 ls6Var = this.a;
        long j = this.b;
        byte b = this.c;
        try {
            SQLiteDatabase sQLiteDatabase = ls6Var.getMessagesStorage().b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j + " AND type = " + ((int) b)).stepThis().dispose();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
