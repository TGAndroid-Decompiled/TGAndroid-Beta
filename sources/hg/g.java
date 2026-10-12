package hg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.im0;
import org.telegram.ui.r71;
public final class g extends s4.o {
    public final int f10556b;
    public ArrayList f10557c;
    public Object d;

    public g() {
        this.f10556b = 4;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f10556b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f43203a == ((k) this.f10557c.get(i11)).f43203a) {
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
                pg.a aVar = (pg.a) this.f10557c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f43203a != aVar2.f43203a) {
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
        switch (this.f10556b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f10557c.get(i11);
                TLRPC.Dialog dialog = kVar.f10644c;
                int i12 = kVar.f43203a;
                int i13 = kVar2.f43203a;
                TLRPC.Dialog dialog2 = kVar2.f10644c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f10648j == kVar2.f10648j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f19220id == dialog2.f19220id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f19220id == dialog2.f19220id && kVar.h == kVar2.h && kVar.f10645f == kVar2.f10645f && kVar.f10646g == kVar2.f10646g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f10557c.get(i10)).equals(((fy) this.d).f25136n.get(i11));
            case 2:
                return Objects.equals(this.f10557c.get(i10), ((im0) this.d).f25997n.get(i11));
            case 3:
                return ((Long) this.f10557c.get(i10)).equals(((r71) this.d).f39666v0.get(i11));
            default:
                pg.a aVar = (pg.a) this.f10557c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f43203a != aVar2.f43203a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f10556b) {
            case 0:
                return this.f10557c.size();
            case 1:
                return ((fy) this.d).f25136n.size();
            case 2:
                return ((im0) this.d).f25997n.size();
            case 3:
                return ((r71) this.d).f39666v0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f10556b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f10557c.size();
            case 2:
                return this.f10557c.size();
            case 3:
                return this.f10557c.size();
            default:
                return this.f10557c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f10556b = i10;
        this.d = obj;
        this.f10557c = arrayList;
    }
}
