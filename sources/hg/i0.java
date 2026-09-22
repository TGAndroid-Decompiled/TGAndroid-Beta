package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kl0;
public final class i0 extends kl0 {
    public final Context f10310c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final k0 f10311f;

    public i0(k0 k0Var, Context context) {
        this.f10311f = k0Var;
        this.f10310c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42674f == 0) {
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
        this.f10311f.L();
    }

    @Override
    public final void v(s4.c1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: hg.i0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View y1Var;
        Context context = this.f10310c;
        if (i10 != 0) {
            if (i10 != 1) {
                y1Var = new View(context);
                y1Var.setTag(-33024);
            } else {
                y1Var = new View(context);
                y1Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                y1Var.setTag(-33024);
            }
        } else {
            y1Var = new y1(context, this.f10311f.f26460a, false);
        }
        return new s4.c1(y1Var);
    }
}
