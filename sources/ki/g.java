package ki;

import android.os.SystemClock;
import java.io.File;
import m.p3;
import z7.fb;
import z7.gb;
import z7.ge;
import z7.wf;
public final class g implements wf {
    public final long f11404a;
    public final Object f11405b;
    public final Object f11406c;

    public g(ub.d dVar, gb gbVar, long j10) {
        this.f11405b = dVar;
        this.f11406c = gbVar;
        this.f11404a = j10;
    }

    @Override
    public a5.a zza() {
        ?? obj = new Object();
        obj.f12521c = fb.TYPE_THIN;
        ?? obj2 = new Object();
        obj2.f54741c = ((ub.d) this.f11405b).e.a();
        obj2.f54739a = (gb) this.f11406c;
        obj2.f54740b = Long.valueOf((SystemClock.elapsedRealtime() - this.f11404a) & Long.MAX_VALUE);
        obj.e = new ge(obj2);
        return new a5.a((p3) obj, 0);
    }

    public g(File file, long j10, byte[] bArr) {
        this.f11405b = file;
        this.f11404a = j10;
        this.f11406c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public g(long j10, j jVar, k kVar) {
        this.f11406c = kVar;
        this.f11404a = j10;
        this.f11405b = jVar;
    }
}
