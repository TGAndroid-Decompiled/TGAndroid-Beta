package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f16874e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f16874e = j3;
        this.d = list;
    }

    @Override
    public final long a() {
        b();
        return this.f16874e + ((p2.j) this.d.get((int) this.f47312c)).f43731e;
    }

    @Override
    public final long d() {
        b();
        p2.j jVar = (p2.j) this.d.get((int) this.f47312c);
        return this.f16874e + jVar.f43731e + jVar.f43730c;
    }
}
