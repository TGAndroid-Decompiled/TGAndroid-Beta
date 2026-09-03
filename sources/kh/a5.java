package kh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import lh.m7;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class a5 implements m7 {
    public final int f10580a;
    public final long f10581b;
    public final Utilities.Callback f10582c;
    public int e;
    public long f10585i;
    public String f10593q;
    public boolean f10594r;
    public boolean f10595s;
    public boolean f10596t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f10583f = new ArrayList();
    public final ArrayList f10584g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f10586j = new HashSet();
    public final HashSet f10587k = new HashSet();
    public final HashSet f10588l = new HashSet();
    public final HashMap f10589m = new HashMap();
    public final HashMap f10590n = new HashMap();
    public final HashMap f10591o = new HashMap();
    public z4 f10592p = z4.BY_PRICE;
    public boolean f10597u = false;
    public int v = -1;

    public a5(long j10, int i10, Utilities.Callback callback) {
        this.f10580a = i10;
        this.f10581b = j10;
        this.f10582c = callback;
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
        return this.e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f10580a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f10596t = false;
    }

    public final void g(boolean z4) {
        if (!this.f10596t) {
            if (z4 || !this.f10597u) {
                this.f10596t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f10581b;
                String str = this.f10593q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f10595s;
                getresalestargifts.stars_only = this.f10594r;
                z4 z4Var = this.f10592p;
                int i10 = 0;
                if (z4Var == z4.BY_NUMBER) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (z4Var == z4.BY_DATE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (z4Var == z4.BY_PRICE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j10 = this.f10585i;
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f10584g;
                ArrayList arrayList3 = this.f10583f;
                if (j10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j10;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f10586j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f10588l;
                HashSet hashSet3 = this.f10587k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f19165id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f19165id;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f19165id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f19165id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f10580a).sendRequest(getresalestargifts, new dg.d3(4, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f10593q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f10582c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(z4 z4Var) {
        if (this.f10592p != z4Var) {
            this.f10592p = z4Var;
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
