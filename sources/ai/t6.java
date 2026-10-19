package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class t6 {
    public final f7 f2196a;
    public y6 f2197b;
    public y6 f2198c;
    public y6 d;
    public p6 h;
    public p6 f2201i;
    public p6 f2202j;
    public p6 f2203k;
    public TL_stars.TL_starGiftUnique f2204l;
    public long f2205m;
    public d2 f2210r;
    public d2 f2211s;
    public float f2212t;
    public boolean f2213u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f2199f = new ArrayList();
    public final ArrayList f2200g = new ArrayList();
    public float f2206n = 0.0f;
    public boolean f2207o = false;
    public boolean f2208p = false;
    public boolean f2209q = false;

    public t6(f7 f7Var) {
        this.f2196a = f7Var;
        f7Var.f1265c.addOnAttachStateChangeListener(new n6(this, 0));
    }

    public final void a() {
        this.f2207o = false;
        this.f2196a.f1265c.c();
        p6 p6Var = this.h;
        if (p6Var != null) {
            p6Var.a();
        }
        p6 p6Var2 = this.f2201i;
        if (p6Var2 != null) {
            p6Var2.a();
        }
        p6 p6Var3 = this.f2202j;
        if (p6Var3 != null) {
            p6Var3.a();
        }
        p6 p6Var4 = this.f2203k;
        if (p6Var4 != null) {
            p6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f2207o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new m6(this, 1));
        }
    }

    public final void c() {
        if (this.f2207o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((r6) obj).a();
        }
        arrayList.clear();
        this.f2199f.clear();
        this.f2200g.clear();
    }
}
