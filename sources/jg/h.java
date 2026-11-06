package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.pw;
import org.telegram.ui.f40;
import org.telegram.ui.q11;
public final class h extends v4.o {
    public final int f16732b;
    public ArrayList f16733c;
    public Object d;

    public h() {
        this.f16732b = 6;
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f16732b) {
            case 0:
                if (((l) ((n) this.d).N.get(i7)).f54415a == ((l) this.f16733c.get(i10)).f54415a) {
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
            case 5:
                return true;
            default:
                rg.a aVar = (rg.a) this.f16733c.get(i7);
                rg.a aVar2 = (rg.a) ((ArrayList) this.d).get(i10);
                if (aVar.f54415a != aVar2.f54415a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f16732b) {
            case 0:
                l lVar = (l) ((n) this.d).N.get(i7);
                l lVar2 = (l) this.f16733c.get(i10);
                TLRPC.Dialog dialog = lVar.f16817c;
                int i11 = lVar.f54415a;
                int i12 = lVar2.f54415a;
                TLRPC.Dialog dialog2 = lVar2.f16817c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : lVar.f16822j == lVar2.f16822j : (tL_contact = lVar.f16818e) != null && (tL_contact2 = lVar2.f16818e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = lVar.d) != null && lVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f26956id == dialog2.f26956id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f26956id == dialog2.f26956id && lVar.h == lVar2.h && lVar.f16819f == lVar2.f16819f && lVar.f16820g == lVar2.f16820g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f16733c.get(i7)).equals(((pw) this.d).f37185n.get(i10));
            case 2:
                return Objects.equals(this.f16733c.get(i7), ((kj0) this.d).f35328n.get(i10));
            case 3:
                if (((l01) this.f16733c.get(i7)).a() == ((l01) ((k01) this.d).f35137c.get(i10)).a()) {
                    return true;
                }
                return false;
            case 4:
                f40 f40Var = (f40) this.d;
                ArrayList arrayList = this.f16733c;
                if (i7 < arrayList.size() && i10 < f40Var.f45472e.size()) {
                    return ((s3) arrayList.get(i7)).equals(f40Var.f45472e.get(i10));
                }
                return false;
            case 5:
                return ((Long) this.f16733c.get(i7)).equals(((q11) this.d).f49036v0.get(i10));
            default:
                rg.a aVar = (rg.a) this.f16733c.get(i7);
                rg.a aVar2 = (rg.a) ((ArrayList) this.d).get(i10);
                if (aVar.f54415a != aVar2.f54415a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f16732b) {
            case 0:
                return this.f16733c.size();
            case 1:
                return ((pw) this.d).f37185n.size();
            case 2:
                return ((kj0) this.d).f35328n.size();
            case 3:
                return ((k01) this.d).f35137c.size();
            case 4:
                return ((f40) this.d).f45472e.size();
            case 5:
                return ((q11) this.d).f49036v0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f16732b) {
            case 0:
                return ((n) this.d).N.size();
            case 1:
                return this.f16733c.size();
            case 2:
                return this.f16733c.size();
            case 3:
                return this.f16733c.size();
            case 4:
                return this.f16733c.size();
            case 5:
                return this.f16733c.size();
            default:
                return this.f16733c.size();
        }
    }

    public h(Object obj, ArrayList arrayList, int i7) {
        this.f16732b = i7;
        this.d = obj;
        this.f16733c = arrayList;
    }
}
