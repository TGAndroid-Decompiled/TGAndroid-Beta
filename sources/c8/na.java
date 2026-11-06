package c8;

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.Components.w70;
public abstract class na {
    public static w70 a(Context context, float f10, int i7, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10 = org.telegram.ui.ActionBar.k6.Uc;
        w70 w70Var = new w70(context, null);
        w70Var.setTextSize(1, f10);
        org.telegram.ui.ActionBar.r6.V(w70Var, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, i10, f6Var);
        if (z9) {
            w70Var.setTypeface(org.telegram.messenger.g0.o());
        }
        return w70Var;
    }

    public static TextView b(Context context, float f10, int i7, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f10);
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        if (z9) {
            textView.setTypeface(org.telegram.messenger.g0.o());
        }
        return textView;
    }
}
