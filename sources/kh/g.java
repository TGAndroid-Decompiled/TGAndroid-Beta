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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.f0;
import org.telegram.ui.fo;
import org.telegram.ui.gz0;
import org.telegram.ui.wf;
import org.telegram.ui.xe;
import org.telegram.ui.xm;
public final class g implements View.OnLongClickListener {
    public final int f14280a;
    public final int f14281b;
    public final FrameLayout f14282c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f14280a = i11;
        this.f14282c = frameLayout;
        this.f14281b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        wf wfVar;
        boolean z10;
        String string;
        nn0 nn0Var;
        switch (this.f14280a) {
            case 0:
                b bVar = ((h) this.f14282c).f14288n;
                if (bVar != null) {
                    fo foVar = ((xe) bVar).f41839b;
                    int i10 = this.f14281b;
                    if (i10 == 2) {
                        wfVar = new wf(foVar, 8);
                        z10 = true;
                    } else if (i10 == 3) {
                        wfVar = new wf(foVar, 9);
                        z10 = false;
                    } else if (i10 == 4) {
                        wfVar = new wf(foVar, 10);
                        z10 = true;
                    }
                    Activity parentActivity = foVar.getParentActivity();
                    b5 parentLayout = foVar.getParentLayout();
                    xm xmVar = foVar.X0;
                    c6 resourceProvider = foVar.getResourceProvider();
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
                    e1Var.setOnClickListener(new gz0(1, wfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    m1 m1Var = new m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    m1Var.e = true;
                    m1Var.f20521c = 220;
                    m1Var.setOutsideTouchable(true);
                    m1Var.setClippingEnabled(true);
                    m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    m1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1Var.setInputMethodMode(2);
                    m1Var.setSoftInputMode(0);
                    m1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    j.b(view, xmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    m1Var.showAtLocation(xmVar, 51, (int) width, (int) measuredHeight);
                    foVar.Q8 = m1Var;
                    foVar.i8(foVar.f35984j1, false);
                    foVar.Q8.setOnDismissListener(new f0(foVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f14282c;
                if (!scrollSlidingTextTabStrip.f23303n0 && (nn0Var = scrollSlidingTextTabStrip.f23288b) != null && nn0Var.n1(this.f14281b, view)) {
                    return true;
                }
                return false;
        }
    }
}
