package hg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.em0;
import org.telegram.ui.z51;
public final class g extends s4.o {
    public final int f11867b;
    public ArrayList f11868c;
    public Object d;

    public g() {
        this.f11867b = 4;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f11867b) {
            case 0:
                if (((k) ((m) this.d).N.get(i10)).f44334a == ((k) this.f11868c.get(i11)).f44334a) {
                    return true;
                }
                return false;
            case 1:
                return true;
            case 2:
                return b(i10, i11);
            case 3:
                return true;
            default:
                pg.a aVar = (pg.a) this.f11868c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f44334a != aVar2.f44334a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f11867b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.f11868c.get(i11);
                TLRPC.Dialog dialog = kVar.f11955c;
                int i12 = kVar.f44334a;
                int i13 = kVar2.f44334a;
                TLRPC.Dialog dialog2 = kVar2.f11955c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.f11959j == kVar2.f11959j : (tL_contact = kVar.e) != null && (tL_contact2 = kVar2.e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f20283id == dialog2.f20283id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f20283id == dialog2.f20283id && kVar.h == kVar2.h && kVar.f11956f == kVar2.f11956f && kVar.f11957g == kVar2.f11957g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f11868c.get(i10)).equals(((ay) this.d).f24740n.get(i11));
            case 2:
                return Objects.equals(this.f11868c.get(i10), ((em0) this.d).f25968n.get(i11));
            case 3:
                return ((Long) this.f11868c.get(i10)).equals(((z51) this.d).f43651v0.get(i11));
            default:
                pg.a aVar = (pg.a) this.f11868c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.f44334a != aVar2.f44334a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f11867b) {
            case 0:
                return this.f11868c.size();
            case 1:
                return ((ay) this.d).f24740n.size();
            case 2:
                return ((em0) this.d).f25968n.size();
            case 3:
                return ((z51) this.d).f43651v0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f11867b) {
            case 0:
                return ((m) this.d).N.size();
            case 1:
                return this.f11868c.size();
            case 2:
                return this.f11868c.size();
            case 3:
                return this.f11868c.size();
            default:
                return this.f11868c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i10) {
        this.f11867b = i10;
        this.d = obj;
        this.f11868c = arrayList;
    }
}
