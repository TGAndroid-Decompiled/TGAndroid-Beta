package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.vw;
import org.telegram.ui.f40;
import org.telegram.ui.n11;
public final class g extends v4.o {
    public final int f17075b;
    public final ArrayList f17076c;
    public final Object d;

    public g(Object obj, ArrayList arrayList, int i7) {
        this.f17075b = i7;
        this.d = obj;
        this.f17076c = arrayList;
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f17075b) {
            case 0:
                if (((k) ((m) this.d).O.get(i7)).f56015a == ((k) this.f17076c.get(i10)).f56015a) {
                    return true;
                }
                return false;
            case 1:
                return true;
            case 2:
                return b(i7, i10);
            case 3:
                return false;
            case 4:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f17075b) {
            case 0:
                k kVar = (k) ((m) this.d).O.get(i7);
                k kVar2 = (k) this.f17076c.get(i10);
                TLRPC.Dialog dialog = kVar.f17163c;
                int i11 = kVar.f56015a;
                int i12 = kVar2.f56015a;
                TLRPC.Dialog dialog2 = kVar2.f17163c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.f17168j == kVar2.f17168j : (tL_contact = kVar.f17164e) != null && (tL_contact2 = kVar2.f17164e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f28055id == dialog2.f28055id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f28055id == dialog2.f28055id && kVar.h == kVar2.h && kVar.f17165f == kVar2.f17165f && kVar.f17166g == kVar2.f17166g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f17076c.get(i7)).equals(((vw) this.d).f41168n.get(i10));
            case 2:
                return Objects.equals(this.f17076c.get(i7), ((pj0) this.d).f38320n.get(i10));
            case 3:
                if (((s01) this.f17076c.get(i7)).a() == ((s01) ((q01) this.d).f38458c.get(i10)).a()) {
                    return true;
                }
                return false;
            case 4:
                f40 f40Var = (f40) this.d;
                ArrayList arrayList = this.f17076c;
                if (i7 < arrayList.size() && i10 < f40Var.f46977e.size()) {
                    return ((s3) arrayList.get(i7)).equals(f40Var.f46977e.get(i10));
                }
                return false;
            default:
                return ((Long) this.f17076c.get(i7)).equals(((n11) this.d).f49414w0.get(i10));
        }
    }

    @Override
    public final int d() {
        switch (this.f17075b) {
            case 0:
                return this.f17076c.size();
            case 1:
                return ((vw) this.d).f41168n.size();
            case 2:
                return ((pj0) this.d).f38320n.size();
            case 3:
                return ((q01) this.d).f38458c.size();
            case 4:
                return ((f40) this.d).f46977e.size();
            default:
                return ((n11) this.d).f49414w0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f17075b) {
            case 0:
                return ((m) this.d).O.size();
            case 1:
                return this.f17076c.size();
            case 2:
                return this.f17076c.size();
            case 3:
                return this.f17076c.size();
            case 4:
                return this.f17076c.size();
            default:
                return this.f17076c.size();
        }
    }
}
