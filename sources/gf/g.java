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
    public static final LinkedHashSet f13232p = new LinkedHashSet(Arrays.asList(kf.b.class, kf.i.class, kf.h.class, kf.j.class, t.class, kf.n.class, kf.l.class));
    public static final Map f13233q;
    public CharSequence f13234a;
    public boolean d;
    public boolean h;
    public final List f13240i;
    public final lf.b f13241j;
    public final List f13242k;
    public final f f13243l;
    public final ArrayList f13245n;
    public final LinkedHashSet f13246o;
    public int f13235b = 0;
    public int f13236c = 0;
    public int f13237e = 0;
    public int f13238f = 0;
    public int f13239g = 0;
    public final LinkedHashMap f13244m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(kf.b.class, new ff.a(1));
        hashMap.put(kf.i.class, new ff.a(3));
        hashMap.put(kf.h.class, new ff.a(2));
        hashMap.put(kf.j.class, new ff.a(4));
        hashMap.put(t.class, new ff.a(7));
        hashMap.put(kf.n.class, new ff.a(6));
        hashMap.put(kf.l.class, new ff.a(5));
        f13233q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, lf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f13245n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f13246o = linkedHashSet;
        this.f13240i = arrayList;
        this.f13241j = bVar;
        this.f13242k = arrayList2;
        f fVar = new f(0);
        this.f13243l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(mf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f13245n.add(aVar);
        this.f13246o.add(aVar);
    }

    public final void b(p pVar) {
        l lVar = pVar.f13291b;
        lVar.a();
        ArrayList arrayList = lVar.f13277c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            kf.m mVar = (kf.m) obj;
            r rVar = pVar.f13290a;
            mVar.g();
            kf.p pVar2 = (kf.p) rVar.f17842e;
            mVar.f17842e = pVar2;
            if (pVar2 != null) {
                pVar2.f17843f = mVar;
            }
            mVar.f17843f = rVar;
            rVar.f17842e = mVar;
            kf.p pVar3 = (kf.p) rVar.f17840b;
            mVar.f17840b = pVar3;
            if (((kf.p) mVar.f17842e) == null) {
                pVar3.f17841c = mVar;
            }
            String str = mVar.f17837g;
            LinkedHashMap linkedHashMap = this.f13244m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f13234a;
            CharSequence subSequence2 = charSequence.subSequence(this.f13235b + 1, charSequence.length());
            int i7 = 4 - (this.f13236c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i7);
            for (int i10 = 0; i10 < i7; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f13234a;
            subSequence = charSequence2.subSequence(this.f13235b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f13234a.charAt(this.f13235b) == '\t') {
            this.f13235b++;
            int i7 = this.f13236c;
            this.f13236c = (4 - (i7 % 4)) + i7;
            return;
        }
        this.f13235b++;
        this.f13236c++;
    }

    public final void e(mf.a aVar) {
        if (h() == aVar) {
            p0.z(1, this.f13245n);
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
        int i7 = this.f13235b;
        int i10 = this.f13236c;
        this.h = true;
        int length = this.f13234a.length();
        while (true) {
            if (i7 >= length) {
                break;
            }
            char charAt = this.f13234a.charAt(i7);
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
        this.f13237e = i7;
        this.f13238f = i10;
        this.f13239g = i10 - this.f13236c;
    }

    public final mf.a h() {
        return (mf.a) i5.c.h(1, this.f13245n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: gf.g.i(java.lang.String):void");
    }

    public final void j(int i7) {
        int i10;
        int i11 = this.f13238f;
        if (i7 >= i11) {
            this.f13235b = this.f13237e;
            this.f13236c = i11;
        }
        int length = this.f13234a.length();
        while (true) {
            i10 = this.f13236c;
            if (i10 >= i7 || this.f13235b == length) {
                break;
            }
            d();
        }
        if (i10 > i7) {
            this.f13235b--;
            this.f13236c = i7;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i7) {
        int i10 = this.f13237e;
        if (i7 >= i10) {
            this.f13235b = i10;
            this.f13236c = this.f13238f;
        }
        int length = this.f13234a.length();
        while (true) {
            int i11 = this.f13235b;
            if (i11 >= i7 || i11 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
