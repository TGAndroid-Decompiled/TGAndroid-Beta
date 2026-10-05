package gg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.wx;
import org.telegram.ui.a71;
public final class g extends s4.o {
    public final int f10584b;
    public ArrayList f10585c;
    public Object d;

    public g() {
        this.f10584b = 1;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f10584b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f17192a == ((k) this.f10585c.get(i11)).f17192a) {
                    return true;
                }
                return false;
            case 1:
                og.a aVar = (og.a) this.f10585c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f17192a != aVar2.f17192a) {
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
        switch (this.f10584b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f10585c.get(i11);
                TLRPC.Dialog dialog = kVar.f10654c;
                int i12 = kVar.f17192a;
                int i13 = kVar2.f17192a;
                TLRPC.Dialog dialog2 = kVar2.f10654c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f10659j == kVar2.f10659j : (tL_contact = kVar.f10655e) != null && (tL_contact2 = kVar2.f10655e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f20051id == dialog2.f20051id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f20051id == dialog2.f20051id && kVar.h == kVar2.h && kVar.f10656f == kVar2.f10656f && kVar.f10657g == kVar2.f10657g))) {
                    return false;
                }
                return true;
            case 1:
                og.a aVar = (og.a) this.f10585c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f17192a != aVar2.f17192a) {
                    return false;
                }
                return aVar.equals(aVar2);
            case 2:
                return ((Integer) this.f10585c.get(i10)).equals(((wx) this.d).f32735n.get(i11));
            case 3:
                return Objects.equals(this.f10585c.get(i10), ((ul0) this.d).f31458n.get(i11));
            default:
                return ((Long) this.f10585c.get(i10)).equals(((a71) this.d).f34768v0.get(i11));
        }
    }

    @Override
    public final int d() {
        switch (this.f10584b) {
            case 0:
                return this.f10585c.size();
            case 1:
                return ((ArrayList) this.d).size();
            case 2:
                return ((wx) this.d).f32735n.size();
            case 3:
                return ((ul0) this.d).f31458n.size();
            default:
                return ((a71) this.d).f34768v0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f10584b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f10585c.size();
            case 2:
                return this.f10585c.size();
            case 3:
                return this.f10585c.size();
            default:
                return this.f10585c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f10584b = i10;
        this.d = obj;
        this.f10585c = arrayList;
    }
}
