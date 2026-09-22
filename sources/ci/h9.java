package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kl0;
public final class h9 extends kl0 {
    public final i9 f4754c;

    public h9(i9 i9Var) {
        this.f4754c = i9Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42674f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f4754c.f4798c.size() + 2;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.h9.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        i9 i9Var = this.f4754c;
        if (i10 != 0 && i10 != 1) {
            Context context = i9Var.getContext();
            e6Var = ((org.telegram.ui.ActionBar.f3) i9Var).resourcesProvider;
            view = new ha(context, e6Var);
        } else {
            View view2 = new View(i9Var.getContext());
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
