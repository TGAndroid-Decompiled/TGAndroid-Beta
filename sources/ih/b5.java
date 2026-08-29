package ih;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jh.l7;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class b5 implements l7 {
    public final int f9043a;
    public final long f9044b;
    public final Utilities.Callback f9045c;
    public int f9046e;
    public long f9049i;
    public String f9057q;
    public boolean f9058r;
    public boolean f9059s;
    public boolean f9060t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f9047f = new ArrayList();
    public final ArrayList f9048g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f9050j = new HashSet();
    public final HashSet f9051k = new HashSet();
    public final HashSet f9052l = new HashSet();
    public final HashMap f9053m = new HashMap();
    public final HashMap f9054n = new HashMap();
    public final HashMap f9055o = new HashMap();
    public a5 f9056p = a5.BY_PRICE;
    public boolean f9061u = false;
    public int v = -1;

    public b5(long j10, int i10, Utilities.Callback callback) {
        this.f9043a = i10;
        this.f9044b = j10;
        this.f9045c = callback;
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
        return this.f9046e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f9043a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f9060t = false;
    }

    public final void g(boolean z10) {
        if (!this.f9060t) {
            if (z10 || !this.f9061u) {
                this.f9060t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f9044b;
                String str = this.f9057q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f9059s;
                getresalestargifts.stars_only = this.f9058r;
                a5 a5Var = this.f9056p;
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
                long j10 = this.f9049i;
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f9048g;
                ArrayList arrayList3 = this.f9047f;
                if (j10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j10;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f9050j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f9052l;
                HashSet hashSet3 = this.f9051k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f22398id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f22398id;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f22398id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f22398id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f9043a).sendRequest(getresalestargifts, new bg.h3(4, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f9057q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f9045c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(a5 a5Var) {
        if (this.f9056p != a5Var) {
            this.f9056p = a5Var;
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
