package dc;

import a8.h0;
import a8.jg;
import a8.ng;
import a8.ob;
import a8.oe;
import a8.qb;
import android.os.SystemClock;
import m.r3;
import ui.i;
import ui.o;
public final class e implements jg {
    public final long f8319a;
    public final Object f8320b;
    public final Object f8321c;

    public e(f fVar, qb qbVar, long j10) {
        this.f8320b = fVar;
        this.f8321c = qbVar;
        this.f8319a = j10;
    }

    @Override
    public ng zza() {
        ?? obj = new Object();
        obj.f17845c = ob.TYPE_THIN;
        h0 h0Var = new h0(4, false);
        h0Var.d = ((f) this.f8320b).e.a();
        h0Var.f511b = (qb) this.f8321c;
        h0Var.f512c = Long.valueOf((SystemClock.elapsedRealtime() - this.f8319a) & Long.MAX_VALUE);
        obj.e = new oe(h0Var);
        return new ng((r3) obj, 0);
    }

    public e(long j10, i iVar, o oVar) {
        this.f8321c = oVar;
        this.f8319a = j10;
        this.f8320b = iVar;
    }
}
