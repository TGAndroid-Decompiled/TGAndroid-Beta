package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class o5 {
    public final z5 f9422a;
    public t5 f9423b;
    public t5 f9424c;
    public t5 d;
    public k5 h;
    public k5 f9428i;
    public k5 f9429j;
    public k5 f9430k;
    public TL_stars.TL_starGiftUnique f9431l;
    public long f9432m;
    public k1 f9437r;
    public k1 f9438s;
    public float f9439t;
    public boolean f9440u;
    public boolean v;
    public final ArrayList f9425e = new ArrayList();
    public final ArrayList f9426f = new ArrayList();
    public final ArrayList f9427g = new ArrayList();
    public float f9433n = 0.0f;
    public boolean f9434o = false;
    public boolean f9435p = false;
    public boolean f9436q = false;

    public o5(z5 z5Var) {
        this.f9422a = z5Var;
        z5Var.f10108c.addOnAttachStateChangeListener(new bi.x2(this, 4));
    }

    public final void a() {
        this.f9434o = false;
        this.f9422a.f10108c.c();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.a();
        }
        k5 k5Var2 = this.f9428i;
        if (k5Var2 != null) {
            k5Var2.a();
        }
        k5 k5Var3 = this.f9429j;
        if (k5Var3 != null) {
            k5Var3.a();
        }
        k5 k5Var4 = this.f9430k;
        if (k5Var4 != null) {
            k5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f9434o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.g3(new i5(this, 1));
        }
    }

    public final void c() {
        if (this.f9434o) {
            return;
        }
        ArrayList arrayList = this.f9425e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((m5) obj).a();
        }
        arrayList.clear();
        this.f9426f.clear();
        this.f9427g.clear();
    }
}
