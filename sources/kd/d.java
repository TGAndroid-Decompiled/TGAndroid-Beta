package kd;

import ab.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import jd.a0;
import jd.e0;
import jd.e2;
import jd.j0;
import jd.m;
import jd.m0;
import jd.o0;
import jd.w1;
import k1.i;
import kotlin.jvm.internal.j;
import od.p;
import sc.h;
public final class d extends a0 implements j0 {
    public final Handler f13626c;
    public final boolean d;
    public final d f13627e;

    public d(Handler handler, boolean z10) {
        d dVar;
        this.f13626c = handler;
        this.d = z10;
        if (z10) {
            dVar = this;
        } else {
            dVar = new d(handler, true);
        }
        this.f13627e = dVar;
    }

    @Override
    public final o0 a(long j10, final e2 e2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f13626c.postDelayed(e2Var, j10)) {
            return new o0() {
                @Override
                public final void dispose() {
                    d.this.f13626c.removeCallbacks(e2Var);
                }
            };
        }
        f(hVar, e2Var);
        return w1.f11538a;
    }

    @Override
    public final void b(long j10, m mVar) {
        o oVar = new o(25, mVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f13626c.postDelayed(oVar, j10)) {
            mVar.u(new i(1, this, oVar));
        } else {
            f(mVar.f11494e, oVar);
        }
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (!this.f13626c.post(runnable)) {
            f(hVar, runnable);
        }
    }

    @Override
    public final boolean e() {
        if (this.d && j.a(Looper.myLooper(), this.f13626c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f13626c == this.f13626c && dVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(h hVar, Runnable runnable) {
        e0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m0.f11496b.c(hVar, runnable);
    }

    public final int hashCode() {
        int i10;
        int identityHashCode = System.identityHashCode(this.f13626c);
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return identityHashCode ^ i10;
    }

    @Override
    public final String toString() {
        d dVar;
        String str;
        qd.e eVar = m0.f11495a;
        d dVar2 = p.f19534a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f13627e;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            if (this == dVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.f13626c.toString();
            if (this.d) {
                return u3.c.k(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
