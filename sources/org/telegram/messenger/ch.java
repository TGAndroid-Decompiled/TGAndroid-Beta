package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class ch implements Runnable {
    public final si f23313a;
    public final long f23314b;
    public final int f23315c;
    public final double d;

    public ch(si siVar, long j3, int i7, double d) {
        this.f23313a = siVar;
        this.f23314b = j3;
        this.f23315c = i7;
        this.d = d;
    }

    @Override
    public final void run() {
        si siVar = this.f23313a;
        long j3 = this.f23314b;
        int i7 = this.f23315c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = siVar.getMessagesStorage().f27252b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
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
