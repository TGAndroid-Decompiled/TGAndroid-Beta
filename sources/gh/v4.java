package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class v4 {
    public final g5 f9016a;
    public a5 f9017b;
    public a5 f9018c;
    public a5 d;
    public r4 h;
    public r4 f9022i;
    public r4 f9023j;
    public r4 f9024k;
    public TL_stars.TL_starGiftUnique f9025l;
    public long f9026m;
    public v1 f9031r;
    public v1 f9032s;
    public float f9033t;
    public boolean f9034u;
    public boolean v;
    public final ArrayList f9019e = new ArrayList();
    public final ArrayList f9020f = new ArrayList();
    public final ArrayList f9021g = new ArrayList();
    public float f9027n = 0.0f;
    public boolean f9028o = false;
    public boolean f9029p = false;
    public boolean f9030q = false;

    public v4(g5 g5Var) {
        this.f9016a = g5Var;
        g5Var.f8110c.addOnAttachStateChangeListener(new af.b(this, 4));
    }

    public final void a() {
        this.f9028o = false;
        this.f9016a.f8110c.c();
        r4 r4Var = this.h;
        if (r4Var != null) {
            r4Var.a();
        }
        r4 r4Var2 = this.f9022i;
        if (r4Var2 != null) {
            r4Var2.a();
        }
        r4 r4Var3 = this.f9023j;
        if (r4Var3 != null) {
            r4Var3.a();
        }
        r4 r4Var4 = this.f9024k;
        if (r4Var4 != null) {
            r4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f9028o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new p4(this, 1));
        }
    }

    public final void c() {
        if (this.f9028o) {
            return;
        }
        ArrayList arrayList = this.f9019e;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((t4) obj).a();
        }
        arrayList.clear();
        this.f9020f.clear();
        this.f9021g.clear();
    }
}
