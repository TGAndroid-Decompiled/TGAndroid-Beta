package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.oj0;
public final class e0 extends oj0 {
    public final Context f17352c;
    public final ArrayList d = new ArrayList();
    public String f17353e;
    public final g0 f17354f;

    public e0(g0 g0Var, Context context) {
        this.f17354f = g0Var;
        this.f17352c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56955f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.size() + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == b() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        super.f();
        this.f17354f.P();
    }

    @Override
    public final void t(v4.d1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View p1Var;
        Context context = this.f17352c;
        if (i7 != 0) {
            if (i7 != 1) {
                p1Var = new View(context);
                p1Var.setTag(-33024);
            } else {
                p1Var = new View(context);
                p1Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                p1Var.setTag(-33024);
            }
        } else {
            p1Var = new p1(context, this.f17354f.f38968a, false);
        }
        return new v4.d1(p1Var);
    }
}
