package bi;

import di.n8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class o5 implements n8 {
    public final int f3754a;
    public final long f3755b;
    public final z10 f3756c;
    public int f3757e;
    public long f3760i;
    public String f3768q;
    public boolean f3769r;
    public boolean f3770s;
    public boolean f3771t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f3758f = new ArrayList();
    public final ArrayList f3759g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f3761j = new HashSet();
    public final HashSet f3762k = new HashSet();
    public final HashSet f3763l = new HashSet();
    public final HashMap f3764m = new HashMap();
    public final HashMap f3765n = new HashMap();
    public final HashMap f3766o = new HashMap();
    public n5 f3767p = n5.f3737a;
    public boolean f3772u = false;
    public int v = -1;

    public o5(int i7, long j3, z10 z10Var) {
        this.f3754a = i7;
        this.f3755b = j3;
        this.f3756c = z10Var;
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
        return this.f3757e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f3754a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f3771t = false;
    }

    public final void g(boolean z10) {
        if (!this.f3771t) {
            if (z10 || !this.f3772u) {
                this.f3771t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f3755b;
                String str = this.f3768q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f3770s;
                getresalestargifts.stars_only = this.f3769r;
                n5 n5Var = this.f3767p;
                int i7 = 0;
                if (n5Var == n5.f3739c) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (n5Var == n5.f3738b) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (n5Var == n5.f3737a) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f3760i;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f3759g;
                ArrayList arrayList3 = this.f3758f;
                if (i10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f3761j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f3763l;
                HashSet hashSet3 = this.f3762k;
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
                this.v = ConnectionsManager.getInstance(this.f3754a).sendRequest(getresalestargifts, new v2(1, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i7) {
        return this.d.get(i7);
    }

    public final void h() {
        f();
        this.f3768q = null;
        this.d.clear();
        g(true);
        z10 z10Var = this.f3756c;
        if (z10Var != null) {
            z10Var.a(Boolean.TRUE);
        }
    }

    public final void i(n5 n5Var) {
        if (this.f3767p != n5Var) {
            this.f3767p = n5Var;
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
