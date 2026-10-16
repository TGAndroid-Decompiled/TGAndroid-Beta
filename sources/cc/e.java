package cc;

import android.os.SystemClock;
import m.t3;
import qi.k;
import qi.q;
import z7.fb;
import z7.fe;
import z7.gb;
import z7.vf;
public final class e implements vf {
    public final long f4723a;
    public final Object f4724b;
    public final Object f4725c;

    public e(f fVar, gb gbVar, long j10) {
        this.f4724b = fVar;
        this.f4725c = gbVar;
        this.f4723a = j10;
    }

    @Override
    public a5.a zza() {
        ?? obj = new Object();
        obj.f14985c = fb.TYPE_THIN;
        u2.c cVar = new u2.c(19, false);
        cVar.d = ((f) this.f4724b).e.a();
        cVar.f45875b = (gb) this.f4725c;
        cVar.f45876c = Long.valueOf((SystemClock.elapsedRealtime() - this.f4723a) & Long.MAX_VALUE);
        obj.e = new fe(cVar);
        return new a5.a((t3) obj, 0);
    }

    public e(q qVar, k kVar, long j10) {
        this.f4725c = qVar;
        this.f4724b = kVar;
        this.f4723a = j10;
    }
}
