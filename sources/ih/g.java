package ih;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gh.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.dz0;
import org.telegram.ui.eo;
import org.telegram.ui.f0;
import org.telegram.ui.sf;
import org.telegram.ui.vm;
import org.telegram.ui.xe;
public final class g implements View.OnLongClickListener {
    public final int f10621a;
    public final int f10622b;
    public final FrameLayout f10623c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f10621a = i11;
        this.f10623c = frameLayout;
        this.f10622b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        sf sfVar;
        char c10;
        String string;
        vm0 vm0Var;
        switch (this.f10621a) {
            case 0:
                b bVar = ((h) this.f10623c).f10629n;
                if (bVar != null) {
                    eo eoVar = ((xe) bVar).f38682b;
                    int i10 = this.f10622b;
                    if (i10 == 2) {
                        sfVar = new sf(eoVar, 10);
                        c10 = 1;
                    } else if (i10 == 3) {
                        sfVar = new sf(eoVar, 11);
                        c10 = 0;
                    } else if (i10 == 4) {
                        sfVar = new sf(eoVar, 12);
                        c10 = 2;
                    }
                    Activity parentActivity = eoVar.getParentActivity();
                    f5 parentLayout = eoVar.getParentLayout();
                    vm vmVar = eoVar.X0;
                    f6 resourceProvider = eoVar.getResourceProvider();
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
                    g1Var.setOnClickListener(new dz0(1, sfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    p1 p1Var = new p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    p1Var.e = true;
                    p1Var.f18535c = 220;
                    p1Var.setOutsideTouchable(true);
                    p1Var.setClippingEnabled(true);
                    p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    p1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    p1Var.setInputMethodMode(2);
                    p1Var.setSoftInputMode(0);
                    p1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, vmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    p1Var.showAtLocation(vmVar, 51, (int) width, (int) measuredHeight);
                    eoVar.Q8 = p1Var;
                    eoVar.f8(eoVar.f32368j1, false);
                    eoVar.Q8.setOnDismissListener(new f0(eoVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f10623c;
                if (!scrollSlidingTextTabStrip.f21268n0 && (vm0Var = scrollSlidingTextTabStrip.f21253b) != null && vm0Var.m1(this.f10622b, view)) {
                    return true;
                }
                return false;
        }
    }
}
