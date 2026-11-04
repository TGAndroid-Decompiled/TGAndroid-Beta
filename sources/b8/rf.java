package b8;

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.Components.s70;
public abstract class rf {
    public static s70 a(Context context, float f10, int i3, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10 = org.telegram.ui.ActionBar.k6.Uc;
        s70 s70Var = new s70(context, null);
        s70Var.setTextSize(1, f10);
        org.telegram.ui.ActionBar.r6.V(s70Var, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, i10, e6Var);
        if (z10) {
            s70Var.setTypeface(org.telegram.messenger.g0.o());
        }
        return s70Var;
    }

    public static TextView b(Context context, float f10, int i3, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f10);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        if (z10) {
            textView.setTypeface(org.telegram.messenger.g0.o());
        }
        return textView;
    }
}
