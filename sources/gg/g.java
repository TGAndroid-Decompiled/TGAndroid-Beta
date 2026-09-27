package gg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.ux;
import org.telegram.ui.c71;
public final class g extends s4.o {
    public final int f9725b;
    public ArrayList f9726c;
    public Object d;

    public g() {
        this.f9725b = 1;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f9725b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f15754a == ((k) this.f9726c.get(i11)).f15754a) {
                    return true;
                }
                return false;
            case 1:
                og.a aVar = (og.a) this.f9726c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f15754a != aVar2.f15754a) {
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
        switch (this.f9725b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f9726c.get(i11);
                TLRPC.Dialog dialog = kVar.f9790c;
                int i12 = kVar.f15754a;
                int i13 = kVar2.f15754a;
                TLRPC.Dialog dialog2 = kVar2.f9790c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f9794j == kVar2.f9794j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f18333id == dialog2.f18333id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f18333id == dialog2.f18333id && kVar.h == kVar2.h && kVar.f9791f == kVar2.f9791f && kVar.f9792g == kVar2.f9792g))) {
                    return false;
                }
                return true;
            case 1:
                og.a aVar = (og.a) this.f9726c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f15754a != aVar2.f15754a) {
                    return false;
                }
                return aVar.equals(aVar2);
            case 2:
                return ((Integer) this.f9726c.get(i10)).equals(((ux) this.d).f28954n.get(i11));
            case 3:
                return Objects.equals(this.f9726c.get(i10), ((ul0) this.d).f28900n.get(i11));
            default:
                return ((Long) this.f9726c.get(i10)).equals(((c71) this.d).f32614v0.get(i11));
        }
    }

    @Override
    public final int d() {
        switch (this.f9725b) {
            case 0:
                return this.f9726c.size();
            case 1:
                return ((ArrayList) this.d).size();
            case 2:
                return ((ux) this.d).f28954n.size();
            case 3:
                return ((ul0) this.d).f28900n.size();
            default:
                return ((c71) this.d).f32614v0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f9725b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f9726c.size();
            case 2:
                return this.f9726c.size();
            case 3:
                return this.f9726c.size();
            default:
                return this.f9726c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f9725b = i10;
        this.d = obj;
        this.f9726c = arrayList;
    }
}
