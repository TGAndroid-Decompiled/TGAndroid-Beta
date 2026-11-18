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
    public static final LinkedHashSet f13547p = new LinkedHashSet(Arrays.asList(kf.b.class, kf.i.class, kf.h.class, kf.j.class, t.class, kf.n.class, kf.l.class));
    public static final Map f13548q;
    public CharSequence f13549a;
    public boolean d;
    public boolean h;
    public final List f13555i;
    public final lf.b f13556j;
    public final List f13557k;
    public final f f13558l;
    public final ArrayList f13560n;
    public final LinkedHashSet f13561o;
    public int f13550b = 0;
    public int f13551c = 0;
    public int f13552e = 0;
    public int f13553f = 0;
    public int f13554g = 0;
    public final LinkedHashMap f13559m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(kf.b.class, new ff.a(1));
        hashMap.put(kf.i.class, new ff.a(3));
        hashMap.put(kf.h.class, new ff.a(2));
        hashMap.put(kf.j.class, new ff.a(4));
        hashMap.put(t.class, new ff.a(7));
        hashMap.put(kf.n.class, new ff.a(6));
        hashMap.put(kf.l.class, new ff.a(5));
        f13548q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, lf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f13560n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f13561o = linkedHashSet;
        this.f13555i = arrayList;
        this.f13556j = bVar;
        this.f13557k = arrayList2;
        f fVar = new f(0);
        this.f13558l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(mf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f13560n.add(aVar);
        this.f13561o.add(aVar);
    }

    public final void b(p pVar) {
        l lVar = pVar.f13606b;
        lVar.a();
        ArrayList arrayList = lVar.f13592c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            kf.m mVar = (kf.m) obj;
            r rVar = pVar.f13605a;
            mVar.g();
            kf.p pVar2 = (kf.p) rVar.f18237e;
            mVar.f18237e = pVar2;
            if (pVar2 != null) {
                pVar2.f18238f = mVar;
            }
            mVar.f18238f = rVar;
            rVar.f18237e = mVar;
            kf.p pVar3 = (kf.p) rVar.f18235b;
            mVar.f18235b = pVar3;
            if (((kf.p) mVar.f18237e) == null) {
                pVar3.f18236c = mVar;
            }
            String str = mVar.f18232g;
            LinkedHashMap linkedHashMap = this.f13559m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f13549a;
            CharSequence subSequence2 = charSequence.subSequence(this.f13550b + 1, charSequence.length());
            int i7 = 4 - (this.f13551c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i7);
            for (int i10 = 0; i10 < i7; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f13549a;
            subSequence = charSequence2.subSequence(this.f13550b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f13549a.charAt(this.f13550b) == '\t') {
            this.f13550b++;
            int i7 = this.f13551c;
            this.f13551c = (4 - (i7 % 4)) + i7;
            return;
        }
        this.f13550b++;
        this.f13551c++;
    }

    public final void e(mf.a aVar) {
        if (h() == aVar) {
            p0.z(1, this.f13560n);
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
        int i7 = this.f13550b;
        int i10 = this.f13551c;
        this.h = true;
        int length = this.f13549a.length();
        while (true) {
            if (i7 >= length) {
                break;
            }
            char charAt = this.f13549a.charAt(i7);
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
        this.f13552e = i7;
        this.f13553f = i10;
        this.f13554g = i10 - this.f13551c;
    }

    public final mf.a h() {
        return (mf.a) i5.c.h(1, this.f13560n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: gf.g.i(java.lang.String):void");
    }

    public final void j(int i7) {
        int i10;
        int i11 = this.f13553f;
        if (i7 >= i11) {
            this.f13550b = this.f13552e;
            this.f13551c = i11;
        }
        int length = this.f13549a.length();
        while (true) {
            i10 = this.f13551c;
            if (i10 >= i7 || this.f13550b == length) {
                break;
            }
            d();
        }
        if (i10 > i7) {
            this.f13550b--;
            this.f13551c = i7;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i7) {
        int i10 = this.f13552e;
        if (i7 >= i10) {
            this.f13550b = i10;
            this.f13551c = this.f13553f;
        }
        int length = this.f13549a.length();
        while (true) {
            int i11 = this.f13550b;
            if (i11 >= i7 || i11 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
