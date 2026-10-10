package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f16964e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f16964e = j3;
        this.d = list;
    }

    @Override
    public final long c() {
        a();
        return this.f16964e + ((p2.j) this.d.get((int) this.f49080c)).f45270e;
    }

    @Override
    public final long h() {
        a();
        p2.j jVar = (p2.j) this.d.get((int) this.f49080c);
        return this.f16964e + jVar.f45270e + jVar.f45269c;
    }
}
