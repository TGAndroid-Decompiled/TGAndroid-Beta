package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d6 {
    public boolean f772a;
    public Object f773b;
    public Object d;
    public Object f777g;
    public Object f774c = k2.b.f14374c;
    public Object f775e = k2.g0.f14438a;
    public Object f776f = k2.w.f14539a;

    public d6(Context context) {
        this.f773b = context;
    }

    public k2.f0 a() {
        e2.d.g(!this.f772a);
        this.f772a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((of.b) this.f777g) == null) {
            this.f777g = new of.b((Context) this.f773b, 26);
        }
        return new k2.f0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f777g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
