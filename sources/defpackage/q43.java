package defpackage;

import java.util.List;
public final class q43 implements heb {
    public static final d51 c = new d51(new p31((byte) 3), qk7.b);
    public final po5 a;
    public final long[] b;

    public q43(defpackage.j99 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q43.<init>(j99):void");
    }

    @Override
    public final int b(long j) {
        int b = gcc.b(this.b, j, false);
        if (b < this.a.size()) {
            return b;
        }
        return -1;
    }

    @Override
    public final long i(int i) {
        boolean z;
        if (i < this.a.size()) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        return this.b[i];
    }

    @Override
    public final List l(long j) {
        int f = gcc.f(this.b, j, false);
        if (f == -1) {
            no5 no5Var = po5.b;
            return j99.e;
        }
        return (po5) this.a.get(f);
    }

    @Override
    public final int q() {
        return this.a.size();
    }
}
