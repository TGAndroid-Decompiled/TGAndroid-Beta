package a3;

import android.os.SystemClock;
import b2.r0;
import b2.x1;
import java.util.NoSuchElementException;
public final class e0 {
    public final n4.y f85a;
    public final z f86b;
    public final y f87c = new y();
    public final e2.a0 d = new e2.a0();
    public final e2.a0 f88e = new e2.a0();
    public final e2.q f89f;
    public long f90g;
    public long h;
    public long f91i;
    public x1 f92j;
    public long f93k;

    public e0(n4.y yVar, z zVar) {
        this.f85a = yVar;
        this.f86b = zVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f8774a = 0;
        obj.f8775b = -1;
        obj.f8776c = 0;
        obj.f8777e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f89f = obj;
        this.f90g = -9223372036854775807L;
        this.f92j = x1.d;
        this.h = -9223372036854775807L;
        this.f91i = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        b2.s sVar;
        n4.y yVar = this.f85a;
        e eVar = (e) yVar.f16497c;
        while (true) {
            e2.q qVar = this.f89f;
            int i10 = qVar.f8776c;
            if (i10 == 0) {
                return;
            }
            if (i10 != 0) {
                long j12 = ((long[]) qVar.f8777e)[qVar.f8774a];
                Long l4 = (Long) this.f88e.g(j12);
                z zVar = this.f86b;
                if (l4 != null && l4.longValue() != this.f93k) {
                    this.f93k = l4.longValue();
                    zVar.f(2);
                }
                long j13 = this.f93k;
                z zVar2 = this.f86b;
                y yVar2 = this.f87c;
                int a2 = zVar2.a(j12, j3, j10, j13, false, false, yVar2);
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
                        eVar.h.execute(new d(1, yVar));
                        i iVar = (i) eVar.f80c.remove();
                        iVar.f116c.L0(iVar.f114a, iVar.f115b);
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
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f92j)) {
                        this.f92j = x1Var;
                        b2.r rVar = new b2.r();
                        rVar.f2318x = x1Var.f2417a;
                        rVar.f2319y = x1Var.f2418b;
                        rVar.f2312q = r0.n("video/raw");
                        yVar.f16496b = new b2.s(rVar);
                        eVar.h.execute(new d(yVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = yVar2.f195b;
                    }
                    long j14 = j11;
                    if (zVar.f199e == 3) {
                        z11 = false;
                    }
                    zVar.f199e = 3;
                    zVar.f205l.getClass();
                    zVar.f201g = e2.d0.Q(SystemClock.elapsedRealtime());
                    if (z11 && eVar.d != null) {
                        eVar.h.execute(new d(0, yVar));
                    }
                    b2.s sVar2 = (b2.s) yVar.f16496b;
                    if (sVar2 == null) {
                        sVar = new b2.s(new b2.r());
                    } else {
                        sVar = sVar2;
                    }
                    eVar.f84i.c(d, j14, sVar, null);
                    i iVar2 = (i) eVar.f80c.remove();
                    iVar2.f116c.H0(iVar2.f114a, iVar2.f115b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
