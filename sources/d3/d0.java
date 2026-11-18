package d3;

import android.os.SystemClock;
import android.os.Trace;
import e2.s0;
import e2.x1;
import h2.l0;
import java.util.NoSuchElementException;
public final class d0 {
    public final q4.q f7656a;
    public final x f7657b;
    public final w f7658c = new w();
    public final h2.j0 d = new h2.j0();
    public final h2.j0 f7659e = new h2.j0();
    public final h2.s f7660f;
    public final y f7661g;
    public long h;
    public long f7662i;
    public long f7663j;
    public x1 f7664k;
    public long f7665l;

    public d0(q4.q qVar, x xVar, y yVar) {
        this.f7656a = qVar;
        this.f7657b = xVar;
        this.f7661g = yVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f13820a = 0;
        obj.f13821b = -1;
        obj.f13822c = 0;
        obj.f13823e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f7660f = obj;
        this.h = -9223372036854775807L;
        this.f7664k = x1.d;
        this.f7662i = -9223372036854775807L;
        this.f7663j = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        e2.u uVar;
        final q4.q qVar = this.f7656a;
        e eVar = (e) qVar.f55827c;
        while (true) {
            h2.s sVar = this.f7660f;
            int i7 = sVar.f13822c;
            if (i7 == 0) {
                return;
            }
            if (i7 != 0) {
                long j12 = ((long[]) sVar.f13823e)[sVar.f13820a];
                Long l10 = (Long) this.f7659e.j(j12);
                x xVar = this.f7657b;
                if (l10 != null && l10.longValue() != this.f7665l) {
                    this.f7665l = l10.longValue();
                    xVar.e(2);
                }
                long j13 = this.f7665l;
                x xVar2 = this.f7657b;
                w wVar = this.f7658c;
                int a10 = xVar2.a(j12, j3, j10, j13, false, false, wVar);
                if (a10 != 5 && a10 != 4) {
                    this.f7661g.a(j12, wVar.f7762a);
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
                        this.f7662i = j12;
                    } else {
                        this.f7662i = j12;
                        sVar.d();
                        eVar.f7672i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55827c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55827c).h.n();
                                        return;
                                }
                            }
                        });
                        i iVar = (i) eVar.d.remove();
                        l lVar = iVar.f7696c;
                        u2.l lVar2 = iVar.f7694a;
                        int i10 = iVar.f7695b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar2.d(i10);
                        Trace.endSection();
                        lVar.R0(0, 1);
                    }
                } else {
                    this.f7662i = j12;
                    if (a10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = sVar.d();
                    x1 x1Var = (x1) this.d.j(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f7664k)) {
                        this.f7664k = x1Var;
                        e2.t tVar = new e2.t();
                        tVar.f10723y = x1Var.f10803a;
                        tVar.f10724z = x1Var.f10804b;
                        tVar.f10717r = s0.n("video/raw");
                        qVar.f55826b = new e2.u(tVar);
                        eVar.f7672i.execute(new c1.c(19, qVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = wVar.f7763b;
                    }
                    long j14 = j11;
                    if (xVar.f7767e != 3) {
                        z11 = true;
                    }
                    xVar.f7767e = 3;
                    xVar.f7773l.getClass();
                    xVar.f7769g = l0.S(SystemClock.elapsedRealtime());
                    if (z11 && eVar.f7669e != null) {
                        eVar.f7672i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55827c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55827c).h.n();
                                        return;
                                }
                            }
                        });
                    }
                    e2.u uVar2 = (e2.u) qVar.f55826b;
                    if (uVar2 == null) {
                        uVar = new e2.u(new e2.t());
                    } else {
                        uVar = uVar2;
                    }
                    eVar.f7673j.a(d, j14, uVar, null);
                    i iVar2 = (i) eVar.d.remove();
                    iVar2.f7696c.M0(iVar2.f7694a, iVar2.f7695b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
