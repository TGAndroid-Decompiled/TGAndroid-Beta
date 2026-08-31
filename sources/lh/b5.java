package lh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import mh.m7;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class b5 implements m7 {
    public final int f12618a;
    public final long f12619b;
    public final Utilities.Callback f12620c;
    public int f12621e;
    public long f12624i;
    public String f12632q;
    public boolean f12633r;
    public boolean f12634s;
    public boolean f12635t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f12622f = new ArrayList();
    public final ArrayList f12623g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f12625j = new HashSet();
    public final HashSet f12626k = new HashSet();
    public final HashSet f12627l = new HashSet();
    public final HashMap f12628m = new HashMap();
    public final HashMap f12629n = new HashMap();
    public final HashMap f12630o = new HashMap();
    public a5 f12631p = a5.BY_PRICE;
    public boolean f12636u = false;
    public int v = -1;

    public b5(long j10, int i10, Utilities.Callback callback) {
        this.f12618a = i10;
        this.f12619b = j10;
        this.f12620c = callback;
    }

    @Override
    public final void a() {
        g(false);
    }

    @Override
    public final int b(int i10) {
        return -1;
    }

    @Override
    public final int c() {
        return this.f12621e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f12618a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f12635t = false;
    }

    public final void g(boolean z4) {
        if (!this.f12635t) {
            if (z4 || !this.f12636u) {
                this.f12635t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f12619b;
                String str = this.f12632q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f12634s;
                getresalestargifts.stars_only = this.f12633r;
                a5 a5Var = this.f12631p;
                int i10 = 0;
                if (a5Var == a5.BY_NUMBER) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (a5Var == a5.BY_DATE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (a5Var == a5.BY_PRICE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j10 = this.f12624i;
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f12623g;
                ArrayList arrayList3 = this.f12622f;
                if (j10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j10;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f12625j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f12627l;
                HashSet hashSet3 = this.f12626k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f20849id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f20849id;
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
                        while (i10 < size3) {
                            Object obj3 = arrayList.get(i10);
                            i10++;
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f20849id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f20849id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f12618a).sendRequest(getresalestargifts, new eg.b3(4, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f12632q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f12620c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(a5 a5Var) {
        if (this.f12631p != a5Var) {
            this.f12631p = a5Var;
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
