package fi;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.tr;
public final class z6 implements Runnable {
    public final int f12911a;
    public final c7 f12912b;
    public final long f12913c;
    public final int d;

    public z6(c7 c7Var, long j3, int i7, int i10) {
        this.f12911a = i10;
        this.f12912b = c7Var;
        this.f12913c = j3;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f12911a) {
            case 0:
                long j3 = this.f12913c;
                int i7 = this.d;
                tr trVar = this.f12912b.f11820b;
                SQLiteDatabase sQLiteDatabase = trVar.f27151b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i7 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    trVar.o(th2, true);
                    return;
                }
            default:
                long j10 = this.f12913c;
                int i10 = this.d;
                tr trVar2 = this.f12912b.f11820b;
                SQLiteDatabase sQLiteDatabase2 = trVar2.f27151b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10).stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    trVar2.o(th3, true);
                    return;
                }
        }
    }
}
