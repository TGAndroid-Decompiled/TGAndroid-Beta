package mh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 {
    public final c5 f14671a;
    public w4 f14672b;
    public w4 f14673c;
    public w4 d;
    public n4 h;
    public n4 f14677i;
    public n4 f14678j;
    public n4 f14679k;
    public TL_stars.TL_starGiftUnique f14680l;
    public long f14681m;
    public s1 f14686r;
    public s1 f14687s;
    public float f14688t;
    public boolean f14689u;
    public boolean v;
    public final ArrayList f14674e = new ArrayList();
    public final ArrayList f14675f = new ArrayList();
    public final ArrayList f14676g = new ArrayList();
    public float f14682n = 0.0f;
    public boolean f14683o = false;
    public boolean f14684p = false;
    public boolean f14685q = false;

    public r4(c5 c5Var) {
        this.f14671a = c5Var;
        c5Var.f13801c.addOnAttachStateChangeListener(new ff.b(this, 6));
    }

    public final void a() {
        this.f14683o = false;
        this.f14671a.f13801c.c();
        n4 n4Var = this.h;
        if (n4Var != null) {
            n4Var.a();
        }
        n4 n4Var2 = this.f14677i;
        if (n4Var2 != null) {
            n4Var2.a();
        }
        n4 n4Var3 = this.f14678j;
        if (n4Var3 != null) {
            n4Var3.a();
        }
        n4 n4Var4 = this.f14679k;
        if (n4Var4 != null) {
            n4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f14683o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new l4(this, 1));
        }
    }

    public final void c() {
        if (this.f14683o) {
            return;
        }
        ArrayList arrayList = this.f14674e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p4) obj).a();
        }
        arrayList.clear();
        this.f14675f.clear();
        this.f14676g.clear();
    }
}
