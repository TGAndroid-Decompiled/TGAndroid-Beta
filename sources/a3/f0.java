package a3;

import android.os.SystemClock;
import b2.r0;
import b2.x1;
import java.util.NoSuchElementException;
public final class f0 {
    public final n4.y f101a;
    public final a0 f102b;
    public final z f103c = new z();
    public final e2.a0 d = new e2.a0();
    public final e2.a0 e = new e2.a0();
    public final e2.q f104f;
    public long f105g;
    public long h;
    public long f106i;
    public x1 f107j;
    public long f108k;

    public f0(n4.y yVar, a0 a0Var) {
        this.f101a = yVar;
        this.f102b = a0Var;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f7222a = 0;
        obj.f7223b = -1;
        obj.f7224c = 0;
        obj.e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f104f = obj;
        this.f105g = -9223372036854775807L;
        this.f107j = x1.d;
        this.h = -9223372036854775807L;
        this.f106i = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        b2.s sVar;
        n4.y yVar = this.f101a;
        f fVar = (f) yVar.f13825c;
        while (true) {
            e2.q qVar = this.f104f;
            int i10 = qVar.f7224c;
            if (i10 == 0) {
                return;
            }
            if (i10 != 0) {
                long j12 = ((long[]) qVar.e)[qVar.f7222a];
                Long l4 = (Long) this.e.g(j12);
                a0 a0Var = this.f102b;
                if (l4 != null && l4.longValue() != this.f108k) {
                    this.f108k = l4.longValue();
                    a0Var.f(2);
                }
                long j13 = this.f108k;
                a0 a0Var2 = this.f102b;
                z zVar = this.f103c;
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
                        fVar.h.execute(new e(yVar, 1));
                        j jVar = (j) fVar.f97c.remove();
                        jVar.f128c.M0(jVar.f126a, jVar.f127b);
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
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f107j)) {
                        this.f107j = x1Var;
                        b2.r rVar = new b2.r();
                        rVar.f1952x = x1Var.f2045a;
                        rVar.f1953y = x1Var.f2046b;
                        rVar.f1946q = r0.n("video/raw");
                        yVar.f13824b = new b2.s(rVar);
                        fVar.h.execute(new e(yVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = zVar.f201b;
                    }
                    long j14 = j11;
                    if (a0Var.e == 3) {
                        z11 = false;
                    }
                    a0Var.e = 3;
                    a0Var.f65l.getClass();
                    a0Var.f61g = e2.d0.Q(SystemClock.elapsedRealtime());
                    if (z11 && fVar.d != null) {
                        fVar.h.execute(new e(yVar, 0));
                    }
                    b2.s sVar2 = (b2.s) yVar.f13824b;
                    if (sVar2 == null) {
                        sVar = new b2.s(new b2.r());
                    } else {
                        sVar = sVar2;
                    }
                    fVar.f100i.a(d, j14, sVar, null);
                    j jVar2 = (j) fVar.f97c.remove();
                    jVar2.f128c.I0(jVar2.f126a, jVar2.f127b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
