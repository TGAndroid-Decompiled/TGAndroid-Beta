package ie;

import a4.w;
import j$.util.DesugarCollections;
import j7.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import le.r;
import le.t;
public final class e {
    public static final LinkedHashSet f8897p = new LinkedHashSet(Arrays.asList(le.b.class, le.i.class, le.h.class, le.j.class, t.class, le.n.class, le.l.class));
    public static final Map f8898q;
    public CharSequence f8899a;
    public boolean d;
    public boolean h;
    public final List f8905i;
    public final me.b f8906j;
    public final List f8907k;
    public final d f8908l;
    public final ArrayList f8910n;
    public final LinkedHashSet f8911o;
    public int f8900b = 0;
    public int f8901c = 0;
    public int f8902e = 0;
    public int f8903f = 0;
    public int f8904g = 0;
    public final LinkedHashMap f8909m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(le.b.class, new he.a(1));
        hashMap.put(le.i.class, new he.a(3));
        hashMap.put(le.h.class, new he.a(2));
        hashMap.put(le.j.class, new he.a(4));
        hashMap.put(t.class, new he.a(7));
        hashMap.put(le.n.class, new he.a(6));
        hashMap.put(le.l.class, new he.a(5));
        f8898q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(ArrayList arrayList, me.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f8910n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f8911o = linkedHashSet;
        this.f8905i = arrayList;
        this.f8906j = bVar;
        this.f8907k = arrayList2;
        d dVar = new d(0);
        this.f8908l = dVar;
        arrayList3.add(dVar);
        linkedHashSet.add(dVar);
    }

    public final void a(ne.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f8910n.add(aVar);
        this.f8911o.add(aVar);
    }

    public final void b(o oVar) {
        k kVar = oVar.f8959b;
        kVar.a();
        ArrayList arrayList = kVar.f8945c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            le.m mVar = (le.m) obj;
            r rVar = oVar.f8958a;
            mVar.g();
            le.p pVar = (le.p) rVar.f15207e;
            mVar.f15207e = pVar;
            if (pVar != null) {
                pVar.f15208f = mVar;
            }
            mVar.f15208f = rVar;
            rVar.f15207e = mVar;
            le.p pVar2 = (le.p) rVar.f15205b;
            mVar.f15205b = pVar2;
            if (((le.p) mVar.f15207e) == null) {
                pVar2.f15206c = mVar;
            }
            String str = mVar.f15202g;
            LinkedHashMap linkedHashMap = this.f8909m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f8899a;
            CharSequence subSequence2 = charSequence.subSequence(this.f8900b + 1, charSequence.length());
            int i10 = 4 - (this.f8901c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f8899a;
            subSequence = charSequence2.subSequence(this.f8900b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f8899a.charAt(this.f8900b) == '\t') {
            this.f8900b++;
            int i10 = this.f8901c;
            this.f8901c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f8900b++;
        this.f8901c++;
    }

    public final void e(ne.a aVar) {
        if (h() == aVar) {
            w.t(1, this.f8910n);
        }
        if (aVar instanceof o) {
            b((o) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((ne.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.f8900b;
        int i11 = this.f8901c;
        this.h = true;
        int length = this.f8899a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f8899a.charAt(i10);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.h = false;
                    break;
                } else {
                    i10++;
                    i11++;
                }
            } else {
                i10++;
                i11 += 4 - (i11 % 4);
            }
        }
        this.f8902e = i10;
        this.f8903f = i11;
        this.f8904g = i11 - this.f8901c;
    }

    public final ne.a h() {
        return (ne.a) l1.i(1, this.f8910n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ie.e.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f8903f;
        if (i10 >= i12) {
            this.f8900b = this.f8902e;
            this.f8901c = i12;
        }
        int length = this.f8899a.length();
        while (true) {
            i11 = this.f8901c;
            if (i11 >= i10 || this.f8900b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f8900b--;
            this.f8901c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.f8902e;
        if (i10 >= i11) {
            this.f8900b = i11;
            this.f8901c = this.f8903f;
        }
        int length = this.f8899a.length();
        while (true) {
            int i12 = this.f8900b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
