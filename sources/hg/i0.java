package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;
public final class i0 extends vl0 {
    public final Context f10296c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final k0 f10297f;

    public i0(k0 k0Var, Context context) {
        this.f10297f = k0Var;
        this.f10296c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42964f == 0) {
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
        this.f10297f.L();
    }

    @Override
    public final void v(s4.c1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: hg.i0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View y1Var;
        Context context = this.f10296c;
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
            y1Var = new y1(context, this.f10297f.f27087a, false);
        }
        return new s4.c1(y1Var);
    }
}
