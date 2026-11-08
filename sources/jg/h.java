package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.qw;
import org.telegram.ui.f40;
import org.telegram.ui.q11;
public final class h extends v4.o {
    public final int f16735b;
    public final ArrayList f16736c;
    public final Object d;

    public h(Object obj, ArrayList arrayList, int i7) {
        this.f16735b = i7;
        this.d = obj;
        this.f16736c = arrayList;
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f16735b) {
            case 0:
                if (((l) ((n) this.d).N.get(i7)).f54532a == ((l) this.f16736c.get(i10)).f54532a) {
                    return true;
                }
                return false;
            case 1:
                return true;
            case 2:
                return b(i7, i10);
            case 3:
                return false;
            case 4:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f16735b) {
            case 0:
                l lVar = (l) ((n) this.d).N.get(i7);
                l lVar2 = (l) this.f16736c.get(i10);
                TLRPC.Dialog dialog = lVar.f16820c;
                int i11 = lVar.f54532a;
                int i12 = lVar2.f54532a;
                TLRPC.Dialog dialog2 = lVar2.f16820c;
                if (i11 != i12 || (i11 != 0 ? !(i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : lVar.f16825j == lVar2.f16825j : (tL_contact = lVar.f16821e) != null && (tL_contact2 = lVar2.f16821e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = lVar.d) != null && lVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f26960id == dialog2.f26960id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f26960id == dialog2.f26960id && lVar.h == lVar2.h && lVar.f16822f == lVar2.f16822f && lVar.f16823g == lVar2.f16823g))) {
                    return false;
                }
                return true;
            case 1:
                return ((Integer) this.f16736c.get(i7)).equals(((qw) this.d).f37430n.get(i10));
            case 2:
                return Objects.equals(this.f16736c.get(i7), ((kj0) this.d).f35348n.get(i10));
            case 3:
                if (((p01) this.f16736c.get(i7)).a() == ((p01) ((n01) this.d).f36177c.get(i10)).a()) {
                    return true;
                }
                return false;
            case 4:
                f40 f40Var = (f40) this.d;
                ArrayList arrayList = this.f16736c;
                if (i7 < arrayList.size() && i10 < f40Var.f45435e.size()) {
                    return ((s3) arrayList.get(i7)).equals(f40Var.f45435e.get(i10));
                }
                return false;
            default:
                return ((Long) this.f16736c.get(i7)).equals(((q11) this.d).f49065v0.get(i10));
        }
    }

    @Override
    public final int d() {
        switch (this.f16735b) {
            case 0:
                return this.f16736c.size();
            case 1:
                return ((qw) this.d).f37430n.size();
            case 2:
                return ((kj0) this.d).f35348n.size();
            case 3:
                return ((n01) this.d).f36177c.size();
            case 4:
                return ((f40) this.d).f45435e.size();
            default:
                return ((q11) this.d).f49065v0.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f16735b) {
            case 0:
                return ((n) this.d).N.size();
            case 1:
                return this.f16736c.size();
            case 2:
                return this.f16736c.size();
            case 3:
                return this.f16736c.size();
            case 4:
                return this.f16736c.size();
            default:
                return this.f16736c.size();
        }
    }
}
