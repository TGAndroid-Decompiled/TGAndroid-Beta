package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class bh implements Runnable {
    public final ri f23197a;
    public final long f23198b;
    public final int f23199c;
    public final double d;

    public bh(ri riVar, long j3, int i7, double d) {
        this.f23197a = riVar;
        this.f23198b = j3;
        this.f23199c = i7;
        this.d = d;
    }

    @Override
    public final void run() {
        ri riVar = this.f23197a;
        long j3 = this.f23198b;
        int i7 = this.f23199c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().f27151b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
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
