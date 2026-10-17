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
import org.telegram.ui.Components.jn0;
import org.telegram.ui.f0;
import org.telegram.ui.fy0;
import org.telegram.ui.lm;
import org.telegram.ui.mf;
import org.telegram.ui.re;
import org.telegram.ui.sn;
public final class g implements View.OnLongClickListener {
    public final int f15077a;
    public final int f15078b;
    public final FrameLayout f15079c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f15077a = i11;
        this.f15079c = frameLayout;
        this.f15078b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        mf mfVar;
        boolean z10;
        String string;
        jn0 jn0Var;
        switch (this.f15077a) {
            case 0:
                b bVar = ((h) this.f15079c).f15085n;
                if (bVar != null) {
                    sn snVar = ((re) bVar).f40709b;
                    int i10 = this.f15078b;
                    if (i10 == 2) {
                        mfVar = new mf(snVar, 8);
                        z10 = true;
                    } else if (i10 == 3) {
                        mfVar = new mf(snVar, 9);
                        z10 = false;
                    } else if (i10 == 4) {
                        mfVar = new mf(snVar, 10);
                        z10 = true;
                    }
                    Activity parentActivity = snVar.getParentActivity();
                    d5 parentLayout = snVar.getParentLayout();
                    lm lmVar = snVar.X0;
                    d6 resourceProvider = snVar.getResourceProvider();
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
                    e1Var.setOnClickListener(new fy0(1, mfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    m1 m1Var = new m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    m1Var.e = true;
                    m1Var.f21573c = 220;
                    m1Var.setOutsideTouchable(true);
                    m1Var.setClippingEnabled(true);
                    m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    m1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1Var.setInputMethodMode(2);
                    m1Var.setSoftInputMode(0);
                    m1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    j.b(view, lmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    m1Var.showAtLocation(lmVar, 51, (int) width, (int) measuredHeight);
                    snVar.Q8 = m1Var;
                    snVar.i8(snVar.f41257j1, false);
                    snVar.Q8.setOnDismissListener(new f0(snVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f15079c;
                if (!scrollSlidingTextTabStrip.f24358n0 && (jn0Var = scrollSlidingTextTabStrip.f24343b) != null && jn0Var.b1(this.f15078b, view)) {
                    return true;
                }
                return false;
        }
    }
}
