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
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.n1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.f0;
import org.telegram.ui.pf;
import org.telegram.ui.qm;
import org.telegram.ui.ue;
import org.telegram.ui.uy0;
import org.telegram.ui.xn;
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
        pf pfVar;
        char c10;
        String string;
        mm0 mm0Var;
        switch (this.f13021a) {
            case 0:
                b bVar = ((h) this.f13023c).f13029n;
                if (bVar != null) {
                    xn xnVar = ((ue) bVar).f38060b;
                    int i10 = this.f13022b;
                    if (i10 == 2) {
                        pfVar = new pf(xnVar, 10);
                        c10 = 1;
                    } else if (i10 == 3) {
                        pfVar = new pf(xnVar, 11);
                        c10 = 0;
                    } else if (i10 == 4) {
                        pfVar = new pf(xnVar, 12);
                        c10 = 2;
                    }
                    Activity parentActivity = xnVar.getParentActivity();
                    c5 parentLayout = xnVar.getParentLayout();
                    qm qmVar = xnVar.X0;
                    d6 resourceProvider = xnVar.getResourceProvider();
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
                    f1Var.setOnClickListener(new uy0(1, pfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                    n1 n1Var = new n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    n1Var.e = true;
                    n1Var.f19407c = 220;
                    n1Var.setOutsideTouchable(true);
                    n1Var.setClippingEnabled(true);
                    n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    n1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1Var.setInputMethodMode(2);
                    n1Var.setSoftInputMode(0);
                    n1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, qmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    n1Var.showAtLocation(qmVar, 51, (int) width, (int) measuredHeight);
                    xnVar.Q8 = n1Var;
                    xnVar.f8(xnVar.f39422j1, false);
                    xnVar.Q8.setOnDismissListener(new f0(xnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f13023c;
                if (!scrollSlidingTextTabStrip.f22154n0 && (mm0Var = scrollSlidingTextTabStrip.f22139b) != null && mm0Var.n1(this.f13022b, view)) {
                    return true;
                }
                return false;
        }
    }
}
