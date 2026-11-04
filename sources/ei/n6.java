package ei;

import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class n6 {
    public final int f10669a;
    public final long f10670b;
    public final boolean f10671c;
    public boolean d;
    public boolean f10672e;
    public boolean f10673f;
    public final ArrayList f10674g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f10675i;
    public final z6 f10676j;

    public n6(int i3, long j10, z6 z6Var) {
        boolean z10;
        this.f10676j = z6Var;
        this.f10669a = i3;
        this.f10670b = j10;
        if (j10 == h10.i(i3).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10671c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f10671c || this.f10676j.i(this.f10670b)) && this.f10673f && this.h.size() < ((org.telegram.messenger.j0) hp.s1(this.f10669a).f23167x7.f24676u.f13798b).f23620c) {
            return true;
        }
        return false;
    }

    public final s6 b(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                s6 s6Var = (s6) arrayList.get(i10);
                if (i3 == s6Var.f11008a) {
                    return s6Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final int c(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (i3 == ((s6) arrayList.get(i10)).f11008a) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.f10672e && !this.f10673f) {
            this.f10672e = true;
            boolean z10 = this.d;
            long j10 = this.f10670b;
            int i3 = this.f10669a;
            if (!z10) {
                qr a02 = qr.a0(i3);
                a02.f24934a.c(new org.telegram.messenger.a4(a02, j10, new m6(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = hp.s1(i3).j1(j10);
            ConnectionsManager.getInstance(i3).sendRequest(tL_getAlbums, new ci.d0(this, 7));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i3 = this.f10669a;
        tL_reorderAlbums.peer = hp.s1(i3).j1(this.f10670b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((s6) obj).f11008a));
        }
        ConnectionsManager.getInstance(i3).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i3 = this.f10669a;
        qr a02 = qr.a0(i3);
        org.telegram.messenger.p5 p5Var = a02.f24934a;
        long j10 = this.f10670b;
        p5Var.c(new org.telegram.messenger.a4(a02, j10, this.h, 26));
        if (z10) {
            hs.f(i3).k(hs.f23251j3, Long.valueOf(j10), this);
        }
    }
}
