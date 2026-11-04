package lg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.sj0;
public final class f0 extends sj0 {
    public final Context f18295c;
    public final ArrayList d = new ArrayList();
    public String f18296e;
    public final h0 f18297f;

    public f0(h0 h0Var, Context context) {
        this.f18297f = h0Var;
        this.f18295c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.size() + 2;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == b() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        super.f();
        this.f18297f.P();
    }

    @Override
    public final void t(u4.d1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: lg.f0.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View q1Var;
        Context context = this.f18295c;
        if (i3 != 0) {
            if (i3 != 1) {
                q1Var = new View(context);
                q1Var.setTag(-33024);
            } else {
                q1Var = new View(context);
                q1Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                q1Var.setTag(-33024);
            }
        } else {
            q1Var = new q1(context, this.f18297f.f38415a, false);
        }
        return new u4.d1(q1Var);
    }
}
