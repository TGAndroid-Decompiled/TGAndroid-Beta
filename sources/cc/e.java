package cc;

import android.os.SystemClock;
import m.s3;
import ri.j;
import ri.p;
import t0.h;
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
        obj.f16337c = gb.TYPE_THIN;
        h hVar = new h(20, false);
        hVar.d = ((f) this.f5095b).e.a();
        hVar.f46911b = (hb) this.f5096c;
        hVar.f46912c = Long.valueOf((SystemClock.elapsedRealtime() - this.f5094a) & Long.MAX_VALUE);
        obj.e = new ge(hVar);
        return new a5.a((s3) obj, 0);
    }

    public e(p pVar, j jVar, long j10) {
        this.f5096c = pVar;
        this.f5095b = jVar;
        this.f5094a = j10;
    }
}
