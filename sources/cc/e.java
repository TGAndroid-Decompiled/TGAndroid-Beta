package cc;

import android.os.SystemClock;
import m.s3;
import ri.i;
import ri.o;
import z7.fb;
import z7.fe;
import z7.gb;
import z7.vf;
public final class e implements vf {
    public final long f5096a;
    public final Object f5097b;
    public final Object f5098c;

    public e(f fVar, gb gbVar, long j10) {
        this.f5097b = fVar;
        this.f5098c = gbVar;
        this.f5096a = j10;
    }

    @Override
    public a5.a zza() {
        ?? obj = new Object();
        obj.f16399c = fb.TYPE_THIN;
        u2.c cVar = new u2.c(19, false);
        cVar.d = ((f) this.f5097b).e.a();
        cVar.f47711b = (gb) this.f5098c;
        cVar.f47712c = Long.valueOf((SystemClock.elapsedRealtime() - this.f5096a) & Long.MAX_VALUE);
        obj.e = new fe(cVar);
        return new a5.a((s3) obj, 0);
    }

    public e(long j10, i iVar, o oVar) {
        this.f5098c = oVar;
        this.f5096a = j10;
        this.f5097b = iVar;
    }
}
