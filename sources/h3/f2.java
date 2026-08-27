package h3;

import java.util.ArrayList;
import java.util.HashMap;

public final class f2 extends a {

    public final int f7834e;

    public final int f7835f;
    public final int[] h;

    public final int[] f7836n;

    public final s2[] f7837r;

    public final Object[] f7838s;
    public final HashMap v;

    public f2(ArrayList arrayList, j4.g1 g1Var) {
        super(g1Var);
        int size = arrayList.size();
        this.h = new int[size];
        this.f7836n = new int[size];
        this.f7837r = new s2[size];
        this.f7838s = new Object[size];
        this.v = new HashMap();
        int size2 = arrayList.size();
        int iO = 0;
        int iH = 0;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            l1 l1Var = (l1) obj;
            this.f7837r[i10] = l1Var.b();
            this.f7836n[i10] = iO;
            this.h[i10] = iH;
            iO += this.f7837r[i10].o();
            iH += this.f7837r[i10].h();
            this.f7838s[i10] = l1Var.a();
            this.v.put(this.f7838s[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f7834e = iO;
        this.f7835f = iH;
    }

    @Override
    public final int h() {
        return this.f7835f;
    }

    @Override
    public final int o() {
        return this.f7834e;
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
        return d5.g0.d(this.h, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return d5.g0.d(this.f7836n, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f7838s[i10];
    }

    @Override
    public final int u(int i10) {
        return this.h[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f7836n[i10];
    }

    @Override
    public final s2 x(int i10) {
        return this.f7837r[i10];
    }
}
