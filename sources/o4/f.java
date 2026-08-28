package o4;

import java.util.List;
public final class f extends l4.b {
    public final List d;
    public final long f18853e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.f18853e = j10;
        this.d = list;
    }

    @Override
    public final long c() {
        a();
        return this.f18853e + ((p4.h) this.d.get((int) this.f16646c)).f45384e;
    }

    @Override
    public final long p() {
        a();
        p4.h hVar = (p4.h) this.d.get((int) this.f16646c);
        return this.f18853e + hVar.f45384e + hVar.f45383c;
    }
}
