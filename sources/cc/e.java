package cc;

import android.os.SystemClock;
import m.s3;
import ri.j;
import ri.p;
import z7.hb;
import z7.he;
import z7.ib;
import z7.xf;
public final class e implements xf {
    public final long f5093a;
    public final Object f5094b;
    public final Object f5095c;

    public e(f fVar, ib ibVar, long j10) {
        this.f5094b = fVar;
        this.f5095c = ibVar;
        this.f5093a = j10;
    }

    @Override
    public a5.a zza() {
        ?? obj = new Object();
        obj.f16330c = hb.TYPE_THIN;
        u2.c cVar = new u2.c(19, false);
        cVar.d = ((f) this.f5094b).e.a();
        cVar.f47282b = (ib) this.f5095c;
        cVar.f47283c = Long.valueOf((SystemClock.elapsedRealtime() - this.f5093a) & Long.MAX_VALUE);
        obj.e = new he(cVar);
        return new a5.a((s3) obj, 0);
    }

    public e(p pVar, j jVar, long j10) {
        this.f5095c = pVar;
        this.f5094b = jVar;
        this.f5093a = j10;
    }
}
