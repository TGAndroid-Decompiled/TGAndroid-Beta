package ki;

import android.os.Handler;
public final class b implements Runnable {
    public final int f13660a;
    public final h f13661b;

    public b(h hVar, int i10) {
        this.f13660a = i10;
        this.f13661b = hVar;
    }

    @Override
    public final void run() {
        k kVar;
        boolean z10;
        switch (this.f13660a) {
            case 0:
                h hVar = this.f13661b;
                Handler handler = hVar.f13714n;
                if (handler != null) {
                    handler.post(new b(hVar, 1));
                    return;
                }
                return;
            case 1:
                h hVar2 = this.f13661b;
                if (hVar2.R && hVar2.f13735y != null && (kVar = hVar2.f13731w) != null) {
                    synchronized (kVar) {
                        z10 = kVar.v;
                    }
                    if (!z10) {
                        try {
                            hVar2.f13731w.n();
                            q qVar = hVar2.v;
                            if (qVar != null) {
                                long j3 = hVar2.f13731w.f13774w;
                                if (j3 > 0) {
                                    qVar.h = j3;
                                    qVar.A = -1L;
                                    qVar.B = 0L;
                                    qVar.C = -1L;
                                    qVar.W = true;
                                } else {
                                    throw new IllegalArgumentException("Invalid recording time origin");
                                }
                            }
                            l lVar = hVar2.f13707j;
                            lVar.b("first camera frame received; codecs started: segmentElapsedMs=" + h.l(hVar2.f13699e0));
                            r0 r0Var = (r0) hVar2.f13709k.f13369b;
                            r0Var.h.post(new b0(r0Var, 3));
                            return;
                        } catch (RuntimeException e) {
                            hVar2.s(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                this.f13661b.a();
                return;
            case 3:
                this.f13661b.q();
                return;
            case 4:
                h hVar3 = this.f13661b;
                hVar3.R = false;
                hVar3.g();
                k kVar2 = hVar3.f13731w;
                if (kVar2 != null) {
                    kVar2.o();
                    hVar3.f13731w = null;
                }
                hVar3.X = false;
                r0 r0Var2 = (r0) hVar3.f13709k.f13369b;
                r0Var2.h.post(new b0(r0Var2, 2));
                return;
            case 5:
                this.f13661b.i();
                return;
            default:
                this.f13661b.F();
                return;
        }
    }
}
