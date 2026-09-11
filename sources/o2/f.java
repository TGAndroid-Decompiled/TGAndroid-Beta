package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f16847e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f16847e = j3;
        this.d = list;
    }

    @Override
    public final long a() {
        b();
        return this.f16847e + ((p2.j) this.d.get((int) this.f47284c)).f43704e;
    }

    @Override
    public final long d() {
        b();
        p2.j jVar = (p2.j) this.d.get((int) this.f47284c);
        return this.f16847e + jVar.f43704e + jVar.f43703c;
    }
}
