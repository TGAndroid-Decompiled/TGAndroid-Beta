package bf;

import ef.r;
import ef.t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public final class g {
    public static final LinkedHashSet f3919p = new LinkedHashSet(Arrays.asList(ef.b.class, ef.i.class, ef.h.class, ef.j.class, t.class, ef.n.class, ef.l.class));
    public static final Map f3920q;
    public CharSequence f3921a;
    public boolean d;
    public boolean h;
    public final List f3926i;
    public final ff.b f3927j;
    public final List f3928k;
    public final f f3929l;
    public final ArrayList f3931n;
    public final LinkedHashSet f3932o;
    public int f3922b = 0;
    public int f3923c = 0;
    public int e = 0;
    public int f3924f = 0;
    public int f3925g = 0;
    public final LinkedHashMap f3930m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ef.b.class, new af.a(1));
        hashMap.put(ef.i.class, new af.a(3));
        hashMap.put(ef.h.class, new af.a(2));
        hashMap.put(ef.j.class, new af.a(4));
        hashMap.put(t.class, new af.a(7));
        hashMap.put(ef.n.class, new af.a(6));
        hashMap.put(ef.l.class, new af.a(5));
        f3920q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, ff.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f3931n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f3932o = linkedHashSet;
        this.f3926i = arrayList;
        this.f3927j = bVar;
        this.f3928k = arrayList2;
        f fVar = new f(0);
        this.f3929l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(gf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f3931n.add(aVar);
        this.f3932o.add(aVar);
    }

    public final void b(p pVar) {
        l lVar = pVar.f3974b;
        lVar.a();
        ArrayList arrayList = lVar.f3961c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ef.m mVar = (ef.m) obj;
            r rVar = pVar.f3973a;
            mVar.g();
            ef.p pVar2 = (ef.p) rVar.e;
            mVar.e = pVar2;
            if (pVar2 != null) {
                pVar2.f9938f = mVar;
            }
            mVar.f9938f = rVar;
            rVar.e = mVar;
            ef.p pVar3 = (ef.p) rVar.f9936b;
            mVar.f9936b = pVar3;
            if (((ef.p) mVar.e) == null) {
                pVar3.f9937c = mVar;
            }
            String str = mVar.f9933g;
            LinkedHashMap linkedHashMap = this.f3930m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.f3921a;
            CharSequence subSequence2 = charSequence.subSequence(this.f3922b + 1, charSequence.length());
            int i10 = 4 - (this.f3923c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f3921a;
            subSequence = charSequence2.subSequence(this.f3922b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.f3921a.charAt(this.f3922b) == '\t') {
            this.f3922b++;
            int i10 = this.f3923c;
            this.f3923c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f3922b++;
        this.f3923c++;
    }

    public final void e(gf.a aVar) {
        if (h() == aVar) {
            a1.g.A(1, this.f3931n);
        }
        if (aVar instanceof p) {
            b((p) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((gf.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.f3922b;
        int i11 = this.f3923c;
        this.h = true;
        int length = this.f3921a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f3921a.charAt(i10);
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
        this.f3924f = i11;
        this.f3925g = i11 - this.f3923c;
    }

    public final gf.a h() {
        return (gf.a) ic.a.g(1, this.f3931n);
    }

    public final void i(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: bf.g.i(java.lang.String):void");
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f3924f;
        if (i10 >= i12) {
            this.f3922b = this.e;
            this.f3923c = i12;
        }
        int length = this.f3921a.length();
        while (true) {
            i11 = this.f3923c;
            if (i11 >= i10 || this.f3922b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f3922b--;
            this.f3923c = i10;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i10) {
        int i11 = this.e;
        if (i10 >= i11) {
            this.f3922b = i11;
            this.f3923c = this.f3924f;
        }
        int length = this.f3921a.length();
        while (true) {
            int i12 = this.f3922b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
