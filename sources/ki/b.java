package ki;

import android.os.Handler;
public final class b implements Runnable {
    public final int f13653a;
    public final h f13654b;

    public b(h hVar, int i10) {
        this.f13653a = i10;
        this.f13654b = hVar;
    }

    @Override
    public final void run() {
        j jVar;
        boolean z10;
        switch (this.f13653a) {
            case 0:
                h hVar = this.f13654b;
                Handler handler = hVar.f13711n;
                if (handler != null) {
                    handler.post(new b(hVar, 2));
                    return;
                }
                return;
            case 1:
                this.f13654b.k();
                return;
            case 2:
                h hVar2 = this.f13654b;
                if (hVar2.R && hVar2.f13732y != null && (jVar = hVar2.f13728w) != null) {
                    synchronized (jVar) {
                        z10 = jVar.f13760t;
                    }
                    if (!z10) {
                        try {
                            hVar2.f13728w.n();
                            o oVar = hVar2.v;
                            if (oVar != null) {
                                long j3 = hVar2.f13728w.f13761u;
                                if (j3 > 0) {
                                    oVar.f13788g = j3;
                                    oVar.f13805z = -1L;
                                    oVar.A = 0L;
                                    oVar.B = -1L;
                                    oVar.V = true;
                                } else {
                                    throw new IllegalArgumentException("Invalid recording time origin");
                                }
                            }
                            k kVar = hVar2.f13704j;
                            kVar.b("first camera frame received; codecs started: segmentElapsedMs=" + h.n(hVar2.f13695d0));
                            q0 q0Var = (q0) hVar2.f13706k.f13672b;
                            q0Var.h.post(new y(q0Var, 3));
                            return;
                        } catch (RuntimeException e) {
                            hVar2.u(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                this.f13654b.a();
                return;
            case 4:
                this.f13654b.s();
                return;
            case 5:
                h hVar3 = this.f13654b;
                hVar3.R = false;
                hVar3.h();
                j jVar2 = hVar3.f13728w;
                if (jVar2 != null) {
                    jVar2.o();
                    hVar3.f13728w = null;
                }
                hVar3.X = false;
                q0 q0Var2 = (q0) hVar3.f13706k.f13672b;
                q0Var2.h.post(new y(q0Var2, 2));
                return;
            default:
                this.f13654b.H();
                return;
        }
    }
}
