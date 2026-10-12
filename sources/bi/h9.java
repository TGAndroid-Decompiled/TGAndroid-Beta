package bi;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class h9 implements Runnable {
    public final int f3128a;
    public final k9 f3129b;
    public final long f3130c;
    public final int d;

    public h9(k9 k9Var, long j10, int i10, int i11) {
        this.f3128a = i11;
        this.f3129b = k9Var;
        this.f3130c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f3128a) {
            case 0:
                long j10 = this.f3130c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f3129b.f3252b;
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
                long j11 = this.f3130c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f3129b.f3252b;
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
