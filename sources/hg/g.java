package hg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.tx;
import org.telegram.ui.j71;
public final class g extends s4.o {
    public final int f11053b;
    public ArrayList f11054c;
    public Object d;

    public g() {
        this.f11053b = 4;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f11053b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f44071a == ((k) this.f11054c.get(i11)).f44071a) {
                    return true;
                }
                return false;
            case 1:
                return true;
            case 2:
                return b(i10, i11);
            case 3:
                return true;
            default:
                pg.a aVar = (pg.a) this.f11054c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f44071a != aVar2.f44071a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f11053b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f11054c.get(i11);
                TLRPC.Dialog dialog = kVar.f11114c;
                int i12 = kVar.f44071a;
                int i13 = kVar2.f44071a;
                TLRPC.Dialog dialog2 = kVar2.f11114c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f11119j == kVar2.f11119j : (tL_contact = kVar.f11115e) != null && (tL_contact2 = kVar2.f11115e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f19873id == dialog2.f19873id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f19873id == dialog2.f19873id && kVar.h == kVar2.h && kVar.f11116f == kVar2.f11116f && kVar.f11117g == kVar2.f11117g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f11054c.get(i10)).equals(((tx) this.d).f30727n.get(i11));
            case 2:
                return Objects.equals(this.f11054c.get(i10), ((hl0) this.d).f26751n.get(i11));
            case 3:
                return ((Long) this.f11054c.get(i10)).equals(((j71) this.d).f37675v0.get(i11));
            default:
                pg.a aVar = (pg.a) this.f11054c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f44071a != aVar2.f44071a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f11053b) {
            case 0:
                return this.f11054c.size();
            case 1:
                return ((tx) this.d).f30727n.size();
            case 2:
                return ((hl0) this.d).f26751n.size();
            case 3:
                return ((j71) this.d).f37675v0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f11053b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f11054c.size();
            case 2:
                return this.f11054c.size();
            case 3:
                return this.f11054c.size();
            default:
                return this.f11054c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f11053b = i10;
        this.d = obj;
        this.f11054c = arrayList;
    }
}
