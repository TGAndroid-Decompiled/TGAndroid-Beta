package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.ui.Components.m41;
public final class xk implements Runnable {
    public final int f26492a;
    public final long f26493b;
    public final long f26494c;
    public final Object d;

    public xk(Object obj, long j3, long j10, int i7) {
        this.f26492a = i7;
        this.d = obj;
        this.f26493b = j3;
        this.f26494c = j10;
    }

    @Override
    public final void run() {
        m41 m41Var;
        switch (this.f26492a) {
            case 0:
                qp qpVar = (qp) this.d;
                long j3 = this.f26493b;
                long j10 = this.f26494c;
                a0.h hVar = qpVar.Q1;
                HashMap hashMap = qpVar.S1;
                if (j3 != 0) {
                    String str = j10 + "_" + j3;
                    ip ipVar = (ip) hashMap.get(str);
                    if (ipVar != null) {
                        qpVar.R(ipVar);
                        qpVar.R1.remove(ipVar);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                ip ipVar2 = (ip) hVar.f(j10);
                if (ipVar2 != null) {
                    qpVar.R(ipVar2);
                    qpVar.P1.remove(ipVar2);
                    hVar.l(j10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.rn.b0((org.telegram.ui.rn) this.d, this.f26493b, this.f26494c);
                return;
            case 2:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.d;
                long j11 = this.f26493b;
                long j12 = this.f26494c;
                o1Var.h = j11;
                o1Var.f51243n = j12;
                fi.w3 w3Var = o1Var.f36649a;
                if (w3Var != null && (m41Var = w3Var.f37556f3) != null && w3Var.G) {
                    m41Var.O(true);
                    return;
                }
                return;
            case 3:
                vi.h hVar2 = (vi.h) this.d;
                long j13 = this.f26493b;
                long j14 = this.f26494c;
                if (hVar2.G == 7) {
                    long j15 = ((j13 - j14) * 48000) / 1000;
                    hVar2.f57566p = j15;
                    hVar2.f57568r = 0L;
                    hVar2.f57569s = vi.h.r(j15);
                    hVar2.i();
                    return;
                }
                return;
            default:
                long j16 = this.f26493b;
                long j17 = this.f26494c;
                vi.h hVar3 = (vi.h) ((ac.e) this.d).f1025c;
                if (j16 == hVar3.f57565o) {
                    hVar3.f57564n = null;
                    hVar3.f57566p += j17;
                    hVar3.f57567q = 0L;
                    hVar3.f57559i.removeCallbacks(hVar3.D);
                    int i7 = hVar3.G;
                    if (i7 == 10) {
                        hVar3.c();
                        hVar3.t();
                        hVar3.l("cancelled");
                        return;
                    } else if (i7 == 9) {
                        hVar3.c();
                        hVar3.t();
                        return;
                    } else if (hVar3.v) {
                        hVar3.v = false;
                        hVar3.i();
                        return;
                    } else if (i7 == 4) {
                        vi.g gVar = hVar3.f57575z;
                        if (gVar == null) {
                            hVar3.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j18 = hVar3.j();
                        hVar3.f57568r = 0L;
                        hVar3.f57569s = j18;
                        hVar3.f57560j.execute(new org.telegram.utils.recorder.audio.c(1, hVar3, gVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
