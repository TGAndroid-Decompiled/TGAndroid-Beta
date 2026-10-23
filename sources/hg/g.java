package hg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.im0;
import org.telegram.ui.b61;
public final class g extends s4.o {
    public final int f11891b;
    public ArrayList f11892c;
    public Object d;

    public g() {
        this.f11891b = 4;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f11891b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f44713a == ((k) this.f11892c.get(i11)).f44713a) {
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
                pg.a aVar = (pg.a) this.f11892c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f44713a != aVar2.f44713a) {
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
        switch (this.f11891b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f11892c.get(i11);
                TLRPC.Dialog dialog = kVar.f11980c;
                int i12 = kVar.f44713a;
                int i13 = kVar2.f44713a;
                TLRPC.Dialog dialog2 = kVar2.f11980c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f11984j == kVar2.f11984j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f20347id == dialog2.f20347id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f20347id == dialog2.f20347id && kVar.h == kVar2.h && kVar.f11981f == kVar2.f11981f && kVar.f11982g == kVar2.f11982g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f11892c.get(i10)).equals(((ay) this.d).f24868n.get(i11));
            case 2:
                return Objects.equals(this.f11892c.get(i10), ((im0) this.d).f27370n.get(i11));
            case 3:
                return ((Long) this.f11892c.get(i10)).equals(((b61) this.d).f35934v0.get(i11));
            default:
                pg.a aVar = (pg.a) this.f11892c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f44713a != aVar2.f44713a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f11891b) {
            case 0:
                return this.f11892c.size();
            case 1:
                return ((ay) this.d).f24868n.size();
            case 2:
                return ((im0) this.d).f27370n.size();
            case 3:
                return ((b61) this.d).f35934v0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f11891b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f11892c.size();
            case 2:
                return this.f11892c.size();
            case 3:
                return this.f11892c.size();
            default:
                return this.f11892c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f11891b = i10;
        this.d = obj;
        this.f11892c = arrayList;
    }
}
