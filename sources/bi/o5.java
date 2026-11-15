package bi;

import di.m8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class o5 implements m8 {
    public final int f3757a;
    public final long f3758b;
    public final z10 f3759c;
    public int f3760e;
    public long f3763i;
    public String f3771q;
    public boolean f3772r;
    public boolean f3773s;
    public boolean f3774t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f3761f = new ArrayList();
    public final ArrayList f3762g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f3764j = new HashSet();
    public final HashSet f3765k = new HashSet();
    public final HashSet f3766l = new HashSet();
    public final HashMap f3767m = new HashMap();
    public final HashMap f3768n = new HashMap();
    public final HashMap f3769o = new HashMap();
    public n5 f3770p = n5.f3740a;
    public boolean f3775u = false;
    public int v = -1;

    public o5(int i7, long j3, z10 z10Var) {
        this.f3757a = i7;
        this.f3758b = j3;
        this.f3759c = z10Var;
    }

    @Override
    public final void a() {
        g(false);
    }

    @Override
    public final int b(int i7) {
        return -1;
    }

    @Override
    public final int c() {
        return this.f3760e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f3757a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f3774t = false;
    }

    public final void g(boolean z10) {
        if (!this.f3774t) {
            if (z10 || !this.f3775u) {
                this.f3774t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f3758b;
                String str = this.f3771q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f3773s;
                getresalestargifts.stars_only = this.f3772r;
                n5 n5Var = this.f3770p;
                int i7 = 0;
                if (n5Var == n5.f3742c) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (n5Var == n5.f3741b) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (n5Var == n5.f3740a) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f3763i;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f3762g;
                ArrayList arrayList3 = this.f3761f;
                if (i10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f3764j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f3766l;
                HashSet hashSet3 = this.f3765k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f28057id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f28057id;
                                getresalestargifts.attributes.add(stargiftattributeidmodel);
                            }
                        }
                    }
                    if (!hashSet3.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList2.get(i12);
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
                        int size3 = arrayList.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f28057id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f28057id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f3757a).sendRequest(getresalestargifts, new v2(1, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i7) {
        return this.d.get(i7);
    }

    public final void h() {
        f();
        this.f3771q = null;
        this.d.clear();
        g(true);
        z10 z10Var = this.f3759c;
        if (z10Var != null) {
            z10Var.a(Boolean.TRUE);
        }
    }

    public final void i(n5 n5Var) {
        if (this.f3770p != n5Var) {
            this.f3770p = n5Var;
            h();
        }
    }

    @Override
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override
    public final void d() {
    }
}
