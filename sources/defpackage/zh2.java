package defpackage;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zh2 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final LinearLayout b;
    public final u88 c;

    public zh2(ContextThemeWrapper contextThemeWrapper, th8 th8Var, u88 u88Var) {
        this.c = u88Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, null, contextThemeWrapper);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232063, jb6.M0(2131753721, null), false, null);
        c.setOnClickListener(new w70(th8Var, (byte) 2));
        c.d(-328966, -328966);
        c.setSelectorColor(268435455);
        View a6Var = new a6(contextThemeWrapper, (byte) 7);
        a6Var.setMinimumWidth(gm.L(196.0f));
        a6Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a6Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a6Var.getLayoutParams();
        if (jb6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gm.L(8.0f);
        a6Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}
