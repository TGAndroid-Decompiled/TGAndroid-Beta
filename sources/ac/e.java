package ac;

import a8.xa;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import c8.db;
import c8.de;
import c8.eb;
import c8.tf;
import java.io.File;
import yi.i;
import yi.j;
public final class e implements tf {
    public final long f1021a;
    public final Object f1022b;
    public final Object f1023c;

    public e(f fVar, eb ebVar, long j3) {
        this.f1022b = fVar;
        this.f1023c = ebVar;
        this.f1021a = j3;
    }

    @Override
    public xa zza() {
        ga.d dVar = new ga.d(1);
        dVar.d = db.TYPE_THIN;
        a0 a0Var = new a0(18, false);
        a0Var.d = ((f) this.f1022b).f1026e.a();
        a0Var.f1713b = (eb) this.f1023c;
        a0Var.f1714c = Long.valueOf((SystemClock.elapsedRealtime() - this.f1021a) & Long.MAX_VALUE);
        dVar.f12966f = new de(a0Var);
        return new xa(dVar, 0);
    }

    public e(File file, long j3, byte[] bArr) {
        this.f1022b = file;
        this.f1021a = j3;
        this.f1023c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public e(long j3, i iVar, j jVar) {
        this.f1023c = jVar;
        this.f1021a = j3;
        this.f1022b = iVar;
    }
}
