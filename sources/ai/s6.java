package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class s6 {
    public final e7 f2151a;
    public x6 f2152b;
    public x6 f2153c;
    public x6 d;
    public o6 h;
    public o6 f2156i;
    public o6 f2157j;
    public o6 f2158k;
    public TL_stars.TL_starGiftUnique f2159l;
    public long f2160m;
    public b2 f2165r;
    public b2 f2166s;
    public float f2167t;
    public boolean f2168u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f2154f = new ArrayList();
    public final ArrayList f2155g = new ArrayList();
    public float f2161n = 0.0f;
    public boolean f2162o = false;
    public boolean f2163p = false;
    public boolean f2164q = false;

    public s6(e7 e7Var) {
        this.f2151a = e7Var;
        e7Var.f1218c.addOnAttachStateChangeListener(new m6(this, 0));
    }

    public final void a() {
        this.f2162o = false;
        this.f2151a.f1218c.c();
        o6 o6Var = this.h;
        if (o6Var != null) {
            o6Var.a();
        }
        o6 o6Var2 = this.f2156i;
        if (o6Var2 != null) {
            o6Var2.a();
        }
        o6 o6Var3 = this.f2157j;
        if (o6Var3 != null) {
            o6Var3.a();
        }
        o6 o6Var4 = this.f2158k;
        if (o6Var4 != null) {
            o6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f2162o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new l6(this, 1));
        }
    }

    public final void c() {
        if (this.f2162o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((q6) obj).a();
        }
        arrayList.clear();
        this.f2154f.clear();
        this.f2155g.clear();
    }
}
