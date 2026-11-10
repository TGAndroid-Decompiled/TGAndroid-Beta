package l2;

import java.util.HashMap;
public final class p1 extends a {
    public final int h;
    public final int f17988i;
    public final int[] f17989j;
    public final int[] f17990k;
    public final e2.l1[] f17991l;
    public final Object[] f17992m;
    public final HashMap f17993n;

    public p1(e2.l1[] l1VarArr, Object[] objArr, x2.g1 g1Var) {
        super(g1Var);
        int length = l1VarArr.length;
        this.f17991l = l1VarArr;
        this.f17989j = new int[length];
        this.f17990k = new int[length];
        this.f17992m = objArr;
        this.f17993n = new HashMap();
        int length2 = l1VarArr.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i7 < length2) {
            e2.l1 l1Var = l1VarArr[i7];
            this.f17991l[i12] = l1Var;
            this.f17990k[i12] = i10;
            this.f17989j[i12] = i11;
            i10 += l1Var.o();
            i11 += this.f17991l[i12].h();
            this.f17993n.put(objArr[i12], Integer.valueOf(i12));
            i7++;
            i12++;
        }
        this.h = i10;
        this.f17988i = i11;
    }

    @Override
    public final int h() {
        return this.f17988i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f17993n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i7) {
        return h2.m0.e(this.f17989j, i7 + 1, false, false);
    }

    @Override
    public final int s(int i7) {
        return h2.m0.e(this.f17990k, i7 + 1, false, false);
    }

    @Override
    public final Object t(int i7) {
        return this.f17992m[i7];
    }

    @Override
    public final int u(int i7) {
        return this.f17989j[i7];
    }

    @Override
    public final int v(int i7) {
        return this.f17990k[i7];
    }

    @Override
    public final e2.l1 x(int i7) {
        return this.f17991l[i7];
    }

    public p1(java.util.ArrayList r8, x2.g1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: l2.p1.<init>(java.util.ArrayList, x2.g1):void");
    }
}
