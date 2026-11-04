package c3;

import android.os.SystemClock;
import android.os.Trace;
import d2.a2;
import d2.u0;
import g2.n0;
import java.util.NoSuchElementException;
public final class e0 {
    public final p4.q f4015a;
    public final y f4016b;
    public final x f4017c = new x();
    public final g2.k0 d = new g2.k0();
    public final g2.k0 f4018e = new g2.k0();
    public final g2.t f4019f;
    public final z f4020g;
    public long h;
    public long f4021i;
    public long f4022j;
    public a2 f4023k;
    public long f4024l;

    public e0(p4.q qVar, y yVar, z zVar) {
        this.f4015a = qVar;
        this.f4016b = yVar;
        this.f4020g = zVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f11907a = 0;
        obj.f11908b = -1;
        obj.f11909c = 0;
        obj.f11910e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f4019f = obj;
        this.h = -9223372036854775807L;
        this.f4023k = a2.d;
        this.f4021i = -9223372036854775807L;
        this.f4022j = -9223372036854775807L;
    }

    public final void a(long j10, long j11) {
        boolean z10;
        long j12;
        d2.v vVar;
        final p4.q qVar = this.f4015a;
        e eVar = (e) qVar.f53182b;
        while (true) {
            g2.t tVar = this.f4019f;
            int i3 = tVar.f11909c;
            if (i3 == 0) {
                return;
            }
            if (i3 != 0) {
                long j13 = ((long[]) tVar.f11910e)[tVar.f11907a];
                Long l10 = (Long) this.f4018e.j(j13);
                y yVar = this.f4016b;
                if (l10 != null && l10.longValue() != this.f4024l) {
                    this.f4024l = l10.longValue();
                    yVar.e(2);
                }
                long j14 = this.f4024l;
                y yVar2 = this.f4016b;
                x xVar = this.f4017c;
                int a10 = yVar2.a(j13, j10, j11, j14, false, false, xVar);
                if (a10 != 5 && a10 != 4) {
                    this.f4020g.a(j13, xVar.f4119a);
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
                        this.f4021i = j13;
                    } else {
                        this.f4021i = j13;
                        tVar.d();
                        eVar.f4013i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f53182b).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f53182b).h.a0();
                                        return;
                                }
                            }
                        });
                        i iVar = (i) eVar.d.remove();
                        l lVar = iVar.f4047c;
                        t2.l lVar2 = iVar.f4045a;
                        int i10 = iVar.f4046b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar2.c(i10);
                        Trace.endSection();
                        lVar.R0(0, 1);
                    }
                } else {
                    this.f4021i = j13;
                    if (a10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = tVar.d();
                    a2 a2Var = (a2) this.d.j(d);
                    if (a2Var != null && !a2Var.equals(a2.d) && !a2Var.equals(this.f4023k)) {
                        this.f4023k = a2Var;
                        d2.u uVar = new d2.u();
                        uVar.f8437y = a2Var.f8030a;
                        uVar.f8438z = a2Var.f8031b;
                        uVar.f8431r = u0.n("video/raw");
                        qVar.f53181a = new d2.v(uVar);
                        eVar.f4013i.execute(new a1.f(25, qVar, a2Var));
                    }
                    if (z10) {
                        j12 = System.nanoTime();
                    } else {
                        j12 = xVar.f4120b;
                    }
                    long j15 = j12;
                    if (yVar.f4124e != 3) {
                        z11 = true;
                    }
                    yVar.f4124e = 3;
                    yVar.f4130l.getClass();
                    yVar.f4126g = n0.S(SystemClock.elapsedRealtime());
                    if (z11 && eVar.f4010e != null) {
                        eVar.f4013i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f53182b).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f53182b).h.a0();
                                        return;
                                }
                            }
                        });
                    }
                    d2.v vVar2 = (d2.v) qVar.f53181a;
                    if (vVar2 == null) {
                        vVar = new d2.v(new d2.u());
                    } else {
                        vVar = vVar2;
                    }
                    eVar.f4014j.a(d, j15, vVar, null);
                    i iVar2 = (i) eVar.d.remove();
                    iVar2.f4047c.M0(iVar2.f4045a, iVar2.f4046b, j15);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
