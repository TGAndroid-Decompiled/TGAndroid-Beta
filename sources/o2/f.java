package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f16713e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f16713e = j3;
        this.d = list;
    }

    @Override
    public final long l() {
        a();
        return this.f16713e + ((p2.j) this.d.get((int) this.f49272c)).f45114e;
    }

    @Override
    public final long v() {
        a();
        p2.j jVar = (p2.j) this.d.get((int) this.f49272c);
        return this.f16713e + jVar.f45114e + jVar.f45113c;
    }
}
