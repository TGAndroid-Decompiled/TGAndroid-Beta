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
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.n1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.az0;
import org.telegram.ui.f0;
import org.telegram.ui.re;
import org.telegram.ui.rf;
import org.telegram.ui.sm;
import org.telegram.ui.zn;
public final class g implements View.OnLongClickListener {
    public final int f14193a;
    public final int f14194b;
    public final FrameLayout f14195c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f14193a = i11;
        this.f14195c = frameLayout;
        this.f14194b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        rf rfVar;
        boolean z10;
        String string;
        rn0 rn0Var;
        switch (this.f14193a) {
            case 0:
                b bVar = ((h) this.f14195c).f14202n;
                if (bVar != null) {
                    zn znVar = ((re) bVar).f41396b;
                    int i10 = this.f14194b;
                    if (i10 == 2) {
                        rfVar = new rf(znVar, 8);
                        z10 = true;
                    } else if (i10 == 3) {
                        rfVar = new rf(znVar, 9);
                        z10 = false;
                    } else if (i10 == 4) {
                        rfVar = new rf(znVar, 10);
                        z10 = true;
                    }
                    Activity parentActivity = znVar.getParentActivity();
                    d5 parentLayout = znVar.getParentLayout();
                    sm smVar = znVar.X0;
                    e6 resourceProvider = znVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    f1 f1Var = new f1(0, parentActivity, resourceProvider, true, true);
                    f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    if (!z10) {
                        string = LocaleController.getString(R.string.ReadAllReactions);
                    } else if (z10) {
                        string = LocaleController.getString(R.string.ReadAllMentions);
                    } else {
                        string = LocaleController.getString(R.string.ReadAllPollVotes);
                    }
                    f1Var.g(string, R.drawable.msg_seen, null);
                    f1Var.setOnClickListener(new az0(1, rfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                    n1 n1Var = new n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    n1Var.f21415e = true;
                    n1Var.f21414c = 220;
                    n1Var.setOutsideTouchable(true);
                    n1Var.setClippingEnabled(true);
                    n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    n1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1Var.setInputMethodMode(2);
                    n1Var.setSoftInputMode(0);
                    n1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    j.b(view, smVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    n1Var.showAtLocation(smVar, 51, (int) width, (int) measuredHeight);
                    znVar.Q8 = n1Var;
                    znVar.i8(znVar.f44815j1, false);
                    znVar.Q8.setOnDismissListener(new f0(znVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f14195c;
                if (!scrollSlidingTextTabStrip.f24322n0 && (rn0Var = scrollSlidingTextTabStrip.f24306b) != null && rn0Var.k1(this.f14194b, view)) {
                    return true;
                }
                return false;
        }
    }
}
