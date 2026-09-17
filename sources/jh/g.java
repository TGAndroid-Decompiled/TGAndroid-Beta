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
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.bo;
import org.telegram.ui.cz0;
import org.telegram.ui.e0;
import org.telegram.ui.sf;
import org.telegram.ui.tm;
import org.telegram.ui.we;
public final class g implements View.OnLongClickListener {
    public final int f13032a;
    public final int f13033b;
    public final FrameLayout f13034c;

    public g(FrameLayout frameLayout, int i10, int i11) {
        this.f13032a = i11;
        this.f13034c = frameLayout;
        this.f13033b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        sf sfVar;
        char c10;
        String string;
        mm0 mm0Var;
        switch (this.f13032a) {
            case 0:
                b bVar = ((h) this.f13034c).f13040n;
                if (bVar != null) {
                    bo boVar = ((we) bVar).f38693b;
                    int i10 = this.f13033b;
                    if (i10 == 2) {
                        sfVar = new sf(boVar, 10);
                        c10 = 1;
                    } else if (i10 == 3) {
                        sfVar = new sf(boVar, 11);
                        c10 = 0;
                    } else if (i10 == 4) {
                        sfVar = new sf(boVar, 12);
                        c10 = 2;
                    }
                    Activity parentActivity = boVar.getParentActivity();
                    e5 parentLayout = boVar.getParentLayout();
                    tm tmVar = boVar.X0;
                    f6 resourceProvider = boVar.getResourceProvider();
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
                    g1Var.setOnClickListener(new cz0(1, sfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    o1 o1Var = new o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    o1Var.e = true;
                    o1Var.f19448c = 220;
                    o1Var.setOutsideTouchable(true);
                    o1Var.setClippingEnabled(true);
                    o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    o1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    o1Var.setInputMethodMode(2);
                    o1Var.setSoftInputMode(0);
                    o1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, tmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var.showAtLocation(tmVar, 51, (int) width, (int) measuredHeight);
                    boVar.Q8 = o1Var;
                    boVar.f8(boVar.f32328j1, false);
                    boVar.Q8.setOnDismissListener(new e0(boVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f13034c;
                if (!scrollSlidingTextTabStrip.f22193n0 && (mm0Var = scrollSlidingTextTabStrip.f22178b) != null && mm0Var.n1(this.f13033b, view)) {
                    return true;
                }
                return false;
        }
    }
}
