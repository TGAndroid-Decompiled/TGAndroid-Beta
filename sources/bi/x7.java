package bi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class x7 implements di.q8 {
    public final int f4254a;
    public final long f4255b;
    public final y10 f4256c;
    public int f4257e;
    public long f4260i;
    public String f4268q;
    public boolean f4269r;
    public boolean f4270s;
    public boolean f4271t;
    public int f4272u;
    public boolean v;
    public boolean f4273w;
    public boolean f4274x;
    public boolean f4275y;
    public final ArrayList d = new ArrayList();
    public final ArrayList f4258f = new ArrayList();
    public final ArrayList f4259g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f4261j = new HashSet();
    public final HashSet f4262k = new HashSet();
    public final HashSet f4263l = new HashSet();
    public final HashMap f4264m = new HashMap();
    public final HashMap f4265n = new HashMap();
    public final HashMap f4266o = new HashMap();
    public w7 f4267p = w7.f4230a;
    public boolean f4276z = false;
    public int A = -1;

    public x7(int i7, long j3, y10 y10Var) {
        this.f4254a = i7;
        this.f4255b = j3;
        this.f4256c = y10Var;
        j();
        for (int size = j8.U.size() - 1; size >= 0; size--) {
            ArrayList arrayList = j8.U;
            if (((WeakReference) arrayList.get(size)).get() == null) {
                arrayList.remove(size);
            }
        }
        j8.U.add(new WeakReference(this));
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
        return this.f4257e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final boolean f() {
        if (!this.f4274x && !this.v) {
            int i7 = this.f4254a;
            if (((org.telegram.messenger.h0) np.u1(i7).A7.f26246t.f14030b).f24341c && ((org.telegram.messenger.h0) np.u1(i7).A7.f26239p0.f14030b).f24341c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g() {
        return !"hidden".equals(org.telegram.messenger.p0.i(np.u1(this.f4254a).A7.v));
    }

    @Override
    public final Object get(int i7) {
        return this.d.get(i7);
    }

    public final boolean h() {
        return !"hidden".equals(org.telegram.messenger.p0.i(np.u1(this.f4254a).A7.f26251w));
    }

    public final void i() {
        if (this.A >= 0) {
            ConnectionsManager.getInstance(this.f4254a).cancelRequest(this.A, true);
            this.A = -1;
        }
        this.f4275y = false;
    }

    @Override
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    public final void j() {
        org.telegram.messenger.p0 p0Var = np.u1(this.f4254a).A7;
        this.f4269r = "default".equals(org.telegram.messenger.p0.i(p0Var.v));
        this.f4270s = "default".equals(org.telegram.messenger.p0.i(p0Var.f26251w));
        boolean f10 = f();
        this.f4271t = f10;
        if (!this.f4269r && !this.f4270s && !f10) {
            this.f4269r = g();
            this.f4270s = h();
        }
    }

    public final boolean k() {
        if (this.f4269r && !this.f4270s && !this.f4271t) {
            return true;
        }
        return false;
    }

    public final void l(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!this.f4275y) {
            if (z10 || !this.f4276z) {
                int i7 = 0;
                if (!this.f4274x && !this.f4273w && ((!this.f4269r || !g()) && ((!this.f4270s || !h()) && (!this.f4271t || !f())))) {
                    boolean z15 = this.f4276z;
                    ArrayList arrayList = this.d;
                    if (z15 && arrayList.isEmpty() && this.f4257e == 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.f4276z = true;
                    this.f4268q = null;
                    arrayList.clear();
                    this.f4257e = 0;
                    this.f4272u = 0;
                    this.f4264m.clear();
                    this.f4265n.clear();
                    this.f4266o.clear();
                    if (z14 && this.f4256c != null) {
                        org.telegram.messenger.g0.g3(new a3.f(this, 28));
                        return;
                    }
                    return;
                }
                this.f4275y = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f4255b;
                String str = this.f4268q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                boolean z16 = this.f4274x;
                getresalestargifts.for_craft = z16;
                if (!z16 && !this.f4273w) {
                    if (this.f4269r && g()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    getresalestargifts.stars_only = z11;
                    if (this.f4270s && h()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    getresalestargifts.ton_only = z12;
                    if (this.f4271t && f()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    getresalestargifts.fragment_only = z13;
                }
                w7 w7Var = this.f4267p;
                if (w7Var == w7.f4232c) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (w7Var == w7.f4231b) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (w7Var == w7.f4230a) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f4260i;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                ArrayList arrayList2 = this.h;
                ArrayList arrayList3 = this.f4259g;
                ArrayList arrayList4 = this.f4258f;
                if (i10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f4261j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f4263l;
                HashSet hashSet3 = this.f4262k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList4.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f28440id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f28440id;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f28440id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f28440id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.A = ConnectionsManager.getInstance(this.f4254a).sendRequest(getresalestargifts, new o1(2, this, getresalestargifts));
            }
        }
    }

    public final void m() {
        i();
        this.f4268q = null;
        this.d.clear();
        l(true);
        y10 y10Var = this.f4256c;
        if (y10Var != null) {
            y10Var.a(Boolean.TRUE);
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
        int i10 = this.f4257e;
        if (i10 > 0) {
            this.f4257e = i10 - 1;
        }
        y10 y10Var = this.f4256c;
        if (y10Var != null) {
            y10Var.a(Boolean.FALSE);
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
            if (this.f4269r == z13 && this.f4270s == z14 && this.f4271t == z15) {
                return;
            }
            this.f4269r = z13;
            this.f4270s = z14;
            this.f4271t = z15;
            m();
        }
    }

    public final void p(w7 w7Var) {
        if (this.f4267p != w7Var) {
            this.f4267p = w7Var;
            m();
        }
    }

    @Override
    public final void d() {
    }
}
