package k2;

import java.util.HashMap;
public final class o1 extends a {
    public final int h;
    public final int f16664i;
    public final int[] f16665j;
    public final int[] f16666k;
    public final d2.n1[] f16667l;
    public final Object[] f16668m;
    public final HashMap f16669n;

    public o1(d2.n1[] n1VarArr, Object[] objArr, w2.i1 i1Var) {
        super(i1Var);
        int length = n1VarArr.length;
        this.f16667l = n1VarArr;
        this.f16665j = new int[length];
        this.f16666k = new int[length];
        this.f16668m = objArr;
        this.f16669n = new HashMap();
        int length2 = n1VarArr.length;
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length2) {
            d2.n1 n1Var = n1VarArr[i3];
            this.f16667l[i12] = n1Var;
            this.f16666k[i12] = i10;
            this.f16665j[i12] = i11;
            i10 += n1Var.o();
            i11 += this.f16667l[i12].h();
            this.f16669n.put(objArr[i12], Integer.valueOf(i12));
            i3++;
            i12++;
        }
        this.h = i10;
        this.f16664i = i11;
    }

    @Override
    public final int h() {
        return this.f16664i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f16669n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i3) {
        return g2.n0.e(this.f16665j, i3 + 1, false, false);
    }

    @Override
    public final int s(int i3) {
        return g2.n0.e(this.f16666k, i3 + 1, false, false);
    }

    @Override
    public final Object t(int i3) {
        return this.f16668m[i3];
    }

    @Override
    public final int u(int i3) {
        return this.f16665j[i3];
    }

    @Override
    public final int v(int i3) {
        return this.f16666k[i3];
    }

    @Override
    public final d2.n1 x(int i3) {
        return this.f16667l[i3];
    }

    public o1(java.util.ArrayList r8, w2.i1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: k2.o1.<init>(java.util.ArrayList, w2.i1):void");
    }
}
