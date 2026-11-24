package defpackage;

import java.util.HashMap;
import org.telegram.utils.recorder.audio.c;
public final class w30 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final Object d;

    public w30(Object obj, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override
    public final void run() {
        l7c l7cVar;
        switch (this.a) {
            case 0:
                h40 h40Var = (h40) this.d;
                long j = this.b;
                long j2 = this.c;
                if (h40Var.G == 7) {
                    long j3 = ((j - j2) * 48000) / 1000;
                    h40Var.p = j3;
                    h40Var.r = 0L;
                    h40Var.s = h40.r(j3);
                    h40Var.i();
                    return;
                }
                return;
            case 1:
                long j4 = this.b;
                long j5 = this.c;
                h40 h40Var2 = (h40) ((m30) this.d).c;
                if (j4 == h40Var2.o) {
                    h40Var2.n = null;
                    h40Var2.p += j5;
                    h40Var2.q = 0L;
                    h40Var2.i.removeCallbacks(h40Var2.D);
                    int i = h40Var2.G;
                    if (i == 10) {
                        h40Var2.c();
                        h40Var2.t();
                        h40Var2.l("cancelled");
                        return;
                    } else if (i == 9) {
                        h40Var2.c();
                        h40Var2.t();
                        return;
                    } else if (h40Var2.v) {
                        h40Var2.v = false;
                        h40Var2.i();
                        return;
                    } else if (i == 4) {
                        f40 f40Var = h40Var2.z;
                        if (f40Var == null) {
                            h40Var2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j6 = h40Var2.j();
                        h40Var2.r = 0L;
                        h40Var2.s = j6;
                        h40Var2.j.execute(new c(h40Var2, f40Var, (byte) 1));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                ((ba2) this.d).j0(this.b, this.c);
                return;
            case 3:
                long j7 = this.b;
                ((un3) this.d).j(j7, Math.max(120L, this.c - j7));
                return;
            case 4:
                oc7 oc7Var = (oc7) this.d;
                long j8 = this.b;
                long j9 = this.c;
                vh6 vh6Var = oc7Var.J1;
                HashMap hashMap = oc7Var.L1;
                if (j8 != 0) {
                    String str = j9 + "_" + j8;
                    hc7 hc7Var = (hc7) hashMap.get(str);
                    if (hc7Var != null) {
                        oc7Var.N(hc7Var);
                        oc7Var.K1.remove(hc7Var);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                hc7 hc7Var2 = (hc7) vh6Var.f(j9);
                if (hc7Var2 != null) {
                    oc7Var.N(hc7Var2);
                    oc7Var.I1.remove(hc7Var2);
                    vh6Var.l(j9);
                    return;
                }
                return;
            default:
                uuc uucVar = (uuc) this.d;
                long j10 = this.b;
                long j11 = this.c;
                uucVar.h = j10;
                uucVar.n = j11;
                va vaVar = uucVar.a;
                if (vaVar != null && (l7cVar = vaVar.g3) != null && vaVar.H) {
                    l7cVar.O(true);
                    return;
                }
                return;
        }
    }
}
