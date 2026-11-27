package defpackage;

import android.util.Pair;
import java.util.HashMap;
public final class rg8 extends asb {
    public static final int n = 0;
    public final int e;
    public final pka f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final asb[] k;
    public final Object[] l;
    public final HashMap m;

    public rg8(asb[] asbVarArr, Object[] objArr, pka pkaVar) {
        this.f = pkaVar;
        this.e = pkaVar.c();
        int length = asbVarArr.length;
        this.k = asbVarArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = asbVarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            asb asbVar = asbVarArr[i];
            this.k[i4] = asbVar;
            this.j[i4] = i2;
            this.i[i4] = i3;
            i2 += asbVar.o();
            i3 += this.k[i4].h();
            this.m.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.g = i2;
        this.h = i3;
    }

    @Override
    public final int a(boolean z) {
        if (this.e == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.f.b;
            if (iArr.length > 0) {
                i = iArr[0];
            } else {
                i = -1;
            }
        }
        while (x(i).p()) {
            i = w(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return x(i).a(z) + v(i);
    }

    @Override
    public final int b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q = q(obj2);
        if (q == -1 || (b = x(q).b(obj3)) == -1) {
            return -1;
        }
        return u(q) + b;
    }

    @Override
    public final int c(boolean z) {
        int i;
        int i2 = this.e;
        if (i2 == 0) {
            return -1;
        }
        pka pkaVar = this.f;
        if (z) {
            int[] iArr = pkaVar.b;
            if (iArr.length > 0) {
                i = iArr[iArr.length - 1];
            } else {
                i = -1;
            }
        } else {
            i = i2 - 1;
        }
        while (x(i).p()) {
            if (z) {
                i = pkaVar.d(i);
                continue;
            } else if (i > 0) {
                i--;
                continue;
            } else {
                i = -1;
                continue;
            }
            if (i == -1) {
                return -1;
            }
        }
        return x(i).c(z) + v(i);
    }

    @Override
    public final int e(int i, int i2, boolean z) {
        int i3;
        int s = s(i);
        int v = v(s);
        asb x = x(s);
        int i4 = i - v;
        if (i2 == 2) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        int e = x.e(i4, i3, z);
        if (e != -1) {
            return v + e;
        }
        int w = w(s, z);
        while (w != -1) {
            if (x(w).p()) {
                w = w(w, z);
            } else {
                return x(w).a(z) + v(w);
            }
        }
        if (i2 != 2) {
            return -1;
        }
        return a(z);
    }

    @Override
    public final xrb f(int i, xrb xrbVar, boolean z) {
        int r = r(i);
        int v = v(r);
        x(r).f(i - u(r), xrbVar, z);
        xrbVar.c += v;
        if (z) {
            Object t = t(r);
            Object obj = xrbVar.b;
            obj.getClass();
            xrbVar.b = Pair.create(t, obj);
        }
        return xrbVar;
    }

    @Override
    public final xrb g(Object obj, xrb xrbVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q = q(obj2);
        int v = v(q);
        x(q).g(obj3, xrbVar);
        xrbVar.c += v;
        xrbVar.b = obj;
        return xrbVar;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int k(int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg8.k(int, int, boolean):int");
    }

    @Override
    public final Object l(int i) {
        int r = r(i);
        return Pair.create(t(r), x(r).l(i - u(r)));
    }

    @Override
    public final zrb m(int i, zrb zrbVar, long j) {
        int s = s(i);
        int v = v(s);
        int u = u(s);
        x(s).m(i - v, zrbVar, j);
        Object t = t(s);
        Object obj = zrb.p;
        Object obj2 = zrbVar.a;
        if (obj != obj2) {
            t = Pair.create(t, obj2);
        }
        zrbVar.a = t;
        zrbVar.m += u;
        zrbVar.n += u;
        return zrbVar;
    }

    @Override
    public final int o() {
        return this.g;
    }

    public final int q(Object obj) {
        Integer num = (Integer) this.m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int r(int i) {
        return gcc.e(this.i, i + 1, false, false);
    }

    public final int s(int i) {
        return gcc.e(this.j, i + 1, false, false);
    }

    public final Object t(int i) {
        return this.l[i];
    }

    public final int u(int i) {
        return this.i[i];
    }

    public final int v(int i) {
        return this.j[i];
    }

    public final int w(int i, boolean z) {
        if (z) {
            pka pkaVar = this.f;
            int i2 = pkaVar.c[i] + 1;
            int[] iArr = pkaVar.b;
            if (i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        } else if (i >= this.e - 1) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final asb x(int i) {
        return this.k[i];
    }

    public rg8(java.util.ArrayList r8, defpackage.pka r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg8.<init>(java.util.ArrayList, pka):void");
    }
}
