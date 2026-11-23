package fi;

import java.util.ArrayList;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class d6 {
    public final int f11845a;
    public final long f11846b;
    public final boolean f11847c;
    public boolean d;
    public boolean f11848e;
    public boolean f11849f;
    public final ArrayList f11850g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f11851i;
    public final p6 f11852j;

    public d6(int i7, long j3, p6 p6Var) {
        boolean z10;
        this.f11852j = p6Var;
        this.f11845a = i7;
        this.f11846b = j3;
        if (j3 == k10.i(i7).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11847c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f11847c || this.f11852j.i(this.f11846b)) && this.f11849f && this.h.size() < ((org.telegram.messenger.j0) np.u1(this.f11845a).A7.f26218z.f15495b).f24776c) {
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
                if (i7 == i6Var.f12104a) {
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
                if (i7 == ((i6) arrayList.get(i10)).f12104a) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f11848e && !this.f11849f) {
            this.f11848e = true;
            boolean z10 = this.d;
            long j3 = this.f11846b;
            int i7 = this.f11845a;
            if (!z10) {
                ur a02 = ur.a0(i7);
                a02.f27214a.c(new org.telegram.messenger.d4(a02, j3, new c6(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = np.u1(i7).l1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new ai.a1(this, 8));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.f11845a;
        tL_reorderAlbums.peer = np.u1(i7).l1(this.f11846b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((i6) obj).f12104a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i7 = this.f11845a;
        ur a02 = ur.a0(i7);
        org.telegram.messenger.q5 q5Var = a02.f27214a;
        long j3 = this.f11846b;
        q5Var.c(new org.telegram.messenger.d4(a02, j3, this.h, 26));
        if (z10) {
            ls.f(i7).k(ls.f25305l3, Long.valueOf(j3), this);
        }
    }
}
