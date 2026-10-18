package ci;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class s7 implements Runnable {
    public final int f5976a;
    public final w7 f5977b;
    public final long f5978c;
    public final int d;

    public s7(w7 w7Var, long j10, int i10, int i11) {
        this.f5976a = i11;
        this.f5977b = w7Var;
        this.f5978c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f5976a) {
            case 0:
                long j10 = this.f5978c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f5977b.f6129b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + i10 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            default:
                long j11 = this.f5978c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f5977b.f6129b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("DELETE FROM stories WHERE dialog_id = " + j11 + " AND story_id = " + i11).stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    messagesStorage2.checkSQLException(th3);
                    return;
                }
        }
    }
}
