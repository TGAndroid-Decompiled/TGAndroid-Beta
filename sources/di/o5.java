package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class o5 {
    public final z5 f9461a;
    public t5 f9462b;
    public t5 f9463c;
    public t5 d;
    public k5 h;
    public k5 f9467i;
    public k5 f9468j;
    public k5 f9469k;
    public TL_stars.TL_starGiftUnique f9470l;
    public long f9471m;
    public k1 f9476r;
    public k1 f9477s;
    public float f9478t;
    public boolean f9479u;
    public boolean v;
    public final ArrayList f9464e = new ArrayList();
    public final ArrayList f9465f = new ArrayList();
    public final ArrayList f9466g = new ArrayList();
    public float f9472n = 0.0f;
    public boolean f9473o = false;
    public boolean f9474p = false;
    public boolean f9475q = false;

    public o5(z5 z5Var) {
        this.f9461a = z5Var;
        z5Var.f10147c.addOnAttachStateChangeListener(new bi.v2(this, 4));
    }

    public final void a() {
        this.f9473o = false;
        this.f9461a.f10147c.c();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.a();
        }
        k5 k5Var2 = this.f9467i;
        if (k5Var2 != null) {
            k5Var2.a();
        }
        k5 k5Var3 = this.f9468j;
        if (k5Var3 != null) {
            k5Var3.a();
        }
        k5 k5Var4 = this.f9469k;
        if (k5Var4 != null) {
            k5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f9473o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.g3(new i5(this, 1));
        }
    }

    public final void c() {
        if (this.f9473o) {
            return;
        }
        ArrayList arrayList = this.f9464e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((m5) obj).a();
        }
        arrayList.clear();
        this.f9465f.clear();
        this.f9466g.clear();
    }
}
