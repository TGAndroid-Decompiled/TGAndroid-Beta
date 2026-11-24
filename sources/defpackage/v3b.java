package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class v3b {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final h4b j;

    public v3b(int i, long j, h4b h4bVar) {
        boolean z;
        this.j = h4bVar;
        this.a = i;
        this.b = j;
        if (j == z8c.h(i).e()) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        d();
    }

    public final boolean a() {
        if ((this.c || this.j.h(this.b)) && this.f && this.h.size() < oc7.r1(this.a).l4.y.f()) {
            return true;
        }
        return false;
    }

    public final a4b b(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 < arrayList.size()) {
                a4b a4bVar = (a4b) arrayList.get(i2);
                if (i == a4bVar.a) {
                    return a4bVar;
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
                if (i == ((a4b) arrayList.get(i2)).a) {
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
                cf7 Y = cf7.Y(i);
                Y.a.c(new hq6(Y, j, new jo8(this, (byte) 1), (byte) 11));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = oc7.r1(i).i1(j);
            ConnectionsManager.getInstance(i).sendRequest(tL_getAlbums, new go9(this, (byte) 11));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i = this.a;
        tL_reorderAlbums.peer = oc7.r1(i).i1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            tL_reorderAlbums.order.add(Integer.valueOf(((a4b) obj).a));
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z) {
        int i = this.a;
        cf7 Y = cf7.Y(i);
        mp3 mp3Var = Y.a;
        long j = this.b;
        mp3Var.c(new me7(Y, j, this.h, (byte) 4));
        if (z) {
            nm7.f(i).k(nm7.l3, Long.valueOf(j), this);
        }
    }
}
