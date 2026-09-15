package gg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.sx;
import org.telegram.ui.g71;
public final class g extends s4.o {
    public final int f9733b;
    public ArrayList f9734c;
    public Object d;

    public g() {
        this.f9733b = 1;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f9733b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f15533a == ((k) this.f9734c.get(i11)).f15533a) {
                    return true;
                }
                return false;
            case 1:
                og.a aVar = (og.a) this.f9734c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f15533a != aVar2.f15533a) {
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
        switch (this.f9733b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f9734c.get(i11);
                TLRPC.Dialog dialog = kVar.f9798c;
                int i12 = kVar.f15533a;
                int i13 = kVar2.f15533a;
                TLRPC.Dialog dialog2 = kVar2.f9798c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f9802j == kVar2.f9802j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f18116id == dialog2.f18116id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f18116id == dialog2.f18116id && kVar.h == kVar2.h && kVar.f9799f == kVar2.f9799f && kVar.f9800g == kVar2.f9800g))) {
                    return false;
                }
                return true;
            case 1:
                og.a aVar = (og.a) this.f9734c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f15533a != aVar2.f15533a) {
                    return false;
                }
                return aVar.equals(aVar2);
            case 2:
                return ((Integer) this.f9734c.get(i10)).equals(((sx) this.d).f27988n.get(i11));
            case 3:
                return Objects.equals(this.f9734c.get(i10), ((hl0) this.d).f24716n.get(i11));
            default:
                return ((Long) this.f9734c.get(i10)).equals(((g71) this.d).f33825v0.get(i11));
        }
    }

    @Override
    public final int d() {
        switch (this.f9733b) {
            case 0:
                return this.f9734c.size();
            case 1:
                return ((ArrayList) this.d).size();
            case 2:
                return ((sx) this.d).f27988n.size();
            case 3:
                return ((hl0) this.d).f24716n.size();
            default:
                return ((g71) this.d).f33825v0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f9733b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f9734c.size();
            case 2:
                return this.f9734c.size();
            case 3:
                return this.f9734c.size();
            default:
                return this.f9734c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f9733b = i10;
        this.d = obj;
        this.f9734c = arrayList;
    }
}
