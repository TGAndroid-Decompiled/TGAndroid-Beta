package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 {
    public final c5 f13007a;
    public w4 f13008b;
    public w4 f13009c;
    public w4 d;
    public n4 h;
    public n4 f13012i;
    public n4 f13013j;
    public n4 f13014k;
    public TL_stars.TL_starGiftUnique f13015l;
    public long f13016m;
    public t1 f13021r;
    public t1 f13022s;
    public float f13023t;
    public boolean f13024u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f13010f = new ArrayList();
    public final ArrayList f13011g = new ArrayList();
    public float f13017n = 0.0f;
    public boolean f13018o = false;
    public boolean f13019p = false;
    public boolean f13020q = false;

    public r4(c5 c5Var) {
        this.f13007a = c5Var;
        c5Var.f12217c.addOnAttachStateChangeListener(new ff.b(this, 6));
    }

    public final void a() {
        this.f13018o = false;
        this.f13007a.f12217c.c();
        n4 n4Var = this.h;
        if (n4Var != null) {
            n4Var.a();
        }
        n4 n4Var2 = this.f13012i;
        if (n4Var2 != null) {
            n4Var2.a();
        }
        n4 n4Var3 = this.f13013j;
        if (n4Var3 != null) {
            n4Var3.a();
        }
        n4 n4Var4 = this.f13014k;
        if (n4Var4 != null) {
            n4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f13018o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new l4(this, 1));
        }
    }

    public final void c() {
        if (this.f13018o) {
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
        this.f13010f.clear();
        this.f13011g.clear();
    }
}
