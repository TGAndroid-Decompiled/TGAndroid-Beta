package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f17010e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f17010e = j3;
        this.d = list;
    }

    @Override
    public final long a() {
        b();
        return this.f17010e + ((p2.j) this.d.get((int) this.f47772c)).f44053e;
    }

    @Override
    public final long f() {
        b();
        p2.j jVar = (p2.j) this.d.get((int) this.f47772c);
        return this.f17010e + jVar.f44053e + jVar.f44052c;
    }
}
