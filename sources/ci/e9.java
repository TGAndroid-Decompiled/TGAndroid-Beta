package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qm0;
public final class e9 extends qm0 {
    public final f9 f5042c;

    public e9(f9 f9Var) {
        this.f5042c = f9Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47706f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f5042c.f5088c.size() + 2;
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
    public final void v(s4.d1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.e9.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        f9 f9Var = this.f5042c;
        if (i10 != 0 && i10 != 1) {
            Context context = f9Var.getContext();
            e6Var = ((org.telegram.ui.ActionBar.f3) f9Var).resourcesProvider;
            view = new ea(context, e6Var);
        } else {
            View view2 = new View(f9Var.getContext());
            if (i10 == 0) {
                dp = (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f);
            } else {
                dp = AndroidUtilities.dp(54.0f);
            }
            view2.setLayoutParams(new s4.q0(-1, dp));
            view = view2;
        }
        return new s4.d1(view);
    }
}
