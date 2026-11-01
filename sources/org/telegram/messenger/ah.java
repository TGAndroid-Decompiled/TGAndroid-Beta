package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class ah implements Runnable {
    public final vi f14631a;
    public final long f14632b;
    public final int f14633c;
    public final double d;

    public ah(vi viVar, long j10, int i10, double d) {
        this.f14631a = viVar;
        this.f14632b = j10;
        this.f14633c = i10;
        this.d = d;
    }

    @Override
    public final void run() {
        vi viVar = this.f14631a;
        long j10 = this.f14632b;
        int i10 = this.f14633c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = viVar.getMessagesStorage().f16333b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            executeFast.bindInteger(2, i10);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
