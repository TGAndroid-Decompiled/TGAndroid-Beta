package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d6 {
    public boolean f714a;
    public Object f715b;
    public Object d;
    public Object f718g;
    public Object f716c = k2.b.f13221c;
    public Object e = k2.f0.f13278a;
    public Object f717f = k2.v.f13372a;

    public d6(Context context) {
        this.f715b = context;
    }

    public k2.e0 a() {
        e2.d.g(!this.f714a);
        this.f714a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((of.b) this.f718g) == null) {
            this.f718g = new of.b((Context) this.f715b, 26);
        }
        return new k2.e0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f718g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
