package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.u3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.h40;
import org.telegram.ui.q11;
public final class g extends v4.p {
    public final int f17554b;
    public final ArrayList f17555c;
    public final Object d;

    public g(Object obj, ArrayList arrayList, int i7) {
        this.f17554b = i7;
        this.d = obj;
        this.f17555c = arrayList;
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f17554b) {
            case 0:
                if (((k) ((m) this.d).O.get(i7)).f56712a == ((k) this.f17555c.get(i10)).f56712a) {
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
        switch (this.f17554b) {
            case 0:
                k kVar = (k) ((m) this.d).O.get(i7);
                k kVar2 = (k) this.f17555c.get(i10);
                TLRPC.Dialog dialog = kVar.f17642c;
                int i11 = kVar.f56712a;
                int i12 = kVar2.f56712a;
                TLRPC.Dialog dialog2 = kVar2.f17642c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.f17647j == kVar2.f17647j : (tL_contact = kVar.f17643e) != null && (tL_contact2 = kVar2.f17643e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f28496id == dialog2.f28496id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f28496id == dialog2.f28496id && kVar.h == kVar2.h && kVar.f17644f == kVar2.f17644f && kVar.f17645g == kVar2.f17645g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f17555c.get(i7)).equals(((ax) this.d).f33569n.get(i10));
            case 2:
                return Objects.equals(this.f17555c.get(i7), ((zj0) this.d).f42915n.get(i10));
            case 3:
                if (((b11) this.f17555c.get(i7)).a() == ((b11) ((a11) this.d).f33317c.get(i10)).a()) {
                    return true;
                }
                return false;
            case 4:
                h40 h40Var = (h40) this.d;
                ArrayList arrayList = this.f17555c;
                if (i7 < arrayList.size() && i10 < h40Var.f48422e.size()) {
                    return ((u3) arrayList.get(i7)).equals(h40Var.f48422e.get(i10));
                }
                return false;
            default:
                return ((Long) this.f17555c.get(i7)).equals(((q11) this.d).f51276w0.get(i10));
        }
    }

    @Override
    public final int d() {
        switch (this.f17554b) {
            case 0:
                return this.f17555c.size();
            case 1:
                return ((ax) this.d).f33569n.size();
            case 2:
                return ((zj0) this.d).f42915n.size();
            case 3:
                return ((a11) this.d).f33317c.size();
            case 4:
                return ((h40) this.d).f48422e.size();
            default:
                return ((q11) this.d).f51276w0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f17554b) {
            case 0:
                return ((m) this.d).O.size();
            case 1:
                return this.f17555c.size();
            case 2:
                return this.f17555c.size();
            case 3:
                return this.f17555c.size();
            case 4:
                return this.f17555c.size();
            default:
                return this.f17555c.size();
        }
    }
}
