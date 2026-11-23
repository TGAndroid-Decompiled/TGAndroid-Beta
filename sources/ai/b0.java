package ai;

import bi.i6;
import java.util.HashMap;
import org.telegram.messenger.fp;
import org.telegram.messenger.np;
import org.telegram.ui.Components.c51;
import org.telegram.ui.rn;
public final class b0 implements Runnable {
    public final int f1131a;
    public final long f1132b;
    public final long f1133c;
    public final Object d;

    public b0(Object obj, long j3, long j10, int i7) {
        this.f1131a = i7;
        this.d = obj;
        this.f1132b = j3;
        this.f1133c = j10;
    }

    @Override
    public final void run() {
        c51 c51Var;
        switch (this.f1131a) {
            case 0:
                k0 k0Var = (k0) this.d;
                long j3 = this.f1132b;
                long j10 = this.f1133c;
                k0Var.getClass();
                k0Var.f(j3, Math.max(120L, j10 - j3));
                return;
            case 1:
                np npVar = (np) this.d;
                long j11 = this.f1132b;
                long j12 = this.f1133c;
                a0.h hVar = npVar.T1;
                HashMap hashMap = npVar.V1;
                if (j11 != 0) {
                    String str = j12 + "_" + j11;
                    fp fpVar = (fp) hashMap.get(str);
                    if (fpVar != null) {
                        npVar.R(fpVar);
                        npVar.U1.remove(fpVar);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                fp fpVar2 = (fp) hVar.f(j12);
                if (fpVar2 != null) {
                    npVar.R(fpVar2);
                    npVar.S1.remove(fpVar2);
                    hVar.l(j12);
                    return;
                }
                return;
            case 2:
                rn.b0((rn) this.d, this.f1132b, this.f1133c);
                return;
            case 3:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.d;
                long j13 = this.f1132b;
                long j14 = this.f1133c;
                n1Var.h = j13;
                n1Var.f53221n = j14;
                i6 i6Var = n1Var.f34671a;
                if (i6Var != null && (c51Var = i6Var.f35742g3) != null && i6Var.H) {
                    c51Var.O(true);
                    return;
                }
                return;
            case 4:
                yi.j jVar = (yi.j) this.d;
                long j15 = this.f1132b;
                long j16 = this.f1133c;
                if (jVar.G == 7) {
                    long j17 = ((j15 - j16) * 48000) / 1000;
                    jVar.f61340p = j17;
                    jVar.f61342r = 0L;
                    jVar.f61343s = yi.j.r(j17);
                    jVar.i();
                    return;
                }
                return;
            default:
                long j18 = this.f1132b;
                long j19 = this.f1133c;
                yi.j jVar2 = (yi.j) ((ac.e) this.d).f1022c;
                if (j18 == jVar2.f61339o) {
                    jVar2.f61338n = null;
                    jVar2.f61340p += j19;
                    jVar2.f61341q = 0L;
                    jVar2.f61333i.removeCallbacks(jVar2.D);
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
                        yi.h hVar2 = jVar2.f61349z;
                        if (hVar2 == null) {
                            jVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j20 = jVar2.j();
                        jVar2.f61342r = 0L;
                        jVar2.f61343s = j20;
                        jVar2.f61334j.execute(new org.telegram.utils.recorder.audio.c(1, jVar2, hVar2));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
