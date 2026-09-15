package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e6 {
    public boolean f759a;
    public Object f760b;
    public Object d;
    public Object f763g;
    public Object f761c = k2.b.f13226c;
    public Object e = k2.h0.f13294a;
    public Object f762f = k2.w.f13385a;

    public e6(Context context) {
        this.f760b = context;
    }

    public k2.g0 a() {
        e2.d.g(!this.f759a);
        this.f759a = true;
        if (((aa.a) this.d) == null) {
            this.d = new aa.a(new c2.h[0]);
        }
        if (((of.b) this.f763g) == null) {
            this.f763g = new of.b((Context) this.f760b, 26);
        }
        return new k2.g0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f763g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
