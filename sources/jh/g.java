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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.f0;
import org.telegram.ui.of;
import org.telegram.ui.pe;
import org.telegram.ui.pm;
import org.telegram.ui.sy0;
import org.telegram.ui.wn;
public final class g implements View.OnLongClickListener {
    public final int f13021a;
    public final int f13022b;
    public final FrameLayout f13023c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f13021a = i11;
        this.f13023c = frameLayout;
        this.f13022b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        of ofVar;
        char c10;
        String string;
        xm0 xm0Var;
        switch (this.f13021a) {
            case 0:
                b bVar = ((h) this.f13023c).f13029n;
                if (bVar != null) {
                    wn wnVar = ((pe) bVar).f36507b;
                    int i10 = this.f13022b;
                    if (i10 == 2) {
                        ofVar = new of(wnVar, 9);
                        c10 = 1;
                    } else if (i10 == 3) {
                        ofVar = new of(wnVar, 10);
                        c10 = 0;
                    } else if (i10 == 4) {
                        ofVar = new of(wnVar, 11);
                        c10 = 2;
                    }
                    Activity parentActivity = wnVar.getParentActivity();
                    b5 parentLayout = wnVar.getParentLayout();
                    pm pmVar = wnVar.X0;
                    d6 resourceProvider = wnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    e1 e1Var = new e1(0, parentActivity, resourceProvider, true, true);
                    e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    if (c10 == 0) {
                        string = LocaleController.getString(R.string.ReadAllReactions);
                    } else if (c10 == 1) {
                        string = LocaleController.getString(R.string.ReadAllMentions);
                    } else {
                        string = LocaleController.getString(R.string.ReadAllPollVotes);
                    }
                    e1Var.g(string, R.drawable.msg_seen, null);
                    e1Var.setOnClickListener(new sy0(1, ofVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    m1 m1Var = new m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    m1Var.e = true;
                    m1Var.f19635c = 220;
                    m1Var.setOutsideTouchable(true);
                    m1Var.setClippingEnabled(true);
                    m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    m1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1Var.setInputMethodMode(2);
                    m1Var.setSoftInputMode(0);
                    m1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, pmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    m1Var.showAtLocation(pmVar, 51, (int) width, (int) measuredHeight);
                    wnVar.Q8 = m1Var;
                    wnVar.f8(wnVar.f39521j1, false);
                    wnVar.Q8.setOnDismissListener(new f0(wnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f13023c;
                if (!scrollSlidingTextTabStrip.f22405n0 && (xm0Var = scrollSlidingTextTabStrip.f22390b) != null && xm0Var.n1(this.f13022b, view)) {
                    return true;
                }
                return false;
        }
    }
}
