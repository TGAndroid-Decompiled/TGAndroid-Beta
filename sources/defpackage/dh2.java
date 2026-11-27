package defpackage;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class dh2 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final LinearLayout b;
    public final fa8 c;

    public dh2(ContextThemeWrapper contextThemeWrapper, fj8 fj8Var, fa8 fa8Var) {
        this.c = fa8Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, null, contextThemeWrapper);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232062, ob6.M0(2131753749, null), false, null);
        c.setOnClickListener(new y60(fj8Var, (byte) 2));
        c.d(-328966, -328966);
        c.setSelectorColor(268435455);
        View b6Var = new b6(contextThemeWrapper, (byte) 7);
        b6Var.setMinimumWidth(hl.L(196.0f));
        b6Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b6Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b6Var.getLayoutParams();
        if (ob6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = hl.L(8.0f);
        b6Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}
