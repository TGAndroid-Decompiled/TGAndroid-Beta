package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class o5 {
    public final z5 f9427a;
    public t5 f9428b;
    public t5 f9429c;
    public t5 d;
    public k5 h;
    public k5 f9433i;
    public k5 f9434j;
    public k5 f9435k;
    public TL_stars.TL_starGiftUnique f9436l;
    public long f9437m;
    public k1 f9442r;
    public k1 f9443s;
    public float f9444t;
    public boolean f9445u;
    public boolean v;
    public final ArrayList f9430e = new ArrayList();
    public final ArrayList f9431f = new ArrayList();
    public final ArrayList f9432g = new ArrayList();
    public float f9438n = 0.0f;
    public boolean f9439o = false;
    public boolean f9440p = false;
    public boolean f9441q = false;

    public o5(z5 z5Var) {
        this.f9427a = z5Var;
        z5Var.f10110c.addOnAttachStateChangeListener(new bi.x2(this, 4));
    }

    public final void a() {
        this.f9439o = false;
        this.f9427a.f10110c.c();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.a();
        }
        k5 k5Var2 = this.f9433i;
        if (k5Var2 != null) {
            k5Var2.a();
        }
        k5 k5Var3 = this.f9434j;
        if (k5Var3 != null) {
            k5Var3.a();
        }
        k5 k5Var4 = this.f9435k;
        if (k5Var4 != null) {
            k5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f9439o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.g3(new i5(this, 1));
        }
    }

    public final void c() {
        if (this.f9439o) {
            return;
        }
        ArrayList arrayList = this.f9430e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((m5) obj).a();
        }
        arrayList.clear();
        this.f9431f.clear();
        this.f9432g.clear();
    }
}
