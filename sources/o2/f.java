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
    public final long a() {
        b();
        return this.e + ((p2.j) this.d.get((int) this.f44111c)).e;
    }

    @Override
    public final long g() {
        b();
        p2.j jVar = (p2.j) this.d.get((int) this.f44111c);
        return this.e + jVar.e + jVar.f40723c;
    }
}
