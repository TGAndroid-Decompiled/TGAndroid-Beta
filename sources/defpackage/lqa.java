package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
public final class lqa extends q41 {
    public final wjb Q;
    public String R;
    public int S;

    public lqa(Context context, wjb wjbVar) {
        super(context);
        this.Q = wjbVar;
        zkb.X(this, bkb.F6, wjbVar);
        setTextSize(1, 14.0f);
        setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
    }

    public final void e(String str, int i, sna snaVar) {
        t79 t79Var;
        if (str == this.R && this.S == i) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vu3.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String I0 = bc.I0(i);
        if (snaVar != null) {
            t79Var = new t79(this, snaVar, i, (byte) 12);
        } else {
            t79Var = null;
        }
        append.append((CharSequence) r41.b(I0, t79Var, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i;
    }
}
