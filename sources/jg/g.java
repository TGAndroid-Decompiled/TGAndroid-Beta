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
import org.telegram.ui.r11;
public final class g extends v4.o {
    public final int f17452b;
    public final ArrayList f17453c;
    public final Object d;

    public g(Object obj, ArrayList arrayList, int i7) {
        this.f17452b = i7;
        this.d = obj;
        this.f17453c = arrayList;
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f17452b) {
            case 0:
                if (((k) ((m) this.d).O.get(i7)).f56599a == ((k) this.f17453c.get(i10)).f56599a) {
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
        switch (this.f17452b) {
            case 0:
                k kVar = (k) ((m) this.d).O.get(i7);
                k kVar2 = (k) this.f17453c.get(i10);
                TLRPC.Dialog dialog = kVar.f17540c;
                int i11 = kVar.f56599a;
                int i12 = kVar2.f56599a;
                TLRPC.Dialog dialog2 = kVar2.f17540c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.f17545j == kVar2.f17545j : (tL_contact = kVar.f17541e) != null && (tL_contact2 = kVar2.f17541e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f28402id == dialog2.f28402id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f28402id == dialog2.f28402id && kVar.h == kVar2.h && kVar.f17542f == kVar2.f17542f && kVar.f17543g == kVar2.f17543g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f17453c.get(i7)).equals(((dx) this.d).f34589n.get(i10));
            case 2:
                return Objects.equals(this.f17453c.get(i7), ((zj0) this.d).f42861n.get(i10));
            case 3:
                if (((c11) this.f17453c.get(i7)).a() == ((c11) ((b11) this.d).f33682c.get(i10)).a()) {
                    return true;
                }
                return false;
            case 4:
                i40 i40Var = (i40) this.d;
                ArrayList arrayList = this.f17453c;
                if (i7 < arrayList.size() && i10 < i40Var.f48545e.size()) {
                    return ((u3) arrayList.get(i7)).equals(i40Var.f48545e.get(i10));
                }
                return false;
            default:
                return ((Long) this.f17453c.get(i7)).equals(((r11) this.d).f51451w0.get(i10));
        }
    }

    @Override
    public final int d() {
        switch (this.f17452b) {
            case 0:
                return this.f17453c.size();
            case 1:
                return ((dx) this.d).f34589n.size();
            case 2:
                return ((zj0) this.d).f42861n.size();
            case 3:
                return ((b11) this.d).f33682c.size();
            case 4:
                return ((i40) this.d).f48545e.size();
            default:
                return ((r11) this.d).f51451w0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f17452b) {
            case 0:
                return ((m) this.d).O.size();
            case 1:
                return this.f17453c.size();
            case 2:
                return this.f17453c.size();
            case 3:
                return this.f17453c.size();
            case 4:
                return this.f17453c.size();
            default:
                return this.f17453c.size();
        }
    }
}
