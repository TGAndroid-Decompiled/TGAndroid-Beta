package ai;

import bi.i6;
import java.util.HashMap;
import org.telegram.messenger.ep;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.b51;
import org.telegram.ui.rn;
public final class c0 implements Runnable {
    public final int f1145a;
    public final long f1146b;
    public final long f1147c;
    public final Object d;

    public c0(Object obj, long j3, long j10, int i7) {
        this.f1145a = i7;
        this.d = obj;
        this.f1146b = j3;
        this.f1147c = j10;
    }

    @Override
    public final void run() {
        b51 b51Var;
        switch (this.f1145a) {
            case 0:
                l0 l0Var = (l0) this.d;
                long j3 = this.f1146b;
                long j10 = this.f1147c;
                l0Var.getClass();
                l0Var.g(j3, Math.max(120L, j10 - j3));
                return;
            case 1:
                mp mpVar = (mp) this.d;
                long j11 = this.f1146b;
                long j12 = this.f1147c;
                a0.h hVar = mpVar.T1;
                HashMap hashMap = mpVar.V1;
                if (j11 != 0) {
                    String str = j12 + "_" + j11;
                    ep epVar = (ep) hashMap.get(str);
                    if (epVar != null) {
                        mpVar.R(epVar);
                        mpVar.U1.remove(epVar);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                ep epVar2 = (ep) hVar.f(j12);
                if (epVar2 != null) {
                    mpVar.R(epVar2);
                    mpVar.S1.remove(epVar2);
                    hVar.l(j12);
                    return;
                }
                return;
            case 2:
                rn.b0((rn) this.d, this.f1146b, this.f1147c);
                return;
            case 3:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.d;
                long j13 = this.f1146b;
                long j14 = this.f1147c;
                n1Var.h = j13;
                n1Var.f53492n = j14;
                i6 i6Var = n1Var.f34213a;
                if (i6Var != null && (b51Var = i6Var.f35323g3) != null && i6Var.H) {
                    b51Var.O(true);
                    return;
                }
                return;
            case 4:
                yi.j jVar = (yi.j) this.d;
                long j15 = this.f1146b;
                long j16 = this.f1147c;
                if (jVar.G == 7) {
                    long j17 = ((j15 - j16) * 48000) / 1000;
                    jVar.f61459p = j17;
                    jVar.f61461r = 0L;
                    jVar.f61462s = yi.j.r(j17);
                    jVar.i();
                    return;
                }
                return;
            default:
                long j18 = this.f1146b;
                long j19 = this.f1147c;
                yi.j jVar2 = (yi.j) ((ac.e) this.d).f1022c;
                if (j18 == jVar2.f61458o) {
                    jVar2.f61457n = null;
                    jVar2.f61459p += j19;
                    jVar2.f61460q = 0L;
                    jVar2.f61452i.removeCallbacks(jVar2.D);
                    int i7 = jVar2.G;
                    if (i7 == 10) {
                        jVar2.c();
                        jVar2.t();
                        jVar2.l("cancelled");
                        return;
                    } else if (i7 == 9) {
                        jVar2.c();
                        jVar2.t();
                        return;
                    } else if (jVar2.v) {
                        jVar2.v = false;
                        jVar2.i();
                        return;
                    } else if (i7 == 4) {
                        yi.h hVar2 = jVar2.f61468z;
                        if (hVar2 == null) {
                            jVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j20 = jVar2.j();
                        jVar2.f61461r = 0L;
                        jVar2.f61462s = j20;
                        jVar2.f61453j.execute(new org.telegram.utils.recorder.audio.c(1, jVar2, hVar2));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
