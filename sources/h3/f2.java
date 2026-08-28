package h3;

import java.util.ArrayList;
import java.util.HashMap;
public final class f2 extends a {
    public final int f9403e;
    public final int f9404f;
    public final int[] h;
    public final int[] f9405n;
    public final r2[] f9406r;
    public final Object[] f9407s;
    public final HashMap v;

    public f2(ArrayList arrayList, j4.g1 g1Var) {
        super(g1Var);
        int size = arrayList.size();
        this.h = new int[size];
        this.f9405n = new int[size];
        this.f9406r = new r2[size];
        this.f9407s = new Object[size];
        this.v = new HashMap();
        int size2 = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList.get(i12);
            i12++;
            l1 l1Var = (l1) obj;
            this.f9406r[i11] = l1Var.b();
            this.f9405n[i11] = i9;
            this.h[i11] = i10;
            i9 += this.f9406r[i11].o();
            i10 += this.f9406r[i11].h();
            this.f9407s[i11] = l1Var.a();
            this.v.put(this.f9407s[i11], Integer.valueOf(i11));
            i11++;
        }
        this.f9403e = i9;
        this.f9404f = i10;
    }

    @Override
    public final int h() {
        return this.f9404f;
    }

    @Override
    public final int o() {
        return this.f9403e;
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
    public final int r(int i9) {
        return d5.f0.d(this.h, i9 + 1, false, false);
    }

    @Override
    public final int s(int i9) {
        return d5.f0.d(this.f9405n, i9 + 1, false, false);
    }

    @Override
    public final Object t(int i9) {
        return this.f9407s[i9];
    }

    @Override
    public final int u(int i9) {
        return this.h[i9];
    }

    @Override
    public final int v(int i9) {
        return this.f9405n[i9];
    }

    @Override
    public final r2 x(int i9) {
        return this.f9406r[i9];
    }
}
