package defpackage;

import android.util.SparseArray;
public final class bp4 implements fv9 {
    public final SparseArray a;
    public final SparseArray b;
    public final long c;
    public final long d;
    public final int e;

    public bp4(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i) {
        this.a = sparseArray;
        this.b = sparseArray2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final ev9 f(long j) {
        SparseArray sparseArray = this.a;
        int i = this.e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length != 0 && j >= jArr[0]) {
            int f = g8c.f(jArr, j, true);
            hv9 hv9Var = new hv9(jArr[f], jArr2[f]);
            return new ev9(hv9Var, hv9Var);
        }
        hv9 hv9Var2 = new hv9(0L, this.d);
        return new ev9(hv9Var2, hv9Var2);
    }

    @Override
    public final long h() {
        return this.c;
    }
}
