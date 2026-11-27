package defpackage;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class dr6 implements Runnable {
    public final ls6 a;
    public final long b;
    public final byte c;
    public final double d;

    public dr6(ls6 ls6Var, long j, int i, double d) {
        this.a = ls6Var;
        this.b = j;
        this.c = i;
        this.d = d;
    }

    @Override
    public final void run() {
        ls6 ls6Var = this.a;
        long j = this.b;
        byte b = this.c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, b);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
