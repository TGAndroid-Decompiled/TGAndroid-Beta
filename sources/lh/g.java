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
import org.telegram.ui.Components.sn0;
import org.telegram.ui.e0;
import org.telegram.ui.kf;
import org.telegram.ui.ky0;
import org.telegram.ui.mm;
import org.telegram.ui.pe;
import org.telegram.ui.un;
public final class g implements View.OnLongClickListener {
    public final int f17042a;
    public final int f17043b;
    public final FrameLayout f17044c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f17042a = i11;
        this.f17044c = frameLayout;
        this.f17043b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        kf kfVar;
        boolean z10;
        String string;
        sn0 sn0Var;
        switch (this.f17042a) {
            case 0:
                b bVar = ((h) this.f17044c).f17050n;
                if (bVar != null) {
                    un unVar = ((pe) bVar).f42482b;
                    int i10 = this.f17043b;
                    if (i10 == 2) {
                        kfVar = new kf(unVar, 9);
                        z10 = true;
                    } else if (i10 == 3) {
                        kfVar = new kf(unVar, 10);
                        z10 = false;
                    } else if (i10 == 4) {
                        kfVar = new kf(unVar, 11);
                        z10 = true;
                    }
                    Activity parentActivity = unVar.getParentActivity();
                    j5 parentLayout = unVar.getParentLayout();
                    mm mmVar = unVar.f44295j1;
                    u6 resourceProvider = unVar.getResourceProvider();
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
                    g1Var.setOnClickListener(new ky0(1, kfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    o1 o1Var = new o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    o1Var.e = true;
                    o1Var.f22909c = 220;
                    o1Var.setOutsideTouchable(true);
                    o1Var.setClippingEnabled(true);
                    o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    o1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    o1Var.setInputMethodMode(2);
                    o1Var.setSoftInputMode(0);
                    o1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, mmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var.showAtLocation(mmVar, 51, (int) width, (int) measuredHeight);
                    unVar.f44216c9 = o1Var;
                    unVar.m8(unVar.f44445v1, false);
                    unVar.f44216c9.setOnDismissListener(new e0(unVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f17044c;
                if (!scrollSlidingTextTabStrip.f26301n0 && (sn0Var = scrollSlidingTextTabStrip.f26286b) != null && sn0Var.h1(this.f17043b, view)) {
                    return true;
                }
                return false;
        }
    }
}
