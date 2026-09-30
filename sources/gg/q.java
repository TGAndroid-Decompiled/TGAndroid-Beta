package gg;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.ho0;
public final class q implements Runnable {
    public final int f9887a;
    public final i0 f9888b;
    public final long f9889c;

    public q(ho0 ho0Var, long j3, int i10) {
        this.f9887a = i10;
        this.f9888b = ho0Var;
        this.f9889c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9887a) {
            case 0:
                long j3 = this.f9889c;
                i0 i0Var = this.f9888b;
                i0Var.getClass();
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i0Var.f9777s0).getDatabase();
                    database.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                long j10 = this.f9889c;
                i0 i0Var2 = this.f9888b;
                i0Var2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i0Var2.f9777s0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
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
