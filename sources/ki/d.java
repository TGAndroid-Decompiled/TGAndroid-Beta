package ki;

import java.util.HashMap;
import org.telegram.messenger.np;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.oo;
import org.telegram.ui.web.p1;
public final class d implements Runnable {
    public final int f11395a;
    public final long f11396b;
    public final long f11397c;
    public final Object d;

    public d(Object obj, long j10, long j11, int i10) {
        this.f11395a = i10;
        this.d = obj;
        this.f11396b = j10;
        this.f11397c = j11;
    }

    @Override
    public final void run() {
        p51 p51Var;
        switch (this.f11395a) {
            case 0:
                k kVar = (k) this.d;
                long j10 = this.f11396b;
                long j11 = this.f11397c;
                if (kVar.G == 7) {
                    long j12 = ((j10 - j11) * 48000) / 1000;
                    kVar.f11424p = j12;
                    kVar.f11426r = 0L;
                    kVar.f11427s = k.r(j12);
                    kVar.i();
                    return;
                }
                return;
            case 1:
                long j13 = this.f11396b;
                long j14 = this.f11397c;
                k kVar2 = (k) ((g) this.d).f11405c;
                if (j13 == kVar2.f11423o) {
                    kVar2.f11422n = null;
                    kVar2.f11424p += j14;
                    kVar2.f11425q = 0L;
                    kVar2.f11417i.removeCallbacks(kVar2.D);
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
                        j jVar = kVar2.f11433z;
                        if (jVar == null) {
                            kVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j15 = kVar2.j();
                        kVar2.f11426r = 0L;
                        kVar2.f11427s = j15;
                        kVar2.f11418j.execute(new org.telegram.utils.recorder.audio.c(1, kVar2, jVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                vp vpVar = (vp) this.d;
                long j16 = this.f11396b;
                long j17 = this.f11397c;
                a0.h hVar = vpVar.Q1;
                HashMap hashMap = vpVar.S1;
                if (j16 != 0) {
                    String str = j17 + "_" + j16;
                    np npVar = (np) hashMap.get(str);
                    if (npVar != null) {
                        vpVar.R(npVar);
                        vpVar.R1.remove(npVar);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                np npVar2 = (np) hVar.f(j17);
                if (npVar2 != null) {
                    vpVar.R(npVar2);
                    vpVar.P1.remove(npVar2);
                    hVar.l(j17);
                    return;
                }
                return;
            case 3:
                oo.a0((oo) this.d, this.f11396b, this.f11397c);
                return;
            default:
                p1 p1Var = (p1) this.d;
                long j18 = this.f11396b;
                long j19 = this.f11397c;
                p1Var.h = j18;
                p1Var.f43163n = j19;
                ii iiVar = p1Var.f29837a;
                if (iiVar != null && (p51Var = iiVar.f30819f3) != null && iiVar.G) {
                    p51Var.O(true);
                    return;
                }
                return;
        }
    }
}
