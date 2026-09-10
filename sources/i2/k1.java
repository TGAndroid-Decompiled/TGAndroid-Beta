package i2;

import java.util.HashMap;
public final class k1 extends a {
    public final int h;
    public final int f10254i;
    public final int[] f10255j;
    public final int[] f10256k;
    public final b2.k1[] f10257l;
    public final Object[] f10258m;
    public final HashMap f10259n;

    public k1(b2.k1[] k1VarArr, Object[] objArr, u2.i1 i1Var) {
        super(i1Var);
        int length = k1VarArr.length;
        this.f10257l = k1VarArr;
        this.f10255j = new int[length];
        this.f10256k = new int[length];
        this.f10258m = objArr;
        this.f10259n = new HashMap();
        int length2 = k1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.k1 k1Var = k1VarArr[i10];
            this.f10257l[i13] = k1Var;
            this.f10256k[i13] = i11;
            this.f10255j[i13] = i12;
            i11 += k1Var.o();
            i12 += this.f10257l[i13].h();
            this.f10259n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f10254i = i12;
    }

    @Override
    public final int h() {
        return this.f10254i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f10259n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.d0.d(this.f10255j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.d0.d(this.f10256k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f10258m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f10255j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f10256k[i10];
    }

    @Override
    public final b2.k1 x(int i10) {
        return this.f10257l[i10];
    }

    public k1(java.util.ArrayList r8, u2.i1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.k1.<init>(java.util.ArrayList, u2.i1):void");
    }
}
