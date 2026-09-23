package gg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.tx;
import org.telegram.ui.z61;
public final class g extends s4.o {
    public final int f9720b;
    public ArrayList f9721c;
    public Object d;

    public g() {
        this.f9720b = 1;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f9720b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f15508a == ((k) this.f9721c.get(i11)).f15508a) {
                    return true;
                }
                return false;
            case 1:
                og.a aVar = (og.a) this.f9721c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f15508a != aVar2.f15508a) {
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
        switch (this.f9720b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f9721c.get(i11);
                TLRPC.Dialog dialog = kVar.f9785c;
                int i12 = kVar.f15508a;
                int i13 = kVar2.f15508a;
                TLRPC.Dialog dialog2 = kVar2.f9785c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f9789j == kVar2.f9789j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f18087id == dialog2.f18087id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f18087id == dialog2.f18087id && kVar.h == kVar2.h && kVar.f9786f == kVar2.f9786f && kVar.f9787g == kVar2.f9787g))) {
                    return false;
                }
                return true;
            case 1:
                og.a aVar = (og.a) this.f9721c.get(i10);
                og.a aVar2 = (og.a) ((ArrayList) this.d).get(i11);
                if (aVar.f15508a != aVar2.f15508a) {
                    return false;
                }
                return aVar.equals(aVar2);
            case 2:
                return ((Integer) this.f9721c.get(i10)).equals(((tx) this.d).f28325n.get(i11));
            case 3:
                return Objects.equals(this.f9721c.get(i10), ((il0) this.d).f24995n.get(i11));
            default:
                return ((Long) this.f9721c.get(i10)).equals(((z61) this.d).f40050v0.get(i11));
        }
    }

    @Override
    public final int d() {
        switch (this.f9720b) {
            case 0:
                return this.f9721c.size();
            case 1:
                return ((ArrayList) this.d).size();
            case 2:
                return ((tx) this.d).f28325n.size();
            case 3:
                return ((il0) this.d).f24995n.size();
            default:
                return ((z61) this.d).f40050v0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f9720b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f9721c.size();
            case 2:
                return this.f9721c.size();
            case 3:
                return this.f9721c.size();
            default:
                return this.f9721c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f9720b = i10;
        this.d = obj;
        this.f9721c = arrayList;
    }
}
