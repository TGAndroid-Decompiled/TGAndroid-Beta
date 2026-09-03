package f5;

import android.os.SystemClock;
import h5.d0;
import j3.n0;
import java.util.Arrays;
import java.util.List;
import o4.s0;
public abstract class c {
    public final s0 f5901a;
    public final int f5902b;
    public final int[] f5903c;
    public final n0[] d;
    public final long[] e;
    public int f5904f;

    public c(s0 s0Var, int[] iArr) {
        boolean z4;
        int i10 = 0;
        if (iArr.length > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        s0Var.getClass();
        this.f5901a = s0Var;
        int length = iArr.length;
        this.f5902b = length;
        this.d = new n0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = s0Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new e5.e(3));
        this.f5903c = new int[this.f5902b];
        while (true) {
            int i12 = this.f5902b;
            if (i10 < i12) {
                this.f5903c[i10] = s0Var.a(this.d[i10]);
                i10++;
            } else {
                this.e = new long[i12];
                return;
            }
        }
    }

    public int c(long j10, List list) {
        return list.size();
    }

    public final boolean d(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean o10 = o(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f5902b && !o10; i11++) {
            if (i11 != i10 && !o(i11, elapsedRealtime)) {
                o10 = true;
            } else {
                o10 = false;
            }
        }
        if (!o10) {
            return false;
        }
        long[] jArr = this.e;
        long j11 = jArr[i10];
        int i12 = d0.f6924a;
        long j12 = elapsedRealtime + j10;
        if (((j10 ^ j12) & (elapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    public final n0 e(int i10) {
        return this.d[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f5901a == cVar.f5901a && Arrays.equals(this.f5903c, cVar.f5903c)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10) {
        return this.f5903c[i10];
    }

    public final n0 g() {
        return this.d[h()];
    }

    public abstract int h();

    public final int hashCode() {
        if (this.f5904f == 0) {
            this.f5904f = Arrays.hashCode(this.f5903c) + (System.identityHashCode(this.f5901a) * 31);
        }
        return this.f5904f;
    }

    public final int i() {
        return this.f5903c[h()];
    }

    public abstract Object j();

    public abstract int k();

    public final s0 l() {
        return this.f5901a;
    }

    public final int m(int i10) {
        for (int i11 = 0; i11 < this.f5902b; i11++) {
            if (this.f5903c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final int n(n0 n0Var) {
        for (int i10 = 0; i10 < this.f5902b; i10++) {
            if (this.d[i10] == n0Var) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean o(int i10, long j10) {
        if (this.e[i10] > j10) {
            return true;
        }
        return false;
    }

    public final int p() {
        return this.f5903c.length;
    }

    public final boolean u(long j10, q4.e eVar, List list) {
        return false;
    }

    public abstract void v(long j10, long j11, long j12, List list, q4.l[] lVarArr);

    public void a() {
    }

    public void b() {
    }

    public final void q() {
    }

    public final void t() {
    }

    public final void r(boolean z4) {
    }

    public void s(float f10) {
    }
}
