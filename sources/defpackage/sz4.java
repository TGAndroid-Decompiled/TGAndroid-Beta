package defpackage;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class sz4 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final Object f;

    public sz4(int i, long j, long j2, int i2, go2 go2Var) {
        this.a = (byte) 0;
        this.d = i;
        this.b = j;
        this.c = j2;
        this.e = i2;
        this.f = go2Var;
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
                uz4.a(this.d, this.b, this.c, i2 + 1, (go2) obj);
                return;
            case 1:
                hq6 hq6Var = (hq6) obj;
                long j2 = this.c;
                int i3 = this.d;
                int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                try {
                    if (i4 != 0) {
                        executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
                    } else {
                        executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
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
                    fa4.g(e, true);
                    return;
                }
            default:
                ((ad7) obj).b2(this.d, this.e, -j, this.c);
                return;
        }
    }

    public sz4(pf0 pf0Var, long j, long j2, int i, int i2, byte b) {
        this.a = b;
        this.f = pf0Var;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
    }
}
