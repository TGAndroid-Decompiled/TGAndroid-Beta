package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.u3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.i40;
import org.telegram.ui.r11;
public final class g extends v4.o {
    public final int f17461b;
    public final ArrayList f17462c;
    public final Object d;

    public g(Object obj, ArrayList arrayList, int i7) {
        this.f17461b = i7;
        this.d = obj;
        this.f17462c = arrayList;
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f17461b) {
            case 0:
                if (((k) ((m) this.d).O.get(i7)).f56589a == ((k) this.f17462c.get(i10)).f56589a) {
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
        switch (this.f17461b) {
            case 0:
                k kVar = (k) ((m) this.d).O.get(i7);
                k kVar2 = (k) this.f17462c.get(i10);
                TLRPC.Dialog dialog = kVar.f17549c;
                int i11 = kVar.f56589a;
                int i12 = kVar2.f56589a;
                TLRPC.Dialog dialog2 = kVar2.f17549c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.f17554j == kVar2.f17554j : (tL_contact = kVar.f17550e) != null && (tL_contact2 = kVar2.f17550e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f28409id == dialog2.f28409id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f28409id == dialog2.f28409id && kVar.h == kVar2.h && kVar.f17551f == kVar2.f17551f && kVar.f17552g == kVar2.f17552g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f17462c.get(i7)).equals(((bx) this.d).f33804n.get(i10));
            case 2:
                return Objects.equals(this.f17462c.get(i7), ((xj0) this.d).f42105n.get(i10));
            case 3:
                if (((b11) this.f17462c.get(i7)).a() == ((b11) ((a11) this.d).f33221c.get(i10)).a()) {
                    return true;
                }
                return false;
            case 4:
                i40 i40Var = (i40) this.d;
                ArrayList arrayList = this.f17462c;
                if (i7 < arrayList.size() && i10 < i40Var.f48575e.size()) {
                    return ((u3) arrayList.get(i7)).equals(i40Var.f48575e.get(i10));
                }
                return false;
            default:
                return ((Long) this.f17462c.get(i7)).equals(((r11) this.d).f51467w0.get(i10));
        }
    }

    @Override
    public final int d() {
        switch (this.f17461b) {
            case 0:
                return this.f17462c.size();
            case 1:
                return ((bx) this.d).f33804n.size();
            case 2:
                return ((xj0) this.d).f42105n.size();
            case 3:
                return ((a11) this.d).f33221c.size();
            case 4:
                return ((i40) this.d).f48575e.size();
            default:
                return ((r11) this.d).f51467w0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f17461b) {
            case 0:
                return ((m) this.d).O.size();
            case 1:
                return this.f17462c.size();
            case 2:
                return this.f17462c.size();
            case 3:
                return this.f17462c.size();
            case 4:
                return this.f17462c.size();
            default:
                return this.f17462c.size();
        }
    }
}
