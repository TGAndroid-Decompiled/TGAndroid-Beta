package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class y5 extends org.telegram.ui.Components.hc {
    public final org.telegram.ui.ActionBar.e6 Q;
    public String R;
    public int S;

    public y5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.Q = e6Var;
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, e6Var);
        setTextSize(1, 14.0f);
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
    }

    public final void f(String str, int i3, y1 y1Var) {
        ai.e3 e3Var;
        if (str == this.R && this.S == i3) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i6.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String J0 = ii.k.J0(i3);
        if (y1Var != null) {
            e3Var = new ai.e3(this, y1Var, i3, 3);
        } else {
            e3Var = null;
        }
        append.append((CharSequence) org.telegram.ui.Components.ic.b(J0, e3Var, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i3;
    }
}
