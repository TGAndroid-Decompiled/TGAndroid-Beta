package d5;

import android.os.SystemClock;
import f5.d0;
import j3.t0;
import java.util.Arrays;
import java.util.List;
import l4.j1;
public abstract class c implements r {
    public final j1 f5323a;
    public final int f5324b;
    public final int[] f5325c;
    public final t0[] d;
    public final long[] f5326e;
    public int f5327f;

    public c(j1 j1Var, int[] iArr) {
        boolean z10;
        int i10 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        j1Var.getClass();
        this.f5323a = j1Var;
        int length = iArr.length;
        this.f5324b = length;
        this.d = new t0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = j1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new c5.e(5));
        this.f5325c = new int[this.f5324b];
        while (true) {
            int i12 = this.f5324b;
            if (i10 < i12) {
                this.f5325c[i10] = j1Var.a(this.d[i10]);
                i10++;
            } else {
                this.f5326e = new long[i12];
                return;
            }
        }
    }

    @Override
    public final j1 a() {
        return this.f5323a;
    }

    @Override
    public final boolean d(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean e10 = e(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f5324b && !e10; i11++) {
            if (i11 != i10 && !e(i11, elapsedRealtime)) {
                e10 = true;
            } else {
                e10 = false;
            }
        }
        if (!e10) {
            return false;
        }
        long[] jArr = this.f5326e;
        long j11 = jArr[i10];
        int i12 = d0.f6579a;
        long j12 = elapsedRealtime + j10;
        if (((j10 ^ j12) & (elapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    @Override
    public final boolean e(int i10, long j10) {
        if (this.f5326e[i10] > j10) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f5323a == cVar.f5323a && Arrays.equals(this.f5325c, cVar.f5325c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final t0 g(int i10) {
        return this.d[i10];
    }

    public final int hashCode() {
        if (this.f5327f == 0) {
            this.f5327f = Arrays.hashCode(this.f5325c) + (System.identityHashCode(this.f5323a) * 31);
        }
        return this.f5327f;
    }

    @Override
    public final int i(int i10) {
        return this.f5325c[i10];
    }

    @Override
    public int j(long j10, List list) {
        return list.size();
    }

    @Override
    public final int l() {
        return this.f5325c[c()];
    }

    @Override
    public final int length() {
        return this.f5325c.length;
    }

    @Override
    public final int m(t0 t0Var) {
        for (int i10 = 0; i10 < this.f5324b; i10++) {
            if (this.d[i10] == t0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final t0 n() {
        return this.d[c()];
    }

    @Override
    public final boolean p(long j10, n4.e eVar, List list) {
        return false;
    }

    @Override
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f5324b; i11++) {
            if (this.f5325c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override
    public void h() {
    }

    @Override
    public void k() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void f(boolean z10) {
    }

    @Override
    public void q(float f9) {
    }
}
