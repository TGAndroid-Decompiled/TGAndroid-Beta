package ai;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class v9 implements Runnable {
    public final int f1617a;
    public final y9 f1618b;
    public final long f1619c;
    public final int d;

    public v9(y9 y9Var, long j3, int i10, int i11) {
        this.f1617a = i11;
        this.f1618b = y9Var;
        this.f1619c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f1617a) {
            case 0:
                long j3 = this.f1619c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f1618b.f1762b;
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
                long j10 = this.f1619c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f1618b.f1762b;
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
