package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f17015e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f17015e = j3;
        this.d = list;
    }

    @Override
    public final long a() {
        b();
        return this.f17015e + ((p2.j) this.d.get((int) this.f47779c)).f44060e;
    }

    @Override
    public final long f() {
        b();
        p2.j jVar = (p2.j) this.d.get((int) this.f47779c);
        return this.f17015e + jVar.f44060e + jVar.f44059c;
    }
}
