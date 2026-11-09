package l2;

import java.util.HashMap;
public final class p1 extends a {
    public final int h;
    public final int f17985i;
    public final int[] f17986j;
    public final int[] f17987k;
    public final e2.l1[] f17988l;
    public final Object[] f17989m;
    public final HashMap f17990n;

    public p1(e2.l1[] l1VarArr, Object[] objArr, x2.h1 h1Var) {
        super(h1Var);
        int length = l1VarArr.length;
        this.f17988l = l1VarArr;
        this.f17986j = new int[length];
        this.f17987k = new int[length];
        this.f17989m = objArr;
        this.f17990n = new HashMap();
        int length2 = l1VarArr.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i7 < length2) {
            e2.l1 l1Var = l1VarArr[i7];
            this.f17988l[i12] = l1Var;
            this.f17987k[i12] = i10;
            this.f17986j[i12] = i11;
            i10 += l1Var.o();
            i11 += this.f17988l[i12].h();
            this.f17990n.put(objArr[i12], Integer.valueOf(i12));
            i7++;
            i12++;
        }
        this.h = i10;
        this.f17985i = i11;
    }

    @Override
    public final int h() {
        return this.f17985i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f17990n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i7) {
        return h2.m0.e(this.f17986j, i7 + 1, false, false);
    }

    @Override
    public final int s(int i7) {
        return h2.m0.e(this.f17987k, i7 + 1, false, false);
    }

    @Override
    public final Object t(int i7) {
        return this.f17989m[i7];
    }

    @Override
    public final int u(int i7) {
        return this.f17986j[i7];
    }

    @Override
    public final int v(int i7) {
        return this.f17987k[i7];
    }

    @Override
    public final e2.l1 x(int i7) {
        return this.f17988l[i7];
    }

    public p1(java.util.ArrayList r8, x2.h1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: l2.p1.<init>(java.util.ArrayList, x2.h1):void");
    }
}
