package ke;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import ne.r;
import ne.t;
public final class e {
    public static final LinkedHashSet f11117p = new LinkedHashSet(Arrays.asList(ne.b.class, ne.i.class, ne.h.class, ne.j.class, t.class, ne.n.class, ne.l.class));
    public static final Map f11118q;
    public CharSequence f11119a;
    public boolean d;
    public boolean h;
    public final List f11125i;
    public final oe.b f11126j;
    public final List f11127k;
    public final d f11128l;
    public final ArrayList f11130n;
    public final LinkedHashSet f11131o;
    public int f11120b = 0;
    public int f11121c = 0;
    public int f11122e = 0;
    public int f11123f = 0;
    public int f11124g = 0;
    public final LinkedHashMap f11129m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ne.b.class, new je.a(1));
        hashMap.put(ne.i.class, new je.a(3));
        hashMap.put(ne.h.class, new je.a(2));
        hashMap.put(ne.j.class, new je.a(4));
        hashMap.put(t.class, new je.a(7));
        hashMap.put(ne.n.class, new je.a(6));
        hashMap.put(ne.l.class, new je.a(5));
        f11118q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(ArrayList arrayList, oe.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f11130n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f11131o = linkedHashSet;
        this.f11125i = arrayList;
        this.f11126j = bVar;
        this.f11127k = arrayList2;
        d dVar = new d(0);
        this.f11128l = dVar;
        arrayList3.add(dVar);
        linkedHashSet.add(dVar);
    }

    public final void a(pe.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f11130n.add(aVar);
        this.f11131o.add(aVar);
    }

    public final void b(o oVar) {
        k kVar = oVar.f11179b;
        kVar.a();
        ArrayList arrayList = kVar.f11165c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ne.m mVar = (ne.m) obj;
            r rVar = oVar.f11178a;
            mVar.g();
            ne.p pVar = (ne.p) rVar.f15978e;
            mVar.f15978e = pVar;
            if (pVar != null) {
                pVar.f15979f = mVar;
            }
            mVar.f15979f = rVar;
            rVar.f15978e = mVar;
            ne.p pVar2 = (ne.p) rVar.f15976b;
            mVar.f15976b = pVar2;
            if (((ne.p) mVar.f15978e) == null) {
                pVar2.f15977c = mVar;
            }
            String str = mVar.f15973g;
            LinkedHashMap linkedHashMap = this.f11129m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f11119a;
            CharSequence subSequence2 = charSequence.subSequence(this.f11120b + 1, charSequence.length());
            int i10 = 4 - (this.f11121c % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f11119a;
            subSequence = charSequence2.subSequence(this.f11120b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f11119a.charAt(this.f11120b) == '\t') {
            this.f11120b++;
            int i10 = this.f11121c;
            this.f11121c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f11120b++;
        this.f11121c++;
    }

    public final void e(pe.a aVar) {
        if (h() == aVar) {
            android.support.v4.media.a.u(1, this.f11130n);
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
        int i10 = this.f11120b;
        int i11 = this.f11121c;
        this.h = true;
        int length = this.f11119a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f11119a.charAt(i10);
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
        this.f11122e = i10;
        this.f11123f = i11;
        this.f11124g = i11 - this.f11121c;
    }

    public final pe.a h() {
        return (pe.a) l.d.i(1, this.f11130n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ke.e.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f11123f;
        if (i10 >= i12) {
            this.f11120b = this.f11122e;
            this.f11121c = i12;
        }
        int length = this.f11119a.length();
        while (true) {
            i11 = this.f11121c;
            if (i11 >= i10 || this.f11120b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f11120b--;
            this.f11121c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.f11122e;
        if (i10 >= i11) {
            this.f11120b = i11;
            this.f11121c = this.f11123f;
        }
        int length = this.f11119a.length();
        while (true) {
            int i12 = this.f11120b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
