package bi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class u7 implements di.p8 {
    public final int f4087a;
    public final long f4088b;
    public final x10 f4089c;
    public int f4090e;
    public long f4093i;
    public String f4101q;
    public boolean f4102r;
    public boolean f4103s;
    public boolean f4104t;
    public int f4105u;
    public boolean v;
    public boolean f4106w;
    public boolean f4107x;
    public boolean f4108y;
    public final ArrayList d = new ArrayList();
    public final ArrayList f4091f = new ArrayList();
    public final ArrayList f4092g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f4094j = new HashSet();
    public final HashSet f4095k = new HashSet();
    public final HashSet f4096l = new HashSet();
    public final HashMap f4097m = new HashMap();
    public final HashMap f4098n = new HashMap();
    public final HashMap f4099o = new HashMap();
    public t7 f4100p = t7.f4068a;
    public boolean f4109z = false;
    public int A = -1;

    public u7(int i7, long j3, x10 x10Var) {
        this.f4087a = i7;
        this.f4088b = j3;
        this.f4089c = x10Var;
        j();
        for (int size = g8.U.size() - 1; size >= 0; size--) {
            ArrayList arrayList = g8.U;
            if (((WeakReference) arrayList.get(size)).get() == null) {
                arrayList.remove(size);
            }
        }
        g8.U.add(new WeakReference(this));
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
        return this.f4090e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final boolean f() {
        if (!this.f4107x && !this.v) {
            int i7 = this.f4087a;
            if (((org.telegram.messenger.h0) mp.u1(i7).A7.f26166t.f13998b).f24336c && ((org.telegram.messenger.h0) mp.u1(i7).A7.f26159p0.f13998b).f24336c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g() {
        return !"hidden".equals(org.telegram.messenger.p0.i(mp.u1(this.f4087a).A7.v));
    }

    @Override
    public final Object get(int i7) {
        return this.d.get(i7);
    }

    public final boolean h() {
        return !"hidden".equals(org.telegram.messenger.p0.i(mp.u1(this.f4087a).A7.f26171w));
    }

    public final void i() {
        if (this.A >= 0) {
            ConnectionsManager.getInstance(this.f4087a).cancelRequest(this.A, true);
            this.A = -1;
        }
        this.f4108y = false;
    }

    @Override
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    public final void j() {
        org.telegram.messenger.p0 p0Var = mp.u1(this.f4087a).A7;
        this.f4102r = "default".equals(org.telegram.messenger.p0.i(p0Var.v));
        this.f4103s = "default".equals(org.telegram.messenger.p0.i(p0Var.f26171w));
        boolean f10 = f();
        this.f4104t = f10;
        if (!this.f4102r && !this.f4103s && !f10) {
            this.f4102r = g();
            this.f4103s = h();
        }
    }

    public final boolean k() {
        if (this.f4102r && !this.f4103s && !this.f4104t) {
            return true;
        }
        return false;
    }

    public final void l(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!this.f4108y) {
            if (z10 || !this.f4109z) {
                int i7 = 0;
                if (!this.f4107x && !this.f4106w && ((!this.f4102r || !g()) && ((!this.f4103s || !h()) && (!this.f4104t || !f())))) {
                    boolean z15 = this.f4109z;
                    ArrayList arrayList = this.d;
                    if (z15 && arrayList.isEmpty() && this.f4090e == 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.f4109z = true;
                    this.f4101q = null;
                    arrayList.clear();
                    this.f4090e = 0;
                    this.f4105u = 0;
                    this.f4097m.clear();
                    this.f4098n.clear();
                    this.f4099o.clear();
                    if (z14 && this.f4089c != null) {
                        org.telegram.messenger.g0.g3(new a3.f(this, 28));
                        return;
                    }
                    return;
                }
                this.f4108y = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f4088b;
                String str = this.f4101q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                boolean z16 = this.f4107x;
                getresalestargifts.for_craft = z16;
                if (!z16 && !this.f4106w) {
                    if (this.f4102r && g()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    getresalestargifts.stars_only = z11;
                    if (this.f4103s && h()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    getresalestargifts.ton_only = z12;
                    if (this.f4104t && f()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    getresalestargifts.fragment_only = z13;
                }
                t7 t7Var = this.f4100p;
                if (t7Var == t7.f4070c) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (t7Var == t7.f4069b) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (t7Var == t7.f4068a) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f4093i;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                ArrayList arrayList2 = this.h;
                ArrayList arrayList3 = this.f4092g;
                ArrayList arrayList4 = this.f4091f;
                if (i10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f4094j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f4096l;
                HashSet hashSet3 = this.f4095k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList4.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f28409id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f28409id;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f28409id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f28409id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.A = ConnectionsManager.getInstance(this.f4087a).sendRequest(getresalestargifts, new k1(2, this, getresalestargifts));
            }
        }
    }

    public final void m() {
        i();
        this.f4101q = null;
        this.d.clear();
        l(true);
        x10 x10Var = this.f4089c;
        if (x10Var != null) {
            x10Var.a(Boolean.TRUE);
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
        int i10 = this.f4090e;
        if (i10 > 0) {
            this.f4090e = i10 - 1;
        }
        x10 x10Var = this.f4089c;
        if (x10Var != null) {
            x10Var.a(Boolean.FALSE);
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
            if (this.f4102r == z13 && this.f4103s == z14 && this.f4104t == z15) {
                return;
            }
            this.f4102r = z13;
            this.f4103s = z14;
            this.f4104t = z15;
            m();
        }
    }

    public final void p(t7 t7Var) {
        if (this.f4100p != t7Var) {
            this.f4100p = t7Var;
            m();
        }
    }

    @Override
    public final void d() {
    }
}
