package o4;

import java.util.List;

public final class f extends l4.b {
    public final List d;

    public final long f19200e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.f19200e = j10;
        this.d = list;
    }

    @Override
    public final long g() {
        a();
        return this.f19200e + ((p4.h) this.d.get((int) this.f15403c)).f45390e;
    }

    @Override
    public final long i() {
        a();
        p4.h hVar = (p4.h) this.d.get((int) this.f15403c);
        return this.f19200e + hVar.f45390e + hVar.f45389c;
    }
}
