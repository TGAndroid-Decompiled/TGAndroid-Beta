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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.g0;
import org.telegram.ui.qm;
import org.telegram.ui.rf;
import org.telegram.ui.se;
import org.telegram.ui.uy0;
import org.telegram.ui.xn;
public final class g implements View.OnLongClickListener {
    public final int f13024a;
    public final int f13025b;
    public final FrameLayout f13026c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f13024a = i11;
        this.f13026c = frameLayout;
        this.f13025b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        rf rfVar;
        char c10;
        String string;
        zm0 zm0Var;
        switch (this.f13024a) {
            case 0:
                b bVar = ((h) this.f13026c).f13032n;
                if (bVar != null) {
                    xn xnVar = ((se) bVar).f37407b;
                    int i10 = this.f13025b;
                    if (i10 == 2) {
                        rfVar = new rf(xnVar, 9);
                        c10 = 1;
                    } else if (i10 == 3) {
                        rfVar = new rf(xnVar, 10);
                        c10 = 0;
                    } else if (i10 == 4) {
                        rfVar = new rf(xnVar, 11);
                        c10 = 2;
                    }
                    Activity parentActivity = xnVar.getParentActivity();
                    d5 parentLayout = xnVar.getParentLayout();
                    qm qmVar = xnVar.X0;
                    e6 resourceProvider = xnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1 g1Var = new g1(0, parentActivity, resourceProvider, true, true);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    if (c10 == 0) {
                        string = LocaleController.getString(R.string.ReadAllReactions);
                    } else if (c10 == 1) {
                        string = LocaleController.getString(R.string.ReadAllMentions);
                    } else {
                        string = LocaleController.getString(R.string.ReadAllPollVotes);
                    }
                    g1Var.g(string, R.drawable.msg_seen, null);
                    g1Var.setOnClickListener(new uy0(1, rfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    o1 o1Var = new o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    o1Var.e = true;
                    o1Var.f19685c = 220;
                    o1Var.setOutsideTouchable(true);
                    o1Var.setClippingEnabled(true);
                    o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    o1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    o1Var.setInputMethodMode(2);
                    o1Var.setSoftInputMode(0);
                    o1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, qmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var.showAtLocation(qmVar, 51, (int) width, (int) measuredHeight);
                    xnVar.Q8 = o1Var;
                    xnVar.f8(xnVar.f39803j1, false);
                    xnVar.Q8.setOnDismissListener(new g0(xnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f13026c;
                if (!scrollSlidingTextTabStrip.f22408n0 && (zm0Var = scrollSlidingTextTabStrip.f22393b) != null && zm0Var.n1(this.f13025b, view)) {
                    return true;
                }
                return false;
        }
    }
}
