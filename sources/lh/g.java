package lh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jh.k;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.af;
import org.telegram.ui.bn;
import org.telegram.ui.e0;
import org.telegram.ui.ee;
import org.telegram.ui.mu0;
import org.telegram.ui.pl;
public final class g implements View.OnLongClickListener {
    public final int f19879a;
    public final int f19880b;
    public final FrameLayout f19881c;

    public g(FrameLayout frameLayout, int i7, int i10) {
        this.f19879a = i10;
        this.f19881c = frameLayout;
        this.f19880b = i7;
    }

    @Override
    public final boolean onLongClick(View view) {
        af afVar;
        boolean z10;
        String M0;
        hl0 hl0Var;
        int i7 = this.f19879a;
        int i10 = this.f19880b;
        FrameLayout frameLayout = this.f19881c;
        switch (i7) {
            case 0:
                b bVar = ((h) frameLayout).f19888n;
                if (bVar != null) {
                    bn bnVar = ((ee) bVar).f47210b;
                    if (i10 == 2) {
                        afVar = new af(bnVar, 10);
                        z10 = true;
                    } else if (i10 == 3) {
                        afVar = new af(bnVar, 11);
                        z10 = false;
                    } else if (i10 == 4) {
                        afVar = new af(bnVar, 12);
                        z10 = true;
                    }
                    Activity parentActivity = bnVar.getParentActivity();
                    s4 parentLayout = bnVar.getParentLayout();
                    pl plVar = bnVar.f46093m1;
                    i6 resourceProvider = bnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(g0.L(200.0f));
                    z0 z0Var = new z0(0, parentActivity, resourceProvider, true, true);
                    z0Var.setMinimumWidth(g0.L(200.0f));
                    if (!z10) {
                        M0 = gd.M0(2131746177, null);
                    } else if (z10) {
                        M0 = gd.M0(2131746179, null);
                    } else {
                        M0 = gd.M0(2131746178, null);
                    }
                    z0Var.j(M0, 2131232358, null);
                    z0Var.setOnClickListener(new mu0(1, afVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                    h1 h1Var = new h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    h1Var.f28993e = true;
                    h1Var.f28992c = 220;
                    h1Var.setOutsideTouchable(true);
                    h1Var.setClippingEnabled(true);
                    h1Var.setAnimationStyle(2131755192);
                    h1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE));
                    h1Var.setInputMethodMode(2);
                    h1Var.setSoftInputMode(0);
                    h1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, plVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + g0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (g0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    h1Var.showAtLocation(plVar, 51, (int) width, (int) measuredHeight);
                    bnVar.f46023g9 = h1Var;
                    bnVar.w8(bnVar.f46246y1, false);
                    bnVar.f46023g9.setOnDismissListener(new e0(bnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                if (!scrollSlidingTextTabStrip.f33116o0 && (hl0Var = scrollSlidingTextTabStrip.f33099b) != null && hl0Var.h1(i10, view)) {
                    return true;
                }
                return false;
        }
    }
}
