package c8;

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.Components.j80;
public abstract class wa {
    public static j80 a(Context context, float f10, int i7, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10 = org.telegram.ui.ActionBar.n6.Xc;
        j80 j80Var = new j80(context, null);
        j80Var.setTextSize(1, f10);
        org.telegram.ui.ActionBar.u6.U(j80Var, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, i10, i6Var);
        if (z10) {
            j80Var.setTypeface(org.telegram.messenger.g0.o());
        }
        return j80Var;
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
