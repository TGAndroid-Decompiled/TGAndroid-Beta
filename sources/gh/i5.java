package gh;

import hh.n7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

public final class i5 implements n7 {

    public final int f7323a;

    public final long f7324b;

    public final Utilities.Callback f7325c;

    public int f7326e;

    public long f7329i;

    public String f7337q;

    public boolean f7338r;

    public boolean f7339s;

    public boolean f7340t;
    public final ArrayList d = new ArrayList();

    public final ArrayList f7327f = new ArrayList();

    public final ArrayList f7328g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public final HashSet f7330j = new HashSet();

    public final HashSet f7331k = new HashSet();

    public final HashSet f7332l = new HashSet();

    public final HashMap f7333m = new HashMap();

    public final HashMap f7334n = new HashMap();

    public final HashMap f7335o = new HashMap();

    public h5 f7336p = h5.BY_PRICE;

    public boolean f7341u = false;
    public int v = -1;

    public i5(long j10, int i10, Utilities.Callback callback) {
        this.f7323a = i10;
        this.f7324b = j10;
        this.f7325c = callback;
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
        return this.f7326e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f7323a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f7340t = false;
    }

    public final void g(boolean z10) {
        if (this.f7340t) {
            return;
        }
        if (z10 || !this.f7341u) {
            this.f7340t = true;
            TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
            getresalestargifts.gift_id = this.f7324b;
            String str = this.f7337q;
            if (str == null) {
                str = "";
            }
            getresalestargifts.offset = str;
            getresalestargifts.limit = 15;
            getresalestargifts.for_craft = this.f7339s;
            getresalestargifts.stars_only = this.f7338r;
            h5 h5Var = this.f7336p;
            int i10 = 0;
            if (h5Var == h5.BY_NUMBER) {
                getresalestargifts.sort_by_num = true;
                getresalestargifts.sort_by_price = false;
            } else if (h5Var == h5.BY_DATE) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = false;
            } else if (h5Var == h5.BY_PRICE) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = true;
            }
            long j10 = this.f7329i;
            ArrayList arrayList = this.h;
            ArrayList arrayList2 = this.f7328g;
            ArrayList arrayList3 = this.f7327f;
            if (j10 != 0) {
                getresalestargifts.flags = 1 | getresalestargifts.flags;
                getresalestargifts.attributes_hash = j10;
            } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                getresalestargifts.flags = 1 | getresalestargifts.flags;
                getresalestargifts.attributes_hash = 0L;
            }
            HashSet hashSet = this.f7330j;
            boolean zIsEmpty = hashSet.isEmpty();
            HashSet hashSet2 = this.f7332l;
            HashSet hashSet3 = this.f7331k;
            if (!zIsEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                getresalestargifts.flags |= 8;
                if (!hashSet.isEmpty()) {
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
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
                        if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f22386id))) {
                            TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                            stargiftattributeidpattern.document_id = stargiftattributepattern.document.f22386id;
                            getresalestargifts.attributes.add(stargiftattributeidpattern);
                        }
                    }
                }
            }
            this.v = ConnectionsManager.getInstance(this.f7323a).sendRequest(getresalestargifts, new cg.g0(3, this, getresalestargifts));
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f7337q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f7325c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(h5 h5Var) {
        if (this.f7336p != h5Var) {
            this.f7336p = h5Var;
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
