package fi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;
public final class o8 extends mm0 {
    public final p8 f11420c;

    public o8(p8 p8Var) {
        this.f11420c = p8Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f11420c.f11444c.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.e1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o8.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.u6 u6Var;
        p8 p8Var = this.f11420c;
        if (i10 != 0 && i10 != 1) {
            Context context = p8Var.getContext();
            u6Var = ((org.telegram.ui.ActionBar.k3) p8Var).resourcesProvider;
            view = new m9(context, u6Var);
        } else {
            View view2 = new View(p8Var.getContext());
            if (i10 == 0) {
                dp = (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f);
            } else {
                dp = AndroidUtilities.dp(54.0f);
            }
            view2.setLayoutParams(new s4.q0(-1, dp));
            view = view2;
        }
        return new s4.e1(view);
    }
}
