package i2;

import java.util.HashMap;
public final class r1 extends a {
    public final int h;
    public final int f8038i;
    public final int[] f8039j;
    public final int[] f8040k;
    public final b2.o1[] f8041l;
    public final Object[] f8042m;
    public final HashMap f8043n;

    public r1(b2.o1[] o1VarArr, Object[] objArr, u2.i1 i1Var) {
        super(i1Var);
        int length = o1VarArr.length;
        this.f8041l = o1VarArr;
        this.f8039j = new int[length];
        this.f8040k = new int[length];
        this.f8042m = objArr;
        this.f8043n = new HashMap();
        int length2 = o1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.o1 o1Var = o1VarArr[i10];
            this.f8041l[i13] = o1Var;
            this.f8040k[i13] = i11;
            this.f8039j[i13] = i12;
            i11 += o1Var.o();
            i12 += this.f8041l[i13].h();
            this.f8043n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f8038i = i12;
    }

    @Override
    public final int h() {
        return this.f8038i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f8043n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.l0.e(this.f8039j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.l0.e(this.f8040k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f8042m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f8039j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f8040k[i10];
    }

    @Override
    public final b2.o1 x(int i10) {
        return this.f8041l[i10];
    }

    public r1(java.util.ArrayList r8, u2.i1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r1.<init>(java.util.ArrayList, u2.i1):void");
    }
}
