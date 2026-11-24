package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class u1b {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final g2b j;

    public u1b(int i, long j, g2b g2bVar) {
        boolean z;
        this.j = g2bVar;
        this.a = i;
        this.b = j;
        if (j == y6c.h(i).e()) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        d();
    }

    public final boolean a() {
        if ((this.c || this.j.h(this.b)) && this.f && this.h.size() < na7.q1(this.a).k4.y.f()) {
            return true;
        }
        return false;
    }

    public final z1b b(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 < arrayList.size()) {
                z1b z1bVar = (z1b) arrayList.get(i2);
                if (i == z1bVar.a) {
                    return z1bVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final int c(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 < arrayList.size()) {
                if (i == ((z1b) arrayList.get(i2)).a) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.e && !this.f) {
            this.e = true;
            boolean z = this.d;
            long j = this.b;
            int i = this.a;
            if (!z) {
                ad7 Y = ad7.Y(i);
                Y.a.c(new go6(Y, j, new km8(this, (byte) 1), (byte) 11));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = na7.q1(i).h1(j);
            ConnectionsManager.getInstance(i).sendRequest(tL_getAlbums, new wx9(this, (byte) 10));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i = this.a;
        tL_reorderAlbums.peer = na7.q1(i).h1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            tL_reorderAlbums.order.add(Integer.valueOf(((z1b) obj).a));
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z) {
        int i = this.a;
        ad7 Y = ad7.Y(i);
        co3 co3Var = Y.a;
        long j = this.b;
        co3Var.c(new jc7(Y, j, this.h, (byte) 4));
        if (z) {
            kk7.f(i).k(kk7.k3, Long.valueOf(j), this);
        }
    }
}
