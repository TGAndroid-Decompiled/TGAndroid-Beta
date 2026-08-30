package eg;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
public final class t1 extends g3 {
    public t1(org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getParentActivity(), false);
        Activity parentActivity = p2Var.getParentActivity();
        LinearLayout h = kh.a2.h(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i10 = j6.f20012j5;
        y3.t(textView, j6.w0(null, i10, false), 1, 20.0f);
        h.addView(textView, b6.d(-1, -2.0f, 0, 21.0f, 16.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(j6.w0(null, i10, false));
        h.addView(textView2, b6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        y3.t(textView3, j6.w0(null, j6.Sh, false), 1, 14.0f);
        textView3.setBackground(z5.f(new float[]{8.0f}, j6.Oh));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new dg.m(1));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout.setBackgroundColor(getThemedColor(j6.f19977h5));
        h.addView(frameLayout, b6.q(-1, 68, 80));
        y3.q(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(h);
        setCustomView(scrollView);
    }
}
