package i2;

import java.util.HashMap;
public final class n1 extends a {
    public final int h;
    public final int f12495i;
    public final int[] f12496j;
    public final int[] f12497k;
    public final b2.o1[] f12498l;
    public final Object[] f12499m;
    public final HashMap f12500n;

    public n1(b2.o1[] o1VarArr, Object[] objArr, u2.h1 h1Var) {
        super(h1Var);
        int length = o1VarArr.length;
        this.f12498l = o1VarArr;
        this.f12496j = new int[length];
        this.f12497k = new int[length];
        this.f12499m = objArr;
        this.f12500n = new HashMap();
        int length2 = o1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.o1 o1Var = o1VarArr[i10];
            this.f12498l[i13] = o1Var;
            this.f12497k[i13] = i11;
            this.f12496j[i13] = i12;
            i11 += o1Var.o();
            i12 += this.f12498l[i13].h();
            this.f12500n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.f12495i = i12;
    }

    @Override
    public final int h() {
        return this.f12495i;
    }

    @Override
    public final int o() {
        return this.h;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.f12500n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return e2.m0.e(this.f12496j, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return e2.m0.e(this.f12497k, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f12499m[i10];
    }

    @Override
    public final int u(int i10) {
        return this.f12496j[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f12497k[i10];
    }

    @Override
    public final b2.o1 x(int i10) {
        return this.f12498l[i10];
    }

    public n1(java.util.ArrayList r8, u2.h1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.n1.<init>(java.util.ArrayList, u2.h1):void");
    }
}
