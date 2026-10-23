package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class t6 {
    public final f7 f2199a;
    public y6 f2200b;
    public y6 f2201c;
    public y6 d;
    public p6 h;
    public p6 f2204i;
    public p6 f2205j;
    public p6 f2206k;
    public TL_stars.TL_starGiftUnique f2207l;
    public long f2208m;
    public d2 f2213r;
    public d2 f2214s;
    public float f2215t;
    public boolean f2216u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f2202f = new ArrayList();
    public final ArrayList f2203g = new ArrayList();
    public float f2209n = 0.0f;
    public boolean f2210o = false;
    public boolean f2211p = false;
    public boolean f2212q = false;

    public t6(f7 f7Var) {
        this.f2199a = f7Var;
        f7Var.f1268c.addOnAttachStateChangeListener(new n6(this, 0));
    }

    public final void a() {
        this.f2210o = false;
        this.f2199a.f1268c.c();
        p6 p6Var = this.h;
        if (p6Var != null) {
            p6Var.a();
        }
        p6 p6Var2 = this.f2204i;
        if (p6Var2 != null) {
            p6Var2.a();
        }
        p6 p6Var3 = this.f2205j;
        if (p6Var3 != null) {
            p6Var3.a();
        }
        p6 p6Var4 = this.f2206k;
        if (p6Var4 != null) {
            p6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f2210o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new m6(this, 1));
        }
    }

    public final void c() {
        if (this.f2210o) {
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
        this.f2202f.clear();
        this.f2203g.clear();
    }
}
