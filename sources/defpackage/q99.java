package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class q99 implements ysa {
    public final int a;
    public final long b;
    public final p8c c;
    public int e;
    public long i;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final ArrayList d = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet j = new HashSet();
    public final HashSet k = new HashSet();
    public final HashSet l = new HashSet();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public final HashMap o = new HashMap();
    public p99 p = p99.a;
    public boolean z = false;
    public int A = -1;

    public q99(int i, long j, p8c p8cVar) {
        this.a = i;
        this.b = j;
        this.c = p8cVar;
        j();
        for (int size = z99.U.size() - 1; size >= 0; size--) {
            ArrayList arrayList = z99.U;
            if (((WeakReference) arrayList.get(size)).get() == null) {
                arrayList.remove(size);
            }
        }
        z99.U.add(new WeakReference(this));
    }

    @Override
    public final void a() {
        l(false);
    }

    @Override
    public final int b(int i) {
        return -1;
    }

    @Override
    public final int c() {
        return this.e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final boolean f() {
        if (!this.x && !this.v && na7.q1(this.a).k4.s.f && na7.q1(this.a).k4.n0.f) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return !"hidden".equals(gr.a(na7.q1(this.a).k4.u));
    }

    @Override
    public final Object get(int i) {
        return this.d.get(i);
    }

    public final boolean h() {
        return !"hidden".equals(gr.a(na7.q1(this.a).k4.v));
    }

    public final void i() {
        if (this.A >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.A, true);
            this.A = -1;
        }
        this.y = false;
    }

    @Override
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    public final void j() {
        gr grVar = na7.q1(this.a).k4;
        this.r = "default".equals(gr.a(grVar.u));
        this.s = "default".equals(gr.a(grVar.v));
        boolean f = f();
        this.t = f;
        if (!this.r && !this.s && !f) {
            this.r = g();
            this.s = h();
        }
    }

    public final boolean k() {
        if (this.r && !this.s && !this.t) {
            return true;
        }
        return false;
    }

    public final void l(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!this.y) {
            if (z || !this.z) {
                int i = 0;
                if (!this.x && !this.w && ((!this.r || !g()) && ((!this.s || !h()) && (!this.t || !f())))) {
                    boolean z6 = this.z;
                    ArrayList arrayList = this.d;
                    if (z6 && arrayList.isEmpty() && this.e == 0) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    this.z = true;
                    this.q = null;
                    arrayList.clear();
                    this.e = 0;
                    this.u = 0;
                    this.m.clear();
                    this.n.clear();
                    this.o.clear();
                    if (z5 && this.c != null) {
                        gl.d3(new sr8(this, (byte) 17));
                        return;
                    }
                    return;
                }
                this.y = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.b;
                String str = this.q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                boolean z7 = this.x;
                getresalestargifts.for_craft = z7;
                if (!z7 && !this.w) {
                    if (this.r && g()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    getresalestargifts.stars_only = z2;
                    if (this.s && h()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    getresalestargifts.ton_only = z3;
                    if (this.t && f()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    getresalestargifts.fragment_only = z4;
                }
                p99 p99Var = this.p;
                if (p99Var == p99.c) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (p99Var == p99.b) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (p99Var == p99.a) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j = this.i;
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                ArrayList arrayList2 = this.h;
                ArrayList arrayList3 = this.g;
                ArrayList arrayList4 = this.f;
                if (i2 != 0) {
                    getresalestargifts.flags |= 1;
                    getresalestargifts.attributes_hash = j;
                } else if (arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                    getresalestargifts.flags |= 1;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.l;
                HashSet hashSet3 = this.k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.id;
                                getresalestargifts.attributes.add(stargiftattributeidmodel);
                            }
                        }
                    }
                    if (!hashSet3.isEmpty()) {
                        int size2 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
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
                        while (i < size3) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.A = ConnectionsManager.getInstance(this.a).sendRequest(getresalestargifts, new hj7(this, getresalestargifts, (byte) 16));
            }
        }
    }

    public final void m() {
        i();
        this.q = null;
        this.d.clear();
        l(true);
        p8c p8cVar = this.c;
        if (p8cVar != null) {
            p8cVar.a(Boolean.TRUE);
        }
    }

    public final void n(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ArrayList arrayList;
        String str;
        int i = 0;
        while (true) {
            arrayList = this.d;
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
        int i2 = this.e;
        if (i2 > 0) {
            this.e = i2 - 1;
        }
        p8c p8cVar = this.c;
        if (p8cVar != null) {
            p8cVar.a(Boolean.FALSE);
        }
    }

    public final void o(boolean z, boolean z2, boolean z3) {
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
            if (this.r == z4 && this.s == z5 && this.t == z6) {
                return;
            }
            this.r = z4;
            this.s = z5;
            this.t = z6;
            m();
        }
    }

    public final void p(p99 p99Var) {
        if (this.p != p99Var) {
            this.p = p99Var;
            m();
        }
    }

    @Override
    public final void d() {
    }
}
