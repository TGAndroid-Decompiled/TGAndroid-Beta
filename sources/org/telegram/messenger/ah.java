package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class ah implements Runnable {
    public final ui f21439a;
    public final long f21440b;
    public final int f21441c;
    public final double d;

    public ah(ui uiVar, long j3, int i7, double d) {
        this.f21439a = uiVar;
        this.f21440b = j3;
        this.f21441c = i7;
        this.d = d;
    }

    @Override
    public final void run() {
        ui uiVar = this.f21439a;
        long j3 = this.f21440b;
        int i7 = this.f21441c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().f26725b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j3);
            executeFast.bindInteger(2, i7);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
