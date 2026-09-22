package jh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import hh.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.az0;
import org.telegram.ui.e0;
import org.telegram.ui.qe;
import org.telegram.ui.rf;
import org.telegram.ui.rm;
import org.telegram.ui.zn;
public final class g implements View.OnLongClickListener {
    public final int f13033a;
    public final int f13034b;
    public final FrameLayout f13035c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f13033a = i11;
        this.f13035c = frameLayout;
        this.f13034b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        rf rfVar;
        char c10;
        String string;
        zm0 zm0Var;
        switch (this.f13033a) {
            case 0:
                b bVar = ((h) this.f13035c).f13041n;
                if (bVar != null) {
                    zn znVar = ((qe) bVar).f36914b;
                    int i10 = this.f13034b;
                    if (i10 == 2) {
                        rfVar = new rf(znVar, 9);
                        c10 = 1;
                    } else if (i10 == 3) {
                        rfVar = new rf(znVar, 10);
                        c10 = 0;
                    } else if (i10 == 4) {
                        rfVar = new rf(znVar, 11);
                        c10 = 2;
                    }
                    Activity parentActivity = znVar.getParentActivity();
                    d5 parentLayout = znVar.getParentLayout();
                    rm rmVar = znVar.X0;
                    f6 resourceProvider = znVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    f1 f1Var = new f1(0, parentActivity, resourceProvider, true, true);
                    f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    if (c10 == 0) {
                        string = LocaleController.getString(R.string.ReadAllReactions);
                    } else if (c10 == 1) {
                        string = LocaleController.getString(R.string.ReadAllMentions);
                    } else {
                        string = LocaleController.getString(R.string.ReadAllPollVotes);
                    }
                    f1Var.g(string, R.drawable.msg_seen, null);
                    f1Var.setOnClickListener(new az0(1, rfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                    n1 n1Var = new n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    n1Var.e = true;
                    n1Var.f19656c = 220;
                    n1Var.setOutsideTouchable(true);
                    n1Var.setClippingEnabled(true);
                    n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    n1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1Var.setInputMethodMode(2);
                    n1Var.setSoftInputMode(0);
                    n1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, rmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    n1Var.showAtLocation(rmVar, 51, (int) width, (int) measuredHeight);
                    znVar.Q8 = n1Var;
                    znVar.f8(znVar.f40377j1, false);
                    znVar.Q8.setOnDismissListener(new e0(znVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f13035c;
                if (!scrollSlidingTextTabStrip.f22420n0 && (zm0Var = scrollSlidingTextTabStrip.f22405b) != null && zm0Var.m1(this.f13034b, view)) {
                    return true;
                }
                return false;
        }
    }
}
