package fi;

import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class g6 {
    public final int f11742a;
    public final long f11743b;
    public final boolean f11744c;
    public boolean d;
    public boolean f11745e;
    public boolean f11746f;
    public final ArrayList f11747g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f11748i;
    public final s6 f11749j;

    public g6(int i7, long j3, s6 s6Var) {
        boolean z10;
        this.f11749j = s6Var;
        this.f11742a = i7;
        this.f11743b = j3;
        if (j3 == m10.i(i7).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11744c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f11744c || this.f11749j.i(this.f11743b)) && this.f11746f && this.h.size() < ((org.telegram.messenger.j0) np.s1(this.f11742a).f25451y7.f25869u.f15881b).f24498c) {
            return true;
        }
        return false;
    }

    public final l6 b(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                l6 l6Var = (l6) arrayList.get(i10);
                if (i7 == l6Var.f11998a) {
                    return l6Var;
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
                if (i7 == ((l6) arrayList.get(i10)).f11998a) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f11745e && !this.f11746f) {
            this.f11745e = true;
            boolean z10 = this.d;
            long j3 = this.f11743b;
            int i7 = this.f11742a;
            if (!z10) {
                vr a02 = vr.a0(i7);
                a02.f27219a.c(new org.telegram.messenger.a4(a02, j3, new e6(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = np.s1(i7).j1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new ai.e1(this, 8));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.f11742a;
        tL_reorderAlbums.peer = np.s1(i7).j1(this.f11743b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((l6) obj).f11998a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i7 = this.f11742a;
        vr a02 = vr.a0(i7);
        org.telegram.messenger.p5 p5Var = a02.f27219a;
        long j3 = this.f11743b;
        p5Var.c(new org.telegram.messenger.a4(a02, j3, this.h, 26));
        if (z10) {
            ns.f(i7).k(ns.j3, Long.valueOf(j3), this);
        }
    }
}
