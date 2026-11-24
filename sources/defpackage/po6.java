package defpackage;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class po6 implements Runnable {
    public final hq6 a;
    public final long b;
    public final byte c;
    public final double d;

    public po6(hq6 hq6Var, long j, int i, double d) {
        this.a = hq6Var;
        this.b = j;
        this.c = i;
        this.d = d;
    }

    @Override
    public final void run() {
        hq6 hq6Var = this.a;
        long j = this.b;
        byte b = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, b);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
