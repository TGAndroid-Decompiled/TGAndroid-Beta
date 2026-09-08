package di;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kl0;
public final class g9 extends kl0 {
    public final h9 f7325c;

    public g9(h9 h9Var) {
        this.f7325c = h9Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45770f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f7325c.f7360c.size() + 2;
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
    public final void v(s4.c1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.g9.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        h9 h9Var = this.f7325c;
        if (i10 != 0 && i10 != 1) {
            Context context = h9Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.f3) h9Var).resourcesProvider;
            view = new ha(context, f6Var);
        } else {
            View view2 = new View(h9Var.getContext());
            if (i10 == 0) {
                dp = (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f);
            } else {
                dp = AndroidUtilities.dp(54.0f);
            }
            view2.setLayoutParams(new s4.p0(-1, dp));
            view = view2;
        }
        return new s4.c1(view);
    }
}
