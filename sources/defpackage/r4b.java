package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
public final class r4b implements Runnable {
    public final byte a;
    public final t4b b;
    public final long c;
    public final int d;

    public r4b(t4b t4bVar, long j, int i, byte b) {
        this.a = b;
        this.b = t4bVar;
        this.c = j;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        t4b t4bVar = this.b;
        switch (b) {
            case 0:
                cf7 cf7Var = t4bVar.b;
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j + ", 0, " + i + ")").stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    cf7Var.n(th, true);
                    return;
                }
            default:
                cf7 cf7Var2 = t4bVar.b;
                SQLiteDatabase sQLiteDatabase2 = cf7Var2.b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j + " AND story_id = " + i).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    cf7Var2.n(th2, true);
                    return;
                }
        }
    }
}
