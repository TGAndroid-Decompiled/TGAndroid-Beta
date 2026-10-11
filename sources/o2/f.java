package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long f17010e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f17010e = j3;
        this.d = list;
    }

    @Override
    public final long c() {
        a();
        return this.f17010e + ((p2.j) this.d.get((int) this.f49123c)).f45260e;
    }

    @Override
    public final long l() {
        a();
        p2.j jVar = (p2.j) this.d.get((int) this.f49123c);
        return this.f17010e + jVar.f45260e + jVar.f45259c;
    }
}
