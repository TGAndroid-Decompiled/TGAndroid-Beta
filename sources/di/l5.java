package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class l5 {
    public final w5 f8960a;
    public q5 f8961b;
    public q5 f8962c;
    public q5 d;
    public h5 h;
    public h5 f8966i;
    public h5 f8967j;
    public h5 f8968k;
    public TL_stars.TL_starGiftUnique f8969l;
    public long f8970m;
    public l1 f8975r;
    public l1 f8976s;
    public float f8977t;
    public boolean f8978u;
    public boolean v;
    public final ArrayList f8963e = new ArrayList();
    public final ArrayList f8964f = new ArrayList();
    public final ArrayList f8965g = new ArrayList();
    public float f8971n = 0.0f;
    public boolean f8972o = false;
    public boolean f8973p = false;
    public boolean f8974q = false;

    public l5(w5 w5Var) {
        this.f8960a = w5Var;
        w5Var.f9650c.addOnAttachStateChangeListener(new bi.x1(this, 4));
    }

    public final void a() {
        this.f8972o = false;
        this.f8960a.f9650c.c();
        h5 h5Var = this.h;
        if (h5Var != null) {
            h5Var.a();
        }
        h5 h5Var2 = this.f8966i;
        if (h5Var2 != null) {
            h5Var2.a();
        }
        h5 h5Var3 = this.f8967j;
        if (h5Var3 != null) {
            h5Var3.a();
        }
        h5 h5Var4 = this.f8968k;
        if (h5Var4 != null) {
            h5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f8972o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.h3(new f5(this, 1));
        }
    }

    public final void c() {
        if (this.f8972o) {
            return;
        }
        ArrayList arrayList = this.f8963e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((j5) obj).a();
        }
        arrayList.clear();
        this.f8964f.clear();
        this.f8965g.clear();
    }
}
