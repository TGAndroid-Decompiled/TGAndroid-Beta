package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f17006e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f17006e = j3;
        this.d = list;
    }

    @Override
    public final long a() {
        b();
        return this.f17006e + ((p2.j) this.d.get((int) this.f47764c)).f44046e;
    }

    @Override
    public final long f() {
        b();
        p2.j jVar = (p2.j) this.d.get((int) this.f47764c);
        return this.f17006e + jVar.f44046e + jVar.f44045c;
    }
}
