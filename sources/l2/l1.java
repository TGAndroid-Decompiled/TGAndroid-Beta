package l2;

import java.util.HashMap;
public final class l1 extends a {
    public final int h;
    public final int f19070i;
    public final int[] f19071j;
    public final int[] f19072k;
    public final e2.l1[] f19073l;
    public final Object[] f19074m;
    public final HashMap f19075n;

    public l1(e2.l1[] l1VarArr, Object[] objArr, x2.g1 g1Var) {
        super(g1Var);
        int length = l1VarArr.length;
        this.f19073l = l1VarArr;
        this.f19071j = new int[length];
        this.f19072k = new int[length];
        this.f19074m = objArr;
        this.f19075n = new HashMap();
        int length2 = l1VarArr.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i7 < length2) {
            e2.l1 l1Var = l1VarArr[i7];
            this.f19073l[i12] = l1Var;
            this.f19072k[i12] = i10;
            this.f19071j[i12] = i11;
            i10 += l1Var.o();
            i11 += this.f19073l[i12].h();
            this.f19075n.put(objArr[i12], Integer.valueOf(i12));
            i7++;
            i12++;
        }
        this.h = i10;
        this.f19070i = i11;
    }

    @Override
    public final int h() {
        return this.f19070i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f19075n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i7) {
        return h2.l0.e(this.f19071j, i7 + 1, false, false);
    }

    @Override
    public final int s(int i7) {
        return h2.l0.e(this.f19072k, i7 + 1, false, false);
    }

    @Override
    public final Object t(int i7) {
        return this.f19074m[i7];
    }

    @Override
    public final int u(int i7) {
        return this.f19071j[i7];
    }

    @Override
    public final int v(int i7) {
        return this.f19072k[i7];
    }

    @Override
    public final e2.l1 x(int i7) {
        return this.f19073l[i7];
    }

    public l1(java.util.ArrayList r8, x2.g1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: l2.l1.<init>(java.util.ArrayList, x2.g1):void");
    }
}
