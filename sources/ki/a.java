package ki;

import android.os.Handler;
public final class a implements Runnable {
    public final int f14874a;
    public final k f14875b;

    public a(k kVar, int i10) {
        this.f14874a = i10;
        this.f14875b = kVar;
    }

    @Override
    public final void run() {
        n nVar;
        boolean z10;
        switch (this.f14874a) {
            case 0:
                this.f14875b.u();
                return;
            case 1:
                this.f14875b.d0();
                return;
            case 2:
                k kVar = this.f14875b;
                Handler handler = kVar.f14996n;
                if (handler != null) {
                    handler.post(new a(kVar, 3));
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f14875b;
                if (kVar2.V && kVar2.A != null && (nVar = kVar2.f15022x) != null) {
                    synchronized (nVar) {
                        z10 = nVar.f15069z;
                    }
                    if (!z10) {
                        try {
                            n nVar2 = kVar2.f15022x;
                            kVar2.f15024y = nVar2;
                            Handler handler2 = kVar2.f14996n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(kVar2.f14995m1);
                                handler2.postDelayed(kVar2.f14995m1, 3000L);
                            }
                            nVar2.p(new d(kVar2, nVar2, 0), new d(kVar2, nVar2, 1));
                            o oVar = kVar2.f14986j;
                            oVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + k.z(kVar2.E0));
                            return;
                        } catch (RuntimeException e7) {
                            kVar2.k();
                            kVar2.N(e7);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f14875b;
                n nVar3 = kVar3.f15024y;
                if (kVar3.V && !kVar3.f14965b0 && nVar3 != null && kVar3.f15022x == nVar3) {
                    kVar3.f15024y = null;
                    kVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f14875b.g();
                return;
            case 6:
                this.f14875b.I();
                return;
            case 7:
                k kVar4 = this.f14875b;
                kVar4.V = false;
                kVar4.k();
                n nVar4 = kVar4.f15022x;
                if (nVar4 != null) {
                    long l4 = nVar4.l();
                    t tVar = kVar4.f15020w;
                    if (tVar != null && l4 != Long.MAX_VALUE) {
                        tVar.f15127q = Math.max(0L, l4) * 1000;
                        Handler handler3 = tVar.f15135u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(tVar.f15141x0);
                        }
                    }
                }
                kVar4.p();
                n nVar5 = kVar4.f15022x;
                if (nVar5 != null) {
                    nVar5.q();
                    kVar4.f15022x = null;
                }
                kVar4.f14965b0 = false;
                v0 v0Var = (v0) kVar4.f14989k.f51228b;
                v0Var.f15164i.post(new e0(v0Var, 3));
                return;
            default:
                this.f14875b.d0();
                return;
        }
    }
}
