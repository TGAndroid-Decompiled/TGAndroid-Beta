package jh;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;

public final class d7 implements Runnable {

    public final int f13197a;

    public final f7 f13198b;

    public final long f13199c;
    public final int d;

    public d7(f7 f7Var, long j10, int i10, int i11) {
        this.f13197a = i11;
        this.f13198b = f7Var;
        this.f13199c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f13197a) {
            case 0:
                long j10 = this.f13199c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f13198b.f13332b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10).stepThis().dispose();
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
                break;
            default:
                long j11 = this.f13199c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f13198b.f13332b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("REPLACE INTO stories_counter VALUES(" + j11 + ", 0, " + i11 + ")").stepThis().dispose();
                } catch (Throwable th2) {
                    messagesStorage2.checkSQLException(th2);
                }
                break;
        }
    }
}
