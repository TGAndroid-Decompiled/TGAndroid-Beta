package hg;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.rn0;
public final class q implements Runnable {
    public final int f11212a;
    public final i0 f11213b;
    public final long f11214c;

    public q(rn0 rn0Var, long j3, int i10) {
        this.f11212a = i10;
        this.f11213b = rn0Var;
        this.f11214c = j3;
    }

    @Override
    public final void run() {
        switch (this.f11212a) {
            case 0:
                long j3 = this.f11214c;
                i0 i0Var = this.f11213b;
                i0Var.getClass();
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i0Var.f11093s0).getDatabase();
                    database.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                long j10 = this.f11214c;
                i0 i0Var2 = this.f11213b;
                i0Var2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i0Var2.f11093s0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j10);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
