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
    public static final LinkedHashSet f13890p = new LinkedHashSet(Arrays.asList(kf.b.class, kf.i.class, kf.h.class, kf.j.class, t.class, kf.n.class, kf.l.class));
    public static final Map f13891q;
    public CharSequence f13892a;
    public boolean d;
    public boolean h;
    public final List f13898i;
    public final lf.b f13899j;
    public final List f13900k;
    public final f f13901l;
    public final ArrayList f13903n;
    public final LinkedHashSet f13904o;
    public int f13893b = 0;
    public int f13894c = 0;
    public int f13895e = 0;
    public int f13896f = 0;
    public int f13897g = 0;
    public final LinkedHashMap f13902m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(kf.b.class, new ff.a(1));
        hashMap.put(kf.i.class, new ff.a(3));
        hashMap.put(kf.h.class, new ff.a(2));
        hashMap.put(kf.j.class, new ff.a(4));
        hashMap.put(t.class, new ff.a(7));
        hashMap.put(kf.n.class, new ff.a(6));
        hashMap.put(kf.l.class, new ff.a(5));
        f13891q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public h(ArrayList arrayList, lf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f13903n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f13904o = linkedHashSet;
        this.f13898i = arrayList;
        this.f13899j = bVar;
        this.f13900k = arrayList2;
        f fVar = new f(0);
        this.f13901l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(mf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f13903n.add(aVar);
        this.f13904o.add(aVar);
    }

    public final void b(q qVar) {
        m mVar = qVar.f13949b;
        mVar.a();
        ArrayList arrayList = mVar.f13935c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            kf.m mVar2 = (kf.m) obj;
            kf.r rVar = qVar.f13948a;
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
            LinkedHashMap linkedHashMap = this.f13902m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f13892a;
            CharSequence subSequence2 = charSequence.subSequence(this.f13893b + 1, charSequence.length());
            int i7 = 4 - (this.f13894c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i7);
            for (int i10 = 0; i10 < i7; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f13892a;
            subSequence = charSequence2.subSequence(this.f13893b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f13892a.charAt(this.f13893b) == '\t') {
            this.f13893b++;
            int i7 = this.f13894c;
            this.f13894c = (4 - (i7 % 4)) + i7;
            return;
        }
        this.f13893b++;
        this.f13894c++;
    }

    public final void e(mf.a aVar) {
        if (h() == aVar) {
            p0.z(1, this.f13903n);
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
        int i7 = this.f13893b;
        int i10 = this.f13894c;
        this.h = true;
        int length = this.f13892a.length();
        while (true) {
            if (i7 >= length) {
                break;
            }
            char charAt = this.f13892a.charAt(i7);
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
        this.f13895e = i7;
        this.f13896f = i10;
        this.f13897g = i10 - this.f13894c;
    }

    public final mf.a h() {
        return (mf.a) jg.g.i(1, this.f13903n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: gf.h.i(java.lang.String):void");
    }

    public final void j(int i7) {
        int i10;
        int i11 = this.f13896f;
        if (i7 >= i11) {
            this.f13893b = this.f13895e;
            this.f13894c = i11;
        }
        int length = this.f13892a.length();
        while (true) {
            i10 = this.f13894c;
            if (i10 >= i7 || this.f13893b == length) {
                break;
            }
            d();
        }
        if (i10 > i7) {
            this.f13893b--;
            this.f13894c = i7;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i7) {
        int i10 = this.f13895e;
        if (i7 >= i10) {
            this.f13893b = i10;
            this.f13894c = this.f13896f;
        }
        int length = this.f13892a.length();
        while (true) {
            int i11 = this.f13893b;
            if (i11 >= i7 || i11 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
