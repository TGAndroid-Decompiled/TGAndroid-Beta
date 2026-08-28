package b5;

import android.os.SystemClock;
import d5.f0;
import h3.t0;
import j4.i1;
import java.util.Arrays;
import java.util.List;
public abstract class c implements t {
    public final i1 f1443a;
    public final int f1444b;
    public final int[] f1445c;
    public final t0[] d;
    public final long[] f1446e;
    public int f1447f;

    public c(i1 i1Var, int[] iArr) {
        boolean z10;
        int i9 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        i1Var.getClass();
        this.f1443a = i1Var;
        int length = iArr.length;
        this.f1444b = length;
        this.d = new t0[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.d[i10] = i1Var.d[iArr[i10]];
        }
        Arrays.sort(this.d, new a5.e(2));
        this.f1445c = new int[this.f1444b];
        while (true) {
            int i11 = this.f1444b;
            if (i9 < i11) {
                this.f1445c[i9] = i1Var.a(this.d[i9]);
                i9++;
            } else {
                this.f1446e = new long[i11];
                return;
            }
        }
    }

    @Override
    public final int a(t0 t0Var) {
        for (int i9 = 0; i9 < this.f1444b; i9++) {
            if (this.d[i9] == t0Var) {
                return i9;
            }
        }
        return -1;
    }

    @Override
    public final i1 b() {
        return this.f1443a;
    }

    @Override
    public final boolean c(long j10, l4.e eVar, List list) {
        return false;
    }

    @Override
    public final boolean e(int i9, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean f10 = f(i9, elapsedRealtime);
        for (int i10 = 0; i10 < this.f1444b && !f10; i10++) {
            if (i10 != i9 && !f(i10, elapsedRealtime)) {
                f10 = true;
            } else {
                f10 = false;
            }
        }
        if (!f10) {
            return false;
        }
        long[] jArr = this.f1446e;
        long j11 = jArr[i9];
        int i11 = f0.f4349a;
        long j12 = elapsedRealtime + j10;
        if (((j10 ^ j12) & (elapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i9] = Math.max(j11, j12);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f1443a == cVar.f1443a && Arrays.equals(this.f1445c, cVar.f1445c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean f(int i9, long j10) {
        if (this.f1446e[i9] > j10) {
            return true;
        }
        return false;
    }

    @Override
    public final t0 h(int i9) {
        return this.d[i9];
    }

    public final int hashCode() {
        if (this.f1447f == 0) {
            this.f1447f = Arrays.hashCode(this.f1445c) + (System.identityHashCode(this.f1443a) * 31);
        }
        return this.f1447f;
    }

    @Override
    public final int j(int i9) {
        return this.f1445c[i9];
    }

    @Override
    public int k(long j10, List list) {
        return list.size();
    }

    @Override
    public final int length() {
        return this.f1445c.length;
    }

    @Override
    public final int n() {
        return this.f1445c[d()];
    }

    @Override
    public final t0 o() {
        return this.d[d()];
    }

    @Override
    public final int u(int i9) {
        for (int i10 = 0; i10 < this.f1444b; i10++) {
            if (this.f1445c[i10] == i9) {
                return i10;
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
