package lh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jh.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.e0;
import org.telegram.ui.jf;
import org.telegram.ui.my0;
import org.telegram.ui.om;
import org.telegram.ui.qe;
import org.telegram.ui.wn;
public final class g implements View.OnLongClickListener {
    public final int f17041a;
    public final int f17042b;
    public final FrameLayout f17043c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f17041a = i11;
        this.f17043c = frameLayout;
        this.f17042b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        jf jfVar;
        boolean z10;
        String string;
        tn0 tn0Var;
        switch (this.f17041a) {
            case 0:
                b bVar = ((h) this.f17043c).f17049n;
                if (bVar != null) {
                    wn wnVar = ((qe) bVar).f42685b;
                    int i10 = this.f17042b;
                    if (i10 == 2) {
                        jfVar = new jf(wnVar, 10);
                        z10 = true;
                    } else if (i10 == 3) {
                        jfVar = new jf(wnVar, 11);
                        z10 = false;
                    } else if (i10 == 4) {
                        jfVar = new jf(wnVar, 12);
                        z10 = true;
                    }
                    Activity parentActivity = wnVar.getParentActivity();
                    j5 parentLayout = wnVar.getParentLayout();
                    om omVar = wnVar.f45163j1;
                    u6 resourceProvider = wnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1 g1Var = new g1(0, parentActivity, resourceProvider, true, true);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    if (!z10) {
                        string = LocaleController.getString(R.string.ReadAllReactions);
                    } else if (z10) {
                        string = LocaleController.getString(R.string.ReadAllMentions);
                    } else {
                        string = LocaleController.getString(R.string.ReadAllPollVotes);
                    }
                    g1Var.j(string, R.drawable.msg_seen, null);
                    g1Var.setOnClickListener(new my0(1, jfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    o1 o1Var = new o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    o1Var.e = true;
                    o1Var.f22910c = 220;
                    o1Var.setOutsideTouchable(true);
                    o1Var.setClippingEnabled(true);
                    o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    o1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    o1Var.setInputMethodMode(2);
                    o1Var.setSoftInputMode(0);
                    o1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, omVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var.showAtLocation(omVar, 51, (int) width, (int) measuredHeight);
                    wnVar.f45134g9 = o1Var;
                    wnVar.o8(wnVar.f45313v1, false);
                    wnVar.f45134g9.setOnDismissListener(new e0(wnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f17043c;
                if (!scrollSlidingTextTabStrip.f26303n0 && (tn0Var = scrollSlidingTextTabStrip.f26288b) != null && tn0Var.h1(this.f17042b, view)) {
                    return true;
                }
                return false;
        }
    }
}
