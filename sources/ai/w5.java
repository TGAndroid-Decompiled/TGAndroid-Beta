package ai;

import ci.w8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class w5 implements w8 {
    public final int f1067a;
    public final long f1068b;
    public final u10 f1069c;
    public int f1070e;
    public long f1073i;
    public String f1081q;
    public boolean f1082r;
    public boolean f1083s;
    public boolean f1084t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f1071f = new ArrayList();
    public final ArrayList f1072g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f1074j = new HashSet();
    public final HashSet f1075k = new HashSet();
    public final HashSet f1076l = new HashSet();
    public final HashMap f1077m = new HashMap();
    public final HashMap f1078n = new HashMap();
    public final HashMap f1079o = new HashMap();
    public v5 f1080p = v5.f1043a;
    public boolean f1085u = false;
    public int v = -1;

    public w5(int i3, long j10, u10 u10Var) {
        this.f1067a = i3;
        this.f1068b = j10;
        this.f1069c = u10Var;
    }

    @Override
    public final void a() {
        g(false);
    }

    @Override
    public final int b(int i3) {
        return -1;
    }

    @Override
    public final int c() {
        return this.f1070e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f1067a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f1084t = false;
    }

    public final void g(boolean z10) {
        if (!this.f1084t) {
            if (z10 || !this.f1085u) {
                this.f1084t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f1068b;
                String str = this.f1081q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f1083s;
                getresalestargifts.stars_only = this.f1082r;
                v5 v5Var = this.f1080p;
                int i3 = 0;
                if (v5Var == v5.f1045c) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (v5Var == v5.f1044b) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (v5Var == v5.f1043a) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j10 = this.f1073i;
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f1072g;
                ArrayList arrayList3 = this.f1071f;
                if (i10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j10;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f1074j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f1076l;
                HashSet hashSet3 = this.f1075k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f27007id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f27007id;
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
                        while (i3 < size3) {
                            Object obj3 = arrayList.get(i3);
                            i3++;
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f27007id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f27007id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f1067a).sendRequest(getresalestargifts, new f3(1, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i3) {
        return this.d.get(i3);
    }

    public final void h() {
        f();
        this.f1081q = null;
        this.d.clear();
        g(true);
        u10 u10Var = this.f1069c;
        if (u10Var != null) {
            u10Var.a(Boolean.TRUE);
        }
    }

    public final void i(v5 v5Var) {
        if (this.f1080p != v5Var) {
            this.f1080p = v5Var;
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
