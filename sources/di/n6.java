package di;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class n6 {
    public final int f9395a;
    public final long f9396b;
    public final boolean f9397c;
    public boolean d;
    public boolean f9398e;
    public boolean f9399f;
    public final ArrayList f9400g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f9401i;
    public final z6 f9402j;

    public n6(int i7, long j3, z6 z6Var) {
        boolean z9;
        this.f9402j = z6Var;
        this.f9395a = i7;
        this.f9396b = j3;
        if (j3 == p10.i(i7).e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9397c = z9;
        d();
    }

    public final boolean a() {
        if ((this.f9397c || this.f9402j.i(this.f9396b)) && this.f9399f && this.h.size() < ((org.telegram.messenger.j0) qp.s1(this.f9395a).f24942x7.f24461u.f13555b).f23460c) {
            return true;
        }
        return false;
    }

    public final s6 b(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                s6 s6Var = (s6) arrayList.get(i10);
                if (i7 == s6Var.f9732a) {
                    return s6Var;
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
                if (i7 == ((s6) arrayList.get(i10)).f9732a) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f9398e && !this.f9399f) {
            this.f9398e = true;
            boolean z9 = this.d;
            long j3 = this.f9396b;
            int i7 = this.f9395a;
            if (!z9) {
                yr a02 = yr.a0(i7);
                a02.f26719a.c(new org.telegram.messenger.a4(a02, j3, new m6(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = qp.s1(i7).j1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new bi.j0(this, 7));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.f9395a;
        tL_reorderAlbums.peer = qp.s1(i7).j1(this.f9396b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((s6) obj).f9732a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z9) {
        int i7 = this.f9395a;
        yr a02 = yr.a0(i7);
        org.telegram.messenger.p5 p5Var = a02.f26719a;
        long j3 = this.f9396b;
        p5Var.c(new org.telegram.messenger.a4(a02, j3, this.h, 26));
        if (z9) {
            qs.f(i7).k(qs.j3, Long.valueOf(j3), this);
        }
    }
}
