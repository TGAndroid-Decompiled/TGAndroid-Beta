package hh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;

public final class x4 extends oc {
    public final org.telegram.ui.ActionBar.c6 J;
    public String K;
    public int L;

    public x4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.J = c6Var;
        setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, q1 q1Var) {
        if (str == this.K && this.L == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) pc.b(nh.k.G0(i10), q1Var != null ? new d5.i(this, q1Var, i10, 4) : null, this.J, null));
        setText(spannableStringBuilder);
        this.K = str;
        this.L = i10;
    }
}
