package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;
public final class g0 extends mm0 {
    public final Context f15710c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final i0 f15711f;

    public g0(i0 i0Var, Context context) {
        this.f15711f = i0Var;
        this.f15710c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 0) {
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
        this.f15711f.O();
    }

    @Override
    public final void v(s4.e1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: jg.g0.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View y1Var;
        Context context = this.f15710c;
        if (i10 != 0) {
            if (i10 != 1) {
                y1Var = new View(context);
                y1Var.setTag(-33024);
            } else {
                y1Var = new View(context);
                y1Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                y1Var.setTag(-33024);
            }
        } else {
            y1Var = new y1(context, this.f15711f.f30253a, false);
        }
        return new s4.e1(y1Var);
    }
}
