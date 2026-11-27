package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class mua extends y41 {
    public final vnb Q;
    public String R;
    public int S;

    public mua(Context context, vnb vnbVar) {
        super(context);
        this.Q = vnbVar;
        yob.X(this, aob.G6, vnbVar);
        setTextSize(1, 14.0f);
        setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
    }

    public final void e(String str, int i, ora oraVar) {
        a39 a39Var;
        if (str == this.R && this.S == i) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pv3.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String J0 = cc.J0(i);
        if (oraVar != null) {
            a39Var = new a39(this, oraVar, i, (byte) 13);
        } else {
            a39Var = null;
        }
        append.append((CharSequence) z41.b(J0, a39Var, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i;
    }
}
