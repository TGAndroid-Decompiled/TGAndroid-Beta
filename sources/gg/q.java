package gg;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.fo0;
public final class q implements Runnable {
    public final int f9881a;
    public final i0 f9882b;
    public final long f9883c;

    public q(fo0 fo0Var, long j3, int i10) {
        this.f9881a = i10;
        this.f9882b = fo0Var;
        this.f9883c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9881a) {
            case 0:
                long j3 = this.f9883c;
                i0 i0Var = this.f9882b;
                i0Var.getClass();
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i0Var.f9771s0).getDatabase();
                    database.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                long j10 = this.f9883c;
                i0 i0Var2 = this.f9882b;
                i0Var2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i0Var2.f9771s0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
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
