package ae;

import android.os.Handler;
import android.os.Looper;
import ee.o;
import i9.s;
import id.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import org.telegram.ui.Cells.p6;
import zd.a0;
import zd.e0;
import zd.e2;
import zd.j0;
import zd.m;
import zd.m0;
import zd.o0;
import zd.w1;
public final class e extends a0 implements j0 {
    public final Handler f418c;
    public final boolean d;
    public final e f419e;

    public e(Handler handler, boolean z10) {
        e eVar;
        this.f418c = handler;
        this.d = z10;
        if (z10) {
            eVar = this;
        } else {
            eVar = new e(handler, true);
        }
        this.f419e = eVar;
    }

    @Override
    public final o0 a(long j3, final e2 e2Var, h hVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f418c.postDelayed(e2Var, j3)) {
            return new o0() {
                @Override
                public final void dispose() {
                    e.this.f418c.removeCallbacks(e2Var);
                }
            };
        }
        f(hVar, e2Var);
        return w1.f51613a;
    }

    @Override
    public final void b(long j3, m mVar) {
        s sVar = new s(1, mVar, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f418c.postDelayed(sVar, j3)) {
            mVar.u(new d(0, this, sVar));
        } else {
            f(mVar.f51569e, sVar);
        }
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (!this.f418c.post(runnable)) {
            f(hVar, runnable);
        }
    }

    @Override
    public final boolean e() {
        if (this.d && i.a(Looper.myLooper(), this.f418c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f418c == this.f418c && eVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(h hVar, Runnable runnable) {
        e0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m0.f51571b.c(hVar, runnable);
    }

    public final int hashCode() {
        int i10;
        int identityHashCode = System.identityHashCode(this.f418c);
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return identityHashCode ^ i10;
    }

    @Override
    public final String toString() {
        e eVar;
        String str;
        ge.e eVar2 = m0.f51570a;
        e eVar3 = o.f9090a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f419e;
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
            String handler = this.f418c.toString();
            if (this.d) {
                return p6.t(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
