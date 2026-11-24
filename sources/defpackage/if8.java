package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class if8 implements y6a, x81 {
    public final String a;
    public final hu4 b;
    public final byte c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final d26 i;
    public final d26 j;
    public final d26 k;

    public if8(String str, hu4 hu4Var, int i) {
        this.a = str;
        this.b = hu4Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = o34.a;
        this.i = fpe.a(new pr4(this) {
            public final if8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                boolean z;
                boolean z2;
                int i4;
                byte b = r2;
                if8 if8Var = this.b;
                switch (b) {
                    case 0:
                        return if8Var.b.a();
                    default:
                        y6a[] y6aVarArr = (y6a[]) if8Var.j.getValue();
                        y6aVarArr.getClass();
                        int hashCode = (if8Var.a().hashCode() * 31) + Arrays.hashCode(y6aVarArr);
                        int f = if8Var.f();
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
                                String a = if8Var.i(if8Var.f() - f).a();
                                if (a != null) {
                                    i6 = a.hashCode();
                                }
                                i5 = i8 + i6;
                                f = i7;
                            } else {
                                int f2 = if8Var.f();
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
                                        yve e = if8Var.i(if8Var.f() - f2).e();
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
        this.j = fpe.a(new hf8(this));
        this.k = fpe.a(new pr4(this) {
            public final if8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                boolean z;
                boolean z2;
                int i4;
                byte b = r2;
                if8 if8Var = this.b;
                switch (b) {
                    case 0:
                        return if8Var.b.a();
                    default:
                        y6a[] y6aVarArr = (y6a[]) if8Var.j.getValue();
                        y6aVarArr.getClass();
                        int hashCode = (if8Var.a().hashCode() * 31) + Arrays.hashCode(y6aVarArr);
                        int f = if8Var.f();
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
                                String a = if8Var.i(if8Var.f() - f).a();
                                if (a != null) {
                                    i6 = a.hashCode();
                                }
                                i5 = i8 + i6;
                                f = i7;
                            } else {
                                int f2 = if8Var.f();
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
                                        yve e = if8Var.i(if8Var.f() - f2).e();
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
    public final yve e() {
        return xbb.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof if8) {
                y6a y6aVar = (y6a) obj;
                if (this.a.equals(y6aVar.a()) && Arrays.equals((y6a[]) this.j.getValue(), (y6a[]) ((if8) obj).j.getValue())) {
                    int f = y6aVar.f();
                    byte b = this.c;
                    if (b == f) {
                        for (int i = 0; i < b; i++) {
                            if (rr5.a(i(i).a(), y6aVar.i(i).a()) && rr5.a(i(i).e(), y6aVar.i(i).e())) {
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
        return n34.a;
    }

    @Override
    public final List h(int i) {
        List list = this.f[i];
        if (list == null) {
            return n34.a;
        }
        return list;
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override
    public final y6a i(int i) {
        return ((cx5[]) this.i.getValue())[i].d();
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
        return km2.f(lue.a(0, this.c), ", ", this.a.concat("("), ")", new z1(this, (byte) 7), 24);
    }
}
