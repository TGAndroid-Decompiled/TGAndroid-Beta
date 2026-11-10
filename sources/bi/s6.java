package bi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class s6 {
    public final e7 f4673a;
    public x6 f4674b;
    public x6 f4675c;
    public x6 d;
    public o6 h;
    public o6 f4679i;
    public o6 f4680j;
    public o6 f4681k;
    public TL_stars.TL_starGiftUnique f4682l;
    public long f4683m;
    public z1 f4688r;
    public z1 f4689s;
    public float f4690t;
    public boolean f4691u;
    public boolean v;
    public final ArrayList f4676e = new ArrayList();
    public final ArrayList f4677f = new ArrayList();
    public final ArrayList f4678g = new ArrayList();
    public float f4684n = 0.0f;
    public boolean f4685o = false;
    public boolean f4686p = false;
    public boolean f4687q = false;

    public s6(e7 e7Var) {
        this.f4673a = e7Var;
        e7Var.f3766c.addOnAttachStateChangeListener(new m6(this, 0));
    }

    public final void a() {
        this.f4685o = false;
        this.f4673a.f3766c.c();
        o6 o6Var = this.h;
        if (o6Var != null) {
            o6Var.a();
        }
        o6 o6Var2 = this.f4679i;
        if (o6Var2 != null) {
            o6Var2.a();
        }
        o6 o6Var3 = this.f4680j;
        if (o6Var3 != null) {
            o6Var3.a();
        }
        o6 o6Var4 = this.f4681k;
        if (o6Var4 != null) {
            o6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f4685o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.h3(new l6(this, 1));
        }
    }

    public final void c() {
        if (this.f4685o) {
            return;
        }
        ArrayList arrayList = this.f4676e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((q6) obj).a();
        }
        arrayList.clear();
        this.f4677f.clear();
        this.f4678g.clear();
    }
}
