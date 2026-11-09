package c8;

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.Components.x70;
public abstract class qa {
    public static x70 a(Context context, float f10, int i7, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10 = org.telegram.ui.ActionBar.l6.Uc;
        x70 x70Var = new x70(context, null);
        x70Var.setTextSize(1, f10);
        org.telegram.ui.ActionBar.s6.U(x70Var, i7, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var, i10, g6Var);
        if (z9) {
            x70Var.setTypeface(org.telegram.messenger.g0.o());
        }
        return x70Var;
    }

    public static TextView b(Context context, float f10, int i7, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f10);
        org.telegram.ui.ActionBar.s6.U(textView, i7, g6Var);
        if (z9) {
            textView.setTypeface(org.telegram.messenger.g0.o());
        }
        return textView;
    }
}
