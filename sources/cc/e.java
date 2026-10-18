package cc;

import android.os.SystemClock;
import m.s3;
import ri.j;
import ri.p;
import z7.gb;
import z7.ge;
import z7.hb;
import z7.wf;
public final class e implements wf {
    public final long f5094a;
    public final Object f5095b;
    public final Object f5096c;

    public e(f fVar, hb hbVar, long j10) {
        this.f5095b = fVar;
        this.f5096c = hbVar;
        this.f5094a = j10;
    }

    @Override
    public a5.a zza() {
        ?? obj = new Object();
        obj.f16335c = gb.TYPE_THIN;
        u2.c cVar = new u2.c(19, false);
        cVar.d = ((f) this.f5095b).e.a();
        cVar.f47260b = (hb) this.f5096c;
        cVar.f47261c = Long.valueOf((SystemClock.elapsedRealtime() - this.f5094a) & Long.MAX_VALUE);
        obj.e = new ge(cVar);
        return new a5.a((s3) obj, 0);
    }

    public e(p pVar, j jVar, long j10) {
        this.f5096c = pVar;
        this.f5095b = jVar;
        this.f5094a = j10;
    }
}
