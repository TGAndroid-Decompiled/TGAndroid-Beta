package l2;

import java.util.HashMap;
public final class l1 extends a {
    public final int h;
    public final int f19465i;
    public final int[] f19466j;
    public final int[] f19467k;
    public final e2.l1[] f19468l;
    public final Object[] f19469m;
    public final HashMap f19470n;

    public l1(e2.l1[] l1VarArr, Object[] objArr, x2.i1 i1Var) {
        super(i1Var);
        int length = l1VarArr.length;
        this.f19468l = l1VarArr;
        this.f19466j = new int[length];
        this.f19467k = new int[length];
        this.f19469m = objArr;
        this.f19470n = new HashMap();
        int length2 = l1VarArr.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i7 < length2) {
            e2.l1 l1Var = l1VarArr[i7];
            this.f19468l[i12] = l1Var;
            this.f19467k[i12] = i10;
            this.f19466j[i12] = i11;
            i10 += l1Var.o();
            i11 += this.f19468l[i12].h();
            this.f19470n.put(objArr[i12], Integer.valueOf(i12));
            i7++;
            i12++;
        }
        this.h = i10;
        this.f19465i = i11;
    }

    @Override
    public final int h() {
        return this.f19465i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f19470n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i7) {
        return h2.l0.e(this.f19466j, i7 + 1, false, false);
    }

    @Override
    public final int s(int i7) {
        return h2.l0.e(this.f19467k, i7 + 1, false, false);
    }

    @Override
    public final Object t(int i7) {
        return this.f19469m[i7];
    }

    @Override
    public final int u(int i7) {
        return this.f19466j[i7];
    }

    @Override
    public final int v(int i7) {
        return this.f19467k[i7];
    }

    @Override
    public final e2.l1 x(int i7) {
        return this.f19468l[i7];
    }

    public l1(java.util.ArrayList r8, x2.i1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: l2.l1.<init>(java.util.ArrayList, x2.i1):void");
    }
}
