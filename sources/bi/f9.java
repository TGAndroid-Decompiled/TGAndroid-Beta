package bi;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class f9 implements Runnable {
    public final int f3014a;
    public final h9 f3015b;
    public final long f3016c;
    public final int d;

    public f9(h9 h9Var, long j3, int i10, int i11) {
        this.f3014a = i11;
        this.f3015b = h9Var;
        this.f3016c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f3014a) {
            case 0:
                long j3 = this.f3016c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f3015b.f3101b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j3 + " AND story_id = " + i10).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            default:
                long j10 = this.f3016c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f3015b.f3101b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + i11 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    messagesStorage2.checkSQLException(th3);
                    return;
                }
        }
    }
}
