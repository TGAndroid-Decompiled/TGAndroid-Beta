package gf;

import a8.p0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kf.r;
import kf.t;
public final class g {
    public static final LinkedHashSet f13576p = new LinkedHashSet(Arrays.asList(kf.b.class, kf.i.class, kf.h.class, kf.j.class, t.class, kf.n.class, kf.l.class));
    public static final Map f13577q;
    public CharSequence f13578a;
    public boolean d;
    public boolean h;
    public final List f13584i;
    public final lf.b f13585j;
    public final List f13586k;
    public final f f13587l;
    public final ArrayList f13589n;
    public final LinkedHashSet f13590o;
    public int f13579b = 0;
    public int f13580c = 0;
    public int f13581e = 0;
    public int f13582f = 0;
    public int f13583g = 0;
    public final LinkedHashMap f13588m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(kf.b.class, new ff.a(1));
        hashMap.put(kf.i.class, new ff.a(3));
        hashMap.put(kf.h.class, new ff.a(2));
        hashMap.put(kf.j.class, new ff.a(4));
        hashMap.put(t.class, new ff.a(7));
        hashMap.put(kf.n.class, new ff.a(6));
        hashMap.put(kf.l.class, new ff.a(5));
        f13577q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, lf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f13589n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f13590o = linkedHashSet;
        this.f13584i = arrayList;
        this.f13585j = bVar;
        this.f13586k = arrayList2;
        f fVar = new f(0);
        this.f13587l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(mf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f13589n.add(aVar);
        this.f13590o.add(aVar);
    }

    public final void b(p pVar) {
        l lVar = pVar.f13635b;
        lVar.a();
        ArrayList arrayList = lVar.f13621c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            kf.m mVar = (kf.m) obj;
            r rVar = pVar.f13634a;
            mVar.g();
            kf.p pVar2 = (kf.p) rVar.f18268e;
            mVar.f18268e = pVar2;
            if (pVar2 != null) {
                pVar2.f18269f = mVar;
            }
            mVar.f18269f = rVar;
            rVar.f18268e = mVar;
            kf.p pVar3 = (kf.p) rVar.f18266b;
            mVar.f18266b = pVar3;
            if (((kf.p) mVar.f18268e) == null) {
                pVar3.f18267c = mVar;
            }
            String str = mVar.f18263g;
            LinkedHashMap linkedHashMap = this.f13588m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f13578a;
            CharSequence subSequence2 = charSequence.subSequence(this.f13579b + 1, charSequence.length());
            int i7 = 4 - (this.f13580c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i7);
            for (int i10 = 0; i10 < i7; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f13578a;
            subSequence = charSequence2.subSequence(this.f13579b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f13578a.charAt(this.f13579b) == '\t') {
            this.f13579b++;
            int i7 = this.f13580c;
            this.f13580c = (4 - (i7 % 4)) + i7;
            return;
        }
        this.f13579b++;
        this.f13580c++;
    }

    public final void e(mf.a aVar) {
        if (h() == aVar) {
            p0.z(1, this.f13589n);
        }
        if (aVar instanceof p) {
            b((p) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((mf.a) list.get(size));
        }
    }

    public final void g() {
        int i7 = this.f13579b;
        int i10 = this.f13580c;
        this.h = true;
        int length = this.f13578a.length();
        while (true) {
            if (i7 >= length) {
                break;
            }
            char charAt = this.f13578a.charAt(i7);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.h = false;
                    break;
                } else {
                    i7++;
                    i10++;
                }
            } else {
                i7++;
                i10 += 4 - (i10 % 4);
            }
        }
        this.f13581e = i7;
        this.f13582f = i10;
        this.f13583g = i10 - this.f13580c;
    }

    public final mf.a h() {
        return (mf.a) i5.c.h(1, this.f13589n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: gf.g.i(java.lang.String):void");
    }

    public final void j(int i7) {
        int i10;
        int i11 = this.f13582f;
        if (i7 >= i11) {
            this.f13579b = this.f13581e;
            this.f13580c = i11;
        }
        int length = this.f13578a.length();
        while (true) {
            i10 = this.f13580c;
            if (i10 >= i7 || this.f13579b == length) {
                break;
            }
            d();
        }
        if (i10 > i7) {
            this.f13579b--;
            this.f13580c = i7;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i7) {
        int i10 = this.f13581e;
        if (i7 >= i10) {
            this.f13579b = i10;
            this.f13580c = this.f13582f;
        }
        int length = this.f13578a.length();
        while (true) {
            int i11 = this.f13579b;
            if (i11 >= i7 || i11 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
