package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class ed9 implements bxa {
    public boolean A;
    public int B;
    public final int a;
    public final ArrayList b;
    public String c;
    public final pcc d;
    public final ArrayList e;
    public int f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public long j;
    public final HashSet k;
    public final HashSet l;
    public final HashSet m;
    public final HashMap n;
    public final HashMap o;
    public final HashMap p;
    public dd9 q;
    public String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public ed9(int i, long j, pcc pccVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.e = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new HashSet();
        this.l = new HashSet();
        this.m = new HashSet();
        this.n = new HashMap();
        this.o = new HashMap();
        this.p = new HashMap();
        this.q = dd9.a;
        this.A = false;
        this.B = -1;
        this.a = i;
        arrayList.add(Long.valueOf(j));
        this.d = pccVar;
        j();
        for (int size = nd9.c0.size() - 1; size >= 0; size--) {
            ArrayList arrayList2 = nd9.c0;
            if (((WeakReference) arrayList2.get(size)).get() == null) {
                arrayList2.remove(size);
            }
        }
        nd9.c0.add(new WeakReference(this));
    }

    @Override
    public final void a() {
        o(false);
    }

    @Override
    public final int b(int i) {
        return -1;
    }

    @Override
    public final int c() {
        return this.f;
    }

    @Override
    public final int e() {
        return this.e.size();
    }

    public final boolean f() {
        if (!this.y && !this.w && !l() && uc7.s1(this.a).l4.s.f && uc7.s1(this.a).l4.v0.f) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return !"hidden".equals(hr.a(uc7.s1(this.a).l4.u));
    }

    @Override
    public final Object get(int i) {
        return this.e.get(i);
    }

    public final boolean h() {
        hr hrVar = uc7.s1(this.a).l4;
        if (hrVar.v0.f && !"hidden".equals(hr.a(hrVar.v))) {
            return true;
        }
        return false;
    }

    public final void i() {
        if (this.B >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.B, true);
            this.B = -1;
        }
        this.z = false;
    }

    @Override
    public final int indexOf(Object obj) {
        return this.e.indexOf(obj);
    }

    public final void j() {
        boolean z;
        hr hrVar = uc7.s1(this.a).l4;
        this.s = "default".equals(hr.a(hrVar.u));
        if ("default".equals(hr.a(hrVar.v)) && h()) {
            z = true;
        } else {
            z = false;
        }
        this.t = z;
        boolean f = f();
        this.u = f;
        if (!this.s && !this.t && !f) {
            this.s = g();
            this.t = h();
        }
    }

    public final void k(ArrayList arrayList, boolean z) {
        int i = 0;
        if (z) {
            HashSet hashSet = this.k;
            if (!hashSet.isEmpty()) {
                ArrayList arrayList2 = this.g;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                    if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.id))) {
                        TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                        stargiftattributeidmodel.document_id = stargiftattributemodel.document.id;
                        arrayList.add(stargiftattributeidmodel);
                    }
                }
            }
        }
        HashSet hashSet2 = this.l;
        if (!hashSet2.isEmpty()) {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj2;
                if (!hashSet2.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id))) {
                    TL_stars.starGiftAttributeIdBackdrop stargiftattributeidbackdrop = new TL_stars.starGiftAttributeIdBackdrop();
                    stargiftattributeidbackdrop.backdrop_id = stargiftattributebackdrop.backdrop_id;
                    arrayList.add(stargiftattributeidbackdrop);
                }
            }
        }
        HashSet hashSet3 = this.m;
        if (!hashSet3.isEmpty()) {
            ArrayList arrayList4 = this.i;
            int size3 = arrayList4.size();
            while (i < size3) {
                Object obj3 = arrayList4.get(i);
                i++;
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                if (!hashSet3.contains(Long.valueOf(stargiftattributepattern.document.id))) {
                    TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                    stargiftattributeidpattern.document_id = stargiftattributepattern.document.id;
                    arrayList.add(stargiftattributeidpattern);
                }
            }
        }
    }

    public final boolean l() {
        if (this.b.size() > 1 || !TextUtils.isEmpty(this.c)) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.s && !this.t && !this.u) {
            return true;
        }
        return false;
    }

    public final void n() {
        if (l()) {
            if (!this.s || !g()) {
                if (!this.t || !h()) {
                    this.s = g();
                    this.t = h();
                }
            }
        }
    }

    public final void o(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed9.o(boolean):void");
    }

    public final void p() {
        i();
        this.r = null;
        this.e.clear();
        o(true);
        pcc pccVar = this.d;
        if (pccVar != null) {
            pccVar.a(Boolean.TRUE);
        }
    }

    public final void q(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ArrayList arrayList;
        String str;
        int i = 0;
        while (true) {
            arrayList = this.e;
            if (i < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i);
                if (tL_starGiftUnique2 == tL_starGiftUnique || ((str = tL_starGiftUnique2.slug) != null && str.equals(tL_starGiftUnique.slug))) {
                    break;
                }
                i++;
            } else {
                return;
            }
        }
        arrayList.remove(i);
        int i2 = this.f;
        if (i2 > 0) {
            this.f = i2 - 1;
        }
        pcc pccVar = this.d;
        if (pccVar != null) {
            pccVar.a(Boolean.FALSE);
        }
    }

    public final void r(boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (z && g()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && h()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z3 && f()) {
            z6 = true;
        }
        if (z4 || z5 || z6) {
            if (this.s == z4 && this.t == z5 && this.u == z6) {
                return;
            }
            this.s = z4;
            this.t = z5;
            this.u = z6;
            p();
        }
    }

    public final void s(String str) {
        String trim;
        String str2 = null;
        if (str == null) {
            trim = null;
        } else {
            trim = str.trim();
        }
        if (!TextUtils.isEmpty(trim)) {
            str2 = trim;
        }
        if (TextUtils.equals(this.c, str2)) {
            return;
        }
        this.c = str2;
        n();
        p();
    }

    public final void t(dd9 dd9Var) {
        if (this.q != dd9Var) {
            this.q = dd9Var;
            p();
        }
    }

    @Override
    public final void d() {
    }
}
