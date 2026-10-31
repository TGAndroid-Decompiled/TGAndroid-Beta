package hg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.e50;
import org.telegram.ui.i31;
import s4.n;
import zf.k;
import zf.m;
public final class a extends n {
    public final int f7678b;
    public ArrayList f7679c;
    public Object d;

    public a() {
        this.f7678b = 0;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f7678b) {
            case 0:
                b bVar = (b) this.f7679c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f7680a != bVar2.f7680a) {
                    return false;
                }
                return bVar.a(bVar2);
            case 1:
                return true;
            case 2:
                return b(i10, i11);
            case 3:
                return true;
            case 4:
                return true;
            default:
                if (((k) ((m) this.d).N.get(i10)).f7680a == ((k) this.f7679c.get(i11)).f7680a) {
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
        switch (this.f7678b) {
            case 0:
                b bVar = (b) this.f7679c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f7680a != bVar2.f7680a) {
                    return false;
                }
                return bVar.equals(bVar2);
            case 1:
                return ((Integer) this.f7679c.get(i10)).equals(((ex) this.d).f25881n.get(i11));
            case 2:
                return Objects.equals(this.f7679c.get(i10), ((ok0) this.d).f29092n.get(i11));
            case 3:
                e50 e50Var = (e50) this.d;
                ArrayList arrayList = this.f7679c;
                if (i10 < arrayList.size() && i11 < e50Var.e.size()) {
                    return ((v3) arrayList.get(i10)).equals(e50Var.e.get(i11));
                }
                return false;
            case 4:
                return ((Long) this.f7679c.get(i10)).equals(((i31) this.d).f38158v0.get(i11));
            default:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f7679c.get(i11);
                TLRPC.Dialog dialog = kVar.f55544c;
                int i12 = kVar.f7680a;
                int i13 = kVar2.f7680a;
                TLRPC.Dialog dialog2 = kVar2.f55544c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f55548j == kVar2.f55548j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f19797id == dialog2.f19797id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f19797id == dialog2.f19797id && kVar.h == kVar2.h && kVar.f55545f == kVar2.f55545f && kVar.f55546g == kVar2.f55546g))) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int d() {
        switch (this.f7678b) {
            case 0:
                return ((ArrayList) this.d).size();
            case 1:
                return ((ex) this.d).f25881n.size();
            case 2:
                return ((ok0) this.d).f29092n.size();
            case 3:
                return ((e50) this.d).e.size();
            case 4:
                return ((i31) this.d).f38158v0.size();
            default:
                return this.f7679c.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f7678b) {
            case 0:
                return this.f7679c.size();
            case 1:
                return this.f7679c.size();
            case 2:
                return this.f7679c.size();
            case 3:
                return this.f7679c.size();
            case 4:
                return this.f7679c.size();
            default:
                return ((m) this.d).N.size();
        }
    }

    public a(Object obj, ArrayList arrayList, int i10) {
        this.f7678b = i10;
        this.d = obj;
        this.f7679c = arrayList;
    }
}
