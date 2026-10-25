package i2;

import java.util.HashMap;
public final class p1 extends a {
    public final int h;
    public final int f13701i;
    public final int[] f13702j;
    public final int[] f13703k;
    public final b2.p1[] f13704l;
    public final Object[] f13705m;
    public final HashMap f13706n;

    public p1(b2.p1[] p1VarArr, Object[] objArr, u2.i1 i1Var) {
        super(i1Var);
        int length = p1VarArr.length;
        this.f13704l = p1VarArr;
        this.f13702j = new int[length];
        this.f13703k = new int[length];
        this.f13705m = objArr;
        this.f13706n = new HashMap();
        int length2 = p1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.p1 p1Var = p1VarArr[i10];
            this.f13704l[i13] = p1Var;
            this.f13703k[i13] = i11;
            this.f13702j[i13] = i12;
            i11 += p1Var.o();
            i12 += this.f13704l[i13].h();
            this.f13706n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f13701i = i12;
    }

    @Override
    public final int h() {
        return this.f13701i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f13706n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.n0.e(this.f13702j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.n0.e(this.f13703k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f13705m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f13702j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f13703k[i10];
    }

    @Override
    public final b2.p1 x(int i10) {
        return this.f13704l[i10];
    }

    public p1(java.util.ArrayList r8, u2.i1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p1.<init>(java.util.ArrayList, u2.i1):void");
    }
}
