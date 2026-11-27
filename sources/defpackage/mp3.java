package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
public final class mp3 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(jk0.class, of5.class, oa4.class, ei5.class, inb.class, c76.class, kp5.class));
    public static final Map q;
    public String a;
    public boolean d;
    public boolean h;
    public final ArrayList i;
    public final up5 j;
    public final ArrayList k;
    public final jp3 l;
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
        hashMap.put(jk0.class, new kk0((byte) 0));
        hashMap.put(of5.class, new kk0((byte) 2));
        hashMap.put(oa4.class, new kk0((byte) 1));
        hashMap.put(ei5.class, new kk0((byte) 3));
        hashMap.put(inb.class, new kk0((byte) 8));
        hashMap.put(c76.class, new kk0((byte) 6));
        hashMap.put(kp5.class, new kk0((byte) 4));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public mp3(ArrayList arrayList, up5 up5Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = up5Var;
        this.k = arrayList2;
        jp3 jp3Var = new jp3((byte) 0);
        this.l = jp3Var;
        arrayList3.add(jp3Var);
        linkedHashSet.add(jp3Var);
    }

    public final void a(y1 y1Var) {
        while (!h().b(y1Var.e())) {
            e(h());
        }
        h().e().b(y1Var.e());
        this.n.add(y1Var);
        this.o.add(y1Var);
    }

    public final void b(by7 by7Var) {
        j66 j66Var = by7Var.b;
        j66Var.a();
        ArrayList arrayList = j66Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i66 i66Var = (i66) obj;
            ay7 ay7Var = by7Var.a;
            i66Var.g();
            yi6 yi6Var = (yi6) ay7Var.e;
            i66Var.e = yi6Var;
            if (yi6Var != null) {
                yi6Var.f = i66Var;
            }
            i66Var.f = ay7Var;
            ay7Var.e = i66Var;
            yi6 yi6Var2 = (yi6) ay7Var.b;
            i66Var.b = yi6Var2;
            if (((yi6) i66Var.e) == null) {
                yi6Var2.c = i66Var;
            }
            String str = i66Var.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, i66Var);
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

    public final void e(y1 y1Var) {
        if (h() == y1Var) {
            qd4.v(1, this.n);
        }
        if (y1Var instanceof by7) {
            b((by7) y1Var);
        }
        y1Var.d();
    }

    public final void f(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e((y1) arrayList.get(size));
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

    public final y1 h() {
        return (y1) c00.g(1, this.n);
    }

    public final void i(java.lang.String r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp3.i(java.lang.String):void");
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
