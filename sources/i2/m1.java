package i2;

import java.util.HashMap;
public final class m1 extends a {
    public final int h;
    public final int f11786i;
    public final int[] f11787j;
    public final int[] f11788k;
    public final b2.k1[] f11789l;
    public final Object[] f11790m;
    public final HashMap f11791n;

    public m1(b2.k1[] k1VarArr, Object[] objArr, u2.f1 f1Var) {
        super(f1Var);
        int length = k1VarArr.length;
        this.f11789l = k1VarArr;
        this.f11787j = new int[length];
        this.f11788k = new int[length];
        this.f11790m = objArr;
        this.f11791n = new HashMap();
        int length2 = k1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.k1 k1Var = k1VarArr[i10];
            this.f11789l[i13] = k1Var;
            this.f11788k[i13] = i11;
            this.f11787j[i13] = i12;
            i11 += k1Var.o();
            i12 += this.f11789l[i13].h();
            this.f11791n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f11786i = i12;
    }

    @Override
    public final int h() {
        return this.f11786i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f11791n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.d0.d(this.f11787j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.d0.d(this.f11788k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f11790m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f11787j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f11788k[i10];
    }

    @Override
    public final b2.k1 x(int i10) {
        return this.f11789l[i10];
    }

    public m1(java.util.ArrayList r8, u2.f1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.m1.<init>(java.util.ArrayList, u2.f1):void");
    }
}
