package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
public abstract class vg0 implements k64 {
    public static final sa g = new sa((byte) 7);
    public final sxb a;
    public final int b;
    public final int[] c;
    public final fm4[] d;
    public final long[] e;
    public int f;

    public vg0(int i, sxb sxbVar, int[] iArr) {
        boolean z;
        fm4[] fm4VarArr;
        int i2 = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        sxbVar.getClass();
        this.a = sxbVar;
        int length = iArr.length;
        this.b = length;
        this.d = new fm4[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            fm4VarArr = this.d;
            if (i3 >= length2) {
                break;
            }
            fm4VarArr[i3] = sxbVar.d[iArr[i3]];
            i3++;
        }
        Arrays.sort(fm4VarArr, g);
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 < i4) {
                this.c[i2] = sxbVar.a(this.d[i2]);
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
    public final sxb c() {
        return this.a;
    }

    @Override
    public final int e(fm4 fm4Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == fm4Var) {
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
            vg0 vg0Var = (vg0) obj;
            if (this.a.equals(vg0Var.a) && Arrays.equals(this.c, vg0Var.c)) {
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
    public final boolean g(long j, zg2 zg2Var, List list) {
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
    public final fm4 i(int i) {
        return this.d[i];
    }

    @Override
    public final int k(int i) {
        return this.c[i];
    }

    @Override
    public int l(long j, List list) {
        return list.size();
    }

    @Override
    public final int length() {
        return this.c.length;
    }

    @Override
    public final int n() {
        return this.c[d()];
    }

    @Override
    public final fm4 o() {
        return this.d[d()];
    }

    @Override
    public final boolean q(int i, long j) {
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
        jArr[i] = Math.max(jArr[i], g8c.a(elapsedRealtime, j));
        return true;
    }

    @Override
    public final int v(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override
    public void j() {
    }

    @Override
    public void m() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void h(boolean z) {
    }

    @Override
    public void r(float f) {
    }
}
