package c3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import d2.a2;
import g2.n0;
public final class k implements Handler.Callback {
    public final Handler f4055a;
    public final l f4056b;

    public k(l lVar, t2.l lVar2) {
        this.f4056b = lVar;
        Handler q10 = n0.q(this);
        this.f4055a = q10;
        lVar2.h(this, q10);
    }

    public final void a(long j10) {
        boolean z10;
        Surface surface;
        l lVar = this.f4056b;
        tf.b bVar = lVar.f4060c1;
        if (this == lVar.N1 && lVar.f54875e0 != null) {
            if (j10 == Long.MAX_VALUE) {
                lVar.N0 = true;
                return;
            }
            try {
                lVar.C0(j10);
                a2 a2Var = lVar.I1;
                if (!a2Var.equals(a2.d) && !a2Var.equals(lVar.J1)) {
                    lVar.J1 = a2Var;
                    bVar.E(a2Var);
                }
                lVar.P0.f16466e++;
                y yVar = lVar.f4063f1;
                if (yVar.f4124e != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yVar.f4124e = 3;
                yVar.f4130l.getClass();
                yVar.f4126g = n0.S(SystemClock.elapsedRealtime());
                if (z10 && (surface = lVar.f4074s1) != null) {
                    bVar.y(surface);
                    lVar.f4077v1 = true;
                }
                lVar.h0(j10);
            } catch (k2.l e10) {
                lVar.O0 = e10;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i3 = message.arg1;
        int i10 = message.arg2;
        String str = n0.f11873a;
        a(((i3 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
