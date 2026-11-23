package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class ch implements Runnable {
    public final si f23277a;
    public final long f23278b;
    public final int f23279c;
    public final double d;

    public ch(si siVar, long j3, int i7, double d) {
        this.f23277a = siVar;
        this.f23278b = j3;
        this.f23279c = i7;
        this.d = d;
    }

    @Override
    public final void run() {
        si siVar = this.f23277a;
        long j3 = this.f23278b;
        int i7 = this.f23279c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = siVar.getMessagesStorage().f27216b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
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
