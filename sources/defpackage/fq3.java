package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
public final class fq3 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(il0.class, lf5.class, sa4.class, bi5.class, klb.class, y66.class, hp5.class));
    public static final Map q;
    public String a;
    public boolean d;
    public boolean h;
    public final ArrayList i;
    public final rp5 j;
    public final ArrayList k;
    public final cq3 l;
    public final ArrayList n;
    public final LinkedHashSet o;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(il0.class, new jl0((byte) 0));
        hashMap.put(lf5.class, new jl0((byte) 2));
        hashMap.put(sa4.class, new jl0((byte) 1));
        hashMap.put(bi5.class, new jl0((byte) 3));
        hashMap.put(klb.class, new jl0((byte) 8));
        hashMap.put(y66.class, new jl0((byte) 6));
        hashMap.put(hp5.class, new jl0((byte) 4));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public fq3(ArrayList arrayList, rp5 rp5Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = rp5Var;
        this.k = arrayList2;
        cq3 cq3Var = new cq3((byte) 0);
        this.l = cq3Var;
        arrayList3.add(cq3Var);
        linkedHashSet.add(cq3Var);
    }

    public final void a(x1 x1Var) {
        while (!h().b(x1Var.e())) {
            e(h());
        }
        h().e().b(x1Var.e());
        this.n.add(x1Var);
        this.o.add(x1Var);
    }

    public final void b(vw7 vw7Var) {
        f66 f66Var = vw7Var.b;
        f66Var.a();
        ArrayList arrayList = f66Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e66 e66Var = (e66) obj;
            uw7 uw7Var = vw7Var.a;
            e66Var.g();
            ui6 ui6Var = (ui6) uw7Var.e;
            e66Var.e = ui6Var;
            if (ui6Var != null) {
                ui6Var.f = e66Var;
            }
            e66Var.f = uw7Var;
            uw7Var.e = e66Var;
            ui6 ui6Var2 = (ui6) uw7Var.b;
            e66Var.b = ui6Var2;
            if (((ui6) e66Var.e) == null) {
                ui6Var2.c = e66Var;
            }
            String str = e66Var.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, e66Var);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            String str = this.a;
            CharSequence subSequence2 = str.subSequence(this.b + 1, str.length());
            int i = 4 - (this.c % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            String str2 = this.a;
            subSequence = str2.subSequence(this.b, str2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        char charAt = this.a.charAt(this.b);
        int i = this.b + 1;
        if (charAt == '\t') {
            this.b = i;
            int i2 = this.c;
            this.c = (4 - (i2 % 4)) + i2;
            return;
        }
        this.b = i;
        this.c++;
    }

    public final void e(x1 x1Var) {
        if (h() == x1Var) {
            td4.w(1, this.n);
        }
        if (x1Var instanceof vw7) {
            b((vw7) x1Var);
        }
        x1Var.d();
    }

    public final void f(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e((x1) arrayList.get(size));
        }
    }

    public final void g() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.a.charAt(i);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.h = false;
                    break;
                } else {
                    i++;
                    i2++;
                }
            } else {
                i++;
                i2 += 4 - (i2 % 4);
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public final x1 h() {
        return (x1) b10.f(1, this.n);
    }

    public final void i(java.lang.String r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fq3.i(java.lang.String):void");
    }

    public final void j(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            }
            d();
        }
        if (i2 > i) {
            this.b--;
            this.c = i;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
