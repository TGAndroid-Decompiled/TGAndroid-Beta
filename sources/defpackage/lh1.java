package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class lh1 extends c79 {
    public final Activity c;
    public final vnb d;
    public final int e;
    public final nh1 f;

    public lh1(nh1 nh1Var, Activity activity, vnb vnbVar, int i) {
        this.f = nh1Var;
        this.c = activity;
        this.d = vnbVar;
        this.e = i;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final int b() {
        lc7 lc7Var = uc7.s1(this.e).E3;
        if (lc7Var == null) {
            return 0;
        }
        return lc7Var.c.size();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        mh1 mh1Var = (mh1) f89Var.a;
        yob.h(aob.d6, this.d, mh1Var);
        if (i == this.f.e) {
            z = true;
        } else {
            z = false;
        }
        mh1Var.s = z;
        mh1Var.w.f(z, true);
        mh1Var.invalidate();
        lc7 lc7Var = uc7.s1(this.e).E3;
        if (lc7Var != null) {
            ArrayList arrayList = lc7Var.c;
            if (i >= 0 && i < arrayList.size()) {
                mh1Var.a((kc7) arrayList.get(i));
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        return new f89(new mh1(this.f, this.c));
    }
}
