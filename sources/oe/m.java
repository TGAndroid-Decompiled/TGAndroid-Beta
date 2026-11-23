package oe;

import c8.x9;
import c8.yc;
import gb.g0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
public class m implements me.d, b {
    public final String f21802a;
    public final e f21803b;
    public final int f21804c;
    public int d = -1;
    public final String[] f21805e;
    public final List[] f21806f;
    public final boolean[] f21807g;
    public Object h;
    public final Object f21808i;
    public final Object f21809j;
    public final Object f21810k;

    public m(String str, e eVar, int i7) {
        this.f21802a = str;
        this.f21803b = eVar;
        this.f21804c = i7;
        String[] strArr = new String[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f21805e = strArr;
        int i11 = this.f21804c;
        this.f21806f = new List[i11];
        this.f21807g = new boolean[i11];
        this.h = hd.o.f14141a;
        gd.d[] dVarArr = gd.d.f13468a;
        this.f21808i = b7.h.a(new rd.a(this) {
            public final m f21801b;

            {
                this.f21801b = this;
            }

            @Override
            public final Object invoke() {
                boolean z10;
                boolean z11;
                int i12;
                switch (r2) {
                    case 0:
                        return this.f21801b.f21803b.c();
                    default:
                        m mVar = this.f21801b;
                        me.d[] typeParams = (me.d[]) mVar.f21809j.getValue();
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
                                        x9 e10 = mVar.i(mVar.f() - f11).e();
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
        this.f21809j = b7.h.a(new g0(this));
        this.f21810k = b7.h.a(new rd.a(this) {
            public final m f21801b;

            {
                this.f21801b = this;
            }

            @Override
            public final Object invoke() {
                boolean z10;
                boolean z11;
                int i12;
                switch (r2) {
                    case 0:
                        return this.f21801b.f21803b.c();
                    default:
                        m mVar = this.f21801b;
                        me.d[] typeParams = (me.d[]) mVar.f21809j.getValue();
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
                                        x9 e10 = mVar.i(mVar.f() - f11).e();
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
        return this.f21802a;
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
    public final x9 e() {
        return me.f.f20968b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                me.d dVar = (me.d) obj;
                if (this.f21802a.equals(dVar.a()) && Arrays.equals((me.d[]) this.f21809j.getValue(), (me.d[]) ((m) obj).f21809j.getValue())) {
                    int f10 = dVar.f();
                    int i7 = this.f21804c;
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
        return this.f21804c;
    }

    @Override
    public final String g(int i7) {
        return this.f21805e[i7];
    }

    @Override
    public final List getAnnotations() {
        return hd.n.f14140a;
    }

    @Override
    public final List h(int i7) {
        List list = this.f21806f[i7];
        if (list == null) {
            return hd.n.f14140a;
        }
        return list;
    }

    public int hashCode() {
        return ((Number) this.f21810k.getValue()).intValue();
    }

    @Override
    public final me.d i(int i7) {
        return ((ke.a[]) this.f21808i.getValue())[i7].d();
    }

    @Override
    public boolean isInline() {
        return false;
    }

    @Override
    public final boolean j(int i7) {
        return this.f21807g[i7];
    }

    public final void k(String str, boolean z10) {
        int i7 = this.d + 1;
        this.d = i7;
        String[] strArr = this.f21805e;
        strArr[i7] = str;
        this.f21807g[i7] = z10;
        this.f21806f[i7] = null;
        if (i7 == this.f21804c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.h = hashMap;
        }
    }

    public final String toString() {
        return hd.f.g(yc.a(0, this.f21804c), ", ", this.f21802a.concat("("), ")", new c1.b(this, 6), 24);
    }
}
