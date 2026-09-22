package ai;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class w9 implements Runnable {
    public final int f1662a;
    public final y9 f1663b;
    public final long f1664c;
    public final int d;

    public w9(y9 y9Var, long j3, int i10, int i11) {
        this.f1662a = i11;
        this.f1663b = y9Var;
        this.f1664c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f1662a) {
            case 0:
                long j3 = this.f1664c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f1663b.f1765b;
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
                long j10 = this.f1664c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f1663b.f1765b;
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
