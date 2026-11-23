package ai;

import bi.f6;
import java.util.HashMap;
import org.telegram.messenger.fp;
import org.telegram.messenger.np;
import org.telegram.ui.Components.c51;
import org.telegram.ui.rn;
public final class g0 implements Runnable {
    public final int f1212a;
    public final long f1213b;
    public final long f1214c;
    public final Object d;

    public g0(Object obj, long j3, long j10, int i7) {
        this.f1212a = i7;
        this.d = obj;
        this.f1213b = j3;
        this.f1214c = j10;
    }

    @Override
    public final void run() {
        c51 c51Var;
        switch (this.f1212a) {
            case 0:
                p0 p0Var = (p0) this.d;
                long j3 = this.f1213b;
                long j10 = this.f1214c;
                p0Var.getClass();
                p0Var.f(j3, Math.max(120L, j10 - j3));
                return;
            case 1:
                np npVar = (np) this.d;
                long j11 = this.f1213b;
                long j12 = this.f1214c;
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
                rn.b0((rn) this.d, this.f1213b, this.f1214c);
                return;
            case 3:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.d;
                long j13 = this.f1213b;
                long j14 = this.f1214c;
                n1Var.h = j13;
                n1Var.f53257n = j14;
                f6 f6Var = n1Var.f34681a;
                if (f6Var != null && (c51Var = f6Var.f35789g3) != null && f6Var.H) {
                    c51Var.O(true);
                    return;
                }
                return;
            case 4:
                yi.j jVar = (yi.j) this.d;
                long j15 = this.f1213b;
                long j16 = this.f1214c;
                if (jVar.G == 7) {
                    long j17 = ((j15 - j16) * 48000) / 1000;
                    jVar.f61375p = j17;
                    jVar.f61377r = 0L;
                    jVar.f61378s = yi.j.r(j17);
                    jVar.i();
                    return;
                }
                return;
            default:
                long j18 = this.f1213b;
                long j19 = this.f1214c;
                yi.j jVar2 = (yi.j) ((ac.e) this.d).f1022c;
                if (j18 == jVar2.f61374o) {
                    jVar2.f61373n = null;
                    jVar2.f61375p += j19;
                    jVar2.f61376q = 0L;
                    jVar2.f61368i.removeCallbacks(jVar2.D);
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
                        yi.h hVar2 = jVar2.f61384z;
                        if (hVar2 == null) {
                            jVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j20 = jVar2.j();
                        jVar2.f61377r = 0L;
                        jVar2.f61378s = j20;
                        jVar2.f61369j.execute(new org.telegram.utils.recorder.audio.c(1, jVar2, hVar2));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
