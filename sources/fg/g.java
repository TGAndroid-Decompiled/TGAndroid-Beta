package fg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.yx;
import org.telegram.ui.l71;
public final class g extends s4.o {
    public final int f8018b;
    public ArrayList f8019c;
    public Object d;

    public g() {
        this.f8018b = 1;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f8018b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f14046a == ((k) this.f8019c.get(i11)).f14046a) {
                    return true;
                }
                return false;
            case 1:
                ng.a aVar = (ng.a) this.f8019c.get(i10);
                ng.a aVar2 = (ng.a) ((ArrayList) this.d).get(i11);
                if (aVar.f14046a != aVar2.f14046a) {
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
        switch (this.f8018b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f8019c.get(i11);
                TLRPC.Dialog dialog = kVar.f8086c;
                int i12 = kVar.f14046a;
                int i13 = kVar2.f14046a;
                TLRPC.Dialog dialog2 = kVar2.f8086c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f8090j == kVar2.f8090j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f17199id == dialog2.f17199id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f17199id == dialog2.f17199id && kVar.h == kVar2.h && kVar.f8087f == kVar2.f8087f && kVar.f8088g == kVar2.f8088g))) {
                    return false;
                }
                return true;
            case 1:
                ng.a aVar = (ng.a) this.f8019c.get(i10);
                ng.a aVar2 = (ng.a) ((ArrayList) this.d).get(i11);
                if (aVar.f14046a != aVar2.f14046a) {
                    return false;
                }
                return aVar.equals(aVar2);
            case 2:
                return ((Integer) this.f8019c.get(i10)).equals(((yx) this.d).f29519n.get(i11));
            case 3:
                return Objects.equals(this.f8019c.get(i10), ((rl0) this.d).f26689n.get(i11));
            default:
                return ((Long) this.f8019c.get(i10)).equals(((l71) this.d).f34599v0.get(i11));
        }
    }

    @Override
    public final int d() {
        switch (this.f8018b) {
            case 0:
                return this.f8019c.size();
            case 1:
                return ((ArrayList) this.d).size();
            case 2:
                return ((yx) this.d).f29519n.size();
            case 3:
                return ((rl0) this.d).f26689n.size();
            default:
                return ((l71) this.d).f34599v0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f8018b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f8019c.size();
            case 2:
                return this.f8019c.size();
            case 3:
                return this.f8019c.size();
            default:
                return this.f8019c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f8018b = i10;
        this.d = obj;
        this.f8019c = arrayList;
    }
}
