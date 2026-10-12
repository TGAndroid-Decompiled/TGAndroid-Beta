package bc;

import android.os.SystemClock;
import m.r3;
import pi.m;
import pi.s;
import v7.k;
import z7.fb;
import z7.gb;
import z7.ge;
import z7.wf;
public final class e implements wf {
    public final long f3853a;
    public final Object f3854b;
    public final Object f3855c;

    public e(f fVar, gb gbVar, long j3) {
        this.f3854b = fVar;
        this.f3855c = gbVar;
        this.f3853a = j3;
    }

    @Override
    public a5.a zza() {
        ?? obj = new Object();
        obj.f15556c = fb.TYPE_THIN;
        k kVar = new k(18, false);
        kVar.d = ((f) this.f3854b).f3858e.a();
        kVar.f49474b = (gb) this.f3855c;
        kVar.f49475c = Long.valueOf((SystemClock.elapsedRealtime() - this.f3853a) & Long.MAX_VALUE);
        obj.f15557e = new ge(kVar);
        return new a5.a((r3) obj, 0);
    }

    public e(s sVar, m mVar, long j3) {
        this.f3855c = sVar;
        this.f3854b = mVar;
        this.f3853a = j3;
    }
}
