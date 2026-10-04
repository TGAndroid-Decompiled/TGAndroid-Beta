package gg;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.jo0;
public final class q implements Runnable {
    public final int f10752a;
    public final i0 f10753b;
    public final long f10754c;

    public q(jo0 jo0Var, long j3, int i10) {
        this.f10752a = i10;
        this.f10753b = jo0Var;
        this.f10754c = j3;
    }

    @Override
    public final void run() {
        switch (this.f10752a) {
            case 0:
                long j3 = this.f10754c;
                i0 i0Var = this.f10753b;
                i0Var.getClass();
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i0Var.f10633s0).getDatabase();
                    database.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                long j10 = this.f10754c;
                i0 i0Var2 = this.f10753b;
                i0Var2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i0Var2.f10633s0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
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
