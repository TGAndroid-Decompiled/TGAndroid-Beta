package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 {
    public final c5 f12991a;
    public w4 f12992b;
    public w4 f12993c;
    public w4 d;
    public n4 h;
    public n4 f12996i;
    public n4 f12997j;
    public n4 f12998k;
    public TL_stars.TL_starGiftUnique f12999l;
    public long f13000m;
    public t1 f13005r;
    public t1 f13006s;
    public float f13007t;
    public boolean f13008u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f12994f = new ArrayList();
    public final ArrayList f12995g = new ArrayList();
    public float f13001n = 0.0f;
    public boolean f13002o = false;
    public boolean f13003p = false;
    public boolean f13004q = false;

    public r4(c5 c5Var) {
        this.f12991a = c5Var;
        c5Var.f12201c.addOnAttachStateChangeListener(new ef.b(this, 6));
    }

    public final void a() {
        this.f13002o = false;
        this.f12991a.f12201c.c();
        n4 n4Var = this.h;
        if (n4Var != null) {
            n4Var.a();
        }
        n4 n4Var2 = this.f12996i;
        if (n4Var2 != null) {
            n4Var2.a();
        }
        n4 n4Var3 = this.f12997j;
        if (n4Var3 != null) {
            n4Var3.a();
        }
        n4 n4Var4 = this.f12998k;
        if (n4Var4 != null) {
            n4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f13002o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new l4(this, 1));
        }
    }

    public final void c() {
        if (this.f13002o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p4) obj).a();
        }
        arrayList.clear();
        this.f12994f.clear();
        this.f12995g.clear();
    }
}
