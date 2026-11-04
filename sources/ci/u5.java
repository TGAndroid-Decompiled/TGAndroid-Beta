package ci;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class u5 {
    public final f6 f6087a;
    public z5 f6088b;
    public z5 f6089c;
    public z5 d;
    public q5 h;
    public q5 f6093i;
    public q5 f6094j;
    public q5 f6095k;
    public TL_stars.TL_starGiftUnique f6096l;
    public long f6097m;
    public s1 f6102r;
    public s1 f6103s;
    public float f6104t;
    public boolean f6105u;
    public boolean v;
    public final ArrayList f6090e = new ArrayList();
    public final ArrayList f6091f = new ArrayList();
    public final ArrayList f6092g = new ArrayList();
    public float f6098n = 0.0f;
    public boolean f6099o = false;
    public boolean f6100p = false;
    public boolean f6101q = false;

    public u5(f6 f6Var) {
        this.f6087a = f6Var;
        f6Var.f5087c.addOnAttachStateChangeListener(new ai.f2(this, 4));
    }

    public final void a() {
        this.f6099o = false;
        this.f6087a.f5087c.c();
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.a();
        }
        q5 q5Var2 = this.f6093i;
        if (q5Var2 != null) {
            q5Var2.a();
        }
        q5 q5Var3 = this.f6094j;
        if (q5Var3 != null) {
            q5Var3.a();
        }
        q5 q5Var4 = this.f6095k;
        if (q5Var4 != null) {
            q5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f6099o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.h3(new o5(this, 1));
        }
    }

    public final void c() {
        if (this.f6099o) {
            return;
        }
        ArrayList arrayList = this.f6090e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((s5) obj).a();
        }
        arrayList.clear();
        this.f6091f.clear();
        this.f6092g.clear();
    }
}
