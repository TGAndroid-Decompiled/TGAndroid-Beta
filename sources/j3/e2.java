package j3;

import java.util.HashMap;
public final class e2 extends a {
    public final int f9100e;
    public final int f9101f;
    public final int[] h;
    public final int[] f9102n;
    public final o2[] f9103r;
    public final Object[] f9104s;
    public final HashMap v;

    public e2(o2[] o2VarArr, Object[] objArr, o4.q0 q0Var) {
        super(q0Var);
        int length = o2VarArr.length;
        this.f9103r = o2VarArr;
        this.h = new int[length];
        this.f9102n = new int[length];
        this.f9104s = objArr;
        this.v = new HashMap();
        int length2 = o2VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            o2 o2Var = o2VarArr[i10];
            this.f9103r[i13] = o2Var;
            this.f9102n[i13] = i11;
            this.h[i13] = i12;
            i11 += o2Var.o();
            i12 += this.f9103r[i13].h();
            this.v.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.f9100e = i11;
        this.f9101f = i12;
    }

    @Override
    public final int h() {
        return this.f9101f;
    }

    @Override
    public final int o() {
        return this.f9100e;
    }

    @Override
    public final int q(Object obj) {
        Integer num = (Integer) this.v.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int r(int i10) {
        return h5.d0.d(this.h, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return h5.d0.d(this.f9102n, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f9104s[i10];
    }

    @Override
    public final int u(int i10) {
        return this.h[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f9102n[i10];
    }

    @Override
    public final o2 x(int i10) {
        return this.f9103r[i10];
    }

    public e2(java.util.ArrayList r8, o4.q0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: j3.e2.<init>(java.util.ArrayList, o4.q0):void");
    }
}
