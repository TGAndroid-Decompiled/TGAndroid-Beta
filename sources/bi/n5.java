package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class n5 {
    public boolean f3364a;
    public Object f3365b;
    public Object d;
    public Object f3369g;
    public Object f3366c = k2.b.f14516c;
    public Object f3367e = k2.e0.f14570a;
    public Object f3368f = k2.u.f14674a;

    public n5(Context context) {
        this.f3365b = context;
    }

    public k2.d0 a() {
        e2.d.g(!this.f3364a);
        this.f3364a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((pf.b) this.f3369g) == null) {
            this.f3369g = new pf.b((Context) this.f3365b, 26);
        }
        return new k2.d0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f3369g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
