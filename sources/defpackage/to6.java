package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
public final class to6 implements Runnable {
    public final hq6 a;
    public final long b;
    public final byte c;

    public to6(hq6 hq6Var, long j, int i) {
        this.a = hq6Var;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run() {
        hq6 hq6Var = this.a;
        long j = this.b;
        byte b = this.c;
        try {
            SQLiteDatabase sQLiteDatabase = hq6Var.getMessagesStorage().b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j + " AND type = " + ((int) b)).stepThis().dispose();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
