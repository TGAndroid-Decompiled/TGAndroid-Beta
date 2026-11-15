package fi;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.vr;
public final class c7 implements Runnable {
    public final int f11608a;
    public final f7 f11609b;
    public final long f11610c;
    public final int d;

    public c7(f7 f7Var, long j3, int i7, int i10) {
        this.f11608a = i10;
        this.f11609b = f7Var;
        this.f11610c = j3;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f11608a) {
            case 0:
                long j3 = this.f11610c;
                int i7 = this.d;
                vr vrVar = this.f11609b.f11709b;
                SQLiteDatabase sQLiteDatabase = vrVar.f27222b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i7 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    vrVar.o(th2, true);
                    return;
                }
            default:
                long j10 = this.f11610c;
                int i10 = this.d;
                vr vrVar2 = this.f11609b.f11709b;
                SQLiteDatabase sQLiteDatabase2 = vrVar2.f27222b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10).stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    vrVar2.o(th3, true);
                    return;
                }
        }
    }
}
