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
    public static final LinkedHashSet f13539p = new LinkedHashSet(Arrays.asList(kf.b.class, kf.i.class, kf.h.class, kf.j.class, t.class, kf.n.class, kf.l.class));
    public static final Map f13540q;
    public CharSequence f13541a;
    public boolean d;
    public boolean h;
    public final List f13547i;
    public final lf.b f13548j;
    public final List f13549k;
    public final f f13550l;
    public final ArrayList f13552n;
    public final LinkedHashSet f13553o;
    public int f13542b = 0;
    public int f13543c = 0;
    public int f13544e = 0;
    public int f13545f = 0;
    public int f13546g = 0;
    public final LinkedHashMap f13551m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(kf.b.class, new ff.a(1));
        hashMap.put(kf.i.class, new ff.a(3));
        hashMap.put(kf.h.class, new ff.a(2));
        hashMap.put(kf.j.class, new ff.a(4));
        hashMap.put(t.class, new ff.a(7));
        hashMap.put(kf.n.class, new ff.a(6));
        hashMap.put(kf.l.class, new ff.a(5));
        f13540q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, lf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f13552n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f13553o = linkedHashSet;
        this.f13547i = arrayList;
        this.f13548j = bVar;
        this.f13549k = arrayList2;
        f fVar = new f(0);
        this.f13550l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(mf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f13552n.add(aVar);
        this.f13553o.add(aVar);
    }

    public final void b(p pVar) {
        l lVar = pVar.f13598b;
        lVar.a();
        ArrayList arrayList = lVar.f13584c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            kf.m mVar = (kf.m) obj;
            r rVar = pVar.f13597a;
            mVar.g();
            kf.p pVar2 = (kf.p) rVar.f18231e;
            mVar.f18231e = pVar2;
            if (pVar2 != null) {
                pVar2.f18232f = mVar;
            }
            mVar.f18232f = rVar;
            rVar.f18231e = mVar;
            kf.p pVar3 = (kf.p) rVar.f18229b;
            mVar.f18229b = pVar3;
            if (((kf.p) mVar.f18231e) == null) {
                pVar3.f18230c = mVar;
            }
            String str = mVar.f18226g;
            LinkedHashMap linkedHashMap = this.f13551m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f13541a;
            CharSequence subSequence2 = charSequence.subSequence(this.f13542b + 1, charSequence.length());
            int i7 = 4 - (this.f13543c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i7);
            for (int i10 = 0; i10 < i7; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f13541a;
            subSequence = charSequence2.subSequence(this.f13542b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f13541a.charAt(this.f13542b) == '\t') {
            this.f13542b++;
            int i7 = this.f13543c;
            this.f13543c = (4 - (i7 % 4)) + i7;
            return;
        }
        this.f13542b++;
        this.f13543c++;
    }

    public final void e(mf.a aVar) {
        if (h() == aVar) {
            p0.z(1, this.f13552n);
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
        int i7 = this.f13542b;
        int i10 = this.f13543c;
        this.h = true;
        int length = this.f13541a.length();
        while (true) {
            if (i7 >= length) {
                break;
            }
            char charAt = this.f13541a.charAt(i7);
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
        this.f13544e = i7;
        this.f13545f = i10;
        this.f13546g = i10 - this.f13543c;
    }

    public final mf.a h() {
        return (mf.a) i5.c.h(1, this.f13552n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: gf.g.i(java.lang.String):void");
    }

    public final void j(int i7) {
        int i10;
        int i11 = this.f13545f;
        if (i7 >= i11) {
            this.f13542b = this.f13544e;
            this.f13543c = i11;
        }
        int length = this.f13541a.length();
        while (true) {
            i10 = this.f13543c;
            if (i10 >= i7 || this.f13542b == length) {
                break;
            }
            d();
        }
        if (i10 > i7) {
            this.f13542b--;
            this.f13543c = i7;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i7) {
        int i10 = this.f13544e;
        if (i7 >= i10) {
            this.f13542b = i10;
            this.f13543c = this.f13545f;
        }
        int length = this.f13541a.length();
        while (true) {
            int i11 = this.f13542b;
            if (i11 >= i7 || i11 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
