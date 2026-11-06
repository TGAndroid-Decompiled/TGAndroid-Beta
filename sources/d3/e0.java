package d3;

import android.os.SystemClock;
import android.os.Trace;
import bi.a4;
import e2.s0;
import e2.x1;
import h2.m0;
import java.util.NoSuchElementException;
public final class e0 {
    public final q4.q f7993a;
    public final y f7994b;
    public final x f7995c = new x();
    public final h2.j0 d = new h2.j0();
    public final h2.j0 f7996e = new h2.j0();
    public final h2.s f7997f;
    public final z f7998g;
    public long h;
    public long f7999i;
    public long f8000j;
    public x1 f8001k;
    public long f8002l;

    public e0(q4.q qVar, y yVar, z zVar) {
        this.f7993a = qVar;
        this.f7994b = yVar;
        this.f7998g = zVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f14146a = 0;
        obj.f14147b = -1;
        obj.f14148c = 0;
        obj.f14149e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f7997f = obj;
        this.h = -9223372036854775807L;
        this.f8001k = x1.d;
        this.f7999i = -9223372036854775807L;
        this.f8000j = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z9;
        long j11;
        e2.u uVar;
        final q4.q qVar = this.f7993a;
        e eVar = (e) qVar.f53712c;
        while (true) {
            h2.s sVar = this.f7997f;
            int i7 = sVar.f14148c;
            if (i7 == 0) {
                return;
            }
            if (i7 != 0) {
                long j12 = ((long[]) sVar.f14149e)[sVar.f14146a];
                Long l10 = (Long) this.f7996e.j(j12);
                y yVar = this.f7994b;
                if (l10 != null && l10.longValue() != this.f8002l) {
                    this.f8002l = l10.longValue();
                    yVar.e(2);
                }
                long j13 = this.f8002l;
                y yVar2 = this.f7994b;
                x xVar = this.f7995c;
                int a10 = yVar2.a(j12, j3, j10, j13, false, false, xVar);
                if (a10 != 5 && a10 != 4) {
                    this.f7998g.a(j12, xVar.f8093a);
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
                        this.f7999i = j12;
                    } else {
                        this.f7999i = j12;
                        sVar.d();
                        eVar.f7991i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f53712c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f53712c).h.m();
                                        return;
                                }
                            }
                        });
                        i iVar = (i) eVar.d.remove();
                        l lVar = iVar.f8021c;
                        u2.l lVar2 = iVar.f8019a;
                        int i10 = iVar.f8020b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar2.c(i10);
                        Trace.endSection();
                        lVar.R0(0, 1);
                    }
                } else {
                    this.f7999i = j12;
                    if (a10 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    long d = sVar.d();
                    x1 x1Var = (x1) this.d.j(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f8001k)) {
                        this.f8001k = x1Var;
                        e2.t tVar = new e2.t();
                        tVar.f10569y = x1Var.f10649a;
                        tVar.f10570z = x1Var.f10650b;
                        tVar.f10563r = s0.n("video/raw");
                        qVar.f53711b = new e2.u(tVar);
                        eVar.f7991i.execute(new a4(22, qVar, x1Var));
                    }
                    if (z9) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = xVar.f8094b;
                    }
                    long j14 = j11;
                    if (yVar.f8098e != 3) {
                        z10 = true;
                    }
                    yVar.f8098e = 3;
                    yVar.f8104l.getClass();
                    yVar.f8100g = m0.S(SystemClock.elapsedRealtime());
                    if (z10 && eVar.f7988e != null) {
                        eVar.f7991i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f53712c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f53712c).h.m();
                                        return;
                                }
                            }
                        });
                    }
                    e2.u uVar2 = (e2.u) qVar.f53711b;
                    if (uVar2 == null) {
                        uVar = new e2.u(new e2.t());
                    } else {
                        uVar = uVar2;
                    }
                    eVar.f7992j.b(d, j14, uVar, null);
                    i iVar2 = (i) eVar.d.remove();
                    iVar2.f8021c.M0(iVar2.f8019a, iVar2.f8020b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
