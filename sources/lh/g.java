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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.af;
import org.telegram.ui.cn;
import org.telegram.ui.e0;
import org.telegram.ui.fe;
import org.telegram.ui.nu0;
import org.telegram.ui.ql;
public final class g implements View.OnLongClickListener {
    public final int f18379a;
    public final int f18380b;
    public final FrameLayout f18381c;

    public g(FrameLayout frameLayout, int i7, int i10) {
        this.f18379a = i10;
        this.f18381c = frameLayout;
        this.f18380b = i7;
    }

    @Override
    public final boolean onLongClick(View view) {
        af afVar;
        boolean z9;
        String M0;
        vk0 vk0Var;
        int i7 = this.f18379a;
        int i10 = this.f18380b;
        FrameLayout frameLayout = this.f18381c;
        switch (i7) {
            case 0:
                b bVar = ((h) frameLayout).f18388n;
                if (bVar != null) {
                    cn cnVar = ((fe) bVar).f45692b;
                    if (i10 == 2) {
                        afVar = new af(cnVar, 10);
                        z9 = true;
                    } else if (i10 == 3) {
                        afVar = new af(cnVar, 11);
                        z9 = false;
                    } else if (i10 == 4) {
                        afVar = new af(cnVar, 12);
                        z9 = true;
                    }
                    Activity parentActivity = cnVar.getParentActivity();
                    q4 parentLayout = cnVar.getParentLayout();
                    ql qlVar = cnVar.l1;
                    g6 resourceProvider = cnVar.getResourceProvider();
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
                    z0Var.setOnClickListener(new nu0(1, afVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                    g1 g1Var = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    g1Var.f27487e = true;
                    g1Var.f27486c = 220;
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
                    cnVar.f44442e9 = g1Var;
                    cnVar.v8(cnVar.f44676x1, false);
                    cnVar.f44442e9.setOnDismissListener(new e0(cnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                if (!scrollSlidingTextTabStrip.f31544n0 && (vk0Var = scrollSlidingTextTabStrip.f31528b) != null && vk0Var.m1(i10, view)) {
                    return true;
                }
                return false;
        }
    }
}
