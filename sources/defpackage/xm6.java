package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
public final class xm6 implements Handler.Callback {
    public final Handler a;
    public final ym6 b;

    public xm6(ym6 ym6Var, hm6 hm6Var) {
        this.b = ym6Var;
        Handler q = hac.q(this);
        this.a = q;
        hm6Var.m(this, q);
    }

    public final void a(long j) {
        boolean z;
        Surface surface;
        ym6 ym6Var = this.b;
        xab xabVar = ym6Var.c1;
        if (this == ym6Var.Q1 && ym6Var.c0 != null) {
            if (j == Long.MAX_VALUE) {
                ym6Var.M0 = true;
                return;
            }
            try {
                ym6Var.I0(j);
                jec jecVar = ym6Var.L1;
                if (!jecVar.equals(jec.d) && !jecVar.equals(ym6Var.M1)) {
                    ym6Var.M1 = jecVar;
                    xabVar.q(jecVar);
                }
                ym6Var.O0.e++;
                xcc xccVar = ym6Var.f1;
                if (xccVar.e != 3) {
                    z = true;
                } else {
                    z = false;
                }
                xccVar.e = 3;
                xccVar.k.getClass();
                xccVar.g = hac.T(SystemClock.elapsedRealtime());
                if (z && (surface = ym6Var.v1) != null) {
                    xabVar.p(surface);
                    ym6Var.y1 = true;
                }
                ym6Var.n0(j);
            } catch (u64 e) {
                ym6Var.N0 = e;
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
        String str = hac.a;
        a(((i & 4294967295L) << 32) | (i2 & 4294967295L));
        return true;
    }
}
