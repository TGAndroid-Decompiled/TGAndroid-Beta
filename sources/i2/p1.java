package i2;

import java.util.HashMap;
public final class p1 extends a {
    public final int h;
    public final int f11133i;
    public final int[] f11134j;
    public final int[] f11135k;
    public final b2.p1[] f11136l;
    public final Object[] f11137m;
    public final HashMap f11138n;

    public p1(b2.p1[] p1VarArr, Object[] objArr, u2.i1 i1Var) {
        super(i1Var);
        int length = p1VarArr.length;
        this.f11136l = p1VarArr;
        this.f11134j = new int[length];
        this.f11135k = new int[length];
        this.f11137m = objArr;
        this.f11138n = new HashMap();
        int length2 = p1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.p1 p1Var = p1VarArr[i10];
            this.f11136l[i13] = p1Var;
            this.f11135k[i13] = i11;
            this.f11134j[i13] = i12;
            i11 += p1Var.o();
            i12 += this.f11136l[i13].h();
            this.f11138n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f11133i = i12;
    }

    @Override
    public final int h() {
        return this.f11133i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f11138n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.m0.e(this.f11134j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.m0.e(this.f11135k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f11137m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f11134j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f11135k[i10];
    }

    @Override
    public final b2.p1 x(int i10) {
        return this.f11136l[i10];
    }

    public p1(java.util.ArrayList r8, u2.i1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p1.<init>(java.util.ArrayList, u2.i1):void");
    }
}
