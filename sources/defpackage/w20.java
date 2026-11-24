package defpackage;

import java.util.HashMap;
import org.telegram.utils.recorder.audio.c;
public final class w20 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final Object d;

    public w20(Object obj, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override
    public final void run() {
        l5c l5cVar;
        switch (this.a) {
            case 0:
                h30 h30Var = (h30) this.d;
                long j = this.b;
                long j2 = this.c;
                if (h30Var.G == 7) {
                    long j3 = ((j - j2) * 48000) / 1000;
                    h30Var.p = j3;
                    h30Var.r = 0L;
                    h30Var.s = h30.r(j3);
                    h30Var.i();
                    return;
                }
                return;
            case 1:
                long j4 = this.b;
                long j5 = this.c;
                h30 h30Var2 = (h30) ((m20) this.d).c;
                if (j4 == h30Var2.o) {
                    h30Var2.n = null;
                    h30Var2.p += j5;
                    h30Var2.q = 0L;
                    h30Var2.i.removeCallbacks(h30Var2.D);
                    int i = h30Var2.G;
                    if (i == 10) {
                        h30Var2.c();
                        h30Var2.t();
                        h30Var2.l("cancelled");
                        return;
                    } else if (i == 9) {
                        h30Var2.c();
                        h30Var2.t();
                        return;
                    } else if (h30Var2.v) {
                        h30Var2.v = false;
                        h30Var2.i();
                        return;
                    } else if (i == 4) {
                        f30 f30Var = h30Var2.z;
                        if (f30Var == null) {
                            h30Var2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j6 = h30Var2.j();
                        h30Var2.r = 0L;
                        h30Var2.s = j6;
                        h30Var2.j.execute(new c(h30Var2, f30Var, (byte) 1));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                ((p82) this.d).i0(this.b, this.c);
                return;
            case 3:
                long j7 = this.b;
                ((jm3) this.d).j(j7, Math.max(120L, this.c - j7));
                return;
            case 4:
                na7 na7Var = (na7) this.d;
                long j8 = this.b;
                long j9 = this.c;
                vf6 vf6Var = na7Var.J1;
                HashMap hashMap = na7Var.L1;
                if (j8 != 0) {
                    String str = j9 + "_" + j8;
                    ga7 ga7Var = (ga7) hashMap.get(str);
                    if (ga7Var != null) {
                        na7Var.N(ga7Var);
                        na7Var.K1.remove(ga7Var);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                ga7 ga7Var2 = (ga7) vf6Var.f(j9);
                if (ga7Var2 != null) {
                    na7Var.N(ga7Var2);
                    na7Var.I1.remove(ga7Var2);
                    vf6Var.l(j9);
                    return;
                }
                return;
            default:
                tsc tscVar = (tsc) this.d;
                long j10 = this.b;
                long j11 = this.c;
                tscVar.h = j10;
                tscVar.n = j11;
                va vaVar = tscVar.a;
                if (vaVar != null && (l5cVar = vaVar.g3) != null && vaVar.H) {
                    l5cVar.O(true);
                    return;
                }
                return;
        }
    }
}
