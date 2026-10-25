package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class o6 {
    public final b7 f5178a;
    public t6 f5179b;
    public t6 f5180c;
    public t6 d;
    public k6 h;
    public k6 f5183i;
    public k6 f5184j;
    public k6 f5185k;
    public TL_stars.TL_starGiftUnique f5186l;
    public long f5187m;
    public a2 f5192r;
    public a2 f5193s;
    public float f5194t;
    public boolean f5195u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f5181f = new ArrayList();
    public final ArrayList f5182g = new ArrayList();
    public float f5188n = 0.0f;
    public boolean f5189o = false;
    public boolean f5190p = false;
    public boolean f5191q = false;

    public o6(b7 b7Var) {
        this.f5178a = b7Var;
        b7Var.f4347c.addOnAttachStateChangeListener(new i6(this, 0));
    }

    public final void a() {
        this.f5189o = false;
        this.f5178a.f4347c.c();
        k6 k6Var = this.h;
        if (k6Var != null) {
            k6Var.a();
        }
        k6 k6Var2 = this.f5183i;
        if (k6Var2 != null) {
            k6Var2.a();
        }
        k6 k6Var3 = this.f5184j;
        if (k6Var3 != null) {
            k6Var3.a();
        }
        k6 k6Var4 = this.f5185k;
        if (k6Var4 != null) {
            k6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f5189o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new h6(this, 1));
        }
    }

    public final void c() {
        if (this.f5189o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m6) obj).a();
        }
        arrayList.clear();
        this.f5181f.clear();
        this.f5182g.clear();
    }
}
