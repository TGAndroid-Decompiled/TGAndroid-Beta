package a3;

import a8.ia;
import android.os.SystemClock;
import e2.m1;
import h2.m0;
import java.util.Arrays;
import java.util.List;
public abstract class d implements u {
    public final m1 f74a;
    public final int f75b;
    public final int[] f76c;
    public final e2.u[] d;
    public final long[] f77e;
    public int f78f;

    public d(m1 m1Var, int[] iArr) {
        boolean z9;
        int i7 = 0;
        if (iArr.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        m1Var.getClass();
        this.f74a = m1Var;
        int length = iArr.length;
        this.f75b = length;
        this.d = new e2.u[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.d[i10] = m1Var.d[iArr[i10]];
        }
        Arrays.sort(this.d, new c(0));
        this.f76c = new int[this.f75b];
        while (true) {
            int i11 = this.f75b;
            if (i7 < i11) {
                this.f76c[i7] = m1Var.a(this.d[i7]);
                i7++;
            } else {
                this.f77e = new long[i11];
                return;
            }
        }
    }

    @Override
    public final boolean a(int i7, long j3) {
        if (this.f77e[i7] > j3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b(e2.u uVar) {
        for (int i7 = 0; i7 < this.f75b; i7++) {
            if (this.d[i7] == uVar) {
                return i7;
            }
        }
        return -1;
    }

    @Override
    public final m1 c() {
        return this.f74a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f74a.equals(dVar.f74a) && Arrays.equals(this.f76c, dVar.f76c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final e2.u g(int i7) {
        return this.d[i7];
    }

    public final int hashCode() {
        if (this.f78f == 0) {
            this.f78f = Arrays.hashCode(this.f76c) + (System.identityHashCode(this.f74a) * 31);
        }
        return this.f78f;
    }

    @Override
    public final int i(int i7) {
        return this.f76c[i7];
    }

    @Override
    public int j(long j3, List list) {
        return list.size();
    }

    @Override
    public final boolean k(long j3, y2.f fVar, List list) {
        return false;
    }

    @Override
    public final int length() {
        return this.f76c.length;
    }

    @Override
    public final int m() {
        return this.f76c[d()];
    }

    @Override
    public final e2.u n() {
        return this.d[d()];
    }

    @Override
    public final boolean p(int i7, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a10 = a(i7, elapsedRealtime);
        for (int i10 = 0; i10 < this.f75b && !a10; i10++) {
            if (i10 != i7 && !a(i10, elapsedRealtime)) {
                a10 = true;
            } else {
                a10 = false;
            }
        }
        if (!a10) {
            return false;
        }
        long[] jArr = this.f77e;
        jArr[i7] = Math.max(jArr[i7], m0.a(elapsedRealtime, j3));
        return true;
    }

    @Override
    public final int u(int i7) {
        for (int i10 = 0; i10 < this.f75b; i10++) {
            if (this.f76c[i10] == i7) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public void h() {
    }

    @Override
    public void l() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void f(boolean z9) {
    }

    @Override
    public void q(float f10) {
    }
}
