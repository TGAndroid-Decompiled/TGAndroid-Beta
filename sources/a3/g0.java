package a3;

import android.os.SystemClock;
import android.os.Trace;
import b2.a2;
import b2.v0;
import java.util.NoSuchElementException;
public final class g0 {
    public final qf.b f107a;
    public final a0 f108b;
    public final z f109c = new z();
    public final e2.j0 d = new e2.j0();
    public final e2.j0 e = new e2.j0();
    public final e2.s f110f;
    public final b0 f111g;
    public long h;
    public long f112i;
    public long f113j;
    public a2 f114k;
    public long f115l;

    public g0(qf.b bVar, a0 a0Var, b0 b0Var) {
        this.f107a = bVar;
        this.f108b = a0Var;
        this.f111g = b0Var;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f8280a = 0;
        obj.f8281b = -1;
        obj.f8282c = 0;
        obj.e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f110f = obj;
        this.h = -9223372036854775807L;
        this.f114k = a2.d;
        this.f112i = -9223372036854775807L;
        this.f113j = -9223372036854775807L;
    }

    public final void a(long j10, long j11) {
        boolean z10;
        long j12;
        b2.w wVar;
        final qf.b bVar = this.f107a;
        f fVar = (f) bVar.f44466c;
        while (true) {
            e2.s sVar = this.f110f;
            int i10 = sVar.f8282c;
            if (i10 == 0) {
                return;
            }
            if (i10 != 0) {
                long j13 = ((long[]) sVar.e)[sVar.f8280a];
                Long l4 = (Long) this.e.g(j13);
                a0 a0Var = this.f108b;
                if (l4 != null && l4.longValue() != this.f115l) {
                    this.f115l = l4.longValue();
                    a0Var.e(2);
                }
                long j14 = this.f115l;
                a0 a0Var2 = this.f108b;
                z zVar = this.f109c;
                int a2 = a0Var2.a(j13, j10, j11, j14, false, false, zVar);
                if (a2 != 5 && a2 != 4) {
                    this.f111g.a(j13, zVar.f206a);
                }
                boolean z11 = false;
                if (a2 != 0 && a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                        if (a2 != 4) {
                            if (a2 == 5) {
                                return;
                            }
                            throw new IllegalStateException(String.valueOf(a2));
                        }
                        this.f112i = j13;
                    } else {
                        this.f112i = j13;
                        sVar.d();
                        fVar.f84i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((f) bVar.f44466c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((f) bVar.f44466c).h.h();
                                        return;
                                }
                            }
                        });
                        j jVar = (j) fVar.d.remove();
                        n nVar = jVar.f127c;
                        r2.l lVar = jVar.f125a;
                        int i11 = jVar.f126b;
                        Trace.beginSection("dropVideoBuffer");
                        lVar.d(i11);
                        Trace.endSection();
                        nVar.R0(0, 1);
                    }
                } else {
                    this.f112i = j13;
                    if (a2 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = sVar.d();
                    a2 a2Var = (a2) this.d.g(d);
                    if (a2Var != null && !a2Var.equals(a2.d) && !a2Var.equals(this.f114k)) {
                        this.f114k = a2Var;
                        b2.v vVar = new b2.v();
                        vVar.f4084y = a2Var.f3696a;
                        vVar.f4085z = a2Var.f3697b;
                        vVar.f4078r = v0.n("video/raw");
                        bVar.f44465b = new b2.w(vVar);
                        fVar.f84i.execute(new a1.f(2, bVar, a2Var));
                    }
                    if (z10) {
                        j12 = System.nanoTime();
                    } else {
                        j12 = zVar.f207b;
                    }
                    long j15 = j12;
                    if (a0Var.e != 3) {
                        z11 = true;
                    }
                    a0Var.e = 3;
                    a0Var.f64l.getClass();
                    a0Var.f60g = e2.m0.S(SystemClock.elapsedRealtime());
                    if (z11 && fVar.e != null) {
                        fVar.f84i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ((f) bVar.f44466c).h.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((f) bVar.f44466c).h.h();
                                        return;
                                }
                            }
                        });
                    }
                    b2.w wVar2 = (b2.w) bVar.f44465b;
                    if (wVar2 == null) {
                        wVar = new b2.w(new b2.v());
                    } else {
                        wVar = wVar2;
                    }
                    fVar.f85j.a(d, j15, wVar, null);
                    j jVar2 = (j) fVar.d.remove();
                    jVar2.f127c.M0(jVar2.f125a, jVar2.f126b, j15);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
