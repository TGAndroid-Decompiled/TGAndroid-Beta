package di;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.yr;
public final class j7 implements Runnable {
    public final int f9266a;
    public final m7 f9267b;
    public final long f9268c;
    public final int d;

    public j7(m7 m7Var, long j3, int i7, int i10) {
        this.f9266a = i10;
        this.f9267b = m7Var;
        this.f9268c = j3;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f9266a) {
            case 0:
                long j3 = this.f9268c;
                int i7 = this.d;
                yr yrVar = this.f9267b.f9368b;
                SQLiteDatabase sQLiteDatabase = yrVar.f26725b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i7 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    yrVar.o(th2, true);
                    return;
                }
            default:
                long j10 = this.f9268c;
                int i10 = this.d;
                yr yrVar2 = this.f9267b.f9368b;
                SQLiteDatabase sQLiteDatabase2 = yrVar2.f26725b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10).stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    yrVar2.o(th3, true);
                    return;
                }
        }
    }
}
