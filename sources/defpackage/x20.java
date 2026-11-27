package defpackage;

import java.util.HashMap;
import org.telegram.utils.recorder.audio.c;
public final class x20 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final Object d;

    public x20(Object obj, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override
    public final void run() {
        l9c l9cVar;
        switch (this.a) {
            case 0:
                i30 i30Var = (i30) this.d;
                long j = this.b;
                long j2 = this.c;
                if (i30Var.G == 7) {
                    long j3 = ((j - j2) * 48000) / 1000;
                    i30Var.p = j3;
                    i30Var.r = 0L;
                    i30Var.s = i30.r(j3);
                    i30Var.i();
                    return;
                }
                return;
            case 1:
                long j4 = this.b;
                long j5 = this.c;
                i30 i30Var2 = (i30) ((n20) this.d).c;
                if (j4 == i30Var2.o) {
                    i30Var2.n = null;
                    i30Var2.p += j5;
                    i30Var2.q = 0L;
                    i30Var2.i.removeCallbacks(i30Var2.D);
                    int i = i30Var2.G;
                    if (i == 10) {
                        i30Var2.c();
                        i30Var2.t();
                        i30Var2.l("cancelled");
                        return;
                    } else if (i == 9) {
                        i30Var2.c();
                        i30Var2.t();
                        return;
                    } else if (i30Var2.v) {
                        i30Var2.v = false;
                        i30Var2.i();
                        return;
                    } else if (i == 4) {
                        g30 g30Var = i30Var2.z;
                        if (g30Var == null) {
                            i30Var2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j6 = i30Var2.j();
                        i30Var2.r = 0L;
                        i30Var2.s = j6;
                        i30Var2.j.execute(new c(i30Var2, g30Var, (byte) 1));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                ((g92) this.d).i0(this.b, this.c);
                return;
            case 3:
                long j7 = this.b;
                ((bn3) this.d).l(j7, Math.max(120L, this.c - j7));
                return;
            case 4:
                uc7 uc7Var = (uc7) this.d;
                long j8 = this.b;
                long j9 = this.c;
                zh6 zh6Var = uc7Var.J1;
                HashMap hashMap = uc7Var.L1;
                if (j8 != 0) {
                    String str = j9 + "_" + j8;
                    nc7 nc7Var = (nc7) hashMap.get(str);
                    if (nc7Var != null) {
                        uc7Var.P(nc7Var);
                        uc7Var.K1.remove(nc7Var);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                nc7 nc7Var2 = (nc7) zh6Var.f(j9);
                if (nc7Var2 != null) {
                    uc7Var.P(nc7Var2);
                    uc7Var.I1.remove(nc7Var2);
                    zh6Var.l(j9);
                    return;
                }
                return;
            default:
                ixc ixcVar = (ixc) this.d;
                long j10 = this.b;
                long j11 = this.c;
                ixcVar.h = j10;
                ixcVar.n = j11;
                wa waVar = ixcVar.a;
                if (waVar != null && (l9cVar = waVar.g3) != null && waVar.H) {
                    l9cVar.O(true);
                    return;
                }
                return;
        }
    }
}
