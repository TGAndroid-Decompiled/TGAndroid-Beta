package ac;

import a8.wa;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import c8.db;
import c8.de;
import c8.eb;
import c8.tf;
import java.io.File;
import vi.g;
import vi.h;
public final class e implements tf {
    public final long f1023a;
    public final Object f1024b;
    public final Object f1025c;

    public e(f fVar, eb ebVar, long j3) {
        this.f1024b = fVar;
        this.f1025c = ebVar;
        this.f1023a = j3;
    }

    @Override
    public wa zza() {
        ga.d dVar = new ga.d(1);
        dVar.d = db.TYPE_THIN;
        a0 a0Var = new a0(18, false);
        a0Var.d = ((f) this.f1024b).f1028e.a();
        a0Var.f1763b = (eb) this.f1025c;
        a0Var.f1764c = Long.valueOf((SystemClock.elapsedRealtime() - this.f1023a) & Long.MAX_VALUE);
        dVar.f13621f = new de(a0Var);
        return new wa(dVar, 0);
    }

    public e(File file, long j3, byte[] bArr) {
        this.f1024b = file;
        this.f1023a = j3;
        this.f1025c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public e(long j3, g gVar, h hVar) {
        this.f1025c = hVar;
        this.f1023a = j3;
        this.f1024b = gVar;
    }
}
