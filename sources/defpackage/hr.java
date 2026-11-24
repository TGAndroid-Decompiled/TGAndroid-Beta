package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class hr extends h11 {
    public hr(LaunchActivity launchActivity, c06 c06Var) {
        super(launchActivity, null);
        mr mrVar = new mr(getContext());
        TextView textView = new TextView(getContext());
        addView(mrVar, nme.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        zkb.X(textView, bkb.xj, null);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, nme.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        mrVar.setImageDrawable(launchActivity.getDrawable(c06Var.b));
        mrVar.setOuterPadding(gl.L(8.0f));
        mrVar.setBackgroundOuterPadding(gl.L(24.0f));
        mrVar.setForeground(c06Var.c);
        de9.r(null, null, 2131754235, new Object[]{k96.M0(c06Var.d, null)}, textView);
    }
}
