package a3;

import android.os.SystemClock;
import b2.r0;
import b2.x1;
import java.util.NoSuchElementException;
public final class f0 {
    public final n4.x f111a;
    public final a0 f112b;
    public final z f113c = new z();
    public final e2.a0 d = new e2.a0(0, (byte) 0);
    public final e2.a0 f114e = new e2.a0(0, (byte) 0);
    public final e2.q f115f;
    public long f116g;
    public long h;
    public long f117i;
    public x1 f118j;
    public long f119k;

    public f0(n4.x xVar, a0 a0Var) {
        this.f111a = xVar;
        this.f112b = a0Var;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f8569a = 0;
        obj.f8570b = -1;
        obj.f8571c = 0;
        obj.f8572e = new long[highestOneBit];
        obj.d = highestOneBit - 1;
        this.f115f = obj;
        this.f116g = -9223372036854775807L;
        this.f118j = x1.d;
        this.h = -9223372036854775807L;
        this.f117i = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        long j11;
        b2.s sVar;
        n4.x xVar = this.f111a;
        f fVar = (f) xVar.f16617c;
        while (true) {
            e2.q qVar = this.f115f;
            int i10 = qVar.f8571c;
            if (i10 == 0) {
                return;
            }
            if (i10 != 0) {
                long j12 = ((long[]) qVar.f8572e)[qVar.f8569a];
                Long l4 = (Long) this.f114e.i(j12);
                a0 a0Var = this.f112b;
                if (l4 != null && l4.longValue() != this.f119k) {
                    this.f119k = l4.longValue();
                    a0Var.f(2);
                }
                long j13 = this.f119k;
                a0 a0Var2 = this.f112b;
                z zVar = this.f113c;
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
                        fVar.h.execute(new e(1, xVar));
                        j jVar = (j) fVar.f106c.remove();
                        jVar.f142c.M0(jVar.f140a, jVar.f141b);
                    }
                } else {
                    this.h = j12;
                    if (a2 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long d = qVar.d();
                    x1 x1Var = (x1) this.d.i(d);
                    if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.f118j)) {
                        this.f118j = x1Var;
                        b2.r rVar = new b2.r();
                        rVar.f3591x = x1Var.f3690a;
                        rVar.f3592y = x1Var.f3691b;
                        rVar.f3585q = r0.n("video/raw");
                        xVar.f16616b = new b2.s(rVar);
                        fVar.h.execute(new e(xVar, x1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = zVar.f221b;
                    }
                    long j14 = j11;
                    if (a0Var.f66e == 3) {
                        z11 = false;
                    }
                    a0Var.f66e = 3;
                    a0Var.f72l.getClass();
                    a0Var.f68g = e2.d0.P(SystemClock.elapsedRealtime());
                    if (z11 && fVar.d != null) {
                        fVar.h.execute(new e(0, xVar));
                    }
                    b2.s sVar2 = (b2.s) xVar.f16616b;
                    if (sVar2 == null) {
                        sVar = new b2.s(new b2.r());
                    } else {
                        sVar = sVar2;
                    }
                    fVar.f110i.a(d, j14, sVar, null);
                    j jVar2 = (j) fVar.f106c.remove();
                    jVar2.f142c.I0(jVar2.f140a, jVar2.f141b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
