package lh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jh.k;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.bf;
import org.telegram.ui.cn;
import org.telegram.ui.e0;
import org.telegram.ui.fe;
import org.telegram.ui.ou0;
import org.telegram.ui.ql;
public final class g implements View.OnLongClickListener {
    public final int f18382a;
    public final int f18383b;
    public final FrameLayout f18384c;

    public g(FrameLayout frameLayout, int i7, int i10) {
        this.f18382a = i10;
        this.f18384c = frameLayout;
        this.f18383b = i7;
    }

    @Override
    public final boolean onLongClick(View view) {
        bf bfVar;
        boolean z9;
        String M0;
        uk0 uk0Var;
        int i7 = this.f18382a;
        int i10 = this.f18383b;
        FrameLayout frameLayout = this.f18384c;
        switch (i7) {
            case 0:
                b bVar = ((h) frameLayout).f18391n;
                if (bVar != null) {
                    cn cnVar = ((fe) bVar).f45690b;
                    if (i10 == 2) {
                        bfVar = new bf(cnVar, 10);
                        z9 = true;
                    } else if (i10 == 3) {
                        bfVar = new bf(cnVar, 11);
                        z9 = false;
                    } else if (i10 == 4) {
                        bfVar = new bf(cnVar, 12);
                        z9 = true;
                    }
                    Activity parentActivity = cnVar.getParentActivity();
                    r4 parentLayout = cnVar.getParentLayout();
                    ql qlVar = cnVar.l1;
                    h6 resourceProvider = cnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(g0.L(200.0f));
                    z0 z0Var = new z0(0, parentActivity, resourceProvider, true, true);
                    z0Var.setMinimumWidth(g0.L(200.0f));
                    if (!z9) {
                        M0 = id.M0(2131746372, null);
                    } else if (z9) {
                        M0 = id.M0(2131746374, null);
                    } else {
                        M0 = id.M0(2131746373, null);
                    }
                    z0Var.j(M0, 2131232356, null);
                    z0Var.setOnClickListener(new ou0(1, bfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                    g1 g1Var = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    g1Var.f27493e = true;
                    g1Var.f27492c = 220;
                    g1Var.setOutsideTouchable(true);
                    g1Var.setClippingEnabled(true);
                    g1Var.setAnimationStyle(2131755192);
                    g1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE));
                    g1Var.setInputMethodMode(2);
                    g1Var.setSoftInputMode(0);
                    g1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, qlVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + g0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (g0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    g1Var.showAtLocation(qlVar, 51, (int) width, (int) measuredHeight);
                    cnVar.f44483e9 = g1Var;
                    cnVar.v8(cnVar.f44717x1, false);
                    cnVar.f44483e9.setOnDismissListener(new e0(cnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                if (!scrollSlidingTextTabStrip.f31555n0 && (uk0Var = scrollSlidingTextTabStrip.f31539b) != null && uk0Var.m1(i10, view)) {
                    return true;
                }
                return false;
        }
    }
}
