package ae;

import android.os.Handler;
import android.os.Looper;
import ee.n;
import id.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import m9.u;
import zd.a1;
import zd.g0;
import zd.j0;
import zd.l0;
import zd.m;
import zd.p1;
import zd.x;
import zd.y;
import zd.y1;
public final class e extends x implements g0 {
    public final Handler f1051c;
    public final boolean d;
    public final e f1052e;

    public e(Handler handler, boolean z9) {
        e eVar;
        this.f1051c = handler;
        this.d = z9;
        if (z9) {
            eVar = this;
        } else {
            eVar = new e(handler, true);
        }
        this.f1052e = eVar;
    }

    @Override
    public final l0 a(long j3, y1 y1Var, h hVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f1051c.postDelayed(y1Var, j3)) {
            return new c(0, this, y1Var);
        }
        g(hVar, y1Var);
        return p1.f60105a;
    }

    @Override
    public final void b(long j3, m mVar) {
        u uVar = new u(6, mVar, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f1051c.postDelayed(uVar, j3)) {
            mVar.u(new d(0, this, uVar));
        } else {
            g(mVar.f60093e, uVar);
        }
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (!this.f1051c.post(runnable)) {
            g(hVar, runnable);
        }
    }

    @Override
    public final boolean d(h hVar) {
        if (this.d && j.a(Looper.myLooper(), this.f1051c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f1051c == this.f1051c && eVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        a1 a1Var = (a1) hVar.get(y.f60131b);
        if (a1Var != null) {
            a1Var.cancel(cancellationException);
        }
        ge.e eVar = j0.f60083a;
        ge.d.f13851c.c(hVar, runnable);
    }

    public final int hashCode() {
        int i7;
        int identityHashCode = System.identityHashCode(this.f1051c);
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return identityHashCode ^ i7;
    }

    @Override
    public final String toString() {
        e eVar;
        String str;
        ge.e eVar2 = j0.f60083a;
        e eVar3 = n.f10792a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f1052e;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            if (this == eVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.f1051c.toString();
            if (this.d) {
                return rf.b.r(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
