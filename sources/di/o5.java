package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class o5 {
    public final z5 f9458a;
    public t5 f9459b;
    public t5 f9460c;
    public t5 d;
    public k5 h;
    public k5 f9464i;
    public k5 f9465j;
    public k5 f9466k;
    public TL_stars.TL_starGiftUnique f9467l;
    public long f9468m;
    public k1 f9473r;
    public k1 f9474s;
    public float f9475t;
    public boolean f9476u;
    public boolean v;
    public final ArrayList f9461e = new ArrayList();
    public final ArrayList f9462f = new ArrayList();
    public final ArrayList f9463g = new ArrayList();
    public float f9469n = 0.0f;
    public boolean f9470o = false;
    public boolean f9471p = false;
    public boolean f9472q = false;

    public o5(z5 z5Var) {
        this.f9458a = z5Var;
        z5Var.f10144c.addOnAttachStateChangeListener(new bi.v2(this, 4));
    }

    public final void a() {
        this.f9470o = false;
        this.f9458a.f10144c.c();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.a();
        }
        k5 k5Var2 = this.f9464i;
        if (k5Var2 != null) {
            k5Var2.a();
        }
        k5 k5Var3 = this.f9465j;
        if (k5Var3 != null) {
            k5Var3.a();
        }
        k5 k5Var4 = this.f9466k;
        if (k5Var4 != null) {
            k5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f9470o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.g3(new i5(this, 1));
        }
    }

    public final void c() {
        if (this.f9470o) {
            return;
        }
        ArrayList arrayList = this.f9461e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((m5) obj).a();
        }
        arrayList.clear();
        this.f9462f.clear();
        this.f9463g.clear();
    }
}
