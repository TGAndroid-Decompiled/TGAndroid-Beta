package md;

import android.os.Handler;
import android.os.Looper;
import androidx.biometric.k;
import java.util.concurrent.CancellationException;
import k1.j;
import ld.a0;
import ld.e0;
import ld.e2;
import ld.j0;
import ld.m;
import ld.m0;
import ld.o0;
import ld.w1;
import qd.o;
import uc.h;
public final class d extends a0 implements j0 {
    public final Handler f13642c;
    public final boolean d;
    public final d f13643e;

    public d(Handler handler, boolean z4) {
        d dVar;
        this.f13642c = handler;
        this.d = z4;
        if (z4) {
            dVar = this;
        } else {
            dVar = new d(handler, true);
        }
        this.f13643e = dVar;
    }

    @Override
    public final o0 a(long j10, final e2 e2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f13642c.postDelayed(e2Var, j10)) {
            return new o0() {
                @Override
                public final void dispose() {
                    d.this.f13642c.removeCallbacks(e2Var);
                }
            };
        }
        f(hVar, e2Var);
        return w1.f12374a;
    }

    @Override
    public final void b(long j10, m mVar) {
        k kVar = new k(mVar, this, false, 25);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f13642c.postDelayed(kVar, j10)) {
            mVar.u(new j(1, this, kVar));
        } else {
            f(mVar.f12330e, kVar);
        }
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (!this.f13642c.post(runnable)) {
            f(hVar, runnable);
        }
    }

    @Override
    public final boolean e() {
        if (this.d && kotlin.jvm.internal.j.a(Looper.myLooper(), this.f13642c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f13642c == this.f13642c && dVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(h hVar, Runnable runnable) {
        e0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m0.f12332b.c(hVar, runnable);
    }

    public final int hashCode() {
        int i10;
        int identityHashCode = System.identityHashCode(this.f13642c);
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
        sd.e eVar = m0.f12331a;
        d dVar2 = o.f44818a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f13643e;
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
            String handler = this.f13642c.toString();
            if (this.d) {
                return w.c.e(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
