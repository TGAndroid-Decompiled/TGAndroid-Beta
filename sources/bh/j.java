package bh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.k1;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.e0;
import org.telegram.ui.km;
import org.telegram.ui.nf;
import org.telegram.ui.re;
import org.telegram.ui.un;
import org.telegram.ui.uv0;
public final class j implements View.OnLongClickListener {
    public final int f2806a;
    public final int f2807b;
    public final FrameLayout f2808c;

    public j(FrameLayout frameLayout, int i10, int i11) {
        this.f2806a = i11;
        this.f2808c = frameLayout;
        this.f2807b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        nf nfVar;
        boolean z10;
        String L0;
        yl0 yl0Var;
        int i10 = this.f2806a;
        int i11 = this.f2807b;
        FrameLayout frameLayout = this.f2808c;
        switch (i10) {
            case 0:
                b bVar = ((k) frameLayout).f2814n;
                if (bVar != null) {
                    un unVar = ((re) bVar).f41066b;
                    if (i11 == 2) {
                        nfVar = new nf(unVar, 10);
                        z10 = true;
                    } else if (i11 == 3) {
                        nfVar = new nf(unVar, 11);
                        z10 = false;
                    } else if (i11 == 4) {
                        nfVar = new nf(unVar, 12);
                        z10 = true;
                    }
                    Activity parentActivity = unVar.getParentActivity();
                    z4 parentLayout = unVar.getParentLayout();
                    km kmVar = unVar.l1;
                    p6 resourceProvider = unVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(i0.L(200.0f));
                    b1 b1Var = new b1(0, parentActivity, resourceProvider, true, true);
                    b1Var.setMinimumWidth(i0.L(200.0f));
                    if (!z10) {
                        L0 = dd.L0(2131746387, null);
                    } else if (z10) {
                        L0 = dd.L0(2131746389, null);
                    } else {
                        L0 = dd.L0(2131746388, null);
                    }
                    b1Var.j(L0, 2131232355, null);
                    b1Var.setOnClickListener(new uv0(1, nfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                    k1 k1Var = new k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    k1Var.e = true;
                    k1Var.f20457c = 220;
                    k1Var.setOutsideTouchable(true);
                    k1Var.setClippingEnabled(true);
                    k1Var.setAnimationStyle(2131755192);
                    k1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i0.L(1000.0f), Integer.MIN_VALUE));
                    k1Var.setInputMethodMode(2);
                    k1Var.setSoftInputMode(0);
                    k1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    zg.h.b(view, kmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (i0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    k1Var.showAtLocation(kmVar, 51, (int) width, (int) measuredHeight);
                    unVar.f42051e9 = k1Var;
                    unVar.r8(unVar.f42279x1, false);
                    unVar.f42051e9.setOnDismissListener(new e0(unVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                if (!scrollSlidingTextTabStrip.f24183n0 && (yl0Var = scrollSlidingTextTabStrip.f24168b) != null && yl0Var.G1(i11, view)) {
                    return true;
                }
                return false;
        }
    }
}
