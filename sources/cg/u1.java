package cg;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w5;
public final class u1 extends f3 {
    public u1(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity(), false);
        Activity parentActivity = o2Var.getParentActivity();
        LinearLayout f9 = x3.f(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i10 = g6.f23169j5;
        x3.t(textView, g6.w0(null, i10, false), 1, 20.0f);
        f9.addView(textView, f6.d(-1, -2.0f, 0, 21.0f, 16.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(g6.w0(null, i10, false));
        f9.addView(textView2, f6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        x3.t(textView3, g6.w0(null, g6.Sh, false), 1, 14.0f);
        textView3.setBackground(w5.f(new float[]{8.0f}, g6.Oh));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new bg.n(1));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, f6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout.setBackgroundColor(getThemedColor(g6.f23133h5));
        f9.addView(frameLayout, f6.q(-1, 68, 80));
        x3.r(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(f9);
        setCustomView(scrollView);
    }
}
