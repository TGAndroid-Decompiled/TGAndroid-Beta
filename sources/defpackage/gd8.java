package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class gd8 implements w4a, p71 {
    public final String a;
    public final gs4 b;
    public final byte c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final d06 i;
    public final d06 j;
    public final d06 k;

    public gd8(String str, gs4 gs4Var, int i) {
        this.a = str;
        this.b = gs4Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = d24.a;
        this.i = cne.a(new op4(this) {
            public final gd8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                boolean z;
                boolean z2;
                int i4;
                byte b = r2;
                gd8 gd8Var = this.b;
                switch (b) {
                    case 0:
                        return gd8Var.b.a();
                    default:
                        w4a[] w4aVarArr = (w4a[]) gd8Var.j.getValue();
                        w4aVarArr.getClass();
                        int hashCode = (gd8Var.a().hashCode() * 31) + Arrays.hashCode(w4aVarArr);
                        int f = gd8Var.f();
                        int i5 = 1;
                        while (true) {
                            int i6 = 0;
                            if (f > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                int i7 = f - 1;
                                int i8 = i5 * 31;
                                String a = gd8Var.i(gd8Var.f() - f).a();
                                if (a != null) {
                                    i6 = a.hashCode();
                                }
                                i5 = i8 + i6;
                                f = i7;
                            } else {
                                int f2 = gd8Var.f();
                                int i9 = 1;
                                while (true) {
                                    if (f2 > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        int i10 = f2 - 1;
                                        int i11 = i9 * 31;
                                        vte e = gd8Var.i(gd8Var.f() - f2).e();
                                        if (e != null) {
                                            i4 = e.hashCode();
                                        } else {
                                            i4 = 0;
                                        }
                                        i9 = i11 + i4;
                                        f2 = i10;
                                    } else {
                                        return Integer.valueOf((((hashCode * 31) + i5) * 31) + i9);
                                    }
                                }
                            }
                        }
                }
            }
        });
        this.j = cne.a(new fd8(this));
        this.k = cne.a(new op4(this) {
            public final gd8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                boolean z;
                boolean z2;
                int i4;
                byte b = r2;
                gd8 gd8Var = this.b;
                switch (b) {
                    case 0:
                        return gd8Var.b.a();
                    default:
                        w4a[] w4aVarArr = (w4a[]) gd8Var.j.getValue();
                        w4aVarArr.getClass();
                        int hashCode = (gd8Var.a().hashCode() * 31) + Arrays.hashCode(w4aVarArr);
                        int f = gd8Var.f();
                        int i5 = 1;
                        while (true) {
                            int i6 = 0;
                            if (f > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                int i7 = f - 1;
                                int i8 = i5 * 31;
                                String a = gd8Var.i(gd8Var.f() - f).a();
                                if (a != null) {
                                    i6 = a.hashCode();
                                }
                                i5 = i8 + i6;
                                f = i7;
                            } else {
                                int f2 = gd8Var.f();
                                int i9 = 1;
                                while (true) {
                                    if (f2 > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        int i10 = f2 - 1;
                                        int i11 = i9 * 31;
                                        vte e = gd8Var.i(gd8Var.f() - f2).e();
                                        if (e != null) {
                                            i4 = e.hashCode();
                                        } else {
                                            i4 = 0;
                                        }
                                        i9 = i11 + i4;
                                        f2 = i10;
                                    } else {
                                        return Integer.valueOf((((hashCode * 31) + i5) * 31) + i9);
                                    }
                                }
                            }
                        }
                }
            }
        });
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public final Set b() {
        return this.h.keySet();
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override
    public final vte e() {
        return v9b.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gd8) {
                w4a w4aVar = (w4a) obj;
                if (this.a.equals(w4aVar.a()) && Arrays.equals((w4a[]) this.j.getValue(), (w4a[]) ((gd8) obj).j.getValue())) {
                    int f = w4aVar.f();
                    byte b = this.c;
                    if (b == f) {
                        for (int i = 0; i < b; i++) {
                            if (rp5.a(i(i).a(), w4aVar.i(i).a()) && rp5.a(i(i).e(), w4aVar.i(i).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int f() {
        return this.c;
    }

    @Override
    public final String g(int i) {
        return this.e[i];
    }

    @Override
    public final List getAnnotations() {
        return c24.a;
    }

    @Override
    public final List h(int i) {
        List list = this.f[i];
        if (list == null) {
            return c24.a;
        }
        return list;
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override
    public final w4a i(int i) {
        return ((cv5[]) this.i.getValue())[i].d();
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public final String toString() {
        return yk2.f(ise.a(0, this.c), ", ", this.a.concat("("), ")", new z1(this, (byte) 7), 24);
    }
}
