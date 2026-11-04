package df;

import gf.r;
import gf.t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k2.p1;
public final class g {
    public static final LinkedHashSet f8860p = new LinkedHashSet(Arrays.asList(gf.b.class, gf.i.class, gf.h.class, gf.j.class, t.class, gf.n.class, gf.l.class));
    public static final Map f8861q;
    public CharSequence f8862a;
    public boolean d;
    public boolean h;
    public final List f8868i;
    public final hf.b f8869j;
    public final List f8870k;
    public final f f8871l;
    public final ArrayList f8873n;
    public final LinkedHashSet f8874o;
    public int f8863b = 0;
    public int f8864c = 0;
    public int f8865e = 0;
    public int f8866f = 0;
    public int f8867g = 0;
    public final LinkedHashMap f8872m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(gf.b.class, new cf.a(1));
        hashMap.put(gf.i.class, new cf.a(3));
        hashMap.put(gf.h.class, new cf.a(2));
        hashMap.put(gf.j.class, new cf.a(4));
        hashMap.put(t.class, new cf.a(7));
        hashMap.put(gf.n.class, new cf.a(6));
        hashMap.put(gf.l.class, new cf.a(5));
        f8861q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, hf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f8873n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f8874o = linkedHashSet;
        this.f8868i = arrayList;
        this.f8869j = bVar;
        this.f8870k = arrayList2;
        f fVar = new f(0);
        this.f8871l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(jf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f8873n.add(aVar);
        this.f8874o.add(aVar);
    }

    public final void b(p pVar) {
        l lVar = pVar.f8919b;
        lVar.a();
        ArrayList arrayList = lVar.f8905c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            gf.m mVar = (gf.m) obj;
            r rVar = pVar.f8918a;
            mVar.g();
            gf.p pVar2 = (gf.p) rVar.f12268e;
            mVar.f12268e = pVar2;
            if (pVar2 != null) {
                pVar2.f12269f = mVar;
            }
            mVar.f12269f = rVar;
            rVar.f12268e = mVar;
            gf.p pVar3 = (gf.p) rVar.f12266b;
            mVar.f12266b = pVar3;
            if (((gf.p) mVar.f12268e) == null) {
                pVar3.f12267c = mVar;
            }
            String str = mVar.f12263g;
            LinkedHashMap linkedHashMap = this.f8872m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f8862a;
            CharSequence subSequence2 = charSequence.subSequence(this.f8863b + 1, charSequence.length());
            int i3 = 4 - (this.f8864c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i3);
            for (int i10 = 0; i10 < i3; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f8862a;
            subSequence = charSequence2.subSequence(this.f8863b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f8862a.charAt(this.f8863b) == '\t') {
            this.f8863b++;
            int i3 = this.f8864c;
            this.f8864c = (4 - (i3 % 4)) + i3;
            return;
        }
        this.f8863b++;
        this.f8864c++;
    }

    public final void e(jf.a aVar) {
        if (h() == aVar) {
            a1.g.y(1, this.f8873n);
        }
        if (aVar instanceof p) {
            b((p) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((jf.a) list.get(size));
        }
    }

    public final void g() {
        int i3 = this.f8863b;
        int i10 = this.f8864c;
        this.h = true;
        int length = this.f8862a.length();
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = this.f8862a.charAt(i3);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.h = false;
                    break;
                } else {
                    i3++;
                    i10++;
                }
            } else {
                i3++;
                i10 += 4 - (i10 % 4);
            }
        }
        this.f8865e = i3;
        this.f8866f = i10;
        this.f8867g = i10 - this.f8864c;
    }

    public final jf.a h() {
        return (jf.a) p1.h(1, this.f8873n);
    }

    public final void i(java.lang.String r24) {
        throw new UnsupportedOperationException("Method not decompiled: df.g.i(java.lang.String):void");
    }

    public final void j(int i3) {
        int i10;
        int i11 = this.f8866f;
        if (i3 >= i11) {
            this.f8863b = this.f8865e;
            this.f8864c = i11;
        }
        int length = this.f8862a.length();
        while (true) {
            i10 = this.f8864c;
            if (i10 >= i3 || this.f8863b == length) {
                break;
            }
            d();
        }
        if (i10 > i3) {
            this.f8863b--;
            this.f8864c = i3;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i3) {
        int i10 = this.f8865e;
        if (i3 >= i10) {
            this.f8863b = i10;
            this.f8864c = this.f8866f;
        }
        int length = this.f8862a.length();
        while (true) {
            int i11 = this.f8863b;
            if (i11 >= i3 || i11 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
