package gg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.n71;
public final class g extends s4.o {
    public final int f10605b;
    public ArrayList f10606c;
    public Object d;

    public g() {
        this.f10605b = 1;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f10605b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f16876a == ((k) this.f10606c.get(i11)).f16876a) {
                    return true;
                }
                return false;
            case 1:
                og.a aVar = (og.a) this.f10606c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f16876a != aVar2.f16876a) {
                    return false;
                }
                return aVar.a(aVar2);
            case 2:
                return true;
            case 3:
                return b(i10, i11);
            default:
                return true;
        }
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f10605b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f10606c.get(i11);
                TLRPC.Dialog dialog = kVar.f10698c;
                int i12 = kVar.f16876a;
                int i13 = kVar2.f16876a;
                TLRPC.Dialog dialog2 = kVar2.f10698c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f10703j == kVar2.f10703j : (tL_contact = kVar.f10699e) != null && (tL_contact2 = kVar2.f10699e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f19806id == dialog2.f19806id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f19806id == dialog2.f19806id && kVar.h == kVar2.h && kVar.f10700f == kVar2.f10700f && kVar.f10701g == kVar2.f10701g))) {
                    return false;
                }
                return true;
            case 1:
                og.a aVar = (og.a) this.f10606c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f16876a != aVar2.f16876a) {
                    return false;
                }
                return aVar.equals(aVar2);
            case 2:
                return ((Integer) this.f10606c.get(i10)).equals(((my) this.d).f28679n.get(i11));
            case 3:
                return Objects.equals(this.f10606c.get(i10), ((sm0) this.d).f30594n.get(i11));
            default:
                return ((Long) this.f10606c.get(i10)).equals(((n71) this.d).f40301v0.get(i11));
        }
    }

    @Override
    public final int d() {
        switch (this.f10605b) {
            case 0:
                return this.f10606c.size();
            case 1:
                return ((ArrayList) this.d).size();
            case 2:
                return ((my) this.d).f28679n.size();
            case 3:
                return ((sm0) this.d).f30594n.size();
            default:
                return ((n71) this.d).f40301v0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f10605b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f10606c.size();
            case 2:
                return this.f10606c.size();
            case 3:
                return this.f10606c.size();
            default:
                return this.f10606c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f10605b = i10;
        this.d = obj;
        this.f10606c = arrayList;
    }
}
