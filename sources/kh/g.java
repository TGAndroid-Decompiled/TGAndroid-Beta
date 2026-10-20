package kh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ih.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.dy0;
import org.telegram.ui.f0;
import org.telegram.ui.jm;
import org.telegram.ui.kf;
import org.telegram.ui.pe;
import org.telegram.ui.qn;
public final class g implements View.OnLongClickListener {
    public final int f15083a;
    public final int f15084b;
    public final FrameLayout f15085c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f15083a = i11;
        this.f15085c = frameLayout;
        this.f15084b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        kf kfVar;
        boolean z10;
        String string;
        kn0 kn0Var;
        switch (this.f15083a) {
            case 0:
                b bVar = ((h) this.f15085c).f15091n;
                if (bVar != null) {
                    qn qnVar = ((pe) bVar).f40199b;
                    int i10 = this.f15084b;
                    if (i10 == 2) {
                        kfVar = new kf(qnVar, 8);
                        z10 = true;
                    } else if (i10 == 3) {
                        kfVar = new kf(qnVar, 9);
                        z10 = false;
                    } else if (i10 == 4) {
                        kfVar = new kf(qnVar, 10);
                        z10 = true;
                    }
                    Activity parentActivity = qnVar.getParentActivity();
                    d5 parentLayout = qnVar.getParentLayout();
                    jm jmVar = qnVar.X0;
                    d6 resourceProvider = qnVar.getResourceProvider();
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
                    e1Var.setOnClickListener(new dy0(1, kfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    m1 m1Var = new m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    m1Var.e = true;
                    m1Var.f21577c = 220;
                    m1Var.setOutsideTouchable(true);
                    m1Var.setClippingEnabled(true);
                    m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    m1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1Var.setInputMethodMode(2);
                    m1Var.setSoftInputMode(0);
                    m1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    j.b(view, jmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    m1Var.showAtLocation(jmVar, 51, (int) width, (int) measuredHeight);
                    qnVar.Q8 = m1Var;
                    qnVar.i8(qnVar.f40725j1, false);
                    qnVar.Q8.setOnDismissListener(new f0(qnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f15085c;
                if (!scrollSlidingTextTabStrip.f24362n0 && (kn0Var = scrollSlidingTextTabStrip.f24347b) != null && kn0Var.b1(this.f15084b, view)) {
                    return true;
                }
                return false;
        }
    }
}
