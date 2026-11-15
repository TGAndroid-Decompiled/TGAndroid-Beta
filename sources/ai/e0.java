package ai;

import bi.v3;
import java.util.HashMap;
import org.telegram.messenger.fp;
import org.telegram.messenger.np;
import org.telegram.ui.Components.p41;
import org.telegram.ui.qn;
public final class e0 implements Runnable {
    public final int f1189a;
    public final long f1190b;
    public final long f1191c;
    public final Object d;

    public e0(Object obj, long j3, long j10, int i7) {
        this.f1189a = i7;
        this.d = obj;
        this.f1190b = j3;
        this.f1191c = j10;
    }

    @Override
    public final void run() {
        p41 p41Var;
        switch (this.f1189a) {
            case 0:
                m0 m0Var = (m0) this.d;
                long j3 = this.f1190b;
                long j10 = this.f1191c;
                m0Var.getClass();
                m0Var.e(j3, Math.max(120L, j10 - j3));
                return;
            case 1:
                np npVar = (np) this.d;
                long j11 = this.f1190b;
                long j12 = this.f1191c;
                a0.h hVar = npVar.R1;
                HashMap hashMap = npVar.T1;
                if (j11 != 0) {
                    String str = j12 + "_" + j11;
                    fp fpVar = (fp) hashMap.get(str);
                    if (fpVar != null) {
                        npVar.R(fpVar);
                        npVar.S1.remove(fpVar);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                fp fpVar2 = (fp) hVar.f(j12);
                if (fpVar2 != null) {
                    npVar.R(fpVar2);
                    npVar.Q1.remove(fpVar2);
                    hVar.l(j12);
                    return;
                }
                return;
            case 2:
                qn.b0((qn) this.d, this.f1190b, this.f1191c);
                return;
            case 3:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.d;
                long j13 = this.f1190b;
                long j14 = this.f1191c;
                n1Var.h = j13;
                n1Var.f52727n = j14;
                v3 v3Var = n1Var.f38882a;
                if (v3Var != null && (p41Var = v3Var.f39895g3) != null && v3Var.H) {
                    p41Var.O(true);
                    return;
                }
                return;
            case 4:
                yi.j jVar = (yi.j) this.d;
                long j15 = this.f1190b;
                long j16 = this.f1191c;
                if (jVar.G == 7) {
                    long j17 = ((j15 - j16) * 48000) / 1000;
                    jVar.f60765p = j17;
                    jVar.f60767r = 0L;
                    jVar.f60768s = yi.j.r(j17);
                    jVar.i();
                    return;
                }
                return;
            default:
                long j18 = this.f1190b;
                long j19 = this.f1191c;
                yi.j jVar2 = (yi.j) ((ac.e) this.d).f1023c;
                if (j18 == jVar2.f60764o) {
                    jVar2.f60763n = null;
                    jVar2.f60765p += j19;
                    jVar2.f60766q = 0L;
                    jVar2.f60758i.removeCallbacks(jVar2.D);
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
                        yi.i iVar = jVar2.f60774z;
                        if (iVar == null) {
                            jVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j20 = jVar2.j();
                        jVar2.f60767r = 0L;
                        jVar2.f60768s = j20;
                        jVar2.f60759j.execute(new org.telegram.utils.recorder.audio.c(1, jVar2, iVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
