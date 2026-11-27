package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class q5b {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final c6b j;

    public q5b(int i, long j, c6b c6bVar) {
        boolean z;
        this.j = c6bVar;
        this.a = i;
        this.b = j;
        if (j == yac.h(i).e()) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        d();
    }

    public final boolean a() {
        if ((this.c || this.j.h(this.b)) && this.f && this.h.size() < uc7.s1(this.a).k4.A.f()) {
            return true;
        }
        return false;
    }

    public final v5b b(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 < arrayList.size()) {
                v5b v5bVar = (v5b) arrayList.get(i2);
                if (i == v5bVar.a) {
                    return v5bVar;
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
                if (i == ((v5b) arrayList.get(i2)).a) {
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
                jf7 Y = jf7.Y(i);
                Y.a.c(new cq6(Y, j, new tp8(this, (byte) 1), (byte) 14));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = uc7.s1(i).j1(j);
            ConnectionsManager.getInstance(i).sendRequest(tL_getAlbums, new yp9(this, (byte) 11));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i = this.a;
        tL_reorderAlbums.peer = uc7.s1(i).j1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            tL_reorderAlbums.order.add(Integer.valueOf(((v5b) obj).a));
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z) {
        int i = this.a;
        jf7 Y = jf7.Y(i);
        to3 to3Var = Y.a;
        long j = this.b;
        to3Var.c(new se7(Y, j, this.h, (byte) 2));
        if (z) {
            jn7.f(i).k(jn7.l3, Long.valueOf(j), this);
        }
    }
}
