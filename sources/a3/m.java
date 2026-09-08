package a3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import b2.x1;
public final class m implements Handler.Callback {
    public final Handler f156a;
    public final n f157b;

    public m(n nVar, r2.l lVar) {
        this.f157b = nVar;
        Handler o9 = e2.d0.o(this);
        this.f156a = o9;
        lVar.d(this, o9);
    }

    public final void a(long j3) {
        boolean z10;
        Surface surface;
        n nVar = this.f157b;
        if (this == nVar.H1 && nVar.f44877b0 != null) {
            if (j3 == Long.MAX_VALUE) {
                nVar.M0 = true;
                return;
            }
            try {
                pf.b bVar = nVar.Z0;
                nVar.y0(j3);
                x1 x1Var = nVar.C1;
                if (!x1Var.equals(x1.d) && !x1Var.equals(nVar.D1)) {
                    nVar.D1 = x1Var;
                    bVar.l0(x1Var);
                }
                nVar.O0.f11601e++;
                a0 a0Var = nVar.f161c1;
                if (a0Var.f64e != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a0Var.f64e = 3;
                a0Var.f70l.getClass();
                a0Var.f66g = e2.d0.Q(SystemClock.elapsedRealtime());
                if (z10 && (surface = nVar.f171n1) != null) {
                    bVar.g0(surface);
                    nVar.f174q1 = true;
                }
                nVar.d0(j3);
            } catch (i2.o e7) {
                nVar.N0 = e7;
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
        String str = e2.d0.f8765a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
