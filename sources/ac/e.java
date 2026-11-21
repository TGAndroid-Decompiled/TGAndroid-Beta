package ac;

import a8.xa;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import c8.db;
import c8.de;
import c8.eb;
import c8.tf;
import java.io.File;
import yi.h;
import yi.j;
public final class e implements tf {
    public final long f1020a;
    public final Object f1021b;
    public final Object f1022c;

    public e(f fVar, eb ebVar, long j3) {
        this.f1021b = fVar;
        this.f1022c = ebVar;
        this.f1020a = j3;
    }

    @Override
    public xa zza() {
        ga.d dVar = new ga.d(1);
        dVar.d = db.TYPE_THIN;
        a0 a0Var = new a0(18, false);
        a0Var.d = ((f) this.f1021b).f1025e.a();
        a0Var.f1717b = (eb) this.f1022c;
        a0Var.f1718c = Long.valueOf((SystemClock.elapsedRealtime() - this.f1020a) & Long.MAX_VALUE);
        dVar.f13309f = new de(a0Var);
        return new xa(dVar, 0);
    }

    public e(File file, long j3, byte[] bArr) {
        this.f1021b = file;
        this.f1020a = j3;
        this.f1022c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public e(long j3, h hVar, j jVar) {
        this.f1022c = jVar;
        this.f1020a = j3;
        this.f1021b = hVar;
    }
}
