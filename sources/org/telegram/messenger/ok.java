package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.ui.Components.f41;
public final class ok implements Runnable {
    public final int f24557a;
    public final long f24558b;
    public final long f24559c;
    public final Object d;

    public ok(Object obj, long j10, long j11, int i3) {
        this.f24557a = i3;
        this.d = obj;
        this.f24558b = j10;
        this.f24559c = j11;
    }

    @Override
    public final void run() {
        f41 f41Var;
        switch (this.f24557a) {
            case 0:
                hp hpVar = (hp) this.d;
                long j10 = this.f24558b;
                long j11 = this.f24559c;
                a0.h hVar = hpVar.R1;
                HashMap hashMap = hpVar.T1;
                if (j10 != 0) {
                    String str = j11 + "_" + j10;
                    zo zoVar = (zo) hashMap.get(str);
                    if (zoVar != null) {
                        hpVar.R(zoVar);
                        hpVar.S1.remove(zoVar);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                zo zoVar2 = (zo) hVar.f(j11);
                if (zoVar2 != null) {
                    hpVar.R(zoVar2);
                    hpVar.Q1.remove(zoVar2);
                    hVar.l(j11);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ln.b0((org.telegram.ui.ln) this.d, this.f24558b, this.f24559c);
                return;
            case 2:
                org.telegram.ui.web.m1 m1Var = (org.telegram.ui.web.m1) this.d;
                long j12 = this.f24558b;
                long j13 = this.f24559c;
                m1Var.h = j12;
                m1Var.f50951n = j13;
                ai.h4 h4Var = m1Var.f34298a;
                if (h4Var != null && (f41Var = h4Var.f35594g3) != null && h4Var.H) {
                    f41Var.O(true);
                    return;
                }
                return;
            case 3:
                vi.j jVar = (vi.j) this.d;
                long j14 = this.f24558b;
                long j15 = this.f24559c;
                if (jVar.G == 7) {
                    long j16 = ((j14 - j15) * 48000) / 1000;
                    jVar.f56994p = j16;
                    jVar.f56996r = 0L;
                    jVar.f56997s = vi.j.r(j16);
                    jVar.i();
                    return;
                }
                return;
            default:
                long j17 = this.f24558b;
                long j18 = this.f24559c;
                vi.j jVar2 = (vi.j) ((vi.f) this.d).f56973c;
                if (j17 == jVar2.f56993o) {
                    jVar2.f56992n = null;
                    jVar2.f56994p += j18;
                    jVar2.f56995q = 0L;
                    jVar2.f56987i.removeCallbacks(jVar2.D);
                    int i3 = jVar2.G;
                    if (i3 == 10) {
                        jVar2.c();
                        jVar2.t();
                        jVar2.l("cancelled");
                        return;
                    } else if (i3 == 9) {
                        jVar2.c();
                        jVar2.t();
                        return;
                    } else if (jVar2.v) {
                        jVar2.v = false;
                        jVar2.i();
                        return;
                    } else if (i3 == 4) {
                        vi.i iVar = jVar2.f57003z;
                        if (iVar == null) {
                            jVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j19 = jVar2.j();
                        jVar2.f56996r = 0L;
                        jVar2.f56997s = j19;
                        jVar2.f56988j.execute(new org.telegram.utils.recorder.audio.c(1, jVar2, iVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
