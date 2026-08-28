package of;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.an0;
public final class p implements Runnable {
    public final int f19447a;
    public final f0 f19448b;
    public final long f19449c;

    public p(an0 an0Var, long j10, int i9) {
        this.f19447a = i9;
        this.f19448b = an0Var;
        this.f19449c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19447a) {
            case 0:
                long j10 = this.f19449c;
                f0 f0Var = this.f19448b;
                f0Var.getClass();
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(f0Var.f19303o0).getDatabase();
                    database.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                long j11 = this.f19449c;
                f0 f0Var2 = this.f19448b;
                f0Var2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(f0Var2.f19303o0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j11);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
