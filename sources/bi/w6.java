package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class w6 extends org.telegram.ui.Components.jc {
    public final org.telegram.ui.ActionBar.f6 P;
    public String Q;
    public int R;

    public w6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.P = f6Var;
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, f6Var);
        setTextSize(1, 14.0f);
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
    }

    public final void f(String str, int i7, h2 h2Var) {
        ai.e0 e0Var;
        if (str == this.Q && this.R == i7) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i6.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String J0 = hi.j.J0(i7);
        if (h2Var != null) {
            e0Var = new ai.e0(this, h2Var, i7, 2);
        } else {
            e0Var = null;
        }
        append.append((CharSequence) org.telegram.ui.Components.kc.b(J0, e0Var, this.P, null));
        setText(spannableStringBuilder);
        this.Q = str;
        this.R = i7;
    }
}
