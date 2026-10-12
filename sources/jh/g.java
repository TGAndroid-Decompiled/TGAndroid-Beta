package jh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import hh.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.cz0;
import org.telegram.ui.eo;
import org.telegram.ui.f0;
import org.telegram.ui.ve;
import org.telegram.ui.vf;
import org.telegram.ui.wm;
public final class g implements View.OnLongClickListener {
    public final int f14190a;
    public final int f14191b;
    public final FrameLayout f14192c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f14190a = i11;
        this.f14192c = frameLayout;
        this.f14191b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        vf vfVar;
        boolean z10;
        String string;
        xn0 xn0Var;
        switch (this.f14190a) {
            case 0:
                b bVar = ((h) this.f14192c).f14199n;
                if (bVar != null) {
                    eo eoVar = ((ve) bVar).f42770b;
                    int i10 = this.f14191b;
                    if (i10 == 2) {
                        vfVar = new vf(eoVar, 8);
                        z10 = true;
                    } else if (i10 == 3) {
                        vfVar = new vf(eoVar, 9);
                        z10 = false;
                    } else if (i10 == 4) {
                        vfVar = new vf(eoVar, 10);
                        z10 = true;
                    }
                    Activity parentActivity = eoVar.getParentActivity();
                    b5 parentLayout = eoVar.getParentLayout();
                    wm wmVar = eoVar.X0;
                    c6 resourceProvider = eoVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    e1 e1Var = new e1(0, parentActivity, resourceProvider, true, true);
                    e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    if (!z10) {
                        string = LocaleController.getString(R.string.ReadAllReactions);
                    } else if (z10) {
                        string = LocaleController.getString(R.string.ReadAllMentions);
                    } else {
                        string = LocaleController.getString(R.string.ReadAllPollVotes);
                    }
                    e1Var.g(string, R.drawable.msg_seen, null);
                    e1Var.setOnClickListener(new cz0(1, vfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    m1 m1Var = new m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    m1Var.f21147e = true;
                    m1Var.f21146c = 220;
                    m1Var.setOutsideTouchable(true);
                    m1Var.setClippingEnabled(true);
                    m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    m1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1Var.setInputMethodMode(2);
                    m1Var.setSoftInputMode(0);
                    m1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    j.b(view, wmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    m1Var.showAtLocation(wmVar, 51, (int) width, (int) measuredHeight);
                    eoVar.Q8 = m1Var;
                    eoVar.i8(eoVar.f37308j1, false);
                    eoVar.Q8.setOnDismissListener(new f0(eoVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f14192c;
                if (!scrollSlidingTextTabStrip.f24100n0 && (xn0Var = scrollSlidingTextTabStrip.f24084b) != null && xn0Var.k1(this.f14191b, view)) {
                    return true;
                }
                return false;
        }
    }
}
