package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class lsa extends x51 {
    public final ylb Q;
    public String R;
    public int S;

    public lsa(Context context, ylb ylbVar) {
        super(context);
        this.Q = ylbVar;
        anb.X(this, cmb.F6, ylbVar);
        setTextSize(1, 14.0f);
        setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
    }

    public final void e(String str, int i, spa spaVar) {
        v99 v99Var;
        if (str == this.R && this.S == i) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gw3.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String J0 = bc.J0(i);
        if (spaVar != null) {
            v99Var = new v99(this, spaVar, i, (byte) 12);
        } else {
            v99Var = null;
        }
        append.append((CharSequence) y51.b(J0, v99Var, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i;
    }
}
