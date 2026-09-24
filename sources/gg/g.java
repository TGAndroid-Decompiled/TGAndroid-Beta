package gg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ux;
import org.telegram.ui.a71;
public final class g extends s4.o {
    public final int f9719b;
    public ArrayList f9720c;
    public Object d;

    public g() {
        this.f9719b = 1;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f9719b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f15700a == ((k) this.f9720c.get(i11)).f15700a) {
                    return true;
                }
                return false;
            case 1:
                og.a aVar = (og.a) this.f9720c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f15700a != aVar2.f15700a) {
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
        switch (this.f9719b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f9720c.get(i11);
                TLRPC.Dialog dialog = kVar.f9784c;
                int i12 = kVar.f15700a;
                int i13 = kVar2.f15700a;
                TLRPC.Dialog dialog2 = kVar2.f9784c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f9788j == kVar2.f9788j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f18325id == dialog2.f18325id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f18325id == dialog2.f18325id && kVar.h == kVar2.h && kVar.f9785f == kVar2.f9785f && kVar.f9786g == kVar2.f9786g))) {
                    return false;
                }
                return true;
            case 1:
                og.a aVar = (og.a) this.f9720c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f15700a != aVar2.f15700a) {
                    return false;
                }
                return aVar.equals(aVar2);
            case 2:
                return ((Integer) this.f9720c.get(i10)).equals(((ux) this.d).f28932n.get(i11));
            case 3:
                return Objects.equals(this.f9720c.get(i10), ((sl0) this.d).f28266n.get(i11));
            default:
                return ((Long) this.f9720c.get(i10)).equals(((a71) this.d).f32042v0.get(i11));
        }
    }

    @Override
    public final int d() {
        switch (this.f9719b) {
            case 0:
                return this.f9720c.size();
            case 1:
                return ((ArrayList) this.d).size();
            case 2:
                return ((ux) this.d).f28932n.size();
            case 3:
                return ((sl0) this.d).f28266n.size();
            default:
                return ((a71) this.d).f32042v0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f9719b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f9720c.size();
            case 2:
                return this.f9720c.size();
            case 3:
                return this.f9720c.size();
            default:
                return this.f9720c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f9719b = i10;
        this.d = obj;
        this.f9720c = arrayList;
    }
}
