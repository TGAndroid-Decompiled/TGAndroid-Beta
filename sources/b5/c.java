package b5;

import android.os.SystemClock;
import d5.g0;
import h3.t0;
import j4.i1;
import java.util.Arrays;
import java.util.List;

public abstract class c implements s {

    public final i1 f1931a;

    public final int f1932b;

    public final int[] f1933c;
    public final t0[] d;

    public final long[] f1934e;

    public int f1935f;

    public c(i1 i1Var, int[] iArr) {
        int i10 = 0;
        d5.a.i(iArr.length > 0);
        i1Var.getClass();
        this.f1931a = i1Var;
        int length = iArr.length;
        this.f1932b = length;
        this.d = new t0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = i1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new a5.f(3));
        this.f1933c = new int[this.f1932b];
        while (true) {
            int i12 = this.f1932b;
            if (i10 >= i12) {
                this.f1934e = new long[i12];
                return;
            } else {
                this.f1933c[i10] = i1Var.a(this.d[i10]);
                i10++;
            }
        }
    }

    @Override
    public final int a(t0 t0Var) {
        for (int i10 = 0; i10 < this.f1932b; i10++) {
            if (this.d[i10] == t0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final i1 b() {
        return this.f1931a;
    }

    @Override
    public final boolean c(long j10, l4.e eVar, List list) {
        return false;
    }

    @Override
    public final boolean e(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zF = f(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f1932b && !zF) {
            zF = (i11 == i10 || f(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zF) {
            return false;
        }
        long[] jArr = this.f1934e;
        long j11 = jArr[i10];
        int i12 = g0.f4795a;
        long j12 = jElapsedRealtime + j10;
        if (((j10 ^ j12) & (jElapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f1931a == cVar.f1931a && Arrays.equals(this.f1933c, cVar.f1933c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean f(int i10, long j10) {
        return this.f1934e[i10] > j10;
    }

    @Override
    public final t0 h(int i10) {
        return this.d[i10];
    }

    public final int hashCode() {
        if (this.f1935f == 0) {
            this.f1935f = Arrays.hashCode(this.f1933c) + (System.identityHashCode(this.f1931a) * 31);
        }
        return this.f1935f;
    }

    @Override
    public final int j(int i10) {
        return this.f1933c[i10];
    }

    @Override
    public int k(long j10, List list) {
        return list.size();
    }

    @Override
    public final int length() {
        return this.f1933c.length;
    }

    @Override
    public final int n() {
        return this.f1933c[d()];
    }

    @Override
    public final t0 o() {
        return this.d[d()];
    }

    @Override
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f1932b; i11++) {
            if (this.f1933c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override
    public void i() {
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
    public final void g(boolean z10) {
    }

    @Override
    public void q(float f10) {
    }
}
