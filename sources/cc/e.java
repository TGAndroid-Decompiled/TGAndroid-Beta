package cc;

import android.os.SystemClock;
import m.s3;
import ri.i;
import ri.o;
import z7.gb;
import z7.ge;
import z7.hb;
import z7.wf;
public final class e implements wf {
    public final long f5091a;
    public final Object f5092b;
    public final Object f5093c;

    public e(f fVar, hb hbVar, long j10) {
        this.f5092b = fVar;
        this.f5093c = hbVar;
        this.f5091a = j10;
    }

    @Override
    public a5.a zza() {
        ?? obj = new Object();
        obj.f16336c = gb.TYPE_THIN;
        u2.c cVar = new u2.c(19, false);
        cVar.d = ((f) this.f5092b).e.a();
        cVar.f47273b = (hb) this.f5093c;
        cVar.f47274c = Long.valueOf((SystemClock.elapsedRealtime() - this.f5091a) & Long.MAX_VALUE);
        obj.e = new ge(cVar);
        return new a5.a((s3) obj, 0);
    }

    public e(long j10, i iVar, o oVar) {
        this.f5093c = oVar;
        this.f5091a = j10;
        this.f5092b = iVar;
    }
}
