package hg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.s11;
import org.telegram.ui.d50;
import org.telegram.ui.g31;
import s4.n;
import zf.k;
import zf.m;
public final class a extends n {
    public final int f7679b;
    public ArrayList f7680c;
    public Object d;

    public a() {
        this.f7679b = 0;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f7679b) {
            case 0:
                b bVar = (b) this.f7680c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f7681a != bVar2.f7681a) {
                    return false;
                }
                return bVar.a(bVar2);
            case 1:
                return true;
            case 2:
                return b(i10, i11);
            case 3:
                return false;
            case 4:
                return true;
            case 5:
                return true;
            default:
                if (((k) ((m) this.d).N.get(i10)).f7681a == ((k) this.f7680c.get(i11)).f7681a) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f7679b) {
            case 0:
                b bVar = (b) this.f7680c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f7681a != bVar2.f7681a) {
                    return false;
                }
                return bVar.equals(bVar2);
            case 1:
                return ((Integer) this.f7680c.get(i10)).equals(((ex) this.d).f25958n.get(i11));
            case 2:
                return Objects.equals(this.f7680c.get(i10), ((pk0) this.d).f29447n.get(i11));
            case 3:
                if (((s11) this.f7680c.get(i10)).a() == ((s11) ((r11) this.d).f29856c.get(i11)).a()) {
                    return true;
                }
                return false;
            case 4:
                d50 d50Var = (d50) this.d;
                ArrayList arrayList = this.f7680c;
                if (i10 < arrayList.size() && i11 < d50Var.e.size()) {
                    return ((v3) arrayList.get(i10)).equals(d50Var.e.get(i11));
                }
                return false;
            case 5:
                return ((Long) this.f7680c.get(i10)).equals(((g31) this.d).f37334v0.get(i11));
            default:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f7680c.get(i11);
                TLRPC.Dialog dialog = kVar.f55562c;
                int i12 = kVar.f7681a;
                int i13 = kVar2.f7681a;
                TLRPC.Dialog dialog2 = kVar2.f55562c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f55566j == kVar2.f55566j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f19798id == dialog2.f19798id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f19798id == dialog2.f19798id && kVar.h == kVar2.h && kVar.f55563f == kVar2.f55563f && kVar.f55564g == kVar2.f55564g))) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int d() {
        switch (this.f7679b) {
            case 0:
                return ((ArrayList) this.d).size();
            case 1:
                return ((ex) this.d).f25958n.size();
            case 2:
                return ((pk0) this.d).f29447n.size();
            case 3:
                return ((r11) this.d).f29856c.size();
            case 4:
                return ((d50) this.d).e.size();
            case 5:
                return ((g31) this.d).f37334v0.size();
            default:
                return this.f7680c.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f7679b) {
            case 0:
                return this.f7680c.size();
            case 1:
                return this.f7680c.size();
            case 2:
                return this.f7680c.size();
            case 3:
                return this.f7680c.size();
            case 4:
                return this.f7680c.size();
            case 5:
                return this.f7680c.size();
            default:
                return ((m) this.d).N.size();
        }
    }

    public a(Object obj, ArrayList arrayList, int i10) {
        this.f7679b = i10;
        this.d = obj;
        this.f7680c = arrayList;
    }
}
