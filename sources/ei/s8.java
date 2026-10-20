package ei;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.im0;
public final class s8 extends im0 {
    public final t8 f9816c;

    public s8(t8 t8Var) {
        this.f9816c = t8Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45920f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f9816c.f9858c.size() + 2;
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
    public final void v(s4.b1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.s8.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        t8 t8Var = this.f9816c;
        if (i10 != 0 && i10 != 1) {
            Context context = t8Var.getContext();
            d6Var = ((org.telegram.ui.ActionBar.f3) t8Var).resourcesProvider;
            view = new q9(context, d6Var);
        } else {
            View view2 = new View(t8Var.getContext());
            if (i10 == 0) {
                dp = (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f);
            } else {
                dp = AndroidUtilities.dp(54.0f);
            }
            view2.setLayoutParams(new s4.o0(-1, dp));
            view = view2;
        }
        return new s4.b1(view);
    }
}
