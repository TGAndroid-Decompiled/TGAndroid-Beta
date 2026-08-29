package nh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.il0;
public final class g8 extends il0 {
    public final h8 f17732c;

    public g8(h8 h8Var) {
        this.f17732c = h8Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f17732c.f17852c.size() + 2;
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
    public final void v(f2.n1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: nh.g8.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        h8 h8Var = this.f17732c;
        if (i10 != 0 && i10 != 1) {
            Context context = h8Var.getContext();
            c6Var = ((org.telegram.ui.ActionBar.f3) h8Var).resourcesProvider;
            view = new d9(context, c6Var);
        } else {
            View view2 = new View(h8Var.getContext());
            if (i10 == 0) {
                dp = (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f);
            } else {
                dp = AndroidUtilities.dp(54.0f);
            }
            view2.setLayoutParams(new f2.x0(-1, dp));
            view = view2;
        }
        return new f2.n1(view);
    }
}
