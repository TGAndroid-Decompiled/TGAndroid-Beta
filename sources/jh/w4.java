package jh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wc;
public final class w4 extends vc {
    public final org.telegram.ui.ActionBar.c6 J;
    public String K;
    public int L;

    public w4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.J = c6Var;
        setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, o1 o1Var) {
        ag.v0 v0Var;
        if (str == this.K && this.L == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String G0 = ph.j.G0(i10);
        if (o1Var != null) {
            v0Var = new ag.v0(this, o1Var, i10, 6);
        } else {
            v0Var = null;
        }
        append.append((CharSequence) wc.b(G0, v0Var, this.J, null));
        setText(spannableStringBuilder);
        this.K = str;
        this.L = i10;
    }
}
