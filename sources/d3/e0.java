package d3;

import android.os.SystemClock;
import android.os.Trace;
import bi.a4;
import e2.s0;
import e2.x1;
import h2.m0;
import java.util.NoSuchElementException;
public final class e0 {
    public final q4.q f7996a;
    public final y f7997b;
    public final x f7998c = new x();
    public final h2.j0 d = new h2.j0();
    public final h2.j0 f7999e = new h2.j0();
    public final h2.s f8000f;
    public final z f8001g;
    public long h;
    public long f8002i;
    public long f8003j;
    public x1 f8004k;
    public long f8005l;

    public e0(q4.q qVar, y yVar, z zVar) {
        this.f7996a = qVar;
        this.f7997b = yVar;
        this.f8001g = zVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f14148a = 0;
        obj.f14149b = -1;
        obj.f14150c = 0;
        obj.f14151e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f8000f = obj;
        this.h = -9223372036854775807L;
        this.f8004k = x1.d;
        this.f8002i = -9223372036854775807L;
        this.f8003j = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z9;
        long j11;
        e2.u uVar;
        final q4.q qVar = this.f7996a;
        e eVar = (e) qVar.f53816c;
        while (true) {
            h2.s sVar = this.f8000f;
            int i7 = sVar.f14150c;
            if (i7 == 0) {
                return;
            }
            if (i7 != 0) {
                long j12 = ((long[]) sVar.f14151e)[sVar.f14148a];
                Long l10 = (Long) this.f7999e.j(j12);
                y yVar = this.f7997b;
                if (l10 != null && l10.longValue() != this.f8005l) {
                    this.f8005l = l10.longValue();
                    yVar.e(2);
                }
                long j13 = this.f8005l;
                y yVar2 = this.f7997b;
                x xVar = this.f7998c;
                int a10 = yVar2.a(j12, j3, j10, j13, false, false, xVar);
                if (a10 != 5 && a10 != 4) {
                    this.f8001g.a(j12, xVar.f8096a);
                }
                boolean z10 = false;
                if (a10 != 0 && a10 != 1) {
                    if (a10 != 2 && a10 != 3) {
                        if (a10 != 4) {
                            if (a10 == 5) {
                                return;
                            }
                            throw new IllegalStateException(String.valueOf(a10));
                        }
                        this.f8002i = j12;
                    } else {
                        this.f8002i = j12;
                        sVar.d();
                        eVar.f7994i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f53816c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f53816c).h.m();
                                        return;
                                }
                            }
                        });
                        i iVar = (i) eVar.d.remove();
                        l lVar = iVar.f8024c;
                        u2.l lVar2 = iVar.f8022a;
                        int i10 = iVar.f8023b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar2.c(i10);
                        Trace.endSection();
                        lVar.R0(0, 1);
                    }
                } else {
                    this.f8002i = j12;
                    if (a10 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    long d = sVar.d();
                    x1 x1Var = (x1) this.d.j(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f8004k)) {
                        this.f8004k = x1Var;
                        e2.t tVar = new e2.t();
                        tVar.f10574y = x1Var.f10654a;
                        tVar.f10575z = x1Var.f10655b;
                        tVar.f10568r = s0.n("video/raw");
                        qVar.f53815b = new e2.u(tVar);
                        eVar.f7994i.execute(new a4(22, qVar, x1Var));
                    }
                    if (z9) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = xVar.f8097b;
                    }
                    long j14 = j11;
                    if (yVar.f8101e != 3) {
                        z10 = true;
                    }
                    yVar.f8101e = 3;
                    yVar.f8107l.getClass();
                    yVar.f8103g = m0.S(SystemClock.elapsedRealtime());
                    if (z10 && eVar.f7991e != null) {
                        eVar.f7994i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f53816c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f53816c).h.m();
                                        return;
                                }
                            }
                        });
                    }
                    e2.u uVar2 = (e2.u) qVar.f53815b;
                    if (uVar2 == null) {
                        uVar = new e2.u(new e2.t());
                    } else {
                        uVar = uVar2;
                    }
                    eVar.f7995j.b(d, j14, uVar, null);
                    i iVar2 = (i) eVar.d.remove();
                    iVar2.f8024c.M0(iVar2.f8022a, iVar2.f8023b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
