package oe;

import a8.ab;
import c8.uc;
import c8.v9;
import gb.h0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
public class m implements me.d, b {
    public final String f20919a;
    public final e f20920b;
    public final int f20921c;
    public int d = -1;
    public final String[] f20922e;
    public final List[] f20923f;
    public final boolean[] f20924g;
    public Object h;
    public final Object f20925i;
    public final Object f20926j;
    public final Object f20927k;

    public m(String str, e eVar, int i7) {
        this.f20919a = str;
        this.f20920b = eVar;
        this.f20921c = i7;
        String[] strArr = new String[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f20922e = strArr;
        int i11 = this.f20921c;
        this.f20923f = new List[i11];
        this.f20924g = new boolean[i11];
        this.h = hd.o.f14475a;
        gd.d[] dVarArr = gd.d.f13817a;
        this.f20925i = ab.a(new rd.a(this) {
            public final m f20918b;

            {
                this.f20918b = this;
            }

            @Override
            public final Object invoke() {
                boolean z9;
                boolean z10;
                int i12;
                switch (r2) {
                    case 0:
                        return this.f20918b.f20920b.c();
                    default:
                        m mVar = this.f20918b;
                        me.d[] typeParams = (me.d[]) mVar.f20926j.getValue();
                        kotlin.jvm.internal.j.e(typeParams, "typeParams");
                        int hashCode = (mVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
                        int f10 = mVar.f();
                        int i13 = 1;
                        while (true) {
                            int i14 = 0;
                            if (f10 > 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
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
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        int i18 = f11 - 1;
                                        int i19 = i17 * 31;
                                        v9 e10 = mVar.i(mVar.f() - f11).e();
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
        this.f20926j = ab.a(new h0(this));
        this.f20927k = ab.a(new rd.a(this) {
            public final m f20918b;

            {
                this.f20918b = this;
            }

            @Override
            public final Object invoke() {
                boolean z9;
                boolean z10;
                int i12;
                switch (r2) {
                    case 0:
                        return this.f20918b.f20920b.c();
                    default:
                        m mVar = this.f20918b;
                        me.d[] typeParams = (me.d[]) mVar.f20926j.getValue();
                        kotlin.jvm.internal.j.e(typeParams, "typeParams");
                        int hashCode = (mVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
                        int f10 = mVar.f();
                        int i13 = 1;
                        while (true) {
                            int i14 = 0;
                            if (f10 > 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
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
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        int i18 = f11 - 1;
                                        int i19 = i17 * 31;
                                        v9 e10 = mVar.i(mVar.f() - f11).e();
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
        return this.f20919a;
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
    public final v9 e() {
        return me.f.f20010b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                me.d dVar = (me.d) obj;
                if (this.f20919a.equals(dVar.a()) && Arrays.equals((me.d[]) this.f20926j.getValue(), (me.d[]) ((m) obj).f20926j.getValue())) {
                    int f10 = dVar.f();
                    int i7 = this.f20921c;
                    if (i7 == f10) {
                        for (int i10 = 0; i10 < i7; i10++) {
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
        return this.f20921c;
    }

    @Override
    public final String g(int i7) {
        return this.f20922e[i7];
    }

    @Override
    public final List getAnnotations() {
        return hd.n.f14474a;
    }

    @Override
    public final List h(int i7) {
        List list = this.f20923f[i7];
        if (list == null) {
            return hd.n.f14474a;
        }
        return list;
    }

    public int hashCode() {
        return ((Number) this.f20927k.getValue()).intValue();
    }

    @Override
    public final me.d i(int i7) {
        return ((ke.a[]) this.f20925i.getValue())[i7].d();
    }

    @Override
    public boolean isInline() {
        return false;
    }

    @Override
    public final boolean j(int i7) {
        return this.f20924g[i7];
    }

    public final void k(String str, boolean z9) {
        int i7 = this.d + 1;
        this.d = i7;
        String[] strArr = this.f20922e;
        strArr[i7] = str;
        this.f20924g[i7] = z9;
        this.f20923f[i7] = null;
        if (i7 == this.f20921c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.h = hashMap;
        }
    }

    public final String toString() {
        return hd.f.g(uc.a(0, this.f20921c), ", ", this.f20919a.concat("("), ")", new c1.b(this, 6), 24);
    }
}
