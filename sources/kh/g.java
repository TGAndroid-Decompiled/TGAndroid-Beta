package kh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ih.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.e0;
import org.telegram.ui.gy0;
import org.telegram.ui.kf;
import org.telegram.ui.km;
import org.telegram.ui.pe;
import org.telegram.ui.sn;
public final class g implements View.OnLongClickListener {
    public final int f15129a;
    public final int f15130b;
    public final FrameLayout f15131c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f15129a = i11;
        this.f15131c = frameLayout;
        this.f15130b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        kf kfVar;
        boolean z10;
        String string;
        mn0 mn0Var;
        switch (this.f15129a) {
            case 0:
                b bVar = ((h) this.f15131c).f15137n;
                if (bVar != null) {
                    sn snVar = ((pe) bVar).f40517b;
                    int i10 = this.f15130b;
                    if (i10 == 2) {
                        kfVar = new kf(snVar, 8);
                        z10 = true;
                    } else if (i10 == 3) {
                        kfVar = new kf(snVar, 9);
                        z10 = false;
                    } else if (i10 == 4) {
                        kfVar = new kf(snVar, 10);
                        z10 = true;
                    }
                    Activity parentActivity = snVar.getParentActivity();
                    h5 parentLayout = snVar.getParentLayout();
                    km kmVar = snVar.f41558j1;
                    g6 resourceProvider = snVar.getResourceProvider();
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
                    e1Var.j(string, R.drawable.msg_seen, null);
                    e1Var.setOnClickListener(new gy0(1, kfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    m1 m1Var = new m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    m1Var.e = true;
                    m1Var.f21632c = 220;
                    m1Var.setOutsideTouchable(true);
                    m1Var.setClippingEnabled(true);
                    m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    m1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1Var.setInputMethodMode(2);
                    m1Var.setSoftInputMode(0);
                    m1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, kmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    m1Var.showAtLocation(kmVar, 51, (int) width, (int) measuredHeight);
                    snVar.f41481c9 = m1Var;
                    snVar.i8(snVar.f41708v1, false);
                    snVar.f41481c9.setOnDismissListener(new e0(snVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f15131c;
                if (!scrollSlidingTextTabStrip.f24509n0 && (mn0Var = scrollSlidingTextTabStrip.f24494b) != null && mn0Var.b1(this.f15130b, view)) {
                    return true;
                }
                return false;
        }
    }
}
