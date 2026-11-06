package lh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jh.k;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.af;
import org.telegram.ui.an;
import org.telegram.ui.e0;
import org.telegram.ui.fe;
import org.telegram.ui.ku0;
import org.telegram.ui.ol;
public final class g implements View.OnLongClickListener {
    public final int f18376a;
    public final int f18377b;
    public final FrameLayout f18378c;

    public g(FrameLayout frameLayout, int i7, int i10) {
        this.f18376a = i10;
        this.f18378c = frameLayout;
        this.f18377b = i7;
    }

    @Override
    public final boolean onLongClick(View view) {
        af afVar;
        boolean z9;
        String M0;
        uk0 uk0Var;
        int i7 = this.f18376a;
        int i10 = this.f18377b;
        FrameLayout frameLayout = this.f18378c;
        switch (i7) {
            case 0:
                b bVar = ((h) frameLayout).f18385n;
                if (bVar != null) {
                    an anVar = ((fe) bVar).f45610b;
                    if (i10 == 2) {
                        afVar = new af(anVar, 11);
                        z9 = true;
                    } else if (i10 == 3) {
                        afVar = new af(anVar, 12);
                        z9 = false;
                    } else if (i10 == 4) {
                        afVar = new af(anVar, 13);
                        z9 = true;
                    }
                    Activity parentActivity = anVar.getParentActivity();
                    q4 parentLayout = anVar.getParentLayout();
                    ol olVar = anVar.l1;
                    f6 resourceProvider = anVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(g0.L(200.0f));
                    z0 z0Var = new z0(0, parentActivity, resourceProvider, true, true);
                    z0Var.setMinimumWidth(g0.L(200.0f));
                    if (!z9) {
                        M0 = hd.M0(2131746371, null);
                    } else if (z9) {
                        M0 = hd.M0(2131746373, null);
                    } else {
                        M0 = hd.M0(2131746372, null);
                    }
                    z0Var.j(M0, 2131232356, null);
                    z0Var.setOnClickListener(new ku0(1, afVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                    g1 g1Var = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    g1Var.f27481e = true;
                    g1Var.f27480c = 220;
                    g1Var.setOutsideTouchable(true);
                    g1Var.setClippingEnabled(true);
                    g1Var.setAnimationStyle(2131755192);
                    g1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE));
                    g1Var.setInputMethodMode(2);
                    g1Var.setSoftInputMode(0);
                    g1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, olVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + g0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (g0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    g1Var.showAtLocation(olVar, 51, (int) width, (int) measuredHeight);
                    anVar.f43757e9 = g1Var;
                    anVar.u8(anVar.f43989x1, false);
                    anVar.f43757e9.setOnDismissListener(new e0(anVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                if (!scrollSlidingTextTabStrip.f31534n0 && (uk0Var = scrollSlidingTextTabStrip.f31518b) != null && uk0Var.m1(i10, view)) {
                    return true;
                }
                return false;
        }
    }
}
