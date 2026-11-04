package kg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.ow;
import org.telegram.ui.a40;
import org.telegram.ui.g11;
public final class g extends u4.o {
    public final int f17027b;
    public ArrayList f17028c;
    public Object d;

    public g() {
        this.f17027b = 6;
    }

    @Override
    public final boolean a(int i3, int i10) {
        switch (this.f17027b) {
            case 0:
                if (((k) ((m) this.d).O.get(i3)).f54715a == ((k) this.f17028c.get(i10)).f54715a) {
                    return true;
                }
                return false;
            case 1:
                return true;
            case 2:
                return b(i3, i10);
            case 3:
                return false;
            case 4:
                return true;
            case 5:
                return true;
            default:
                sg.a aVar = (sg.a) this.f17028c.get(i3);
                sg.a aVar2 = (sg.a) ((ArrayList) this.d).get(i10);
                if (aVar.f54715a != aVar2.f54715a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i3, int i10) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f17027b) {
            case 0:
                k kVar = (k) ((m) this.d).O.get(i3);
                k kVar2 = (k) this.f17028c.get(i10);
                TLRPC.Dialog dialog = kVar.f17061c;
                int i11 = kVar.f54715a;
                int i12 = kVar2.f54715a;
                TLRPC.Dialog dialog2 = kVar2.f17061c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.f17066j == kVar2.f17066j : (tL_contact = kVar.f17062e) != null && (tL_contact2 = kVar2.f17062e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = kVar.d) != null && kVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f27005id == dialog2.f27005id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f27005id == dialog2.f27005id && kVar.h == kVar2.h && kVar.f17063f == kVar2.f17063f && kVar.f17064g == kVar2.f17064g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f17028c.get(i3)).equals(((ow) this.d).f36952n.get(i10));
            case 2:
                return Objects.equals(this.f17028c.get(i3), ((oj0) this.d).f36847n.get(i10));
            case 3:
                if (((l01) this.f17028c.get(i3)).a() == ((l01) ((k01) this.d).f35234c.get(i10)).a()) {
                    return true;
                }
                return false;
            case 4:
                a40 a40Var = (a40) this.d;
                ArrayList arrayList = this.f17028c;
                if (i3 < arrayList.size() && i10 < a40Var.f43589e.size()) {
                    return ((s3) arrayList.get(i3)).equals(a40Var.f43589e.get(i10));
                }
                return false;
            case 5:
                return ((Long) this.f17028c.get(i3)).equals(((g11) this.d).f45485w0.get(i10));
            default:
                sg.a aVar = (sg.a) this.f17028c.get(i3);
                sg.a aVar2 = (sg.a) ((ArrayList) this.d).get(i10);
                if (aVar.f54715a != aVar2.f54715a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f17027b) {
            case 0:
                return this.f17028c.size();
            case 1:
                return ((ow) this.d).f36952n.size();
            case 2:
                return ((oj0) this.d).f36847n.size();
            case 3:
                return ((k01) this.d).f35234c.size();
            case 4:
                return ((a40) this.d).f43589e.size();
            case 5:
                return ((g11) this.d).f45485w0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f17027b) {
            case 0:
                return ((m) this.d).O.size();
            case 1:
                return this.f17028c.size();
            case 2:
                return this.f17028c.size();
            case 3:
                return this.f17028c.size();
            case 4:
                return this.f17028c.size();
            case 5:
                return this.f17028c.size();
            default:
                return this.f17028c.size();
        }
    }

    public g(Object obj, ArrayList arrayList, int i3) {
        this.f17027b = i3;
        this.d = obj;
        this.f17028c = arrayList;
    }
}
