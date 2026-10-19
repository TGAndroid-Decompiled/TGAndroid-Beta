package ce;

import android.os.Handler;
import android.os.Looper;
import be.a0;
import be.f0;
import be.f2;
import be.k0;
import be.m;
import be.n0;
import be.p0;
import be.x1;
import ge.o;
import j9.u;
import java.util.concurrent.CancellationException;
import kd.h;
import kotlin.jvm.internal.i;
public final class e extends a0 implements k0 {
    public final Handler f5116c;
    public final boolean d;
    public final e e;

    public e(Handler handler, boolean z10) {
        e eVar;
        this.f5116c = handler;
        this.d = z10;
        if (z10) {
            eVar = this;
        } else {
            eVar = new e(handler, true);
        }
        this.e = eVar;
    }

    @Override
    public final void a(long j10, m mVar) {
        u uVar = new u(9, mVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f5116c.postDelayed(uVar, j10)) {
            mVar.u(new d(0, this, uVar));
        } else {
            f(mVar.e, uVar);
        }
    }

    @Override
    public final p0 b(long j10, final f2 f2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f5116c.postDelayed(f2Var, j10)) {
            return new p0() {
                @Override
                public final void dispose() {
                    e.this.f5116c.removeCallbacks(f2Var);
                }
            };
        }
        f(hVar, f2Var);
        return x1.f4340a;
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (!this.f5116c.post(runnable)) {
            f(hVar, runnable);
        }
    }

    @Override
    public final boolean d() {
        if (this.d && i.a(Looper.myLooper(), this.f5116c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f5116c == this.f5116c && eVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(h hVar, Runnable runnable) {
        f0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        n0.f4305b.c(hVar, runnable);
    }

    public final int hashCode() {
        int i10;
        int identityHashCode = System.identityHashCode(this.f5116c);
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
        ie.e eVar2 = n0.f4304a;
        e eVar3 = o.f11039a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.e;
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
            String handler = this.f5116c.toString();
            if (this.d) {
                return r4.c.u(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
