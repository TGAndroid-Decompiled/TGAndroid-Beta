package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
public final class kc5 extends vw2 implements dd3 {
    public final Handler c;
    public final boolean d;
    public final kc5 e;

    public kc5(Handler handler, boolean z) {
        kc5 kc5Var;
        this.c = handler;
        this.d = z;
        if (z) {
            kc5Var = this;
        } else {
            kc5Var = new kc5(handler, true);
        }
        this.e = kc5Var;
    }

    @Override
    public final no3 a(long j, nob nobVar, sw2 sw2Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(nobVar, j)) {
            return new jc5(this, nobVar, (byte) 0);
        }
        f(sw2Var, nobVar);
        return sj7.a;
    }

    @Override
    public final void b(long j, na1 na1Var) {
        rld rldVar = new rld(na1Var, this, (byte) 5);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(rldVar, j)) {
            na1Var.u(new u13(this, rldVar, (byte) 3));
        } else {
            f(na1Var.e, rldVar);
        }
    }

    @Override
    public final void c(sw2 sw2Var, Runnable runnable) {
        if (!this.c.post(runnable)) {
            f(sw2Var, runnable);
        }
    }

    @Override
    public final boolean d(sw2 sw2Var) {
        if (this.d && rp5.a(Looper.myLooper(), this.c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kc5) {
            kc5 kc5Var = (kc5) obj;
            if (kc5Var.c == this.c && kc5Var.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(sw2 sw2Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        bt5 bt5Var = (bt5) sw2Var.get(pd5.c);
        if (bt5Var != null) {
            bt5Var.cancel(cancellationException);
        }
        xb3 xb3Var = ko3.a;
        xa3.c.c(sw2Var, runnable);
    }

    public final int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.c);
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return identityHashCode ^ i;
    }

    @Override
    public final String toString() {
        kc5 kc5Var;
        String str;
        xb3 xb3Var = ko3.a;
        kc5 kc5Var2 = ug6.a;
        if (this == kc5Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                kc5Var = kc5Var2.e;
            } catch (UnsupportedOperationException unused) {
                kc5Var = null;
            }
            if (this == kc5Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.c.toString();
            if (this.d) {
                return tb4.o(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
