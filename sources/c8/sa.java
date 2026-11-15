package c8;

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.Components.z70;
public abstract class sa {
    public static z70 a(Context context, float f10, int i7, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10 = org.telegram.ui.ActionBar.j6.Xc;
        z70 z70Var = new z70(context, null);
        z70Var.setTextSize(1, f10);
        org.telegram.ui.ActionBar.q6.U(z70Var, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, i10, e6Var);
        if (z10) {
            z70Var.setTypeface(org.telegram.messenger.g0.o());
        }
        return z70Var;
    }

    public static TextView b(Context context, float f10, int i7, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f10);
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        if (z10) {
            textView.setTypeface(org.telegram.messenger.g0.o());
        }
        return textView;
    }
}
