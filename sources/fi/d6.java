package fi;

import java.util.ArrayList;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class d6 {
    public final int f11894a;
    public final long f11895b;
    public final boolean f11896c;
    public boolean d;
    public boolean f11897e;
    public boolean f11898f;
    public final ArrayList f11899g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f11900i;
    public final p6 f11901j;

    public d6(int i7, long j3, p6 p6Var) {
        boolean z10;
        this.f11901j = p6Var;
        this.f11894a = i7;
        this.f11895b = j3;
        if (j3 == k10.i(i7).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11896c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f11896c || this.f11901j.i(this.f11895b)) && this.f11898f && this.h.size() < ((org.telegram.messenger.j0) np.u1(this.f11894a).A7.f26254z.f15508b).f24812c) {
            return true;
        }
        return false;
    }

    public final i6 b(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                i6 i6Var = (i6) arrayList.get(i10);
                if (i7 == i6Var.f12144a) {
                    return i6Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final int c(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (i7 == ((i6) arrayList.get(i10)).f12144a) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f11897e && !this.f11898f) {
            this.f11897e = true;
            boolean z10 = this.d;
            long j3 = this.f11895b;
            int i7 = this.f11894a;
            if (!z10) {
                ur a02 = ur.a0(i7);
                a02.f27250a.c(new org.telegram.messenger.d4(a02, j3, new c6(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = np.u1(i7).l1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new ai.g1(this, 8));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.f11894a;
        tL_reorderAlbums.peer = np.u1(i7).l1(this.f11895b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((i6) obj).f12144a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i7 = this.f11894a;
        ur a02 = ur.a0(i7);
        org.telegram.messenger.q5 q5Var = a02.f27250a;
        long j3 = this.f11895b;
        q5Var.c(new org.telegram.messenger.d4(a02, j3, this.h, 26));
        if (z10) {
            ls.f(i7).k(ls.f25341l3, Long.valueOf(j3), this);
        }
    }
}
