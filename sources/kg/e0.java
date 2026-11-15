package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.tj0;
public final class e0 extends tj0 {
    public final Context f17914c;
    public final ArrayList d = new ArrayList();
    public String f17915e;
    public final g0 f17916f;

    public e0(g0 g0Var, Context context) {
        this.f17916f = g0Var;
        this.f17914c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 0) {
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
        this.f17916f.Q();
    }

    @Override
    public final void t(v4.e1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e0.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View q1Var;
        Context context = this.f17914c;
        if (i7 != 0) {
            if (i7 != 1) {
                q1Var = new View(context);
                q1Var.setTag(-33024);
            } else {
                q1Var = new View(context);
                q1Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                q1Var.setTag(-33024);
            }
        } else {
            q1Var = new q1(context, this.f17916f.f33606a, false);
        }
        return new v4.e1(q1Var);
    }
}
