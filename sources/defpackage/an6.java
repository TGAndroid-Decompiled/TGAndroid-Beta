package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
public final class an6 implements Handler.Callback {
    public final Handler a;
    public final bn6 b;

    public an6(bn6 bn6Var, jm6 jm6Var) {
        this.b = bn6Var;
        Handler q = gcc.q(this);
        this.a = q;
        jm6Var.m(this, q);
    }

    public final void a(long j) {
        boolean z;
        Surface surface;
        bn6 bn6Var = this.b;
        k7b k7bVar = bn6Var.c1;
        if (this == bn6Var.Q1 && bn6Var.c0 != null) {
            if (j == Long.MAX_VALUE) {
                bn6Var.M0 = true;
                return;
            }
            try {
                bn6Var.I0(j);
                ggc ggcVar = bn6Var.L1;
                if (!ggcVar.equals(ggc.d) && !ggcVar.equals(bn6Var.M1)) {
                    bn6Var.M1 = ggcVar;
                    k7bVar.t(ggcVar);
                }
                bn6Var.O0.e++;
                uec uecVar = bn6Var.f1;
                if (uecVar.e != 3) {
                    z = true;
                } else {
                    z = false;
                }
                uecVar.e = 3;
                uecVar.k.getClass();
                uecVar.g = gcc.T(SystemClock.elapsedRealtime());
                if (z && (surface = bn6Var.v1) != null) {
                    k7bVar.s(surface);
                    bn6Var.y1 = true;
                }
                bn6Var.n0(j);
            } catch (e64 e) {
                bn6Var.N0 = e;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = gcc.a;
        a(((i & 4294967295L) << 32) | (i2 & 4294967295L));
        return true;
    }
}
