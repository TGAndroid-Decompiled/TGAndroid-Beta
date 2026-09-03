package cg;

import f2.q;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.tx;
import org.telegram.ui.w61;
import uf.i;
import uf.k;
public final class a extends q {
    public final int f2503b;
    public ArrayList f2504c;
    public Object d;

    public a() {
        this.f2503b = 0;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f2503b) {
            case 0:
                b bVar = (b) this.f2504c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f2505a != bVar2.f2505a) {
                    return false;
                }
                return bVar.a(bVar2);
            case 1:
                return true;
            case 2:
                return b(i10, i11);
            case 3:
                return true;
            default:
                if (((i) ((k) this.d).K.get(i10)).f2505a == ((i) this.f2504c.get(i11)).f2505a) {
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
        switch (this.f2503b) {
            case 0:
                b bVar = (b) this.f2504c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f2505a != bVar2.f2505a) {
                    return false;
                }
                return bVar.equals(bVar2);
            case 1:
                return ((Integer) this.f2504c.get(i10)).equals(((tx) this.d).f31428n.get(i11));
            case 2:
                return Objects.equals(this.f2504c.get(i10), ((ol0) this.d).f29809n.get(i11));
            case 3:
                return ((Long) this.f2504c.get(i10)).equals(((w61) this.d).f42344s0.get(i11));
            default:
                i iVar = (i) ((k) this.d).K.get(i10);
                i iVar2 = (i) this.f2504c.get(i11);
                TLRPC.Dialog dialog = iVar.f48629c;
                int i12 = iVar.f2505a;
                int i13 = iVar2.f2505a;
                TLRPC.Dialog dialog2 = iVar2.f48629c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : iVar.f48634j == iVar2.f48634j : (tL_contact = iVar.f48630e) != null && (tL_contact2 = iVar2.f48630e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = iVar.d) != null && iVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f20849id == dialog2.f20849id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f20849id == dialog2.f20849id && iVar.h == iVar2.h && iVar.f48631f == iVar2.f48631f && iVar.f48632g == iVar2.f48632g))) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int d() {
        switch (this.f2503b) {
            case 0:
                return ((ArrayList) this.d).size();
            case 1:
                return ((tx) this.d).f31428n.size();
            case 2:
                return ((ol0) this.d).f29809n.size();
            case 3:
                return ((w61) this.d).f42344s0.size();
            default:
                return this.f2504c.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f2503b) {
            case 0:
                return this.f2504c.size();
            case 1:
                return this.f2504c.size();
            case 2:
                return this.f2504c.size();
            case 3:
                return this.f2504c.size();
            default:
                return ((k) this.d).K.size();
        }
    }

    public a(Object obj, ArrayList arrayList, int i10) {
        this.f2503b = i10;
        this.d = obj;
        this.f2504c = arrayList;
    }
}
