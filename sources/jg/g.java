package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.u3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.i40;
import org.telegram.ui.s11;
public final class g extends v4.o {
    public final int f17486b;
    public final ArrayList f17487c;
    public final Object d;

    public g(Object obj, ArrayList arrayList, int i7) {
        this.f17486b = i7;
        this.d = obj;
        this.f17487c = arrayList;
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f17486b) {
            case 0:
                if (((k) ((m) this.d).O.get(i7)).f56634a == ((k) this.f17487c.get(i10)).f56634a) {
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
        switch (this.f17486b) {
            case 0:
                k kVar = (k) ((m) this.d).O.get(i7);
                k kVar2 = (k) this.f17487c.get(i10);
                TLRPC.Dialog dialog = kVar.f17574c;
                int i11 = kVar.f56634a;
                int i12 = kVar2.f56634a;
                TLRPC.Dialog dialog2 = kVar2.f17574c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.f17579j == kVar2.f17579j : (tL_contact = kVar.f17575e) != null && (tL_contact2 = kVar2.f17575e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f28438id == dialog2.f28438id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f28438id == dialog2.f28438id && kVar.h == kVar2.h && kVar.f17576f == kVar2.f17576f && kVar.f17577g == kVar2.f17577g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f17487c.get(i7)).equals(((dx) this.d).f34599n.get(i10));
            case 2:
                return Objects.equals(this.f17487c.get(i7), ((zj0) this.d).f42902n.get(i10));
            case 3:
                if (((c11) this.f17487c.get(i7)).a() == ((c11) ((b11) this.d).f33705c.get(i10)).a()) {
                    return true;
                }
                return false;
            case 4:
                i40 i40Var = (i40) this.d;
                ArrayList arrayList = this.f17487c;
                if (i7 < arrayList.size() && i10 < i40Var.f48573e.size()) {
                    return ((u3) arrayList.get(i7)).equals(i40Var.f48573e.get(i10));
                }
                return false;
            default:
                return ((Long) this.f17487c.get(i7)).equals(((s11) this.d).f51873w0.get(i10));
        }
    }

    @Override
    public final int d() {
        switch (this.f17486b) {
            case 0:
                return this.f17487c.size();
            case 1:
                return ((dx) this.d).f34599n.size();
            case 2:
                return ((zj0) this.d).f42902n.size();
            case 3:
                return ((b11) this.d).f33705c.size();
            case 4:
                return ((i40) this.d).f48573e.size();
            default:
                return ((s11) this.d).f51873w0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f17486b) {
            case 0:
                return ((m) this.d).O.size();
            case 1:
                return this.f17487c.size();
            case 2:
                return this.f17487c.size();
            case 3:
                return this.f17487c.size();
            case 4:
                return this.f17487c.size();
            default:
                return this.f17487c.size();
        }
    }
}
