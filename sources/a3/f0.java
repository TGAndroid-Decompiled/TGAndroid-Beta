package a3;

import android.os.SystemClock;
import b2.r0;
import b2.x1;
import java.util.NoSuchElementException;
public final class f0 {
    public final n4.y f103a;
    public final a0 f104b;
    public final z f105c = new z();
    public final e2.a0 d = new e2.a0();
    public final e2.a0 e = new e2.a0();
    public final e2.q f106f;
    public long f107g;
    public long h;
    public long f108i;
    public x1 f109j;
    public long f110k;

    public f0(n4.y yVar, a0 a0Var) {
        this.f103a = yVar;
        this.f104b = a0Var;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f7905a = 0;
        obj.f7906b = -1;
        obj.f7907c = 0;
        obj.e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f106f = obj;
        this.f107g = -9223372036854775807L;
        this.f109j = x1.d;
        this.h = -9223372036854775807L;
        this.f108i = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        b2.s sVar;
        n4.y yVar = this.f103a;
        f fVar = (f) yVar.f14970c;
        while (true) {
            e2.q qVar = this.f106f;
            int i10 = qVar.f7907c;
            if (i10 == 0) {
                return;
            }
            if (i10 != 0) {
                long j12 = ((long[]) qVar.e)[qVar.f7905a];
                Long l4 = (Long) this.e.g(j12);
                a0 a0Var = this.f104b;
                if (l4 != null && l4.longValue() != this.f110k) {
                    this.f110k = l4.longValue();
                    a0Var.f(2);
                }
                long j13 = this.f110k;
                a0 a0Var2 = this.f104b;
                z zVar = this.f105c;
                int a2 = a0Var2.a(j12, j3, j10, j13, false, false, zVar);
                boolean z11 = true;
                if (a2 != 0 && a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                        if (a2 != 4) {
                            if (a2 == 5) {
                                return;
                            }
                            throw new IllegalStateException(String.valueOf(a2));
                        }
                        this.h = j12;
                    } else {
                        this.h = j12;
                        qVar.d();
                        fVar.h.execute(new e(1, yVar));
                        j jVar = (j) fVar.f99c.remove();
                        jVar.f130c.M0(jVar.f128a, jVar.f129b);
                    }
                } else {
                    this.h = j12;
                    if (a2 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = qVar.d();
                    x1 x1Var = (x1) this.d.g(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f109j)) {
                        this.f109j = x1Var;
                        b2.r rVar = new b2.r();
                        rVar.f3251x = x1Var.f3344a;
                        rVar.f3252y = x1Var.f3345b;
                        rVar.f3245q = r0.n("video/raw");
                        yVar.f14969b = new b2.s(rVar);
                        fVar.h.execute(new e(yVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = zVar.f203b;
                    }
                    long j14 = j11;
                    if (a0Var.e == 3) {
                        z11 = false;
                    }
                    a0Var.e = 3;
                    a0Var.f67l.getClass();
                    a0Var.f63g = e2.d0.Q(SystemClock.elapsedRealtime());
                    if (z11 && fVar.d != null) {
                        fVar.h.execute(new e(0, yVar));
                    }
                    b2.s sVar2 = (b2.s) yVar.f14969b;
                    if (sVar2 == null) {
                        sVar = new b2.s(new b2.r());
                    } else {
                        sVar = sVar2;
                    }
                    fVar.f102i.b(d, j14, sVar, null);
                    j jVar2 = (j) fVar.f99c.remove();
                    jVar2.f130c.I0(jVar2.f128a, jVar2.f129b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
