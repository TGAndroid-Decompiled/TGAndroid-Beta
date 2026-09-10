package gg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ul0;
public final class l0 extends ul0 {
    public final Context f8943c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final n0 f8944f;

    public l0(n0 n0Var, Context context) {
        this.f8944f = n0Var;
        this.f8943c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == h() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void l() {
        super.l();
        this.f8944f.L();
    }

    @Override
    public final void v(s4.c1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: gg.l0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g2Var;
        Context context = this.f8943c;
        if (i10 != 0) {
            if (i10 != 1) {
                g2Var = new View(context);
                g2Var.setTag(-33024);
            } else {
                g2Var = new View(context);
                g2Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                g2Var.setTag(-33024);
            }
        } else {
            g2Var = new g2(context, this.f8944f.f26421a, false);
        }
        return new s4.c1(g2Var);
    }
}
