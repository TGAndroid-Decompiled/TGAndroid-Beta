package d3;

import android.os.SystemClock;
import android.os.Trace;
import e2.s0;
import e2.x1;
import h2.l0;
import java.util.NoSuchElementException;
public final class d0 {
    public final q4.q f7373a;
    public final x f7374b;
    public final w f7375c = new w();
    public final h2.j0 d = new h2.j0();
    public final h2.j0 f7376e = new h2.j0();
    public final h2.s f7377f;
    public final y f7378g;
    public long h;
    public long f7379i;
    public long f7380j;
    public x1 f7381k;
    public long f7382l;

    public d0(q4.q qVar, x xVar, y yVar) {
        this.f7373a = qVar;
        this.f7374b = xVar;
        this.f7378g = yVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f13505a = 0;
        obj.f13506b = -1;
        obj.f13507c = 0;
        obj.f13508e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f7377f = obj;
        this.h = -9223372036854775807L;
        this.f7381k = x1.d;
        this.f7379i = -9223372036854775807L;
        this.f7380j = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        e2.u uVar;
        final q4.q qVar = this.f7373a;
        e eVar = (e) qVar.f55253c;
        while (true) {
            h2.s sVar = this.f7377f;
            int i7 = sVar.f13507c;
            if (i7 == 0) {
                return;
            }
            if (i7 != 0) {
                long j12 = ((long[]) sVar.f13508e)[sVar.f13505a];
                Long l10 = (Long) this.f7376e.j(j12);
                x xVar = this.f7374b;
                if (l10 != null && l10.longValue() != this.f7382l) {
                    this.f7382l = l10.longValue();
                    xVar.e(2);
                }
                long j13 = this.f7382l;
                x xVar2 = this.f7374b;
                w wVar = this.f7375c;
                int a10 = xVar2.a(j12, j3, j10, j13, false, false, wVar);
                if (a10 != 5 && a10 != 4) {
                    this.f7378g.a(j12, wVar.f7479a);
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
                        this.f7379i = j12;
                    } else {
                        this.f7379i = j12;
                        sVar.d();
                        eVar.f7389i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55253c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55253c).h.n();
                                        return;
                                }
                            }
                        });
                        i iVar = (i) eVar.d.remove();
                        l lVar = iVar.f7413c;
                        u2.l lVar2 = iVar.f7411a;
                        int i10 = iVar.f7412b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar2.f(i10);
                        Trace.endSection();
                        lVar.R0(0, 1);
                    }
                } else {
                    this.f7379i = j12;
                    if (a10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = sVar.d();
                    x1 x1Var = (x1) this.d.j(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f7381k)) {
                        this.f7381k = x1Var;
                        e2.t tVar = new e2.t();
                        tVar.f10405y = x1Var.f10485a;
                        tVar.f10406z = x1Var.f10486b;
                        tVar.f10399r = s0.n("video/raw");
                        qVar.f55252b = new e2.u(tVar);
                        eVar.f7389i.execute(new c1.c(20, qVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = wVar.f7480b;
                    }
                    long j14 = j11;
                    if (xVar.f7484e != 3) {
                        z11 = true;
                    }
                    xVar.f7484e = 3;
                    xVar.f7490l.getClass();
                    xVar.f7486g = l0.S(SystemClock.elapsedRealtime());
                    if (z11 && eVar.f7386e != null) {
                        eVar.f7389i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55253c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55253c).h.n();
                                        return;
                                }
                            }
                        });
                    }
                    e2.u uVar2 = (e2.u) qVar.f55252b;
                    if (uVar2 == null) {
                        uVar = new e2.u(new e2.t());
                    } else {
                        uVar = uVar2;
                    }
                    eVar.f7390j.a(d, j14, uVar, null);
                    i iVar2 = (i) eVar.d.remove();
                    iVar2.f7413c.M0(iVar2.f7411a, iVar2.f7412b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
