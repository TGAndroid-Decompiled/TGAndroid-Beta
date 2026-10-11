package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f17046e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f17046e = j3;
        this.d = list;
    }

    @Override
    public final long c() {
        a();
        return this.f17046e + ((p2.j) this.d.get((int) this.f49157c)).f45294e;
    }

    @Override
    public final long l() {
        a();
        p2.j jVar = (p2.j) this.d.get((int) this.f49157c);
        return this.f17046e + jVar.f45294e + jVar.f45293c;
    }
}
