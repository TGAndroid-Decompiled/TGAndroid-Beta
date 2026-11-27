package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class ir extends q11 {
    public ir(LaunchActivity launchActivity, g26 g26Var) {
        super(launchActivity, null);
        nr nrVar = new nr(getContext());
        TextView textView = new TextView(getContext());
        addView(nrVar, tre.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        yob.X(textView, aob.yj, null);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, tre.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        nrVar.setImageDrawable(launchActivity.getDrawable(g26Var.b));
        nrVar.setOuterPadding(hl.L(8.0f));
        nrVar.setBackgroundOuterPadding(hl.L(24.0f));
        nrVar.setForeground(g26Var.c);
        uh9.r(null, null, 2131754231, new Object[]{ob6.M0(g26Var.d, null)}, textView);
    }
}
