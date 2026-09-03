package bg;

import f2.q;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.rx;
import org.telegram.ui.x61;
import tf.i;
import tf.k;
public final class a extends q {
    public final int f1828b;
    public ArrayList f1829c;
    public Object d;

    public a() {
        this.f1828b = 0;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f1828b) {
            case 0:
                b bVar = (b) this.f1829c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f1830a != bVar2.f1830a) {
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
                if (((i) ((k) this.d).K.get(i10)).f1830a == ((i) this.f1829c.get(i11)).f1830a) {
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
        switch (this.f1828b) {
            case 0:
                b bVar = (b) this.f1829c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f1830a != bVar2.f1830a) {
                    return false;
                }
                return bVar.equals(bVar2);
            case 1:
                return ((Integer) this.f1829c.get(i10)).equals(((rx) this.d).f28599n.get(i11));
            case 2:
                return Objects.equals(this.f1829c.get(i10), ((nl0) this.d).f27297n.get(i11));
            case 3:
                return ((Long) this.f1829c.get(i10)).equals(((x61) this.d).f39892s0.get(i11));
            default:
                i iVar = (i) ((k) this.d).K.get(i10);
                i iVar2 = (i) this.f1829c.get(i11);
                TLRPC.Dialog dialog = iVar.f44807c;
                int i12 = iVar.f1830a;
                int i13 = iVar2.f1830a;
                TLRPC.Dialog dialog2 = iVar2.f44807c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : iVar.f44811j == iVar2.f44811j : (tL_contact = iVar.e) != null && (tL_contact2 = iVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = iVar.d) != null && iVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f19163id == dialog2.f19163id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f19163id == dialog2.f19163id && iVar.h == iVar2.h && iVar.f44808f == iVar2.f44808f && iVar.f44809g == iVar2.f44809g))) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int d() {
        switch (this.f1828b) {
            case 0:
                return ((ArrayList) this.d).size();
            case 1:
                return ((rx) this.d).f28599n.size();
            case 2:
                return ((nl0) this.d).f27297n.size();
            case 3:
                return ((x61) this.d).f39892s0.size();
            default:
                return this.f1829c.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f1828b) {
            case 0:
                return this.f1829c.size();
            case 1:
                return this.f1829c.size();
            case 2:
                return this.f1829c.size();
            case 3:
                return this.f1829c.size();
            default:
                return ((k) this.d).K.size();
        }
    }

    public a(Object obj, ArrayList arrayList, int i10) {
        this.f1828b = i10;
        this.d = obj;
        this.f1829c = arrayList;
    }
}
