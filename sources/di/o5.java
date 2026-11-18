package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class o5 {
    public final z5 f9432a;
    public t5 f9433b;
    public t5 f9434c;
    public t5 d;
    public k5 h;
    public k5 f9438i;
    public k5 f9439j;
    public k5 f9440k;
    public TL_stars.TL_starGiftUnique f9441l;
    public long f9442m;
    public k1 f9447r;
    public k1 f9448s;
    public float f9449t;
    public boolean f9450u;
    public boolean v;
    public final ArrayList f9435e = new ArrayList();
    public final ArrayList f9436f = new ArrayList();
    public final ArrayList f9437g = new ArrayList();
    public float f9443n = 0.0f;
    public boolean f9444o = false;
    public boolean f9445p = false;
    public boolean f9446q = false;

    public o5(z5 z5Var) {
        this.f9432a = z5Var;
        z5Var.f10126c.addOnAttachStateChangeListener(new bi.r2(this, 4));
    }

    public final void a() {
        this.f9444o = false;
        this.f9432a.f10126c.c();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.a();
        }
        k5 k5Var2 = this.f9438i;
        if (k5Var2 != null) {
            k5Var2.a();
        }
        k5 k5Var3 = this.f9439j;
        if (k5Var3 != null) {
            k5Var3.a();
        }
        k5 k5Var4 = this.f9440k;
        if (k5Var4 != null) {
            k5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f9444o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.g3(new i5(this, 1));
        }
    }

    public final void c() {
        if (this.f9444o) {
            return;
        }
        ArrayList arrayList = this.f9435e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((m5) obj).a();
        }
        arrayList.clear();
        this.f9436f.clear();
        this.f9437g.clear();
    }
}
