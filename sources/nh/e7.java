package nh;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class e7 implements Runnable {
    public final int f15292a;
    public final g7 f15293b;
    public final long f15294c;
    public final int d;

    public e7(g7 g7Var, long j10, int i10, int i11) {
        this.f15292a = i11;
        this.f15293b = g7Var;
        this.f15294c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f15292a) {
            case 0:
                long j10 = this.f15294c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f15293b.f15346b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            default:
                long j11 = this.f15294c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f15293b.f15346b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("REPLACE INTO stories_counter VALUES(" + j11 + ", 0, " + i11 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    messagesStorage2.checkSQLException(th3);
                    return;
                }
        }
    }
}
