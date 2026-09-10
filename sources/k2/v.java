package k2;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class v {
    public boolean f12224a;
    public Object f12225b;
    public Object d;
    public Object f12228g;
    public Object f12226c = b.f12073c;
    public Object e = f0.f12130a;
    public Object f12227f = u.f12223a;

    public v(Context context) {
        this.f12225b = context;
    }

    public e0 a() {
        e2.d.g(!this.f12224a);
        this.f12224a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((n4.y) this.f12228g) == null) {
            this.f12228g = new n4.y((Context) this.f12225b, 26);
        }
        return new e0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f12228g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
