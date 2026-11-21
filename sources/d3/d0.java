package d3;

import android.os.SystemClock;
import android.os.Trace;
import e2.s0;
import e2.x1;
import h2.l0;
import java.util.NoSuchElementException;
public final class d0 {
    public final q4.q f7682a;
    public final x f7683b;
    public final w f7684c = new w();
    public final h2.j0 d = new h2.j0();
    public final h2.j0 f7685e = new h2.j0();
    public final h2.s f7686f;
    public final y f7687g;
    public long h;
    public long f7688i;
    public long f7689j;
    public x1 f7690k;
    public long f7691l;

    public d0(q4.q qVar, x xVar, y yVar) {
        this.f7682a = qVar;
        this.f7683b = xVar;
        this.f7687g = yVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f13846a = 0;
        obj.f13847b = -1;
        obj.f13848c = 0;
        obj.f13849e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f7686f = obj;
        this.h = -9223372036854775807L;
        this.f7690k = x1.d;
        this.f7688i = -9223372036854775807L;
        this.f7689j = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        e2.u uVar;
        final q4.q qVar = this.f7682a;
        e eVar = (e) qVar.f55868c;
        while (true) {
            h2.s sVar = this.f7686f;
            int i7 = sVar.f13848c;
            if (i7 == 0) {
                return;
            }
            if (i7 != 0) {
                long j12 = ((long[]) sVar.f13849e)[sVar.f13846a];
                Long l10 = (Long) this.f7685e.j(j12);
                x xVar = this.f7683b;
                if (l10 != null && l10.longValue() != this.f7691l) {
                    this.f7691l = l10.longValue();
                    xVar.e(2);
                }
                long j13 = this.f7691l;
                x xVar2 = this.f7683b;
                w wVar = this.f7684c;
                int a10 = xVar2.a(j12, j3, j10, j13, false, false, wVar);
                if (a10 != 5 && a10 != 4) {
                    this.f7687g.a(j12, wVar.f7788a);
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
                        this.f7688i = j12;
                    } else {
                        this.f7688i = j12;
                        sVar.d();
                        eVar.f7698i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55868c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55868c).h.n();
                                        return;
                                }
                            }
                        });
                        i iVar = (i) eVar.d.remove();
                        l lVar = iVar.f7722c;
                        u2.l lVar2 = iVar.f7720a;
                        int i10 = iVar.f7721b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar2.e(i10);
                        Trace.endSection();
                        lVar.R0(0, 1);
                    }
                } else {
                    this.f7688i = j12;
                    if (a10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = sVar.d();
                    x1 x1Var = (x1) this.d.j(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f7690k)) {
                        this.f7690k = x1Var;
                        e2.t tVar = new e2.t();
                        tVar.f10749y = x1Var.f10829a;
                        tVar.f10750z = x1Var.f10830b;
                        tVar.f10743r = s0.n("video/raw");
                        qVar.f55867b = new e2.u(tVar);
                        eVar.f7698i.execute(new c1.a(21, qVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = wVar.f7789b;
                    }
                    long j14 = j11;
                    if (xVar.f7793e != 3) {
                        z11 = true;
                    }
                    xVar.f7793e = 3;
                    xVar.f7799l.getClass();
                    xVar.f7795g = l0.S(SystemClock.elapsedRealtime());
                    if (z11 && eVar.f7695e != null) {
                        eVar.f7698i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((e) qVar.f55868c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((e) qVar.f55868c).h.n();
                                        return;
                                }
                            }
                        });
                    }
                    e2.u uVar2 = (e2.u) qVar.f55867b;
                    if (uVar2 == null) {
                        uVar = new e2.u(new e2.t());
                    } else {
                        uVar = uVar2;
                    }
                    eVar.f7699j.a(d, j14, uVar, null);
                    i iVar2 = (i) eVar.d.remove();
                    iVar2.f7722c.M0(iVar2.f7720a, iVar2.f7721b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
