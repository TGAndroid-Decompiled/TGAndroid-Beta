package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.e = j3;
        this.d = list;
    }

    @Override
    public final long b() {
        a();
        return this.e + ((p2.j) this.d.get((int) this.f42850c)).e;
    }

    @Override
    public final long d() {
        a();
        p2.j jVar = (p2.j) this.d.get((int) this.f42850c);
        return this.e + jVar.e + jVar.f39582c;
    }
}
