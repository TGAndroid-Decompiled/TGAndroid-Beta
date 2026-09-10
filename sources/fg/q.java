package fg;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.ao0;
public final class q implements Runnable {
    public final int f8177a;
    public final h0 f8178b;
    public final long f8179c;

    public q(ao0 ao0Var, long j3, int i10) {
        this.f8177a = i10;
        this.f8178b = ao0Var;
        this.f8179c = j3;
    }

    @Override
    public final void run() {
        switch (this.f8177a) {
            case 0:
                long j3 = this.f8179c;
                h0 h0Var = this.f8178b;
                h0Var.getClass();
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(h0Var.f8050s0).getDatabase();
                    database.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                long j10 = this.f8179c;
                h0 h0Var2 = this.f8178b;
                h0Var2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(h0Var2.f8050s0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j10);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
