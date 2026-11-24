package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
public final class vo3 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(ik0.class, nd5.class, s84.class, cg5.class, jjb.class, y46.class, hn5.class));
    public static final Map q;
    public String a;
    public boolean d;
    public boolean h;
    public final ArrayList i;
    public final rn5 j;
    public final ArrayList k;
    public final so3 l;
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
        hashMap.put(ik0.class, new jk0((byte) 0));
        hashMap.put(nd5.class, new jk0((byte) 2));
        hashMap.put(s84.class, new jk0((byte) 1));
        hashMap.put(cg5.class, new jk0((byte) 3));
        hashMap.put(jjb.class, new jk0((byte) 8));
        hashMap.put(y46.class, new jk0((byte) 6));
        hashMap.put(hn5.class, new jk0((byte) 4));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public vo3(ArrayList arrayList, rn5 rn5Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = rn5Var;
        this.k = arrayList2;
        so3 so3Var = new so3((byte) 0);
        this.l = so3Var;
        arrayList3.add(so3Var);
        linkedHashSet.add(so3Var);
    }

    public final void a(x1 x1Var) {
        while (!h().b(x1Var.e())) {
            e(h());
        }
        h().e().b(x1Var.e());
        this.n.add(x1Var);
        this.o.add(x1Var);
    }

    public final void b(uu7 uu7Var) {
        f46 f46Var = uu7Var.b;
        f46Var.a();
        ArrayList arrayList = f46Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e46 e46Var = (e46) obj;
            tu7 tu7Var = uu7Var.a;
            e46Var.g();
            tg6 tg6Var = (tg6) tu7Var.e;
            e46Var.e = tg6Var;
            if (tg6Var != null) {
                tg6Var.f = e46Var;
            }
            e46Var.f = tu7Var;
            tu7Var.e = e46Var;
            tg6 tg6Var2 = (tg6) tu7Var.b;
            e46Var.b = tg6Var2;
            if (((tg6) e46Var.e) == null) {
                tg6Var2.c = e46Var;
            }
            String str = e46Var.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, e46Var);
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
            tb4.v(1, this.n);
        }
        if (x1Var instanceof uu7) {
            b((uu7) x1Var);
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
        return (x1) b00.f(1, this.n);
    }

    public final void i(java.lang.String r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo3.i(java.lang.String):void");
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
