package a3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import b2.x1;
public final class m implements Handler.Callback {
    public final Handler f145a;
    public final n f146b;

    public m(n nVar, r2.l lVar) {
        this.f146b = nVar;
        Handler o9 = e2.d0.o(this);
        this.f145a = o9;
        lVar.e(this, o9);
    }

    public final void a(long j3) {
        boolean z10;
        Surface surface;
        n nVar = this.f146b;
        if (this == nVar.H1 && nVar.f41931b0 != null) {
            if (j3 == Long.MAX_VALUE) {
                nVar.M0 = true;
                return;
            }
            try {
                of.b bVar = nVar.Z0;
                nVar.y0(j3);
                x1 x1Var = nVar.C1;
                if (!x1Var.equals(x1.d) && !x1Var.equals(nVar.D1)) {
                    nVar.D1 = x1Var;
                    bVar.W(x1Var);
                }
                nVar.O0.e++;
                a0 a0Var = nVar.f150c1;
                if (a0Var.e != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a0Var.e = 3;
                a0Var.f67l.getClass();
                a0Var.f63g = e2.d0.Q(SystemClock.elapsedRealtime());
                if (z10 && (surface = nVar.f160n1) != null) {
                    bVar.S(surface);
                    nVar.f163q1 = true;
                }
                nVar.d0(j3);
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
        String str = e2.d0.f7871a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
