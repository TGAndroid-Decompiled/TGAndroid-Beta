package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d6 {
    public boolean f711a;
    public Object f712b;
    public Object d;
    public Object f715g;
    public Object f713c = k2.b.f13218c;
    public Object e = k2.f0.f13275a;
    public Object f714f = k2.v.f13370a;

    public d6(Context context) {
        this.f712b = context;
    }

    public k2.e0 a() {
        e2.d.g(!this.f711a);
        this.f711a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((of.b) this.f715g) == null) {
            this.f715g = new of.b((Context) this.f712b, 26);
        }
        return new k2.e0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f715g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
