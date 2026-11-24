package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class dk1 extends ogc {
    public final Activity a;
    public final int b;
    public final int c;
    public final ylb d;
    public final ArrayList e = new ArrayList();
    public final ek1 f;

    public dk1(ek1 ek1Var, Activity activity, int i, long j, int i2, ylb ylbVar) {
        this.f = ek1Var;
        this.a = activity;
        this.b = i;
        this.c = i2;
        this.d = ylbVar;
        i();
    }

    @Override
    public final void b(View view, int i, int i2) {
        this.f.b.L(view);
    }

    @Override
    public final View d(int i) {
        return new ck1(this.f, this.a, i, this.b, this.c, new eh(this, i, (byte) 13), this.d);
    }

    @Override
    public final int e() {
        return this.e.size();
    }

    @Override
    public final CharSequence g(int i) {
        int h = h(i);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return jb6.M0(2131748109, null);
        }
        return jb6.M0(2131748110, null);
    }

    @Override
    public final int h(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                return ((c6c) arrayList.get(i)).A;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ek1 ek1Var = this.f;
        if (!ek1Var.n.isEmpty()) {
            arrayList.add(c6c.D(1));
        }
        if (!ek1Var.r.isEmpty()) {
            arrayList.add(c6c.D(0));
        }
    }
}
