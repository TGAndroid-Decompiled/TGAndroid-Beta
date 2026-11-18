package c8;

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.Components.k80;
public abstract class va {
    public static k80 a(Context context, float f10, int i7, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10 = org.telegram.ui.ActionBar.n6.Xc;
        k80 k80Var = new k80(context, null);
        k80Var.setTextSize(1, f10);
        org.telegram.ui.ActionBar.u6.U(k80Var, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, i10, i6Var);
        if (z10) {
            k80Var.setTypeface(org.telegram.messenger.g0.o());
        }
        return k80Var;
    }

    public static TextView b(Context context, float f10, int i7, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f10);
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        if (z10) {
            textView.setTypeface(org.telegram.messenger.g0.o());
        }
        return textView;
    }
}
