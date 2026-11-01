package ki;

import java.util.HashMap;
import org.telegram.messenger.op;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.q51;
import org.telegram.ui.oo;
import org.telegram.ui.web.p1;
public final class d implements Runnable {
    public final int f11396a;
    public final long f11397b;
    public final long f11398c;
    public final Object d;

    public d(Object obj, long j10, long j11, int i10) {
        this.f11396a = i10;
        this.d = obj;
        this.f11397b = j10;
        this.f11398c = j11;
    }

    @Override
    public final void run() {
        q51 q51Var;
        switch (this.f11396a) {
            case 0:
                k kVar = (k) this.d;
                long j10 = this.f11397b;
                long j11 = this.f11398c;
                if (kVar.G == 7) {
                    long j12 = ((j10 - j11) * 48000) / 1000;
                    kVar.f11425p = j12;
                    kVar.f11427r = 0L;
                    kVar.f11428s = k.r(j12);
                    kVar.i();
                    return;
                }
                return;
            case 1:
                long j13 = this.f11397b;
                long j14 = this.f11398c;
                k kVar2 = (k) ((g) this.d).f11406c;
                if (j13 == kVar2.f11424o) {
                    kVar2.f11423n = null;
                    kVar2.f11425p += j14;
                    kVar2.f11426q = 0L;
                    kVar2.f11418i.removeCallbacks(kVar2.D);
                    int i10 = kVar2.G;
                    if (i10 == 10) {
                        kVar2.c();
                        kVar2.t();
                        kVar2.l("cancelled");
                        return;
                    } else if (i10 == 9) {
                        kVar2.c();
                        kVar2.t();
                        return;
                    } else if (kVar2.v) {
                        kVar2.v = false;
                        kVar2.i();
                        return;
                    } else if (i10 == 4) {
                        j jVar = kVar2.f11434z;
                        if (jVar == null) {
                            kVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j15 = kVar2.j();
                        kVar2.f11427r = 0L;
                        kVar2.f11428s = j15;
                        kVar2.f11419j.execute(new org.telegram.utils.recorder.audio.c(1, kVar2, jVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                wp wpVar = (wp) this.d;
                long j16 = this.f11397b;
                long j17 = this.f11398c;
                a0.h hVar = wpVar.Q1;
                HashMap hashMap = wpVar.S1;
                if (j16 != 0) {
                    String str = j17 + "_" + j16;
                    op opVar = (op) hashMap.get(str);
                    if (opVar != null) {
                        wpVar.R(opVar);
                        wpVar.R1.remove(opVar);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                op opVar2 = (op) hVar.f(j17);
                if (opVar2 != null) {
                    wpVar.R(opVar2);
                    wpVar.P1.remove(opVar2);
                    hVar.l(j17);
                    return;
                }
                return;
            case 3:
                oo.b0((oo) this.d, this.f11397b, this.f11398c);
                return;
            default:
                p1 p1Var = (p1) this.d;
                long j18 = this.f11397b;
                long j19 = this.f11398c;
                p1Var.h = j18;
                p1Var.f42965n = j19;
                ii iiVar = p1Var.f30217a;
                if (iiVar != null && (q51Var = iiVar.f31183f3) != null && iiVar.G) {
                    q51Var.O(true);
                    return;
                }
                return;
        }
    }
}
