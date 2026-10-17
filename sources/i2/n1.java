package i2;

import java.util.HashMap;
public final class n1 extends a {
    public final int h;
    public final int f12522i;
    public final int[] f12523j;
    public final int[] f12524k;
    public final b2.o1[] f12525l;
    public final Object[] f12526m;
    public final HashMap f12527n;

    public n1(b2.o1[] o1VarArr, Object[] objArr, u2.i1 i1Var) {
        super(i1Var);
        int length = o1VarArr.length;
        this.f12525l = o1VarArr;
        this.f12523j = new int[length];
        this.f12524k = new int[length];
        this.f12526m = objArr;
        this.f12527n = new HashMap();
        int length2 = o1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.o1 o1Var = o1VarArr[i10];
            this.f12525l[i13] = o1Var;
            this.f12524k[i13] = i11;
            this.f12523j[i13] = i12;
            i11 += o1Var.o();
            i12 += this.f12525l[i13].h();
            this.f12527n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f12522i = i12;
    }

    @Override
    public final int h() {
        return this.f12522i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f12527n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.m0.e(this.f12523j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.m0.e(this.f12524k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f12526m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f12523j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f12524k[i10];
    }

    @Override
    public final b2.o1 x(int i10) {
        return this.f12525l[i10];
    }

    public n1(java.util.ArrayList r8, u2.i1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.n1.<init>(java.util.ArrayList, u2.i1):void");
    }
}
