package le;

import b8.hb;
import b8.jd;
import db.g0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
public class m implements je.d, b {
    public final String f18200a;
    public final e f18201b;
    public final int f18202c;
    public int d = -1;
    public final String[] f18203e;
    public final List[] f18204f;
    public final boolean[] f18205g;
    public Object h;
    public final Object f18206i;
    public final Object f18207j;
    public final Object f18208k;

    public m(String str, e eVar, int i3) {
        this.f18200a = str;
        this.f18201b = eVar;
        this.f18202c = i3;
        String[] strArr = new String[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f18203e = strArr;
        int i11 = this.f18202c;
        this.f18204f = new List[i11];
        this.f18205g = new boolean[i11];
        this.h = ed.p.f9954a;
        dd.d[] dVarArr = dd.d.f8789a;
        this.f18206i = hb.a(new od.a(this) {
            public final m f18199b;

            {
                this.f18199b = this;
            }

            @Override
            public final Object invoke() {
                boolean z10;
                boolean z11;
                int i12;
                switch (r2) {
                    case 0:
                        return this.f18199b.f18201b.b();
                    default:
                        m mVar = this.f18199b;
                        je.d[] typeParams = (je.d[]) mVar.f18207j.getValue();
                        kotlin.jvm.internal.j.e(typeParams, "typeParams");
                        int hashCode = (mVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
                        int f10 = mVar.f();
                        int i13 = 1;
                        while (true) {
                            int i14 = 0;
                            if (f10 > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                int i15 = f10 - 1;
                                int i16 = i13 * 31;
                                String a10 = mVar.i(mVar.f() - f10).a();
                                if (a10 != null) {
                                    i14 = a10.hashCode();
                                }
                                i13 = i16 + i14;
                                f10 = i15;
                            } else {
                                int f11 = mVar.f();
                                int i17 = 1;
                                while (true) {
                                    if (f11 > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        int i18 = f11 - 1;
                                        int i19 = i17 * 31;
                                        jd e10 = mVar.i(mVar.f() - f11).e();
                                        if (e10 != null) {
                                            i12 = e10.hashCode();
                                        } else {
                                            i12 = 0;
                                        }
                                        i17 = i19 + i12;
                                        f11 = i18;
                                    } else {
                                        return Integer.valueOf((((hashCode * 31) + i13) * 31) + i17);
                                    }
                                }
                            }
                        }
                }
            }
        });
        this.f18207j = hb.a(new g0(this));
        this.f18208k = hb.a(new od.a(this) {
            public final m f18199b;

            {
                this.f18199b = this;
            }

            @Override
            public final Object invoke() {
                boolean z10;
                boolean z11;
                int i12;
                switch (r2) {
                    case 0:
                        return this.f18199b.f18201b.b();
                    default:
                        m mVar = this.f18199b;
                        je.d[] typeParams = (je.d[]) mVar.f18207j.getValue();
                        kotlin.jvm.internal.j.e(typeParams, "typeParams");
                        int hashCode = (mVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
                        int f10 = mVar.f();
                        int i13 = 1;
                        while (true) {
                            int i14 = 0;
                            if (f10 > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                int i15 = f10 - 1;
                                int i16 = i13 * 31;
                                String a10 = mVar.i(mVar.f() - f10).a();
                                if (a10 != null) {
                                    i14 = a10.hashCode();
                                }
                                i13 = i16 + i14;
                                f10 = i15;
                            } else {
                                int f11 = mVar.f();
                                int i17 = 1;
                                while (true) {
                                    if (f11 > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        int i18 = f11 - 1;
                                        int i19 = i17 * 31;
                                        jd e10 = mVar.i(mVar.f() - f11).e();
                                        if (e10 != null) {
                                            i12 = e10.hashCode();
                                        } else {
                                            i12 = 0;
                                        }
                                        i17 = i19 + i12;
                                        f11 = i18;
                                    } else {
                                        return Integer.valueOf((((hashCode * 31) + i13) * 31) + i17);
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
        return this.f18200a;
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
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        Integer num = (Integer) this.h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override
    public final jd e() {
        return je.f.f16245b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                je.d dVar = (je.d) obj;
                if (this.f18200a.equals(dVar.a()) && Arrays.equals((je.d[]) this.f18207j.getValue(), (je.d[]) ((m) obj).f18207j.getValue())) {
                    int f10 = dVar.f();
                    int i3 = this.f18202c;
                    if (i3 == f10) {
                        for (int i10 = 0; i10 < i3; i10++) {
                            if (kotlin.jvm.internal.j.a(i(i10).a(), dVar.i(i10).a()) && kotlin.jvm.internal.j.a(i(i10).e(), dVar.i(i10).e())) {
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
        return this.f18202c;
    }

    @Override
    public final String g(int i3) {
        return this.f18203e[i3];
    }

    @Override
    public final List getAnnotations() {
        return ed.o.f9953a;
    }

    @Override
    public final List h(int i3) {
        List list = this.f18204f[i3];
        if (list == null) {
            return ed.o.f9953a;
        }
        return list;
    }

    public int hashCode() {
        return ((Number) this.f18208k.getValue()).intValue();
    }

    @Override
    public final je.d i(int i3) {
        return ((he.a[]) this.f18206i.getValue())[i3].d();
    }

    @Override
    public boolean isInline() {
        return false;
    }

    @Override
    public final boolean j(int i3) {
        return this.f18205g[i3];
    }

    public final void k(String str, boolean z10) {
        int i3 = this.d + 1;
        this.d = i3;
        String[] strArr = this.f18203e;
        strArr[i3] = str;
        this.f18205g[i3] = z10;
        this.f18204f[i3] = null;
        if (i3 == this.f18202c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.h = hashMap;
        }
    }

    public final String toString() {
        return ed.g.g(x7.n.a(0, this.f18202c), ", ", this.f18200a.concat("("), ")", new c1.b(this, 6), 24);
    }
}
