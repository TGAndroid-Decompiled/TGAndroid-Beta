package ke;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kh.a2;
import ne.r;
import ne.t;
public final class e {
    public static final LinkedHashSet f10345p = new LinkedHashSet(Arrays.asList(ne.b.class, ne.i.class, ne.h.class, ne.j.class, t.class, ne.n.class, ne.l.class));
    public static final Map f10346q;
    public CharSequence f10347a;
    public boolean d;
    public boolean h;
    public final List f10352i;
    public final oe.b f10353j;
    public final List f10354k;
    public final d f10355l;
    public final ArrayList f10357n;
    public final LinkedHashSet f10358o;
    public int f10348b = 0;
    public int f10349c = 0;
    public int e = 0;
    public int f10350f = 0;
    public int f10351g = 0;
    public final LinkedHashMap f10356m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ne.b.class, new je.a(1));
        hashMap.put(ne.i.class, new je.a(3));
        hashMap.put(ne.h.class, new je.a(2));
        hashMap.put(ne.j.class, new je.a(4));
        hashMap.put(t.class, new je.a(7));
        hashMap.put(ne.n.class, new je.a(6));
        hashMap.put(ne.l.class, new je.a(5));
        f10346q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(ArrayList arrayList, oe.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f10357n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f10358o = linkedHashSet;
        this.f10352i = arrayList;
        this.f10353j = bVar;
        this.f10354k = arrayList2;
        d dVar = new d(0);
        this.f10355l = dVar;
        arrayList3.add(dVar);
        linkedHashSet.add(dVar);
    }

    public final void a(pe.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f10357n.add(aVar);
        this.f10358o.add(aVar);
    }

    public final void b(o oVar) {
        k kVar = oVar.f10403b;
        kVar.a();
        ArrayList arrayList = kVar.f10390c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ne.m mVar = (ne.m) obj;
            r rVar = oVar.f10402a;
            mVar.g();
            ne.p pVar = (ne.p) rVar.e;
            mVar.e = pVar;
            if (pVar != null) {
                pVar.f14957f = mVar;
            }
            mVar.f14957f = rVar;
            rVar.e = mVar;
            ne.p pVar2 = (ne.p) rVar.f14955b;
            mVar.f14955b = pVar2;
            if (((ne.p) mVar.e) == null) {
                pVar2.f14956c = mVar;
            }
            String str = mVar.f14952g;
            LinkedHashMap linkedHashMap = this.f10356m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f10347a;
            CharSequence subSequence2 = charSequence.subSequence(this.f10348b + 1, charSequence.length());
            int i10 = 4 - (this.f10349c % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f10347a;
            subSequence = charSequence2.subSequence(this.f10348b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f10347a.charAt(this.f10348b) == '\t') {
            this.f10348b++;
            int i10 = this.f10349c;
            this.f10349c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f10348b++;
        this.f10349c++;
    }

    public final void e(pe.a aVar) {
        if (h() == aVar) {
            android.support.v4.media.a.u(1, this.f10357n);
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
        int i10 = this.f10348b;
        int i11 = this.f10349c;
        this.h = true;
        int length = this.f10347a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f10347a.charAt(i10);
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
        this.f10350f = i11;
        this.f10351g = i11 - this.f10349c;
    }

    public final pe.a h() {
        return (pe.a) a2.i(1, this.f10357n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ke.e.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f10350f;
        if (i10 >= i12) {
            this.f10348b = this.e;
            this.f10349c = i12;
        }
        int length = this.f10347a.length();
        while (true) {
            i11 = this.f10349c;
            if (i11 >= i10 || this.f10348b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f10348b--;
            this.f10349c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.e;
        if (i10 >= i11) {
            this.f10348b = i11;
            this.f10349c = this.f10350f;
        }
        int length = this.f10347a.length();
        while (true) {
            int i12 = this.f10348b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
