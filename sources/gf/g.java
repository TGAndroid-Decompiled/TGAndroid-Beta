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
    public static final LinkedHashSet f13573p = new LinkedHashSet(Arrays.asList(kf.b.class, kf.i.class, kf.h.class, kf.j.class, t.class, kf.n.class, kf.l.class));
    public static final Map f13574q;
    public CharSequence f13575a;
    public boolean d;
    public boolean h;
    public final List f13581i;
    public final lf.b f13582j;
    public final List f13583k;
    public final f f13584l;
    public final ArrayList f13586n;
    public final LinkedHashSet f13587o;
    public int f13576b = 0;
    public int f13577c = 0;
    public int f13578e = 0;
    public int f13579f = 0;
    public int f13580g = 0;
    public final LinkedHashMap f13585m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(kf.b.class, new ff.a(1));
        hashMap.put(kf.i.class, new ff.a(3));
        hashMap.put(kf.h.class, new ff.a(2));
        hashMap.put(kf.j.class, new ff.a(4));
        hashMap.put(t.class, new ff.a(7));
        hashMap.put(kf.n.class, new ff.a(6));
        hashMap.put(kf.l.class, new ff.a(5));
        f13574q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, lf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f13586n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f13587o = linkedHashSet;
        this.f13581i = arrayList;
        this.f13582j = bVar;
        this.f13583k = arrayList2;
        f fVar = new f(0);
        this.f13584l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(mf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f13586n.add(aVar);
        this.f13587o.add(aVar);
    }

    public final void b(p pVar) {
        l lVar = pVar.f13632b;
        lVar.a();
        ArrayList arrayList = lVar.f13618c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            kf.m mVar = (kf.m) obj;
            r rVar = pVar.f13631a;
            mVar.g();
            kf.p pVar2 = (kf.p) rVar.f18265e;
            mVar.f18265e = pVar2;
            if (pVar2 != null) {
                pVar2.f18266f = mVar;
            }
            mVar.f18266f = rVar;
            rVar.f18265e = mVar;
            kf.p pVar3 = (kf.p) rVar.f18263b;
            mVar.f18263b = pVar3;
            if (((kf.p) mVar.f18265e) == null) {
                pVar3.f18264c = mVar;
            }
            String str = mVar.f18260g;
            LinkedHashMap linkedHashMap = this.f13585m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f13575a;
            CharSequence subSequence2 = charSequence.subSequence(this.f13576b + 1, charSequence.length());
            int i7 = 4 - (this.f13577c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i7);
            for (int i10 = 0; i10 < i7; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f13575a;
            subSequence = charSequence2.subSequence(this.f13576b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f13575a.charAt(this.f13576b) == '\t') {
            this.f13576b++;
            int i7 = this.f13577c;
            this.f13577c = (4 - (i7 % 4)) + i7;
            return;
        }
        this.f13576b++;
        this.f13577c++;
    }

    public final void e(mf.a aVar) {
        if (h() == aVar) {
            p0.z(1, this.f13586n);
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
        int i7 = this.f13576b;
        int i10 = this.f13577c;
        this.h = true;
        int length = this.f13575a.length();
        while (true) {
            if (i7 >= length) {
                break;
            }
            char charAt = this.f13575a.charAt(i7);
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
        this.f13578e = i7;
        this.f13579f = i10;
        this.f13580g = i10 - this.f13577c;
    }

    public final mf.a h() {
        return (mf.a) i5.c.h(1, this.f13586n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: gf.g.i(java.lang.String):void");
    }

    public final void j(int i7) {
        int i10;
        int i11 = this.f13579f;
        if (i7 >= i11) {
            this.f13576b = this.f13578e;
            this.f13577c = i11;
        }
        int length = this.f13575a.length();
        while (true) {
            i10 = this.f13577c;
            if (i10 >= i7 || this.f13576b == length) {
                break;
            }
            d();
        }
        if (i10 > i7) {
            this.f13576b--;
            this.f13577c = i7;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i7) {
        int i10 = this.f13578e;
        if (i7 >= i10) {
            this.f13576b = i10;
            this.f13577c = this.f13579f;
        }
        int length = this.f13575a.length();
        while (true) {
            int i11 = this.f13576b;
            if (i11 >= i7 || i11 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
