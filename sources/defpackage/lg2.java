package defpackage;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lg2 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final LinearLayout b;
    public final s68 c;

    public lg2(ContextThemeWrapper contextThemeWrapper, rf8 rf8Var, s68 s68Var) {
        this.c = s68Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, null, contextThemeWrapper);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232062, k96.M0(2131753753, null), false, null);
        c.setOnClickListener(new w60(rf8Var, (byte) 2));
        c.d(-328966, -328966);
        c.setSelectorColor(268435455);
        View a6Var = new a6(contextThemeWrapper, (byte) 7);
        a6Var.setMinimumWidth(gl.L(196.0f));
        a6Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a6Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a6Var.getLayoutParams();
        if (k96.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gl.L(8.0f);
        a6Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}
