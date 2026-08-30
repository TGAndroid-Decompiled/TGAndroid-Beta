package bg;

import f2.q;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.rx;
import org.telegram.ui.q61;
import tf.i;
import tf.k;
public final class a extends q {
    public final int f1806b;
    public ArrayList f1807c;
    public Object d;

    public a() {
        this.f1806b = 0;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f1806b) {
            case 0:
                b bVar = (b) this.f1807c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f1808a != bVar2.f1808a) {
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
                if (((i) ((k) this.d).K.get(i10)).f1808a == ((i) this.f1807c.get(i11)).f1808a) {
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
        switch (this.f1806b) {
            case 0:
                b bVar = (b) this.f1807c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.f1808a != bVar2.f1808a) {
                    return false;
                }
                return bVar.equals(bVar2);
            case 1:
                return ((Integer) this.f1807c.get(i10)).equals(((rx) this.d).f28550n.get(i11));
            case 2:
                return Objects.equals(this.f1807c.get(i10), ((ol0) this.d).f27589n.get(i11));
            case 3:
                return ((Long) this.f1807c.get(i10)).equals(((q61) this.d).f37635s0.get(i11));
            default:
                i iVar = (i) ((k) this.d).K.get(i10);
                i iVar2 = (i) this.f1807c.get(i11);
                TLRPC.Dialog dialog = iVar.f44746c;
                int i12 = iVar.f1808a;
                int i13 = iVar2.f1808a;
                TLRPC.Dialog dialog2 = iVar2.f44746c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : iVar.f44750j == iVar2.f44750j : (tL_contact = iVar.e) != null && (tL_contact2 = iVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = iVar.d) != null && iVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f19188id == dialog2.f19188id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f19188id == dialog2.f19188id && iVar.h == iVar2.h && iVar.f44747f == iVar2.f44747f && iVar.f44748g == iVar2.f44748g))) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int d() {
        switch (this.f1806b) {
            case 0:
                return ((ArrayList) this.d).size();
            case 1:
                return ((rx) this.d).f28550n.size();
            case 2:
                return ((ol0) this.d).f27589n.size();
            case 3:
                return ((q61) this.d).f37635s0.size();
            default:
                return this.f1807c.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f1806b) {
            case 0:
                return this.f1807c.size();
            case 1:
                return this.f1807c.size();
            case 2:
                return this.f1807c.size();
            case 3:
                return this.f1807c.size();
            default:
                return ((k) this.d).K.size();
        }
    }

    public a(Object obj, ArrayList arrayList, int i10) {
        this.f1806b = i10;
        this.d = obj;
        this.f1807c = arrayList;
    }
}
