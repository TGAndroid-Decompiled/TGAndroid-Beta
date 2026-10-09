package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f16960e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f16960e = j3;
        this.d = list;
    }

    @Override
    public final long c() {
        a();
        return this.f16960e + ((p2.j) this.d.get((int) this.f49034c)).f45224e;
    }

    @Override
    public final long h() {
        a();
        p2.j jVar = (p2.j) this.d.get((int) this.f49034c);
        return this.f16960e + jVar.f45224e + jVar.f45223c;
    }
}
