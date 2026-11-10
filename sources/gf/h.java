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
import kf.t;
public final class h {
    public static final LinkedHashSet f13892p = new LinkedHashSet(Arrays.asList(kf.b.class, kf.i.class, kf.h.class, kf.j.class, t.class, kf.n.class, kf.l.class));
    public static final Map f13893q;
    public CharSequence f13894a;
    public boolean d;
    public boolean h;
    public final List f13900i;
    public final lf.b f13901j;
    public final List f13902k;
    public final f f13903l;
    public final ArrayList f13905n;
    public final LinkedHashSet f13906o;
    public int f13895b = 0;
    public int f13896c = 0;
    public int f13897e = 0;
    public int f13898f = 0;
    public int f13899g = 0;
    public final LinkedHashMap f13904m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(kf.b.class, new ff.a(1));
        hashMap.put(kf.i.class, new ff.a(3));
        hashMap.put(kf.h.class, new ff.a(2));
        hashMap.put(kf.j.class, new ff.a(4));
        hashMap.put(t.class, new ff.a(7));
        hashMap.put(kf.n.class, new ff.a(6));
        hashMap.put(kf.l.class, new ff.a(5));
        f13893q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public h(ArrayList arrayList, lf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f13905n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f13906o = linkedHashSet;
        this.f13900i = arrayList;
        this.f13901j = bVar;
        this.f13902k = arrayList2;
        f fVar = new f(0);
        this.f13903l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(mf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f13905n.add(aVar);
        this.f13906o.add(aVar);
    }

    public final void b(q qVar) {
        m mVar = qVar.f13951b;
        mVar.a();
        ArrayList arrayList = mVar.f13937c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            kf.m mVar2 = (kf.m) obj;
            kf.r rVar = qVar.f13950a;
            mVar2.g();
            kf.p pVar = (kf.p) rVar.f17283e;
            mVar2.f17283e = pVar;
            if (pVar != null) {
                pVar.f17284f = mVar2;
            }
            mVar2.f17284f = rVar;
            rVar.f17283e = mVar2;
            kf.p pVar2 = (kf.p) rVar.f17281b;
            mVar2.f17281b = pVar2;
            if (((kf.p) mVar2.f17283e) == null) {
                pVar2.f17282c = mVar2;
            }
            String str = mVar2.f17278g;
            LinkedHashMap linkedHashMap = this.f13904m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f13894a;
            CharSequence subSequence2 = charSequence.subSequence(this.f13895b + 1, charSequence.length());
            int i7 = 4 - (this.f13896c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i7);
            for (int i10 = 0; i10 < i7; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f13894a;
            subSequence = charSequence2.subSequence(this.f13895b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f13894a.charAt(this.f13895b) == '\t') {
            this.f13895b++;
            int i7 = this.f13896c;
            this.f13896c = (4 - (i7 % 4)) + i7;
            return;
        }
        this.f13895b++;
        this.f13896c++;
    }

    public final void e(mf.a aVar) {
        if (h() == aVar) {
            p0.z(1, this.f13905n);
        }
        if (aVar instanceof q) {
            b((q) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((mf.a) list.get(size));
        }
    }

    public final void g() {
        int i7 = this.f13895b;
        int i10 = this.f13896c;
        this.h = true;
        int length = this.f13894a.length();
        while (true) {
            if (i7 >= length) {
                break;
            }
            char charAt = this.f13894a.charAt(i7);
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
        this.f13897e = i7;
        this.f13898f = i10;
        this.f13899g = i10 - this.f13896c;
    }

    public final mf.a h() {
        return (mf.a) jg.g.i(1, this.f13905n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: gf.h.i(java.lang.String):void");
    }

    public final void j(int i7) {
        int i10;
        int i11 = this.f13898f;
        if (i7 >= i11) {
            this.f13895b = this.f13897e;
            this.f13896c = i11;
        }
        int length = this.f13894a.length();
        while (true) {
            i10 = this.f13896c;
            if (i10 >= i7 || this.f13895b == length) {
                break;
            }
            d();
        }
        if (i10 > i7) {
            this.f13895b--;
            this.f13896c = i7;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i7) {
        int i10 = this.f13897e;
        if (i7 >= i10) {
            this.f13895b = i10;
            this.f13896c = this.f13898f;
        }
        int length = this.f13894a.length();
        while (true) {
            int i11 = this.f13895b;
            if (i11 >= i7 || i11 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
