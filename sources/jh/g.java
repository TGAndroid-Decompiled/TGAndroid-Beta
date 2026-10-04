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
import org.telegram.ui.Components.dn0;
import org.telegram.ui.f0;
import org.telegram.ui.qm;
import org.telegram.ui.re;
import org.telegram.ui.uy0;
import org.telegram.ui.yf;
import org.telegram.ui.yn;
public final class g implements View.OnLongClickListener {
    public final int f14157a;
    public final int f14158b;
    public final FrameLayout f14159c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f14157a = i11;
        this.f14159c = frameLayout;
        this.f14158b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        yf yfVar;
        char c10;
        String string;
        dn0 dn0Var;
        switch (this.f14157a) {
            case 0:
                b bVar = ((h) this.f14159c).f14166n;
                if (bVar != null) {
                    yn ynVar = ((re) bVar).f40108b;
                    int i10 = this.f14158b;
                    if (i10 == 2) {
                        yfVar = new yf(ynVar, 7);
                        c10 = 1;
                    } else if (i10 == 3) {
                        yfVar = new yf(ynVar, 8);
                        c10 = 0;
                    } else if (i10 == 4) {
                        yfVar = new yf(ynVar, 10);
                        c10 = 2;
                    }
                    Activity parentActivity = ynVar.getParentActivity();
                    c5 parentLayout = ynVar.getParentLayout();
                    qm qmVar = ynVar.V0;
                    d6 resourceProvider = ynVar.getResourceProvider();
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
                    f1Var.setOnClickListener(new uy0(1, yfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                    n1 n1Var = new n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    n1Var.f21413e = true;
                    n1Var.f21412c = 220;
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
                    ynVar.O8 = n1Var;
                    ynVar.f8(ynVar.f43360h1, false);
                    ynVar.O8.setOnDismissListener(new f0(ynVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f14159c;
                if (!scrollSlidingTextTabStrip.f24323n0 && (dn0Var = scrollSlidingTextTabStrip.f24307b) != null && dn0Var.o1(this.f14158b, view)) {
                    return true;
                }
                return false;
        }
    }
}
