package ei;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.qr;
public final class j7 implements Runnable {
    public final int f10552a;
    public final m7 f10553b;
    public final long f10554c;
    public final int d;

    public j7(m7 m7Var, long j10, int i3, int i10) {
        this.f10552a = i10;
        this.f10553b = m7Var;
        this.f10554c = j10;
        this.d = i3;
    }

    @Override
    public final void run() {
        switch (this.f10552a) {
            case 0:
                long j10 = this.f10554c;
                int i3 = this.d;
                qr qrVar = this.f10553b.f10644b;
                SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + i3 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    qrVar.o(th2, true);
                    return;
                }
            default:
                long j11 = this.f10554c;
                int i10 = this.d;
                qr qrVar2 = this.f10553b.f10644b;
                SQLiteDatabase sQLiteDatabase2 = qrVar2.f24936b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j11 + " AND story_id = " + i10).stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    qrVar2.o(th3, true);
                    return;
                }
        }
    }
}
