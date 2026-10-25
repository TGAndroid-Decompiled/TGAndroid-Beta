package ig;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.c61;
public final class h extends s4.p {
    public final int f14062b;
    public ArrayList f14063c;
    public Object d;

    public h() {
        this.f14062b = 4;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f14062b) {
            case 0:
                if (((l) ((n) this.d).N.get(i10)).f47037a == ((l) this.f14063c.get(i11)).f47037a) {
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
                qg.a aVar = (qg.a) this.f14063c.get(i10);
                qg.a aVar2 = (qg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f47037a != aVar2.f47037a) {
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
        switch (this.f14062b) {
            case 0:
                l lVar = (l) ((n) this.d).N.get(i10);
                l lVar2 = (l) this.f14063c.get(i11);
                TLRPC.Dialog dialog = lVar.f14150c;
                int i12 = lVar.f47037a;
                int i13 = lVar2.f47037a;
                TLRPC.Dialog dialog2 = lVar2.f14150c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : lVar.f14154j == lVar2.f14154j : (tL_contact = lVar.e) != null && (tL_contact2 = lVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = lVar.d) != null && lVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f22031id == dialog2.f22031id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f22031id == dialog2.f22031id && lVar.h == lVar2.h && lVar.f14151f == lVar2.f14151f && lVar.f14152g == lVar2.f14152g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f14063c.get(i10)).equals(((zx) this.d).f35426n.get(i11));
            case 2:
                return Objects.equals(this.f14063c.get(i10), ((hm0) this.d).f29014n.get(i11));
            case 3:
                return ((Long) this.f14063c.get(i10)).equals(((c61) this.d).f38325v0.get(i11));
            default:
                qg.a aVar = (qg.a) this.f14063c.get(i10);
                qg.a aVar2 = (qg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f47037a != aVar2.f47037a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f14062b) {
            case 0:
                return this.f14063c.size();
            case 1:
                return ((zx) this.d).f35426n.size();
            case 2:
                return ((hm0) this.d).f29014n.size();
            case 3:
                return ((c61) this.d).f38325v0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f14062b) {
            case 0:
                return ((n) this.d).N.size();
            case 1:
                return this.f14063c.size();
            case 2:
                return this.f14063c.size();
            case 3:
                return this.f14063c.size();
            default:
                return this.f14063c.size();
        }
    }

    public h(Object obj, ArrayList arrayList, int i10) {
        this.f14062b = i10;
        this.d = obj;
        this.f14063c = arrayList;
    }
}
