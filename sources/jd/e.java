package jd;

import a9.o;
import android.os.Handler;
import android.os.Looper;
import id.a0;
import id.f0;
import id.f2;
import id.k0;
import id.m;
import id.n0;
import id.p0;
import id.x1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import rc.h;

public final class e extends a0 implements k0 {

    public final Handler f12907c;
    public final boolean d;

    public final e f12908e;

    public e(Handler handler, boolean z10) {
        this.f12907c = handler;
        this.d = z10;
        this.f12908e = z10 ? this : new e(handler, true);
    }

    @Override
    public final void a(long j10, m mVar) {
        o oVar = new o(mVar, this, false, 21);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f12907c.postDelayed(oVar, j10)) {
            mVar.u(new d(0, this, oVar));
        } else {
            f(mVar.f11167e, oVar);
        }
    }

    @Override
    public final p0 b(long j10, final f2 f2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f12907c.postDelayed(f2Var, j10)) {
            return new p0() {
                @Override
                public final void dispose() {
                    this.f12903a.f12907c.removeCallbacks(f2Var);
                }
            };
        }
        f(hVar, f2Var);
        return x1.f11215a;
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (this.f12907c.post(runnable)) {
            return;
        }
        f(hVar, runnable);
    }

    @Override
    public final boolean e() {
        return (this.d && j.a(Looper.myLooper(), this.f12907c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f12907c == this.f12907c && eVar.d == this.d;
    }

    public final void f(h hVar, Runnable runnable) {
        f0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        n0.f11172b.c(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f12907c) ^ (this.d ? 1231 : 1237);
    }

    @Override
    public final String toString() {
        e eVar;
        String str;
        pd.e eVar2 = n0.f11171a;
        e eVar3 = nd.o.f18504a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f12908e;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f12907c.toString();
        return this.d ? s3.c.l(string, ".immediate") : string;
    }
}
