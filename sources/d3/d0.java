package d3;

import android.os.SystemClock;
import android.os.Trace;
import e2.s0;
import e2.x1;
import h2.l0;
import java.util.NoSuchElementException;
public final class d0 {
    public final q4.q f7685a;
    public final x f7686b;
    public final w f7687c = new w();
    public final h2.j0 d = new h2.j0();
    public final h2.j0 f7688e = new h2.j0();
    public final h2.s f7689f;
    public final y f7690g;
    public long h;
    public long f7691i;
    public long f7692j;
    public x1 f7693k;
    public long f7694l;

    public d0(q4.q qVar, x xVar, y yVar) {
        this.f7685a = qVar;
        this.f7686b = xVar;
        this.f7690g = yVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f13849a = 0;
        obj.f13850b = -1;
        obj.f13851c = 0;
        obj.f13852e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f7689f = obj;
        this.h = -9223372036854775807L;
        this.f7693k = x1.d;
        this.f7691i = -9223372036854775807L;
        this.f7692j = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        e2.u uVar;
        final q4.q qVar = this.f7685a;
        e eVar = (e) qVar.f55872c;
        while (true) {
            h2.s sVar = this.f7689f;
            int i7 = sVar.f13851c;
            if (i7 == 0) {
                return;
            }
            if (i7 != 0) {
                long j12 = ((long[]) sVar.f13852e)[sVar.f13849a];
                Long l10 = (Long) this.f7688e.j(j12);
                x xVar = this.f7686b;
                if (l10 != null && l10.longValue() != this.f7694l) {
                    this.f7694l = l10.longValue();
                    xVar.e(2);
                }
                long j13 = this.f7694l;
                x xVar2 = this.f7686b;
                w wVar = this.f7687c;
                int a10 = xVar2.a(j12, j3, j10, j13, false, false, wVar);
                if (a10 != 5 && a10 != 4) {
                    this.f7690g.a(j12, wVar.f7791a);
                }
                boolean z11 = false;
                if (a10 != 0 && a10 != 1) {
                    if (a10 != 2 && a10 != 3) {
                        if (a10 != 4) {
                            if (a10 == 5) {
                                return;
                            }
                            throw new IllegalStateException(String.valueOf(a10));
                        }
                        this.f7691i = j12;
                    } else {
                        this.f7691i = j12;
                        sVar.d();
                        eVar.f7701i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55872c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55872c).h.n();
                                        return;
                                }
                            }
                        });
                        i iVar = (i) eVar.d.remove();
                        l lVar = iVar.f7725c;
                        u2.l lVar2 = iVar.f7723a;
                        int i10 = iVar.f7724b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar2.e(i10);
                        Trace.endSection();
                        lVar.R0(0, 1);
                    }
                } else {
                    this.f7691i = j12;
                    if (a10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = sVar.d();
                    x1 x1Var = (x1) this.d.j(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f7693k)) {
                        this.f7693k = x1Var;
                        e2.t tVar = new e2.t();
                        tVar.f10752y = x1Var.f10832a;
                        tVar.f10753z = x1Var.f10833b;
                        tVar.f10746r = s0.n("video/raw");
                        qVar.f55871b = new e2.u(tVar);
                        eVar.f7701i.execute(new c1.a(21, qVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = wVar.f7792b;
                    }
                    long j14 = j11;
                    if (xVar.f7796e != 3) {
                        z11 = true;
                    }
                    xVar.f7796e = 3;
                    xVar.f7802l.getClass();
                    xVar.f7798g = l0.S(SystemClock.elapsedRealtime());
                    if (z11 && eVar.f7698e != null) {
                        eVar.f7701i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55872c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55872c).h.n();
                                        return;
                                }
                            }
                        });
                    }
                    e2.u uVar2 = (e2.u) qVar.f55871b;
                    if (uVar2 == null) {
                        uVar = new e2.u(new e2.t());
                    } else {
                        uVar = uVar2;
                    }
                    eVar.f7702j.a(d, j14, uVar, null);
                    i iVar2 = (i) eVar.d.remove();
                    iVar2.f7725c.M0(iVar2.f7723a, iVar2.f7724b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
