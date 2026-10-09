package be;

import ae.b0;
import ae.g0;
import ae.g2;
import ae.l0;
import ae.m;
import ae.o0;
import ae.q0;
import ae.y1;
import android.os.Handler;
import android.os.Looper;
import fe.o;
import i9.s;
import java.util.concurrent.CancellationException;
import jd.h;
import kotlin.jvm.internal.i;
import sc.v;
public final class e extends b0 implements l0 {
    public final Handler f3880c;
    public final boolean d;
    public final e f3881e;

    public e(Handler handler, boolean z10) {
        e eVar;
        this.f3880c = handler;
        this.d = z10;
        if (z10) {
            eVar = this;
        } else {
            eVar = new e(handler, true);
        }
        this.f3881e = eVar;
    }

    @Override
    public final q0 a(long j3, final g2 g2Var, h hVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f3880c.postDelayed(g2Var, j3)) {
            return new q0() {
                @Override
                public final void dispose() {
                    e.this.f3880c.removeCallbacks(g2Var);
                }
            };
        }
        f(hVar, g2Var);
        return y1.f523a;
    }

    @Override
    public final void b(long j3, m mVar) {
        s sVar = new s(3, mVar, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f3880c.postDelayed(sVar, j3)) {
            mVar.u(new d(0, this, sVar));
        } else {
            f(mVar.f474e, sVar);
        }
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (!this.f3880c.post(runnable)) {
            f(hVar, runnable);
        }
    }

    @Override
    public final boolean e() {
        if (this.d && i.a(Looper.myLooper(), this.f3880c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f3880c == this.f3880c && eVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(h hVar, Runnable runnable) {
        g0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        o0.f481b.c(hVar, runnable);
    }

    public final int hashCode() {
        int i10;
        int identityHashCode = System.identityHashCode(this.f3880c);
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
        he.e eVar2 = o0.f480a;
        e eVar3 = o.f9913a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f3881e;
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
            String handler = this.f3880c.toString();
            if (this.d) {
                return v.v(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
