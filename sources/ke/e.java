package ke;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kf.k0;
import ne.r;
import ne.t;
public final class e {
    public static final LinkedHashSet f10324p = new LinkedHashSet(Arrays.asList(ne.b.class, ne.i.class, ne.h.class, ne.j.class, t.class, ne.n.class, ne.l.class));
    public static final Map f10325q;
    public CharSequence f10326a;
    public boolean d;
    public boolean h;
    public final List f10331i;
    public final oe.b f10332j;
    public final List f10333k;
    public final d f10334l;
    public final ArrayList f10336n;
    public final LinkedHashSet f10337o;
    public int f10327b = 0;
    public int f10328c = 0;
    public int e = 0;
    public int f10329f = 0;
    public int f10330g = 0;
    public final LinkedHashMap f10335m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ne.b.class, new je.a(1));
        hashMap.put(ne.i.class, new je.a(3));
        hashMap.put(ne.h.class, new je.a(2));
        hashMap.put(ne.j.class, new je.a(4));
        hashMap.put(t.class, new je.a(7));
        hashMap.put(ne.n.class, new je.a(6));
        hashMap.put(ne.l.class, new je.a(5));
        f10325q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(ArrayList arrayList, oe.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f10336n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f10337o = linkedHashSet;
        this.f10331i = arrayList;
        this.f10332j = bVar;
        this.f10333k = arrayList2;
        d dVar = new d(0);
        this.f10334l = dVar;
        arrayList3.add(dVar);
        linkedHashSet.add(dVar);
    }

    public final void a(pe.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f10336n.add(aVar);
        this.f10337o.add(aVar);
    }

    public final void b(o oVar) {
        k kVar = oVar.f10382b;
        kVar.a();
        ArrayList arrayList = kVar.f10369c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ne.m mVar = (ne.m) obj;
            r rVar = oVar.f10381a;
            mVar.g();
            ne.p pVar = (ne.p) rVar.e;
            mVar.e = pVar;
            if (pVar != null) {
                pVar.f14942f = mVar;
            }
            mVar.f14942f = rVar;
            rVar.e = mVar;
            ne.p pVar2 = (ne.p) rVar.f14940b;
            mVar.f14940b = pVar2;
            if (((ne.p) mVar.e) == null) {
                pVar2.f14941c = mVar;
            }
            String str = mVar.f14937g;
            LinkedHashMap linkedHashMap = this.f10335m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f10326a;
            CharSequence subSequence2 = charSequence.subSequence(this.f10327b + 1, charSequence.length());
            int i10 = 4 - (this.f10328c % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f10326a;
            subSequence = charSequence2.subSequence(this.f10327b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f10326a.charAt(this.f10327b) == '\t') {
            this.f10327b++;
            int i10 = this.f10328c;
            this.f10328c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f10327b++;
        this.f10328c++;
    }

    public final void e(pe.a aVar) {
        if (h() == aVar) {
            android.support.v4.media.a.u(1, this.f10336n);
        }
        if (aVar instanceof o) {
            b((o) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((pe.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.f10327b;
        int i11 = this.f10328c;
        this.h = true;
        int length = this.f10326a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f10326a.charAt(i10);
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
        this.e = i10;
        this.f10329f = i11;
        this.f10330g = i11 - this.f10328c;
    }

    public final pe.a h() {
        return (pe.a) k0.i(1, this.f10336n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ke.e.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f10329f;
        if (i10 >= i12) {
            this.f10327b = this.e;
            this.f10328c = i12;
        }
        int length = this.f10326a.length();
        while (true) {
            i11 = this.f10328c;
            if (i11 >= i10 || this.f10327b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f10327b--;
            this.f10328c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.e;
        if (i10 >= i11) {
            this.f10327b = i11;
            this.f10328c = this.f10329f;
        }
        int length = this.f10326a.length();
        while (true) {
            int i12 = this.f10327b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
