package ci;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class r7 implements Runnable {
    public final int f5868a;
    public final v7 f5869b;
    public final long f5870c;
    public final int d;

    public r7(v7 v7Var, long j10, int i10, int i11) {
        this.f5868a = i11;
        this.f5869b = v7Var;
        this.f5870c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f5868a) {
            case 0:
                long j10 = this.f5870c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f5869b.f6024b;
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
                long j11 = this.f5870c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f5869b.f6024b;
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
