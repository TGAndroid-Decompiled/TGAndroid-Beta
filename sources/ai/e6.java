package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e6 {
    public boolean f882a;
    public Object f883b;
    public Object d;
    public Object f887g;
    public Object f884c = k2.b.f14409c;
    public Object f885e = k2.e0.f14462a;
    public Object f886f = k2.u.f14565a;

    public e6(Context context) {
        this.f883b = context;
    }

    public k2.d0 a() {
        e2.d.g(!this.f882a);
        this.f882a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((pf.b) this.f887g) == null) {
            this.f887g = new pf.b((Context) this.f883b, 24);
        }
        return new k2.d0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f887g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
