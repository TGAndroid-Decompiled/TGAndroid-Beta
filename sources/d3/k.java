package d3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import e2.x1;
import h2.m0;
public final class k implements Handler.Callback {
    public final Handler f8033a;
    public final l f8034b;

    public k(l lVar, u2.l lVar2) {
        this.f8034b = lVar;
        Handler q10 = m0.q(this);
        this.f8033a = q10;
        lVar2.h(this, q10);
    }

    public final void a(long j3) {
        boolean z9;
        Surface surface;
        l lVar = this.f8034b;
        wf.b bVar = lVar.f8036b1;
        if (this == lVar.M1 && lVar.f56293d0 != null) {
            if (j3 == Long.MAX_VALUE) {
                lVar.M0 = true;
                return;
            }
            try {
                lVar.C0(j3);
                x1 x1Var = lVar.H1;
                if (!x1Var.equals(x1.d) && !x1Var.equals(lVar.I1)) {
                    lVar.I1 = x1Var;
                    bVar.m0(x1Var);
                }
                lVar.O0.f17780e++;
                y yVar = lVar.f8039e1;
                if (yVar.f8101e != 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                yVar.f8101e = 3;
                yVar.f8107l.getClass();
                yVar.f8103g = m0.S(SystemClock.elapsedRealtime());
                if (z9 && (surface = lVar.f8050r1) != null) {
                    bVar.g0(surface);
                    lVar.f8053u1 = true;
                }
                lVar.h0(j3);
            } catch (l2.l e10) {
                lVar.N0 = e10;
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
        String str = m0.f14114a;
        a(((i7 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
