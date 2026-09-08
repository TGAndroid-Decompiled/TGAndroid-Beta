package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class n5 {
    public boolean f3391a;
    public Object f3392b;
    public Object d;
    public Object f3396g;
    public Object f3393c = k2.b.f14542c;
    public Object f3394e = k2.e0.f14596a;
    public Object f3395f = k2.u.f14700a;

    public n5(Context context) {
        this.f3392b = context;
    }

    public k2.d0 a() {
        e2.d.g(!this.f3391a);
        this.f3391a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((pf.b) this.f3396g) == null) {
            this.f3396g = new pf.b((Context) this.f3392b, 26);
        }
        return new k2.d0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f3396g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
