package fi;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.ur;
public final class z6 implements Runnable {
    public final int f12912a;
    public final c7 f12913b;
    public final long f12914c;
    public final int d;

    public z6(c7 c7Var, long j3, int i7, int i10) {
        this.f12912a = i10;
        this.f12913b = c7Var;
        this.f12914c = j3;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f12912a) {
            case 0:
                long j3 = this.f12914c;
                int i7 = this.d;
                ur urVar = this.f12913b.f11810b;
                SQLiteDatabase sQLiteDatabase = urVar.f27216b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i7 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    urVar.o(th2, true);
                    return;
                }
            default:
                long j10 = this.f12914c;
                int i10 = this.d;
                ur urVar2 = this.f12913b.f11810b;
                SQLiteDatabase sQLiteDatabase2 = urVar2.f27216b;
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
