package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e6 {
    public boolean f880a;
    public Object f881b;
    public Object d;
    public Object f885g;
    public Object f882c = k2.b.f14406c;
    public Object f883e = k2.e0.f14459a;
    public Object f884f = k2.u.f14562a;

    public e6(Context context) {
        this.f881b = context;
    }

    public k2.d0 a() {
        e2.d.g(!this.f880a);
        this.f880a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((pf.b) this.f885g) == null) {
            this.f885g = new pf.b((Context) this.f881b, 24);
        }
        return new k2.d0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f885g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
