package defpackage;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class pq6 implements Runnable {
    public final hs6 a;
    public final long b;
    public final byte c;
    public final double d;

    public pq6(hs6 hs6Var, long j, int i, double d) {
        this.a = hs6Var;
        this.b = j;
        this.c = i;
        this.d = d;
    }

    @Override
    public final void run() {
        hs6 hs6Var = this.a;
        long j = this.b;
        byte b = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, b);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
