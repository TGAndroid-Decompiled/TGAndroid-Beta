package id;

import android.os.Handler;
import android.os.Looper;
import androidx.biometric.j;
import hd.a0;
import hd.f0;
import hd.f2;
import hd.k0;
import hd.m;
import hd.n0;
import hd.p0;
import hd.x1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import md.o;
import qc.h;
public final class e extends a0 implements k0 {
    public final Handler f11105c;
    public final boolean d;
    public final e f11106e;

    public e(Handler handler, boolean z10) {
        e eVar;
        this.f11105c = handler;
        this.d = z10;
        if (z10) {
            eVar = this;
        } else {
            eVar = new e(handler, true);
        }
        this.f11106e = eVar;
    }

    @Override
    public final p0 a(long j10, final f2 f2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f11105c.postDelayed(f2Var, j10)) {
            return new p0() {
                @Override
                public final void dispose() {
                    e.this.f11105c.removeCallbacks(f2Var);
                }
            };
        }
        f(hVar, f2Var);
        return x1.f10506a;
    }

    @Override
    public final void b(long j10, m mVar) {
        j jVar = new j(mVar, this, false, 20);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f11105c.postDelayed(jVar, j10)) {
            mVar.u(new d(0, this, jVar));
        } else {
            f(mVar.f10458e, jVar);
        }
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (!this.f11105c.post(runnable)) {
            f(hVar, runnable);
        }
    }

    @Override
    public final boolean e() {
        if (this.d && i.a(Looper.myLooper(), this.f11105c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f11105c == this.f11105c && eVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(h hVar, Runnable runnable) {
        f0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        n0.f10463b.c(hVar, runnable);
    }

    public final int hashCode() {
        int i9;
        int identityHashCode = System.identityHashCode(this.f11105c);
        if (this.d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return identityHashCode ^ i9;
    }

    @Override
    public final String toString() {
        e eVar;
        String str;
        od.e eVar2 = n0.f10462a;
        e eVar3 = o.f17668a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f11106e;
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
            String handler = this.f11105c.toString();
            if (this.d) {
                return ta.b.j(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
