package af;

import df.t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public final class h {
    public static final LinkedHashSet f565p = new LinkedHashSet(Arrays.asList(df.b.class, df.i.class, df.h.class, df.j.class, t.class, df.n.class, df.l.class));
    public static final Map f566q;
    public CharSequence f567a;
    public boolean d;
    public boolean h;
    public final List f572i;
    public final ef.b f573j;
    public final List f574k;
    public final g f575l;
    public final ArrayList f577n;
    public final LinkedHashSet f578o;
    public int f568b = 0;
    public int f569c = 0;
    public int e = 0;
    public int f570f = 0;
    public int f571g = 0;
    public final LinkedHashMap f576m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(df.b.class, new b(0));
        hashMap.put(df.i.class, new b(2));
        hashMap.put(df.h.class, new b(1));
        hashMap.put(df.j.class, new b(3));
        hashMap.put(t.class, new b(6));
        hashMap.put(df.n.class, new b(5));
        hashMap.put(df.l.class, new b(4));
        f566q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public h(ArrayList arrayList, ef.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f577n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f578o = linkedHashSet;
        this.f572i = arrayList;
        this.f573j = bVar;
        this.f574k = arrayList2;
        g gVar = new g(0);
        this.f575l = gVar;
        arrayList3.add(gVar);
        linkedHashSet.add(gVar);
    }

    public final void a(ff.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f577n.add(aVar);
        this.f578o.add(aVar);
    }

    public final void b(r rVar) {
        n nVar = rVar.f623b;
        nVar.a();
        ArrayList arrayList = nVar.f610c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            df.m mVar = (df.m) obj;
            df.r rVar2 = rVar.f622a;
            mVar.g();
            df.p pVar = (df.p) rVar2.e;
            mVar.e = pVar;
            if (pVar != null) {
                pVar.f6530f = mVar;
            }
            mVar.f6530f = rVar2;
            rVar2.e = mVar;
            df.p pVar2 = (df.p) rVar2.f6528b;
            mVar.f6528b = pVar2;
            if (((df.p) mVar.e) == null) {
                pVar2.f6529c = mVar;
            }
            String str = mVar.f6525g;
            LinkedHashMap linkedHashMap = this.f576m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f567a;
            CharSequence subSequence2 = charSequence.subSequence(this.f568b + 1, charSequence.length());
            int i10 = 4 - (this.f569c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f567a;
            subSequence = charSequence2.subSequence(this.f568b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f567a.charAt(this.f568b) == '\t') {
            this.f568b++;
            int i10 = this.f569c;
            this.f569c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f568b++;
        this.f569c++;
    }

    public final void e(ff.a aVar) {
        if (h() == aVar) {
            a1.g.y(1, this.f577n);
        }
        if (aVar instanceof r) {
            b((r) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((ff.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.f568b;
        int i11 = this.f569c;
        this.h = true;
        int length = this.f567a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f567a.charAt(i10);
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
        this.f570f = i11;
        this.f571g = i11 - this.f569c;
    }

    public final ff.a h() {
        return (ff.a) i2.d.g(1, this.f577n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: af.h.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f570f;
        if (i10 >= i12) {
            this.f568b = this.e;
            this.f569c = i12;
        }
        int length = this.f567a.length();
        while (true) {
            i11 = this.f569c;
            if (i11 >= i10 || this.f568b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f568b--;
            this.f569c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.e;
        if (i10 >= i11) {
            this.f568b = i11;
            this.f569c = this.f570f;
        }
        int length = this.f567a.length();
        while (true) {
            int i12 = this.f568b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
