package ai;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class w9 implements Runnable {
    public final int f1865a;
    public final z9 f1866b;
    public final long f1867c;
    public final int d;

    public w9(z9 z9Var, long j3, int i10, int i11) {
        this.f1865a = i11;
        this.f1866b = z9Var;
        this.f1867c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f1865a) {
            case 0:
                long j3 = this.f1867c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f1866b.f2022b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i10 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            default:
                long j10 = this.f1867c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f1866b.f2022b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i11).stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    messagesStorage2.checkSQLException(th3);
                    return;
                }
        }
    }
}
