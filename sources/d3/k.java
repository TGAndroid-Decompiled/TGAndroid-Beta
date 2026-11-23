package d3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import e2.x1;
import h2.l0;
public final class k implements Handler.Callback {
    public final Handler f7696a;
    public final l f7697b;

    public k(l lVar, u2.l lVar2) {
        this.f7697b = lVar;
        Handler q10 = l0.q(this);
        this.f7696a = q10;
        lVar2.o(this, q10);
    }

    public final void a(long j3) {
        boolean z10;
        Surface surface;
        l lVar = this.f7697b;
        wf.b bVar = lVar.f7700c1;
        if (this == lVar.N1 && lVar.f58486e0 != null) {
            if (j3 == Long.MAX_VALUE) {
                lVar.N0 = true;
                return;
            }
            try {
                lVar.C0(j3);
                x1 x1Var = lVar.I1;
                if (!x1Var.equals(x1.d) && !x1Var.equals(lVar.J1)) {
                    lVar.J1 = x1Var;
                    bVar.V(x1Var);
                }
                lVar.P0.f19378e++;
                x xVar = lVar.f7703f1;
                if (xVar.f7758e != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xVar.f7758e = 3;
                xVar.f7764l.getClass();
                xVar.f7760g = l0.S(SystemClock.elapsedRealtime());
                if (z10 && (surface = lVar.f7714s1) != null) {
                    bVar.P(surface);
                    lVar.f7717v1 = true;
                }
                lVar.h0(j3);
            } catch (l2.m e10) {
                lVar.O0 = e10;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i10 = message.arg2;
        String str = l0.f13778a;
        a(((i7 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
