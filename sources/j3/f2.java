package j3;

import java.util.ArrayList;
import java.util.HashMap;
public final class f2 extends a {
    public final int f10441e;
    public final int f10442f;
    public final int[] h;
    public final int[] f10443n;
    public final r2[] f10444r;
    public final Object[] f10445s;
    public final HashMap v;

    public f2(ArrayList arrayList, l4.h1 h1Var) {
        super(h1Var);
        int size = arrayList.size();
        this.h = new int[size];
        this.f10443n = new int[size];
        this.f10444r = new r2[size];
        this.f10445s = new Object[size];
        this.v = new HashMap();
        int size2 = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList.get(i13);
            i13++;
            l1 l1Var = (l1) obj;
            this.f10444r[i12] = l1Var.b();
            this.f10443n[i12] = i10;
            this.h[i12] = i11;
            i10 += this.f10444r[i12].o();
            i11 += this.f10444r[i12].h();
            this.f10445s[i12] = l1Var.a();
            this.v.put(this.f10445s[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f10441e = i10;
        this.f10442f = i11;
    }

    @Override
    public final int h() {
        return this.f10442f;
    }

    @Override
    public final int o() {
        return this.f10441e;
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
        return f5.d0.d(this.h, i10 + 1, false, false);
    }

    @Override
    public final int s(int i10) {
        return f5.d0.d(this.f10443n, i10 + 1, false, false);
    }

    @Override
    public final Object t(int i10) {
        return this.f10445s[i10];
    }

    @Override
    public final int u(int i10) {
        return this.h[i10];
    }

    @Override
    public final int v(int i10) {
        return this.f10443n[i10];
    }

    @Override
    public final r2 x(int i10) {
        return this.f10444r[i10];
    }
}
