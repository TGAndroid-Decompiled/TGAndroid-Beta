package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
public abstract class vh0 implements t74 {
    public static final sa g = new sa((byte) 7);
    public final uzb a;
    public final int b;
    public final int[] c;
    public final go4[] d;
    public final long[] e;
    public int f;

    public vh0(int i, uzb uzbVar, int[] iArr) {
        boolean z;
        go4[] go4VarArr;
        int i2 = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        uzbVar.getClass();
        this.a = uzbVar;
        int length = iArr.length;
        this.b = length;
        this.d = new go4[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            go4VarArr = this.d;
            if (i3 >= length2) {
                break;
            }
            go4VarArr[i3] = uzbVar.d[iArr[i3]];
            i3++;
        }
        Arrays.sort(go4VarArr, g);
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 < i4) {
                this.c[i2] = uzbVar.a(this.d[i2]);
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
    public final uzb c() {
        return this.a;
    }

    @Override
    public final int e(go4 go4Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == go4Var) {
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
            vh0 vh0Var = (vh0) obj;
            if (this.a.equals(vh0Var.a) && Arrays.equals(this.c, vh0Var.c)) {
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
    public final boolean g(long j, ni2 ni2Var, List list) {
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
    public final go4 i(int i) {
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
    public final go4 o() {
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
        jArr[i] = Math.max(jArr[i], hac.a(elapsedRealtime, j));
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
