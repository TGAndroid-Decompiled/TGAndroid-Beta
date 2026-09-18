package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ll0;
public final class h9 extends ll0 {
    public final i9 f4757c;

    public h9(i9 i9Var) {
        this.f4757c = i9Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42705f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f4757c.f4801c.size() + 2;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        i9 i9Var = this.f4757c;
        if (i10 != 0 && i10 != 1) {
            Context context = i9Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) i9Var).resourcesProvider;
            view = new ha(context, f6Var);
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
