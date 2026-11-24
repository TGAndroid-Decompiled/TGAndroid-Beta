package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class i6 implements Runnable {
    public final byte a;
    public final ActionBarLayout b;

    public i6(ActionBarLayout actionBarLayout, byte b) {
        this.a = b;
        this.b = actionBarLayout;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (b) {
            case 0:
                Drawable drawable = ActionBarLayout.w1;
                actionBarLayout.I0.setVisibility(8);
                return;
            case 1:
                actionBarLayout.invalidate();
                return;
            case 2:
                actionBarLayout.requestLayout();
                actionBarLayout.s.requestLayout();
                actionBarLayout.w.requestLayout();
                actionBarLayout.x.requestLayout();
                return;
            case 3:
                Drawable drawable2 = ActionBarLayout.w1;
                if (actionBarLayout.a && actionBarLayout.getLastFragment() != null && actionBarLayout.s.getChildCount() == 0) {
                    boolean z = w01.a;
                    fa4.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.p1)), true);
                    actionBarLayout.W(true, true);
                    return;
                }
                return;
            case 4:
                Drawable drawable3 = ActionBarLayout.w1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable4 = ActionBarLayout.w1;
                actionBarLayout.F(false);
                return;
        }
    }
}
