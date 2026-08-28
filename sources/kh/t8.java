package kh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vk0;
public final class t8 extends vk0 {
    public final u8 f16096c;

    public t8(u8 u8Var) {
        this.f16096c = u8Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f16096c.f16166c.size() + 2;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: kh.t8.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.b6 b6Var;
        u8 u8Var = this.f16096c;
        if (i9 != 0 && i9 != 1) {
            Context context = u8Var.getContext();
            b6Var = ((org.telegram.ui.ActionBar.f3) u8Var).resourcesProvider;
            view = new s9(context, b6Var);
        } else {
            View view2 = new View(u8Var.getContext());
            if (i9 == 0) {
                dp = (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f);
            } else {
                dp = AndroidUtilities.dp(54.0f);
            }
            view2.setLayoutParams(new f2.a1(-1, dp));
            view = view2;
        }
        return new f2.q1(view);
    }
}
