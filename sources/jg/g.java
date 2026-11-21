package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.u3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.i40;
import org.telegram.ui.s11;
public final class g extends v4.o {
    public final int f17483b;
    public final ArrayList f17484c;
    public final Object d;

    public g(Object obj, ArrayList arrayList, int i7) {
        this.f17483b = i7;
        this.d = obj;
        this.f17484c = arrayList;
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f17483b) {
            case 0:
                if (((k) ((m) this.d).O.get(i7)).f56630a == ((k) this.f17484c.get(i10)).f56630a) {
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
        switch (this.f17483b) {
            case 0:
                k kVar = (k) ((m) this.d).O.get(i7);
                k kVar2 = (k) this.f17484c.get(i10);
                TLRPC.Dialog dialog = kVar.f17571c;
                int i11 = kVar.f56630a;
                int i12 = kVar2.f56630a;
                TLRPC.Dialog dialog2 = kVar2.f17571c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.f17576j == kVar2.f17576j : (tL_contact = kVar.f17572e) != null && (tL_contact2 = kVar2.f17572e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f28435id == dialog2.f28435id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f28435id == dialog2.f28435id && kVar.h == kVar2.h && kVar.f17573f == kVar2.f17573f && kVar.f17574g == kVar2.f17574g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f17484c.get(i7)).equals(((dx) this.d).f34604n.get(i10));
            case 2:
                return Objects.equals(this.f17484c.get(i7), ((zj0) this.d).f42898n.get(i10));
            case 3:
                if (((d11) this.f17484c.get(i7)).a() == ((d11) ((c11) this.d).f33982c.get(i10)).a()) {
                    return true;
                }
                return false;
            case 4:
                i40 i40Var = (i40) this.d;
                ArrayList arrayList = this.f17484c;
                if (i7 < arrayList.size() && i10 < i40Var.f48569e.size()) {
                    return ((u3) arrayList.get(i7)).equals(i40Var.f48569e.get(i10));
                }
                return false;
            default:
                return ((Long) this.f17484c.get(i7)).equals(((s11) this.d).f51869w0.get(i10));
        }
    }

    @Override
    public final int d() {
        switch (this.f17483b) {
            case 0:
                return this.f17484c.size();
            case 1:
                return ((dx) this.d).f34604n.size();
            case 2:
                return ((zj0) this.d).f42898n.size();
            case 3:
                return ((c11) this.d).f33982c.size();
            case 4:
                return ((i40) this.d).f48569e.size();
            default:
                return ((s11) this.d).f51869w0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f17483b) {
            case 0:
                return ((m) this.d).O.size();
            case 1:
                return this.f17484c.size();
            case 2:
                return this.f17484c.size();
            case 3:
                return this.f17484c.size();
            case 4:
                return this.f17484c.size();
            default:
                return this.f17484c.size();
        }
    }
}
