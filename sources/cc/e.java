package cc;

import android.os.SystemClock;
import m.q3;
import ri.k;
import ri.q;
import z7.fb;
import z7.fe;
import z7.gb;
import z7.vf;
public final class e implements vf {
    public final long f4720a;
    public final Object f4721b;
    public final Object f4722c;

    public e(f fVar, gb gbVar, long j10) {
        this.f4721b = fVar;
        this.f4722c = gbVar;
        this.f4720a = j10;
    }

    @Override
    public a5.a zza() {
        ?? obj = new Object();
        obj.f15221c = fb.TYPE_THIN;
        u2.c cVar = new u2.c(19, false);
        cVar.d = ((f) this.f4721b).e.a();
        cVar.f45875b = (gb) this.f4722c;
        cVar.f45876c = Long.valueOf((SystemClock.elapsedRealtime() - this.f4720a) & Long.MAX_VALUE);
        obj.e = new fe(cVar);
        return new a5.a((q3) obj, 0);
    }

    public e(q qVar, k kVar, long j10) {
        this.f4722c = qVar;
        this.f4721b = kVar;
        this.f4720a = j10;
    }
}
