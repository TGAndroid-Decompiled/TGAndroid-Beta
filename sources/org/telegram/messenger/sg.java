package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class sg implements Runnable {
    public final li f25336a;
    public final long f25337b;
    public final int f25338c;
    public final double d;

    public sg(li liVar, long j10, int i3, double d) {
        this.f25336a = liVar;
        this.f25337b = j10;
        this.f25338c = i3;
        this.d = d;
    }

    @Override
    public final void run() {
        li liVar = this.f25336a;
        long j10 = this.f25337b;
        int i3 = this.f25338c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = liVar.getMessagesStorage().f24936b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            executeFast.bindInteger(2, i3);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
