package o2;

import java.util.List;
public final class f extends v2.b {
    public final List d;
    public final long e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.e = j10;
        this.d = list;
    }

    @Override
    public final long b() {
        a();
        return this.e + ((p2.k) this.d.get((int) this.f47870c)).e;
    }

    @Override
    public final long r() {
        a();
        p2.k kVar = (p2.k) this.d.get((int) this.f47870c);
        return this.e + kVar.e + kVar.f43989c;
    }
}
