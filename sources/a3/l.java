package a3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import b2.x1;
public final class l implements Handler.Callback {
    public final Handler f133a;
    public final m f134b;

    public l(m mVar, r2.l lVar) {
        this.f134b = mVar;
        Handler o9 = e2.d0.o(this);
        this.f133a = o9;
        lVar.d(this, o9);
    }

    public final void a(long j3) {
        boolean z10;
        Surface surface;
        m mVar = this.f134b;
        if (this == mVar.H1 && mVar.f44849b0 != null) {
            if (j3 == Long.MAX_VALUE) {
                mVar.M0 = true;
                return;
            }
            try {
                pf.b bVar = mVar.Z0;
                mVar.x0(j3);
                x1 x1Var = mVar.C1;
                if (!x1Var.equals(x1.d) && !x1Var.equals(mVar.D1)) {
                    mVar.D1 = x1Var;
                    bVar.k0(x1Var);
                }
                mVar.O0.f11575e++;
                z zVar = mVar.f138c1;
                if (zVar.f199e != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zVar.f199e = 3;
                zVar.f205l.getClass();
                zVar.f201g = e2.d0.Q(SystemClock.elapsedRealtime());
                if (z10 && (surface = mVar.f148n1) != null) {
                    Handler handler = (Handler) bVar.f44046b;
                    if (handler != null) {
                        handler.post(new g0(bVar, surface, SystemClock.elapsedRealtime(), 0));
                    }
                    mVar.f151q1 = true;
                }
                mVar.c0(j3);
            } catch (i2.o e7) {
                mVar.N0 = e7;
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
        String str = e2.d0.f8737a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
