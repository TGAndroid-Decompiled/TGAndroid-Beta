package i2;

import java.util.HashMap;
public final class m1 extends a {
    public final int h;
    public final int f11785i;
    public final int[] f11786j;
    public final int[] f11787k;
    public final b2.k1[] f11788l;
    public final Object[] f11789m;
    public final HashMap f11790n;

    public m1(b2.k1[] k1VarArr, Object[] objArr, u2.f1 f1Var) {
        super(f1Var);
        int length = k1VarArr.length;
        this.f11788l = k1VarArr;
        this.f11786j = new int[length];
        this.f11787k = new int[length];
        this.f11789m = objArr;
        this.f11790n = new HashMap();
        int length2 = k1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.k1 k1Var = k1VarArr[i10];
            this.f11788l[i13] = k1Var;
            this.f11787k[i13] = i11;
            this.f11786j[i13] = i12;
            i11 += k1Var.o();
            i12 += this.f11788l[i13].h();
            this.f11790n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f11785i = i12;
    }

    @Override
    public final int h() {
        return this.f11785i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f11790n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.d0.d(this.f11786j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.d0.d(this.f11787k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f11789m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f11786j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f11787k[i10];
    }

    @Override
    public final b2.k1 x(int i10) {
        return this.f11788l[i10];
    }

    public m1(java.util.ArrayList r8, u2.f1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.m1.<init>(java.util.ArrayList, u2.f1):void");
    }
}
