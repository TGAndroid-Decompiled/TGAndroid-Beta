package a3;

import android.os.SystemClock;
import b2.r0;
import b2.x1;
import java.util.NoSuchElementException;
public final class f0 {
    public final n4.y f109a;
    public final a0 f110b;
    public final z f111c = new z();
    public final e2.a0 d = new e2.a0();
    public final e2.a0 f112e = new e2.a0();
    public final e2.q f113f;
    public long f114g;
    public long h;
    public long f115i;
    public x1 f116j;
    public long f117k;

    public f0(n4.y yVar, a0 a0Var) {
        this.f109a = yVar;
        this.f110b = a0Var;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f8802a = 0;
        obj.f8803b = -1;
        obj.f8804c = 0;
        obj.f8805e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f113f = obj;
        this.f114g = -9223372036854775807L;
        this.f116j = x1.d;
        this.h = -9223372036854775807L;
        this.f115i = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        b2.s sVar;
        n4.y yVar = this.f109a;
        f fVar = (f) yVar.f16524c;
        while (true) {
            e2.q qVar = this.f113f;
            int i10 = qVar.f8804c;
            if (i10 == 0) {
                return;
            }
            if (i10 != 0) {
                long j12 = ((long[]) qVar.f8805e)[qVar.f8802a];
                Long l4 = (Long) this.f112e.g(j12);
                a0 a0Var = this.f110b;
                if (l4 != null && l4.longValue() != this.f117k) {
                    this.f117k = l4.longValue();
                    a0Var.f(2);
                }
                long j13 = this.f117k;
                a0 a0Var2 = this.f110b;
                z zVar = this.f111c;
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
                        j jVar = (j) fVar.f104c.remove();
                        jVar.f140c.M0(jVar.f138a, jVar.f139b);
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
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f116j)) {
                        this.f116j = x1Var;
                        b2.r rVar = new b2.r();
                        rVar.f2345x = x1Var.f2444a;
                        rVar.f2346y = x1Var.f2445b;
                        rVar.f2339q = r0.n("video/raw");
                        yVar.f16523b = new b2.s(rVar);
                        fVar.h.execute(new e(yVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = zVar.f219b;
                    }
                    long j14 = j11;
                    if (a0Var.f64e == 3) {
                        z11 = false;
                    }
                    a0Var.f64e = 3;
                    a0Var.f70l.getClass();
                    a0Var.f66g = e2.d0.Q(SystemClock.elapsedRealtime());
                    if (z11 && fVar.d != null) {
                        fVar.h.execute(new e(0, yVar));
                    }
                    b2.s sVar2 = (b2.s) yVar.f16523b;
                    if (sVar2 == null) {
                        sVar = new b2.s(new b2.r());
                    } else {
                        sVar = sVar2;
                    }
                    fVar.f108i.c(d, j14, sVar, null);
                    j jVar2 = (j) fVar.f104c.remove();
                    jVar2.f140c.I0(jVar2.f138a, jVar2.f139b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
