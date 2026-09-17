package ai;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class w9 implements Runnable {
    public final int f1665a;
    public final y9 f1666b;
    public final long f1667c;
    public final int d;

    public w9(y9 y9Var, long j3, int i10, int i11) {
        this.f1665a = i11;
        this.f1666b = y9Var;
        this.f1667c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f1665a) {
            case 0:
                long j3 = this.f1667c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f1666b.f1768b;
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
                long j10 = this.f1667c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f1666b.f1768b;
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
