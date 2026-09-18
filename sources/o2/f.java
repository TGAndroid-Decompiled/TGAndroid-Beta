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
        return this.e + ((p2.k) this.d.get((int) this.f43858c)).e;
    }

    @Override
    public final long g() {
        b();
        p2.k kVar = (p2.k) this.d.get((int) this.f43858c);
        return this.e + kVar.e + kVar.f40484c;
    }
}
