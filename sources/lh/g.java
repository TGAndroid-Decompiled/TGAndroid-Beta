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
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.af;
import org.telegram.ui.bn;
import org.telegram.ui.e0;
import org.telegram.ui.ee;
import org.telegram.ui.mu0;
import org.telegram.ui.pl;
public final class g implements View.OnLongClickListener {
    public final int f19904a;
    public final int f19905b;
    public final FrameLayout f19906c;

    public g(FrameLayout frameLayout, int i7, int i10) {
        this.f19904a = i10;
        this.f19906c = frameLayout;
        this.f19905b = i7;
    }

    @Override
    public final boolean onLongClick(View view) {
        af afVar;
        boolean z10;
        String N0;
        jl0 jl0Var;
        int i7 = this.f19904a;
        int i10 = this.f19905b;
        FrameLayout frameLayout = this.f19906c;
        switch (i7) {
            case 0:
                b bVar = ((h) frameLayout).f19913n;
                if (bVar != null) {
                    bn bnVar = ((ee) bVar).f47246b;
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
                    r4 parentLayout = bnVar.getParentLayout();
                    pl plVar = bnVar.f46107m1;
                    h6 resourceProvider = bnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(g0.L(200.0f));
                    y0 y0Var = new y0(0, parentActivity, resourceProvider, true, true);
                    y0Var.setMinimumWidth(g0.L(200.0f));
                    if (!z10) {
                        N0 = gd.N0(2131746176, null);
                    } else if (z10) {
                        N0 = gd.N0(2131746178, null);
                    } else {
                        N0 = gd.N0(2131746177, null);
                    }
                    y0Var.j(N0, 2131232358, null);
                    y0Var.setOnClickListener(new mu0(1, afVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                    g1 g1Var = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    g1Var.f28974e = true;
                    g1Var.f28973c = 220;
                    g1Var.setOutsideTouchable(true);
                    g1Var.setClippingEnabled(true);
                    g1Var.setAnimationStyle(2131755192);
                    g1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), Integer.MIN_VALUE));
                    g1Var.setInputMethodMode(2);
                    g1Var.setSoftInputMode(0);
                    g1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, plVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + g0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (g0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    g1Var.showAtLocation(plVar, 51, (int) width, (int) measuredHeight);
                    bnVar.f46037g9 = g1Var;
                    bnVar.w8(bnVar.f46260y1, false);
                    bnVar.f46037g9.setOnDismissListener(new e0(bnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                if (!scrollSlidingTextTabStrip.f33149o0 && (jl0Var = scrollSlidingTextTabStrip.f33132b) != null && jl0Var.h1(i10, view)) {
                    return true;
                }
                return false;
        }
    }
}
