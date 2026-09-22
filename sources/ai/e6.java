package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e6 {
    public boolean f761a;
    public Object f762b;
    public Object d;
    public Object f765g;
    public Object f763c = k2.b.f13228c;
    public Object e = k2.h0.f13296a;
    public Object f764f = k2.w.f13387a;

    public e6(Context context) {
        this.f762b = context;
    }

    public k2.g0 a() {
        e2.d.g(!this.f761a);
        this.f761a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((of.b) this.f765g) == null) {
            this.f765g = new of.b((Context) this.f762b, 26);
        }
        return new k2.g0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f765g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
