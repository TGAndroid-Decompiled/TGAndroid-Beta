package a3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import b2.a2;
public final class m implements Handler.Callback {
    public final Handler f145a;
    public final n f146b;

    public m(n nVar, r2.l lVar) {
        this.f146b = nVar;
        Handler q6 = e2.m0.q(this);
        this.f145a = q6;
        lVar.d(this, q6);
    }

    public final void a(long j10) {
        boolean z10;
        Surface surface;
        n nVar = this.f146b;
        n4.s sVar = nVar.f148b1;
        if (this == nVar.M1 && nVar.f44964d0 != null) {
            if (j10 == Long.MAX_VALUE) {
                nVar.M0 = true;
                return;
            }
            try {
                nVar.C0(j10);
                a2 a2Var = nVar.H1;
                if (!a2Var.equals(a2.d) && !a2Var.equals(nVar.I1)) {
                    nVar.I1 = a2Var;
                    sVar.I(a2Var);
                }
                nVar.O0.e++;
                a0 a0Var = nVar.f151e1;
                if (a0Var.e != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a0Var.e = 3;
                a0Var.f64l.getClass();
                a0Var.f60g = e2.m0.S(SystemClock.elapsedRealtime());
                if (z10 && (surface = nVar.f163r1) != null) {
                    sVar.D(surface);
                    nVar.f166u1 = true;
                }
                nVar.h0(j10);
            } catch (i2.n e) {
                nVar.N0 = e;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        String str = e2.m0.f8252a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
