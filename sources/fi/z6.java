package fi;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.ur;
public final class z6 implements Runnable {
    public final int f12949a;
    public final c7 f12950b;
    public final long f12951c;
    public final int d;

    public z6(c7 c7Var, long j3, int i7, int i10) {
        this.f12949a = i10;
        this.f12950b = c7Var;
        this.f12951c = j3;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f12949a) {
            case 0:
                long j3 = this.f12951c;
                int i7 = this.d;
                ur urVar = this.f12950b.f11858b;
                SQLiteDatabase sQLiteDatabase = urVar.f27252b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i7 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    urVar.o(th2, true);
                    return;
                }
            default:
                long j10 = this.f12951c;
                int i10 = this.d;
                ur urVar2 = this.f12950b.f11858b;
                SQLiteDatabase sQLiteDatabase2 = urVar2.f27252b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10).stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    urVar2.o(th3, true);
                    return;
                }
        }
    }
}
