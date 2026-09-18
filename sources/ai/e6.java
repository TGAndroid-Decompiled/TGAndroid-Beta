package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e6 {
    public boolean f764a;
    public Object f765b;
    public Object d;
    public Object f768g;
    public Object f766c = k2.b.f13229c;
    public Object e = k2.g0.f13292a;
    public Object f767f = k2.w.f13386a;

    public e6(Context context) {
        this.f765b = context;
    }

    public k2.f0 a() {
        e2.d.g(!this.f764a);
        this.f764a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((of.b) this.f768g) == null) {
            this.f768g = new of.b((Context) this.f765b, 26);
        }
        return new k2.f0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f768g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
