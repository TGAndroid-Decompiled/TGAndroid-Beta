package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class ui1 extends oec {
    public final Activity a;
    public final int b;
    public final int c;
    public final wjb d;
    public final ArrayList e = new ArrayList();
    public final vi1 f;

    public ui1(vi1 vi1Var, Activity activity, int i, long j, int i2, wjb wjbVar) {
        this.f = vi1Var;
        this.a = activity;
        this.b = i;
        this.c = i2;
        this.d = wjbVar;
        i();
    }

    @Override
    public final void b(View view, int i, int i2) {
        this.f.b.L(view);
    }

    @Override
    public final View d(int i) {
        return new ti1(this.f, this.a, i, this.b, this.c, new eg(this, i, (byte) 13), this.d);
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
            return k96.M0(2131748160, null);
        }
        return k96.M0(2131748161, null);
    }

    @Override
    public final int h(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                return ((c4c) arrayList.get(i)).A;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        vi1 vi1Var = this.f;
        if (!vi1Var.n.isEmpty()) {
            arrayList.add(c4c.D(1));
        }
        if (!vi1Var.r.isEmpty()) {
            arrayList.add(c4c.D(0));
        }
    }
}
