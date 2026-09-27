package i2;

import java.util.HashMap;
public final class m1 extends a {
    public final int h;
    public final int f10773i;
    public final int[] f10774j;
    public final int[] f10775k;
    public final b2.k1[] f10776l;
    public final Object[] f10777m;
    public final HashMap f10778n;

    public m1(b2.k1[] k1VarArr, Object[] objArr, u2.g1 g1Var) {
        super(g1Var);
        int length = k1VarArr.length;
        this.f10776l = k1VarArr;
        this.f10774j = new int[length];
        this.f10775k = new int[length];
        this.f10777m = objArr;
        this.f10778n = new HashMap();
        int length2 = k1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.k1 k1Var = k1VarArr[i10];
            this.f10776l[i13] = k1Var;
            this.f10775k[i13] = i11;
            this.f10774j[i13] = i12;
            i11 += k1Var.o();
            i12 += this.f10776l[i13].h();
            this.f10778n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f10773i = i12;
    }

    @Override
    public final int h() {
        return this.f10773i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f10778n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.d0.d(this.f10774j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.d0.d(this.f10775k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f10777m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f10774j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f10775k[i10];
    }

    @Override
    public final b2.k1 x(int i10) {
        return this.f10776l[i10];
    }

    public m1(java.util.ArrayList r8, u2.g1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.m1.<init>(java.util.ArrayList, u2.g1):void");
    }
}
