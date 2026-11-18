package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class s5 extends org.telegram.ui.Components.nc {
    public final org.telegram.ui.ActionBar.i6 Q;
    public String R;
    public int S;

    public s5(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.Q = i6Var;
        org.telegram.ui.ActionBar.u6.U(this, org.telegram.ui.ActionBar.n6.G6, i6Var);
        setTextSize(1, 14.0f);
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
    }

    public final void f(String str, int i7, q1 q1Var) {
        ai.a1 a1Var;
        if (str == this.R && this.S == i7) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String J0 = ki.k.J0(i7);
        if (q1Var != null) {
            a1Var = new ai.a1(this, q1Var, i7, 7);
        } else {
            a1Var = null;
        }
        append.append((CharSequence) org.telegram.ui.Components.oc.b(J0, a1Var, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i7;
    }
}
