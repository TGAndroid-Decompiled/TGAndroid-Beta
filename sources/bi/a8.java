package bi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class a8 implements di.q8 {
    public final int f3361a;
    public final long f3362b;
    public final w10 f3363c;
    public int f3364e;
    public long f3367i;
    public String f3375q;
    public boolean f3376r;
    public boolean f3377s;
    public boolean f3378t;
    public int f3379u;
    public boolean v;
    public boolean f3380w;
    public boolean f3381x;
    public boolean f3382y;
    public final ArrayList d = new ArrayList();
    public final ArrayList f3365f = new ArrayList();
    public final ArrayList f3366g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f3368j = new HashSet();
    public final HashSet f3369k = new HashSet();
    public final HashSet f3370l = new HashSet();
    public final HashMap f3371m = new HashMap();
    public final HashMap f3372n = new HashMap();
    public final HashMap f3373o = new HashMap();
    public z7 f3374p = z7.f4308a;
    public boolean f3383z = false;
    public int A = -1;

    public a8(int i7, long j3, w10 w10Var) {
        this.f3361a = i7;
        this.f3362b = j3;
        this.f3363c = w10Var;
        j();
        for (int size = m8.U.size() - 1; size >= 0; size--) {
            ArrayList arrayList = m8.U;
            if (((WeakReference) arrayList.get(size)).get() == null) {
                arrayList.remove(size);
            }
        }
        m8.U.add(new WeakReference(this));
    }

    @Override
    public final void a() {
        l(false);
    }

    @Override
    public final int b(int i7) {
        return -1;
    }

    @Override
    public final int c() {
        return this.f3364e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final boolean f() {
        if (!this.f3381x && !this.v) {
            int i7 = this.f3361a;
            if (((org.telegram.messenger.h0) mp.u1(i7).A7.f26261t.f17372b).f24439c && ((org.telegram.messenger.h0) mp.u1(i7).A7.f26254p0.f17372b).f24439c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g() {
        return !"hidden".equals(org.telegram.messenger.p0.i(mp.u1(this.f3361a).A7.v));
    }

    @Override
    public final Object get(int i7) {
        return this.d.get(i7);
    }

    public final boolean h() {
        return !"hidden".equals(org.telegram.messenger.p0.i(mp.u1(this.f3361a).A7.f26266w));
    }

    public final void i() {
        if (this.A >= 0) {
            ConnectionsManager.getInstance(this.f3361a).cancelRequest(this.A, true);
            this.A = -1;
        }
        this.f3382y = false;
    }

    @Override
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    public final void j() {
        org.telegram.messenger.p0 p0Var = mp.u1(this.f3361a).A7;
        this.f3376r = "default".equals(org.telegram.messenger.p0.i(p0Var.v));
        this.f3377s = "default".equals(org.telegram.messenger.p0.i(p0Var.f26266w));
        boolean f10 = f();
        this.f3378t = f10;
        if (!this.f3376r && !this.f3377s && !f10) {
            this.f3376r = g();
            this.f3377s = h();
        }
    }

    public final boolean k() {
        if (this.f3376r && !this.f3377s && !this.f3378t) {
            return true;
        }
        return false;
    }

    public final void l(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!this.f3382y) {
            if (z10 || !this.f3383z) {
                int i7 = 0;
                if (!this.f3381x && !this.f3380w && ((!this.f3376r || !g()) && ((!this.f3377s || !h()) && (!this.f3378t || !f())))) {
                    boolean z15 = this.f3383z;
                    ArrayList arrayList = this.d;
                    if (z15 && arrayList.isEmpty() && this.f3364e == 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.f3383z = true;
                    this.f3375q = null;
                    arrayList.clear();
                    this.f3364e = 0;
                    this.f3379u = 0;
                    this.f3371m.clear();
                    this.f3372n.clear();
                    this.f3373o.clear();
                    if (z14 && this.f3363c != null) {
                        org.telegram.messenger.g0.g3(new a3.f(this, 27));
                        return;
                    }
                    return;
                }
                this.f3382y = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f3362b;
                String str = this.f3375q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                boolean z16 = this.f3381x;
                getresalestargifts.for_craft = z16;
                if (!z16 && !this.f3380w) {
                    if (this.f3376r && g()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    getresalestargifts.stars_only = z11;
                    if (this.f3377s && h()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    getresalestargifts.ton_only = z12;
                    if (this.f3378t && f()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    getresalestargifts.fragment_only = z13;
                }
                z7 z7Var = this.f3374p;
                if (z7Var == z7.f4310c) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (z7Var == z7.f4309b) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (z7Var == z7.f4308a) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f3367i;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                ArrayList arrayList2 = this.h;
                ArrayList arrayList3 = this.f3366g;
                ArrayList arrayList4 = this.f3365f;
                if (i10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f3368j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f3370l;
                HashSet hashSet3 = this.f3369k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList4.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f28498id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f28498id;
                                getresalestargifts.attributes.add(stargiftattributeidmodel);
                            }
                        }
                    }
                    if (!hashSet3.isEmpty()) {
                        int size2 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj2;
                            if (!hashSet3.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id))) {
                                TL_stars.starGiftAttributeIdBackdrop stargiftattributeidbackdrop = new TL_stars.starGiftAttributeIdBackdrop();
                                stargiftattributeidbackdrop.backdrop_id = stargiftattributebackdrop.backdrop_id;
                                getresalestargifts.attributes.add(stargiftattributeidbackdrop);
                            }
                        }
                    }
                    if (!hashSet2.isEmpty()) {
                        int size3 = arrayList2.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList2.get(i7);
                            i7++;
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f28498id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f28498id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.A = ConnectionsManager.getInstance(this.f3361a).sendRequest(getresalestargifts, new o1(2, this, getresalestargifts));
            }
        }
    }

    public final void m() {
        i();
        this.f3375q = null;
        this.d.clear();
        l(true);
        w10 w10Var = this.f3363c;
        if (w10Var != null) {
            w10Var.a(Boolean.TRUE);
        }
    }

    public final void n(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ArrayList arrayList;
        String str;
        int i7 = 0;
        while (true) {
            arrayList = this.d;
            if (i7 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i7);
                if (tL_starGiftUnique2 == tL_starGiftUnique || ((str = tL_starGiftUnique2.slug) != null && str.equals(tL_starGiftUnique.slug))) {
                    break;
                }
                i7++;
            } else {
                return;
            }
        }
        arrayList.remove(i7);
        int i10 = this.f3364e;
        if (i10 > 0) {
            this.f3364e = i10 - 1;
        }
        w10 w10Var = this.f3363c;
        if (w10Var != null) {
            w10Var.a(Boolean.FALSE);
        }
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (z10 && g()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11 && h()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z12 && f()) {
            z15 = true;
        }
        if (z13 || z14 || z15) {
            if (this.f3376r == z13 && this.f3377s == z14 && this.f3378t == z15) {
                return;
            }
            this.f3376r = z13;
            this.f3377s = z14;
            this.f3378t = z15;
            m();
        }
    }

    public final void p(z7 z7Var) {
        if (this.f3374p != z7Var) {
            this.f3374p = z7Var;
            m();
        }
    }

    @Override
    public final void d() {
    }
}
