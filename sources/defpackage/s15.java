package defpackage;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class s15 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final Object f;

    public s15(int i, long j, long j2, int i2, rp2 rp2Var) {
        this.a = (byte) 0;
        this.d = i;
        this.b = j;
        this.c = j2;
        this.e = i2;
        this.f = rp2Var;
    }

    @Override
    public final void run() {
        SQLitePreparedStatement executeFast;
        int i;
        byte b = this.a;
        int i2 = this.e;
        long j = this.b;
        Object obj = this.f;
        switch (b) {
            case 0:
                u15.a(this.d, this.b, this.c, i2 + 1, (rp2) obj);
                return;
            case 1:
                hs6 hs6Var = (hs6) obj;
                long j2 = this.c;
                int i3 = this.d;
                int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                try {
                    if (i4 != 0) {
                        executeFast = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
                    } else {
                        executeFast = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    }
                    executeFast.requery();
                    executeFast.bindLong(1, j2);
                    if (i4 != 0) {
                        executeFast.bindLong(2, j);
                        i = 3;
                    } else {
                        i = 2;
                    }
                    executeFast.bindInteger(i, i3);
                    executeFast.bindInteger(i + 1, i2);
                    executeFast.bindInteger(i + 2, 0);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                ((cf7) obj).b2(this.d, this.e, -j, this.c);
                return;
        }
    }

    public s15(pg0 pg0Var, long j, long j2, int i, int i2, byte b) {
        this.a = b;
        this.f = pg0Var;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
    }
}
