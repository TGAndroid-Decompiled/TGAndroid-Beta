package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yl0;
public final class e9 extends yl0 {
    public final f9 f4657c;

    public e9(f9 f9Var) {
        this.f4657c = f9Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43071f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f4657c.f4700c.size() + 2;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.e9.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        f9 f9Var = this.f4657c;
        if (i10 != 0 && i10 != 1) {
            Context context = f9Var.getContext();
            d6Var = ((org.telegram.ui.ActionBar.e3) f9Var).resourcesProvider;
            view = new ea(context, d6Var);
        } else {
            View view2 = new View(f9Var.getContext());
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
