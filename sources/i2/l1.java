package i2;

import java.util.HashMap;
public final class l1 extends a {
    public final int h;
    public final int f11654i;
    public final int[] f11655j;
    public final int[] f11656k;
    public final b2.k1[] f11657l;
    public final Object[] f11658m;
    public final HashMap f11659n;

    public l1(b2.k1[] k1VarArr, Object[] objArr, u2.g1 g1Var) {
        super(g1Var);
        int length = k1VarArr.length;
        this.f11657l = k1VarArr;
        this.f11655j = new int[length];
        this.f11656k = new int[length];
        this.f11658m = objArr;
        this.f11659n = new HashMap();
        int length2 = k1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.k1 k1Var = k1VarArr[i10];
            this.f11657l[i13] = k1Var;
            this.f11656k[i13] = i11;
            this.f11655j[i13] = i12;
            i11 += k1Var.o();
            i12 += this.f11657l[i13].h();
            this.f11659n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f11654i = i12;
    }

    @Override
    public final int h() {
        return this.f11654i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f11659n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.d0.d(this.f11655j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.d0.d(this.f11656k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f11658m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f11655j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f11656k[i10];
    }

    @Override
    public final b2.k1 x(int i10) {
        return this.f11657l[i10];
    }

    public l1(java.util.ArrayList r8, u2.g1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.l1.<init>(java.util.ArrayList, u2.g1):void");
    }
}
