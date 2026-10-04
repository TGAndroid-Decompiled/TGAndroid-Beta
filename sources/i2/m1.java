package i2;

import java.util.HashMap;
public final class m1 extends a {
    public final int h;
    public final int f11737i;
    public final int[] f11738j;
    public final int[] f11739k;
    public final b2.k1[] f11740l;
    public final Object[] f11741m;
    public final HashMap f11742n;

    public m1(b2.k1[] k1VarArr, Object[] objArr, u2.h1 h1Var) {
        super(h1Var);
        int length = k1VarArr.length;
        this.f11740l = k1VarArr;
        this.f11738j = new int[length];
        this.f11739k = new int[length];
        this.f11741m = objArr;
        this.f11742n = new HashMap();
        int length2 = k1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.k1 k1Var = k1VarArr[i10];
            this.f11740l[i13] = k1Var;
            this.f11739k[i13] = i11;
            this.f11738j[i13] = i12;
            i11 += k1Var.o();
            i12 += this.f11740l[i13].h();
            this.f11742n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f11737i = i12;
    }

    @Override
    public final int h() {
        return this.f11737i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f11742n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.d0.d(this.f11738j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.d0.d(this.f11739k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f11741m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f11738j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f11739k[i10];
    }

    @Override
    public final b2.k1 x(int i10) {
        return this.f11740l[i10];
    }

    public m1(java.util.ArrayList r8, u2.h1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.m1.<init>(java.util.ArrayList, u2.h1):void");
    }
}
