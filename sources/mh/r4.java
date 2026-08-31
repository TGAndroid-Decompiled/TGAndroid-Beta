package mh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 {
    public final c5 f14669a;
    public w4 f14670b;
    public w4 f14671c;
    public w4 d;
    public n4 h;
    public n4 f14675i;
    public n4 f14676j;
    public n4 f14677k;
    public TL_stars.TL_starGiftUnique f14678l;
    public long f14679m;
    public s1 f14684r;
    public s1 f14685s;
    public float f14686t;
    public boolean f14687u;
    public boolean v;
    public final ArrayList f14672e = new ArrayList();
    public final ArrayList f14673f = new ArrayList();
    public final ArrayList f14674g = new ArrayList();
    public float f14680n = 0.0f;
    public boolean f14681o = false;
    public boolean f14682p = false;
    public boolean f14683q = false;

    public r4(c5 c5Var) {
        this.f14669a = c5Var;
        c5Var.f13799c.addOnAttachStateChangeListener(new ff.b(this, 6));
    }

    public final void a() {
        this.f14681o = false;
        this.f14669a.f13799c.c();
        n4 n4Var = this.h;
        if (n4Var != null) {
            n4Var.a();
        }
        n4 n4Var2 = this.f14675i;
        if (n4Var2 != null) {
            n4Var2.a();
        }
        n4 n4Var3 = this.f14676j;
        if (n4Var3 != null) {
            n4Var3.a();
        }
        n4 n4Var4 = this.f14677k;
        if (n4Var4 != null) {
            n4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f14681o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new l4(this, 1));
        }
    }

    public final void c() {
        if (this.f14681o) {
            return;
        }
        ArrayList arrayList = this.f14672e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p4) obj).a();
        }
        arrayList.clear();
        this.f14673f.clear();
        this.f14674g.clear();
    }
}
