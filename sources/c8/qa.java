package c8;

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.Components.w70;
public abstract class qa {
    public static w70 a(Context context, float f10, int i7, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10 = org.telegram.ui.ActionBar.m6.Uc;
        w70 w70Var = new w70(context, null);
        w70Var.setTextSize(1, f10);
        org.telegram.ui.ActionBar.t6.U(w70Var, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var, i10, h6Var);
        if (z9) {
            w70Var.setTypeface(org.telegram.messenger.g0.o());
        }
        return w70Var;
    }

    public static TextView b(Context context, float f10, int i7, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f10);
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        if (z9) {
            textView.setTypeface(org.telegram.messenger.g0.o());
        }
        return textView;
    }
}
