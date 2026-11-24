package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class hs extends p21 {
    public hs(LaunchActivity launchActivity, c26 c26Var) {
        super(launchActivity, null);
        ms msVar = new ms(getContext());
        TextView textView = new TextView(getContext());
        addView(msVar, qoe.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        anb.X(textView, cmb.xj, null);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, qoe.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        msVar.setImageDrawable(launchActivity.getDrawable(c26Var.b));
        msVar.setOuterPadding(gm.L(8.0f));
        msVar.setBackgroundOuterPadding(gm.L(24.0f));
        msVar.setForeground(c26Var.c);
        hg9.q(null, null, 2131754203, new Object[]{jb6.M0(c26Var.d, null)}, textView);
    }
}
