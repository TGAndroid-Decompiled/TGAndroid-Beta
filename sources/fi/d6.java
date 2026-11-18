package fi;

import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class d6 {
    public final int f11853a;
    public final long f11854b;
    public final boolean f11855c;
    public boolean d;
    public boolean f11856e;
    public boolean f11857f;
    public final ArrayList f11858g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f11859i;
    public final p6 f11860j;

    public d6(int i7, long j3, p6 p6Var) {
        boolean z10;
        this.f11860j = p6Var;
        this.f11853a = i7;
        this.f11854b = j3;
        if (j3 == j10.i(i7).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11855c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f11855c || this.f11860j.i(this.f11854b)) && this.f11857f && this.h.size() < ((org.telegram.messenger.j0) mp.u1(this.f11853a).A7.f26176z.f15539b).f24767c) {
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
                if (i7 == i6Var.f12112a) {
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
                if (i7 == ((i6) arrayList.get(i10)).f12112a) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f11856e && !this.f11857f) {
            this.f11856e = true;
            boolean z10 = this.d;
            long j3 = this.f11854b;
            int i7 = this.f11853a;
            if (!z10) {
                tr a02 = tr.a0(i7);
                a02.f27054a.c(new org.telegram.messenger.d4(a02, j3, new c6(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = mp.u1(i7).l1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new ai.e1(this, 8));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.f11853a;
        tL_reorderAlbums.peer = mp.u1(i7).l1(this.f11854b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((i6) obj).f12112a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i7 = this.f11853a;
        tr a02 = tr.a0(i7);
        org.telegram.messenger.q5 q5Var = a02.f27054a;
        long j3 = this.f11854b;
        q5Var.c(new org.telegram.messenger.d4(a02, j3, this.h, 26));
        if (z10) {
            ks.f(i7).k(ks.f25149l3, Long.valueOf(j3), this);
        }
    }
}
