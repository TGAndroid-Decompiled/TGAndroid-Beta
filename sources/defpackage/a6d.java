package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
public final class a6d {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final byte e;

    public a6d(d00 d00Var) {
        this.e = d00Var.a;
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.b = currentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
