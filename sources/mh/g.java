package mh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kh.k;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.cu0;
import org.telegram.ui.de;
import org.telegram.ui.f0;
import org.telegram.ui.kl;
import org.telegram.ui.wm;
import org.telegram.ui.xe;
public final class g implements View.OnLongClickListener {
    public final int f19418a;
    public final int f19419b;
    public final FrameLayout f19420c;

    public g(FrameLayout frameLayout, int i3, int i10) {
        this.f19418a = i10;
        this.f19420c = frameLayout;
        this.f19419b = i3;
    }

    @Override
    public final boolean onLongClick(View view) {
        xe xeVar;
        boolean z10;
        String M0;
        yk0 yk0Var;
        int i3 = this.f19418a;
        int i10 = this.f19419b;
        FrameLayout frameLayout = this.f19420c;
        switch (i3) {
            case 0:
                b bVar = ((h) frameLayout).f19427n;
                if (bVar != null) {
                    wm wmVar = ((de) bVar).f44668b;
                    if (i10 == 2) {
                        xeVar = new xe(wmVar, 11);
                        z10 = true;
                    } else if (i10 == 3) {
                        xeVar = new xe(wmVar, 12);
                        z10 = false;
                    } else if (i10 == 4) {
                        xeVar = new xe(wmVar, 13);
                        z10 = true;
                    }
                    Activity parentActivity = wmVar.getParentActivity();
                    q4 parentLayout = wmVar.getParentLayout();
                    kl klVar = wmVar.m1;
                    e6 resourceProvider = wmVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(g0.L(200.0f));
                    y0 y0Var = new y0(0, parentActivity, resourceProvider, true, true);
                    y0Var.setMinimumWidth(g0.L(200.0f));
                    if (!z10) {
                        M0 = bd.M0(2131746380, null);
                    } else if (z10) {
                        M0 = bd.M0(2131746382, null);
                    } else {
                        M0 = bd.M0(2131746381, null);
                    }
                    y0Var.j(M0, 2131232356, null);
                    y0Var.setOnClickListener(new cu0(1, xeVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                    f1 f1Var = new f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    f1Var.f27495e = true;
                    f1Var.f27494c = 220;
                    f1Var.setOutsideTouchable(true);
                    f1Var.setClippingEnabled(true);
                    f1Var.setAnimationStyle(2131755192);
                    f1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE));
                    f1Var.setInputMethodMode(2);
                    f1Var.setSoftInputMode(0);
                    f1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, klVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + g0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (g0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    f1Var.showAtLocation(klVar, 51, (int) width, (int) measuredHeight);
                    wmVar.f51316f9 = f1Var;
                    wmVar.u8(wmVar.f51549y1, false);
                    wmVar.f51316f9.setOnDismissListener(new f0(wmVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                if (!scrollSlidingTextTabStrip.f31612o0 && (yk0Var = scrollSlidingTextTabStrip.f31595b) != null && yk0Var.k1(i10, view)) {
                    return true;
                }
                return false;
        }
    }
}
