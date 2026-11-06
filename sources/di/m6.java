package di;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class m6 {
    public final int f9354a;
    public final long f9355b;
    public final boolean f9356c;
    public boolean d;
    public boolean f9357e;
    public boolean f9358f;
    public final ArrayList f9359g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f9360i;
    public final y6 f9361j;

    public m6(int i7, long j3, y6 y6Var) {
        boolean z9;
        this.f9361j = y6Var;
        this.f9354a = i7;
        this.f9355b = j3;
        if (j3 == p10.i(i7).e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9356c = z9;
        d();
    }

    public final boolean a() {
        if ((this.f9356c || this.f9361j.i(this.f9355b)) && this.f9358f && this.h.size() < ((org.telegram.messenger.j0) qp.s1(this.f9354a).f24935x7.f24457u.f13555b).f23439c) {
            return true;
        }
        return false;
    }

    public final r6 b(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                r6 r6Var = (r6) arrayList.get(i10);
                if (i7 == r6Var.f9701a) {
                    return r6Var;
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
                if (i7 == ((r6) arrayList.get(i10)).f9701a) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f9357e && !this.f9358f) {
            this.f9357e = true;
            boolean z9 = this.d;
            long j3 = this.f9355b;
            int i7 = this.f9354a;
            if (!z9) {
                yr a02 = yr.a0(i7);
                a02.f26696a.c(new org.telegram.messenger.a4(a02, j3, new l6(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = qp.s1(i7).j1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new bi.j0(this, 7));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.f9354a;
        tL_reorderAlbums.peer = qp.s1(i7).j1(this.f9355b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((r6) obj).f9701a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z9) {
        int i7 = this.f9354a;
        yr a02 = yr.a0(i7);
        org.telegram.messenger.p5 p5Var = a02.f26696a;
        long j3 = this.f9355b;
        p5Var.c(new org.telegram.messenger.a4(a02, j3, this.h, 26));
        if (z9) {
            qs.f(i7).k(qs.j3, Long.valueOf(j3), this);
        }
    }
}
