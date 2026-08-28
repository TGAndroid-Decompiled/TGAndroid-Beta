package fh;

import gh.o7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class p5 implements o7 {
    public final int f6701a;
    public final long f6702b;
    public final Utilities.Callback f6703c;
    public int f6704e;
    public long f6707i;
    public String f6715q;
    public boolean f6716r;
    public boolean f6717s;
    public boolean f6718t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f6705f = new ArrayList();
    public final ArrayList f6706g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f6708j = new HashSet();
    public final HashSet f6709k = new HashSet();
    public final HashSet f6710l = new HashSet();
    public final HashMap f6711m = new HashMap();
    public final HashMap f6712n = new HashMap();
    public final HashMap f6713o = new HashMap();
    public o5 f6714p = o5.BY_PRICE;
    public boolean f6719u = false;
    public int v = -1;

    public p5(long j10, int i9, Utilities.Callback callback) {
        this.f6701a = i9;
        this.f6702b = j10;
        this.f6703c = callback;
    }

    @Override
    public final void a() {
        g(false);
    }

    @Override
    public final int b(int i9) {
        return -1;
    }

    @Override
    public final int c() {
        return this.f6704e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f6701a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f6718t = false;
    }

    public final void g(boolean z10) {
        if (!this.f6718t) {
            if (z10 || !this.f6719u) {
                this.f6718t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f6702b;
                String str = this.f6715q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f6717s;
                getresalestargifts.stars_only = this.f6716r;
                o5 o5Var = this.f6714p;
                int i9 = 0;
                if (o5Var == o5.BY_NUMBER) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (o5Var == o5.BY_DATE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (o5Var == o5.BY_PRICE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j10 = this.f6707i;
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f6706g;
                ArrayList arrayList3 = this.f6705f;
                if (j10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j10;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f6708j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f6710l;
                HashSet hashSet3 = this.f6709k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f22386id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f22386id;
                                getresalestargifts.attributes.add(stargiftattributeidmodel);
                            }
                        }
                    }
                    if (!hashSet3.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
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
                        while (i9 < size3) {
                            Object obj3 = arrayList.get(i9);
                            i9++;
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f22386id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f22386id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f6701a).sendRequest(getresalestargifts, new bg.j0(3, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i9) {
        return this.d.get(i9);
    }

    public final void h() {
        f();
        this.f6715q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f6703c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(o5 o5Var) {
        if (this.f6714p != o5Var) {
            this.f6714p = o5Var;
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
