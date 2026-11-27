package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
public final class le5 extends px2 implements vd3 {
    public final Handler c;
    public final boolean d;
    public final le5 e;

    public le5(Handler handler, boolean z) {
        le5 le5Var;
        this.c = handler;
        this.d = z;
        if (z) {
            le5Var = this;
        } else {
            le5Var = new le5(handler, true);
        }
        this.e = le5Var;
    }

    @Override
    public final ep3 a(long j, nsb nsbVar, mx2 mx2Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(nsbVar, j)) {
            return new ke5(this, nsbVar, (byte) 0);
        }
        f(mx2Var, nsbVar);
        return rm7.a;
    }

    @Override
    public final void b(long j, va1 va1Var) {
        iqd iqdVar = new iqd(va1Var, this, (byte) 5);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(iqdVar, j)) {
            va1Var.u(new m23(this, iqdVar, (byte) 3));
        } else {
            f(va1Var.e, iqdVar);
        }
    }

    @Override
    public final void c(mx2 mx2Var, Runnable runnable) {
        if (!this.c.post(runnable)) {
            f(mx2Var, runnable);
        }
    }

    @Override
    public final boolean d(mx2 mx2Var) {
        if (this.d && ur5.a(Looper.myLooper(), this.c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof le5) {
            le5 le5Var = (le5) obj;
            if (le5Var.c == this.c && le5Var.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(mx2 mx2Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
        if (ev5Var != null) {
            ev5Var.cancel(cancellationException);
        }
        qc3 qc3Var = bp3.a;
        qb3.c.c(mx2Var, runnable);
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
        le5 le5Var;
        String str;
        qc3 qc3Var = bp3.a;
        le5 le5Var2 = zi6.a;
        if (this == le5Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                le5Var = le5Var2.e;
            } catch (UnsupportedOperationException unused) {
                le5Var = null;
            }
            if (this == le5Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.c.toString();
            if (this.d) {
                return qd4.o(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
