package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yl0;
public final class d9 extends yl0 {
    public final e9 f4917c;

    public d9(e9 e9Var) {
        this.f4917c = e9Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46527f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f4917c.f5041c.size() + 2;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.d9.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        e9 e9Var = this.f4917c;
        if (i10 != 0 && i10 != 1) {
            Context context = e9Var.getContext();
            d6Var = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
            view = new da(context, d6Var);
        } else {
            View view2 = new View(e9Var.getContext());
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
