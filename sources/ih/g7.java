package ih;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class g7 implements Runnable {
    public final int f11489a;
    public final i7 f11490b;
    public final long f11491c;
    public final int d;

    public g7(i7 i7Var, long j10, int i9, int i10) {
        this.f11489a = i10;
        this.f11490b = i7Var;
        this.f11491c = j10;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f11489a) {
            case 0:
                long j10 = this.f11491c;
                int i9 = this.d;
                MessagesStorage messagesStorage = this.f11490b.f11620b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i9).stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
            default:
                long j11 = this.f11491c;
                int i10 = this.d;
                MessagesStorage messagesStorage2 = this.f11490b.f11620b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("REPLACE INTO stories_counter VALUES(" + j11 + ", 0, " + i10 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage2.checkSQLException(th2);
                    return;
                }
        }
    }
}
