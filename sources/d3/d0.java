package d3;

import android.os.SystemClock;
import android.os.Trace;
import e2.s0;
import e2.x1;
import h2.l0;
import java.util.NoSuchElementException;
public final class d0 {
    public final q4.q f7648a;
    public final x f7649b;
    public final w f7650c = new w();
    public final h2.j0 d = new h2.j0();
    public final h2.j0 f7651e = new h2.j0();
    public final h2.s f7652f;
    public final y f7653g;
    public long h;
    public long f7654i;
    public long f7655j;
    public x1 f7656k;
    public long f7657l;

    public d0(q4.q qVar, x xVar, y yVar) {
        this.f7648a = qVar;
        this.f7649b = xVar;
        this.f7653g = yVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f13812a = 0;
        obj.f13813b = -1;
        obj.f13814c = 0;
        obj.f13815e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f7652f = obj;
        this.h = -9223372036854775807L;
        this.f7656k = x1.d;
        this.f7654i = -9223372036854775807L;
        this.f7655j = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        e2.u uVar;
        final q4.q qVar = this.f7648a;
        e eVar = (e) qVar.f55837c;
        while (true) {
            h2.s sVar = this.f7652f;
            int i7 = sVar.f13814c;
            if (i7 == 0) {
                return;
            }
            if (i7 != 0) {
                long j12 = ((long[]) sVar.f13815e)[sVar.f13812a];
                Long l10 = (Long) this.f7651e.j(j12);
                x xVar = this.f7649b;
                if (l10 != null && l10.longValue() != this.f7657l) {
                    this.f7657l = l10.longValue();
                    xVar.e(2);
                }
                long j13 = this.f7657l;
                x xVar2 = this.f7649b;
                w wVar = this.f7650c;
                int a10 = xVar2.a(j12, j3, j10, j13, false, false, wVar);
                if (a10 != 5 && a10 != 4) {
                    this.f7653g.a(j12, wVar.f7754a);
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
                        this.f7654i = j12;
                    } else {
                        this.f7654i = j12;
                        sVar.d();
                        eVar.f7664i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55837c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55837c).h.n();
                                        return;
                                }
                            }
                        });
                        i iVar = (i) eVar.d.remove();
                        l lVar = iVar.f7688c;
                        u2.l lVar2 = iVar.f7686a;
                        int i10 = iVar.f7687b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar2.d(i10);
                        Trace.endSection();
                        lVar.R0(0, 1);
                    }
                } else {
                    this.f7654i = j12;
                    if (a10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = sVar.d();
                    x1 x1Var = (x1) this.d.j(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f7656k)) {
                        this.f7656k = x1Var;
                        e2.t tVar = new e2.t();
                        tVar.f10715y = x1Var.f10795a;
                        tVar.f10716z = x1Var.f10796b;
                        tVar.f10709r = s0.n("video/raw");
                        qVar.f55836b = new e2.u(tVar);
                        eVar.f7664i.execute(new c1.c(19, qVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = wVar.f7755b;
                    }
                    long j14 = j11;
                    if (xVar.f7759e != 3) {
                        z11 = true;
                    }
                    xVar.f7759e = 3;
                    xVar.f7765l.getClass();
                    xVar.f7761g = l0.S(SystemClock.elapsedRealtime());
                    if (z11 && eVar.f7661e != null) {
                        eVar.f7664i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55837c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55837c).h.n();
                                        return;
                                }
                            }
                        });
                    }
                    e2.u uVar2 = (e2.u) qVar.f55836b;
                    if (uVar2 == null) {
                        uVar = new e2.u(new e2.t());
                    } else {
                        uVar = uVar2;
                    }
                    eVar.f7665j.a(d, j14, uVar, null);
                    i iVar2 = (i) eVar.d.remove();
                    iVar2.f7688c.M0(iVar2.f7686a, iVar2.f7687b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
