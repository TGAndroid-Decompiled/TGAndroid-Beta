package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class o5 {
    public final z5 f9429a;
    public t5 f9430b;
    public t5 f9431c;
    public t5 d;
    public k5 h;
    public k5 f9435i;
    public k5 f9436j;
    public k5 f9437k;
    public TL_stars.TL_starGiftUnique f9438l;
    public long f9439m;
    public k1 f9444r;
    public k1 f9445s;
    public float f9446t;
    public boolean f9447u;
    public boolean v;
    public final ArrayList f9432e = new ArrayList();
    public final ArrayList f9433f = new ArrayList();
    public final ArrayList f9434g = new ArrayList();
    public float f9440n = 0.0f;
    public boolean f9441o = false;
    public boolean f9442p = false;
    public boolean f9443q = false;

    public o5(z5 z5Var) {
        this.f9429a = z5Var;
        z5Var.f10123c.addOnAttachStateChangeListener(new bi.r2(this, 4));
    }

    public final void a() {
        this.f9441o = false;
        this.f9429a.f10123c.c();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.a();
        }
        k5 k5Var2 = this.f9435i;
        if (k5Var2 != null) {
            k5Var2.a();
        }
        k5 k5Var3 = this.f9436j;
        if (k5Var3 != null) {
            k5Var3.a();
        }
        k5 k5Var4 = this.f9437k;
        if (k5Var4 != null) {
            k5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f9441o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.g3(new i5(this, 1));
        }
    }

    public final void c() {
        if (this.f9441o) {
            return;
        }
        ArrayList arrayList = this.f9432e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((m5) obj).a();
        }
        arrayList.clear();
        this.f9433f.clear();
        this.f9434g.clear();
    }
}
