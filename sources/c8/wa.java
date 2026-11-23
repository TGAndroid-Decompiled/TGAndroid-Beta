package c8;

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.Components.m80;
public abstract class wa {
    public static m80 a(Context context, float f10, int i7, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10 = org.telegram.ui.ActionBar.m6.Xc;
        m80 m80Var = new m80(context, null);
        m80Var.setTextSize(1, f10);
        org.telegram.ui.ActionBar.t6.U(m80Var, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, i10, h6Var);
        if (z10) {
            m80Var.setTypeface(org.telegram.messenger.g0.o());
        }
        return m80Var;
    }

    public static TextView b(Context context, float f10, int i7, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f10);
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        if (z10) {
            textView.setTypeface(org.telegram.messenger.g0.o());
        }
        return textView;
    }
}
