package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
public abstract class wg0 implements e74 {
    public static final ta g = new ta((byte) 7);
    public final t1c a;
    public final int b;
    public final int[] c;
    public final ko4[] d;
    public final long[] e;
    public int f;

    public wg0(int i, t1c t1cVar, int[] iArr) {
        boolean z;
        ko4[] ko4VarArr;
        int i2 = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        t1cVar.getClass();
        this.a = t1cVar;
        int length = iArr.length;
        this.b = length;
        this.d = new ko4[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            ko4VarArr = this.d;
            if (i3 >= length2) {
                break;
            }
            ko4VarArr[i3] = t1cVar.d[iArr[i3]];
            i3++;
        }
        Arrays.sort(ko4VarArr, g);
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 < i4) {
                this.c[i2] = t1cVar.a(this.d[i2]);
                i2++;
            } else {
                this.e = new long[i4];
                return;
            }
        }
    }

    @Override
    public final boolean a(int i, long j) {
        if (this.e[i] > j) {
            return true;
        }
        return false;
    }

    @Override
    public final t1c c() {
        return this.a;
    }

    @Override
    public final int e(ko4 ko4Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == ko4Var) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wg0 wg0Var = (wg0) obj;
            if (this.a.equals(wg0Var.a) && Arrays.equals(this.c, wg0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void f() {
        Arrays.fill(this.e, 0L);
    }

    @Override
    public final boolean g(long j, rh2 rh2Var, List list) {
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
            this.f = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override
    public final ko4 i(int i) {
        return this.d[i];
    }

    @Override
    public final int j(int i) {
        return this.c[i];
    }

    @Override
    public int k(long j, List list) {
        return list.size();
    }

    @Override
    public final int length() {
        return this.c.length;
    }

    @Override
    public final int m() {
        return this.c[d()];
    }

    @Override
    public final ko4 n() {
        return this.d[d()];
    }

    @Override
    public final boolean p(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.b && !a; i2++) {
            if (i2 != i && !a(i2, elapsedRealtime)) {
                a = true;
            } else {
                a = false;
            }
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], gcc.a(elapsedRealtime, j));
        return true;
    }

    @Override
    public final int u(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override
    public void enable() {
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
    public final void h(boolean z) {
    }

    @Override
    public void q(float f) {
    }
}
