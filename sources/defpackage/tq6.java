package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
public final class tq6 implements Runnable {
    public final hs6 a;
    public final long b;
    public final byte c;

    public tq6(hs6 hs6Var, long j, int i) {
        this.a = hs6Var;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run() {
        hs6 hs6Var = this.a;
        long j = this.b;
        byte b = this.c;
        try {
            SQLiteDatabase sQLiteDatabase = hs6Var.getMessagesStorage().b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j + " AND type = " + ((int) b)).stepThis().dispose();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
