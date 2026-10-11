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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.e0;
import org.telegram.ui.qe;
import org.telegram.ui.qf;
import org.telegram.ui.sm;
import org.telegram.ui.zn;
import org.telegram.ui.zy0;
public final class g implements View.OnLongClickListener {
    public final int f14192a;
    public final int f14193b;
    public final FrameLayout f14194c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f14192a = i11;
        this.f14194c = frameLayout;
        this.f14193b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        qf qfVar;
        boolean z10;
        String string;
        tn0 tn0Var;
        switch (this.f14192a) {
            case 0:
                b bVar = ((h) this.f14194c).f14201n;
                if (bVar != null) {
                    zn znVar = ((qe) bVar).f41156b;
                    int i10 = this.f14193b;
                    if (i10 == 2) {
                        qfVar = new qf(znVar, 8);
                        z10 = true;
                    } else if (i10 == 3) {
                        qfVar = new qf(znVar, 9);
                        z10 = false;
                    } else if (i10 == 4) {
                        qfVar = new qf(znVar, 10);
                        z10 = true;
                    }
                    Activity parentActivity = znVar.getParentActivity();
                    b5 parentLayout = znVar.getParentLayout();
                    sm smVar = znVar.X0;
                    d6 resourceProvider = znVar.getResourceProvider();
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
                    e1Var.setOnClickListener(new zy0(1, qfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    m1 m1Var = new m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    m1Var.f21372e = true;
                    m1Var.f21371c = 220;
                    m1Var.setOutsideTouchable(true);
                    m1Var.setClippingEnabled(true);
                    m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    m1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1Var.setInputMethodMode(2);
                    m1Var.setSoftInputMode(0);
                    m1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    j.b(view, smVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    m1Var.showAtLocation(smVar, 51, (int) width, (int) measuredHeight);
                    znVar.Q8 = m1Var;
                    znVar.i8(znVar.f44814j1, false);
                    znVar.Q8.setOnDismissListener(new e0(znVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f14194c;
                if (!scrollSlidingTextTabStrip.f24314n0 && (tn0Var = scrollSlidingTextTabStrip.f24298b) != null && tn0Var.k1(this.f14193b, view)) {
                    return true;
                }
                return false;
        }
    }
}
