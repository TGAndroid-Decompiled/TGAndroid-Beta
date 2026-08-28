package fe;

import ie.r;
import ie.t;
import j$.util.DesugarCollections;
import j3.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public final class e {
    public static final LinkedHashSet f6060p = new LinkedHashSet(Arrays.asList(ie.b.class, ie.i.class, ie.h.class, ie.j.class, t.class, ie.n.class, ie.l.class));
    public static final Map f6061q;
    public CharSequence f6062a;
    public boolean d;
    public boolean h;
    public final List f6068i;
    public final je.b f6069j;
    public final List f6070k;
    public final d f6071l;
    public final ArrayList f6073n;
    public final LinkedHashSet f6074o;
    public int f6063b = 0;
    public int f6064c = 0;
    public int f6065e = 0;
    public int f6066f = 0;
    public int f6067g = 0;
    public final LinkedHashMap f6072m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ie.b.class, new ee.a(1));
        hashMap.put(ie.i.class, new ee.a(3));
        hashMap.put(ie.h.class, new ee.a(2));
        hashMap.put(ie.j.class, new ee.a(4));
        hashMap.put(t.class, new ee.a(7));
        hashMap.put(ie.n.class, new ee.a(6));
        hashMap.put(ie.l.class, new ee.a(5));
        f6061q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(ArrayList arrayList, je.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f6073n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f6074o = linkedHashSet;
        this.f6068i = arrayList;
        this.f6069j = bVar;
        this.f6070k = arrayList2;
        d dVar = new d(0);
        this.f6071l = dVar;
        arrayList3.add(dVar);
        linkedHashSet.add(dVar);
    }

    public final void a(ke.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f6073n.add(aVar);
        this.f6074o.add(aVar);
    }

    public final void b(o oVar) {
        k kVar = oVar.f6122b;
        kVar.a();
        ArrayList arrayList = kVar.f6108c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ie.m mVar = (ie.m) obj;
            r rVar = oVar.f6121a;
            mVar.g();
            ie.p pVar = (ie.p) rVar.f11124e;
            mVar.f11124e = pVar;
            if (pVar != null) {
                pVar.f11125f = mVar;
            }
            mVar.f11125f = rVar;
            rVar.f11124e = mVar;
            ie.p pVar2 = (ie.p) rVar.f11122b;
            mVar.f11122b = pVar2;
            if (((ie.p) mVar.f11124e) == null) {
                pVar2.f11123c = mVar;
            }
            String str = mVar.f11119g;
            LinkedHashMap linkedHashMap = this.f6072m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f6062a;
            CharSequence subSequence2 = charSequence.subSequence(this.f6063b + 1, charSequence.length());
            int i9 = 4 - (this.f6064c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i9);
            for (int i10 = 0; i10 < i9; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f6062a;
            subSequence = charSequence2.subSequence(this.f6063b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f6062a.charAt(this.f6063b) == '\t') {
            this.f6063b++;
            int i9 = this.f6064c;
            this.f6064c = (4 - (i9 % 4)) + i9;
            return;
        }
        this.f6063b++;
        this.f6064c++;
    }

    public final void e(ke.a aVar) {
        if (h() == aVar) {
            aa.d.u(1, this.f6073n);
        }
        if (aVar instanceof o) {
            b((o) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((ke.a) list.get(size));
        }
    }

    public final void g() {
        int i9 = this.f6063b;
        int i10 = this.f6064c;
        this.h = true;
        int length = this.f6062a.length();
        while (true) {
            if (i9 >= length) {
                break;
            }
            char charAt = this.f6062a.charAt(i9);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.h = false;
                    break;
                } else {
                    i9++;
                    i10++;
                }
            } else {
                i9++;
                i10 += 4 - (i10 % 4);
            }
        }
        this.f6065e = i9;
        this.f6066f = i10;
        this.f6067g = i10 - this.f6064c;
    }

    public final ke.a h() {
        return (ke.a) r0.j(1, this.f6073n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: fe.e.i(java.lang.String):void");
    }

    public final void j(int i9) {
        int i10;
        int i11 = this.f6066f;
        if (i9 >= i11) {
            this.f6063b = this.f6065e;
            this.f6064c = i11;
        }
        int length = this.f6062a.length();
        while (true) {
            i10 = this.f6064c;
            if (i10 >= i9 || this.f6063b == length) {
                break;
            }
            d();
        }
        if (i10 > i9) {
            this.f6063b--;
            this.f6064c = i9;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i9) {
        int i10 = this.f6065e;
        if (i9 >= i10) {
            this.f6063b = i10;
            this.f6064c = this.f6066f;
        }
        int length = this.f6062a.length();
        while (true) {
            int i11 = this.f6063b;
            if (i11 >= i9 || i11 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
