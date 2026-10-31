package ki;

import android.os.SystemClock;
import java.io.File;
import m.p3;
import z7.fb;
import z7.gb;
import z7.ge;
import z7.wf;
public final class g implements wf {
    public final long f11403a;
    public final Object f11404b;
    public final Object f11405c;

    public g(ub.d dVar, gb gbVar, long j10) {
        this.f11404b = dVar;
        this.f11405c = gbVar;
        this.f11403a = j10;
    }

    @Override
    public a5.a zza() {
        ?? obj = new Object();
        obj.f12520c = fb.TYPE_THIN;
        ?? obj2 = new Object();
        obj2.f54723c = ((ub.d) this.f11404b).e.a();
        obj2.f54721a = (gb) this.f11405c;
        obj2.f54722b = Long.valueOf((SystemClock.elapsedRealtime() - this.f11403a) & Long.MAX_VALUE);
        obj.e = new ge(obj2);
        return new a5.a((p3) obj, 0);
    }

    public g(File file, long j10, byte[] bArr) {
        this.f11404b = file;
        this.f11403a = j10;
        this.f11405c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public g(long j10, j jVar, k kVar) {
        this.f11405c = kVar;
        this.f11403a = j10;
        this.f11404b = jVar;
    }
}
