package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.bk0;
public final class e0 extends bk0 {
    public final Context f18298c;
    public final ArrayList d = new ArrayList();
    public String f18299e;
    public final g0 f18300f;

    public e0(g0 g0Var, Context context) {
        this.f18300f = g0Var;
        this.f18298c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 0) {
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
        this.f18300f.Q();
    }

    @Override
    public final void t(v4.f1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View s1Var;
        Context context = this.f18298c;
        if (i7 != 0) {
            if (i7 != 1) {
                s1Var = new View(context);
                s1Var.setTag(-33024);
            } else {
                s1Var = new View(context);
                s1Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                s1Var.setTag(-33024);
            }
        } else {
            s1Var = new s1(context, this.f18300f.f36765a, false);
        }
        return new v4.f1(s1Var);
    }
}
