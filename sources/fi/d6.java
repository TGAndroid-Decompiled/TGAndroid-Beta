package fi;

import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class d6 {
    public final int f11850a;
    public final long f11851b;
    public final boolean f11852c;
    public boolean d;
    public boolean f11853e;
    public boolean f11854f;
    public final ArrayList f11855g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f11856i;
    public final p6 f11857j;

    public d6(int i7, long j3, p6 p6Var) {
        boolean z10;
        this.f11857j = p6Var;
        this.f11850a = i7;
        this.f11851b = j3;
        if (j3 == j10.i(i7).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11852c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f11852c || this.f11857j.i(this.f11851b)) && this.f11854f && this.h.size() < ((org.telegram.messenger.j0) mp.u1(this.f11850a).A7.f26174z.f15536b).f24764c) {
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
                if (i7 == i6Var.f12109a) {
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
                if (i7 == ((i6) arrayList.get(i10)).f12109a) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f11853e && !this.f11854f) {
            this.f11853e = true;
            boolean z10 = this.d;
            long j3 = this.f11851b;
            int i7 = this.f11850a;
            if (!z10) {
                tr a02 = tr.a0(i7);
                a02.f27052a.c(new org.telegram.messenger.d4(a02, j3, new c6(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = mp.u1(i7).l1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new ai.e1(this, 8));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.f11850a;
        tL_reorderAlbums.peer = mp.u1(i7).l1(this.f11851b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((i6) obj).f12109a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i7 = this.f11850a;
        tr a02 = tr.a0(i7);
        org.telegram.messenger.q5 q5Var = a02.f27052a;
        long j3 = this.f11851b;
        q5Var.c(new org.telegram.messenger.d4(a02, j3, this.h, 26));
        if (z10) {
            ks.f(i7).k(ks.f25147l3, Long.valueOf(j3), this);
        }
    }
}
