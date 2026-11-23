package d3;

import android.os.SystemClock;
import android.os.Trace;
import e2.s0;
import e2.x1;
import h2.l0;
import java.util.NoSuchElementException;
public final class d0 {
    public final q4.q f7647a;
    public final x f7648b;
    public final w f7649c = new w();
    public final h2.j0 d = new h2.j0();
    public final h2.j0 f7650e = new h2.j0();
    public final h2.s f7651f;
    public final y f7652g;
    public long h;
    public long f7653i;
    public long f7654j;
    public x1 f7655k;
    public long f7656l;

    public d0(q4.q qVar, x xVar, y yVar) {
        this.f7647a = qVar;
        this.f7648b = xVar;
        this.f7652g = yVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f13812a = 0;
        obj.f13813b = -1;
        obj.f13814c = 0;
        obj.f13815e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f7651f = obj;
        this.h = -9223372036854775807L;
        this.f7655k = x1.d;
        this.f7653i = -9223372036854775807L;
        this.f7654j = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        e2.u uVar;
        final q4.q qVar = this.f7647a;
        e eVar = (e) qVar.f55950c;
        while (true) {
            h2.s sVar = this.f7651f;
            int i7 = sVar.f13814c;
            if (i7 == 0) {
                return;
            }
            if (i7 != 0) {
                long j12 = ((long[]) sVar.f13815e)[sVar.f13812a];
                Long l10 = (Long) this.f7650e.j(j12);
                x xVar = this.f7648b;
                if (l10 != null && l10.longValue() != this.f7656l) {
                    this.f7656l = l10.longValue();
                    xVar.e(2);
                }
                long j13 = this.f7656l;
                x xVar2 = this.f7648b;
                w wVar = this.f7649c;
                int a10 = xVar2.a(j12, j3, j10, j13, false, false, wVar);
                if (a10 != 5 && a10 != 4) {
                    this.f7652g.a(j12, wVar.f7753a);
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
                        this.f7653i = j12;
                    } else {
                        this.f7653i = j12;
                        sVar.d();
                        eVar.f7663i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55950c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55950c).h.n();
                                        return;
                                }
                            }
                        });
                        i iVar = (i) eVar.d.remove();
                        l lVar = iVar.f7687c;
                        u2.l lVar2 = iVar.f7685a;
                        int i10 = iVar.f7686b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar2.i(i10);
                        Trace.endSection();
                        lVar.R0(0, 1);
                    }
                } else {
                    this.f7653i = j12;
                    if (a10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = sVar.d();
                    x1 x1Var = (x1) this.d.j(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f7655k)) {
                        this.f7655k = x1Var;
                        e2.t tVar = new e2.t();
                        tVar.f10713y = x1Var.f10793a;
                        tVar.f10714z = x1Var.f10794b;
                        tVar.f10707r = s0.n("video/raw");
                        qVar.f55949b = new e2.u(tVar);
                        eVar.f7663i.execute(new c1.a(21, qVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = wVar.f7754b;
                    }
                    long j14 = j11;
                    if (xVar.f7758e != 3) {
                        z11 = true;
                    }
                    xVar.f7758e = 3;
                    xVar.f7764l.getClass();
                    xVar.f7760g = l0.S(SystemClock.elapsedRealtime());
                    if (z11 && eVar.f7660e != null) {
                        eVar.f7663i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55950c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55950c).h.n();
                                        return;
                                }
                            }
                        });
                    }
                    e2.u uVar2 = (e2.u) qVar.f55949b;
                    if (uVar2 == null) {
                        uVar = new e2.u(new e2.t());
                    } else {
                        uVar = uVar2;
                    }
                    eVar.f7664j.a(d, j14, uVar, null);
                    i iVar2 = (i) eVar.d.remove();
                    iVar2.f7687c.M0(iVar2.f7685a, iVar2.f7686b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
