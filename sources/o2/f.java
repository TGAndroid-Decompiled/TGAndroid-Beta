package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f16712e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f16712e = j3;
        this.d = list;
    }

    @Override
    public final long l() {
        a();
        return this.f16712e + ((p2.k) this.d.get((int) this.f49264c)).f45109e;
    }

    @Override
    public final long v() {
        a();
        p2.k kVar = (p2.k) this.d.get((int) this.f49264c);
        return this.f16712e + kVar.f45109e + kVar.f45108c;
    }
}
