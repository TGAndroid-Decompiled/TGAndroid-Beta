package of;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.b61;
public final class g extends f2.s {
    public final int f19354b;
    public ArrayList f19355c;
    public Object d;

    public g() {
        this.f19354b = 4;
    }

    @Override
    public final boolean a(int i9, int i10) {
        switch (this.f19354b) {
            case 0:
                if (((k) ((m) this.d).J.get(i9)).f48814a == ((k) this.f19355c.get(i10)).f48814a) {
                    return true;
                }
                return false;
            case 1:
                return true;
            case 2:
                return b(i9, i10);
            case 3:
                return true;
            default:
                wf.a aVar = (wf.a) this.f19355c.get(i9);
                wf.a aVar2 = (wf.a) ((ArrayList) this.d).get(i10);
                if (aVar.f48814a != aVar2.f48814a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i9, int i10) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f19354b) {
            case 0:
                k kVar = (k) ((m) this.d).J.get(i9);
                k kVar2 = (k) this.f19355c.get(i10);
                TLRPC.Dialog dialog = kVar.f19385c;
                int i11 = kVar.f48814a;
                int i12 = kVar2.f48814a;
                TLRPC.Dialog dialog2 = kVar2.f19385c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.f19390j == kVar2.f19390j : (tL_contact = kVar.f19386e) != null && (tL_contact2 = kVar2.f19386e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f22384id == dialog2.f22384id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f22384id == dialog2.f22384id && kVar.h == kVar2.h && kVar.f19387f == kVar2.f19387f && kVar.f19388g == kVar2.f19388g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f19355c.get(i9)).equals(((fx) this.d).f28591n.get(i10));
            case 2:
                return Objects.equals(this.f19355c.get(i9), ((sk0) this.d).f32488n.get(i10));
            case 3:
                return ((Long) this.f19355c.get(i9)).equals(((b61) this.d).f36699r0.get(i10));
            default:
                wf.a aVar = (wf.a) this.f19355c.get(i9);
                wf.a aVar2 = (wf.a) ((ArrayList) this.d).get(i10);
                if (aVar.f48814a != aVar2.f48814a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f19354b) {
            case 0:
                return this.f19355c.size();
            case 1:
                return ((fx) this.d).f28591n.size();
            case 2:
                return ((sk0) this.d).f32488n.size();
            case 3:
                return ((b61) this.d).f36699r0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f19354b) {
            case 0:
                return ((m) this.d).J.size();
            case 1:
                return this.f19355c.size();
            case 2:
                return this.f19355c.size();
            case 3:
                return this.f19355c.size();
            default:
                return this.f19355c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i9) {
        this.f19354b = i9;
        this.d = obj;
        this.f19355c = arrayList;
    }
}
