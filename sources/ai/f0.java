package ai;

import bi.d6;
import java.util.HashMap;
import org.telegram.messenger.ep;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.z41;
import org.telegram.ui.rn;
public final class f0 implements Runnable {
    public final int f1191a;
    public final long f1192b;
    public final long f1193c;
    public final Object d;

    public f0(Object obj, long j3, long j10, int i7) {
        this.f1191a = i7;
        this.d = obj;
        this.f1192b = j3;
        this.f1193c = j10;
    }

    @Override
    public final void run() {
        z41 z41Var;
        switch (this.f1191a) {
            case 0:
                n0 n0Var = (n0) this.d;
                long j3 = this.f1192b;
                long j10 = this.f1193c;
                n0Var.getClass();
                n0Var.e(j3, Math.max(120L, j10 - j3));
                return;
            case 1:
                mp mpVar = (mp) this.d;
                long j11 = this.f1192b;
                long j12 = this.f1193c;
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
                rn.b0((rn) this.d, this.f1192b, this.f1193c);
                return;
            case 3:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.d;
                long j13 = this.f1192b;
                long j14 = this.f1193c;
                n1Var.h = j13;
                n1Var.f53259n = j14;
                d6 d6Var = n1Var.f33530a;
                if (d6Var != null && (z41Var = d6Var.f34607g3) != null && d6Var.H) {
                    z41Var.O(true);
                    return;
                }
                return;
            case 4:
                yi.j jVar = (yi.j) this.d;
                long j15 = this.f1192b;
                long j16 = this.f1193c;
                if (jVar.G == 7) {
                    long j17 = ((j15 - j16) * 48000) / 1000;
                    jVar.f61329p = j17;
                    jVar.f61331r = 0L;
                    jVar.f61332s = yi.j.r(j17);
                    jVar.i();
                    return;
                }
                return;
            default:
                long j18 = this.f1192b;
                long j19 = this.f1193c;
                yi.j jVar2 = (yi.j) ((ac.e) this.d).f1022c;
                if (j18 == jVar2.f61328o) {
                    jVar2.f61327n = null;
                    jVar2.f61329p += j19;
                    jVar2.f61330q = 0L;
                    jVar2.f61322i.removeCallbacks(jVar2.D);
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
                        yi.h hVar2 = jVar2.f61338z;
                        if (hVar2 == null) {
                            jVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j20 = jVar2.j();
                        jVar2.f61331r = 0L;
                        jVar2.f61332s = j20;
                        jVar2.f61323j.execute(new org.telegram.utils.recorder.audio.c(1, jVar2, hVar2));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
