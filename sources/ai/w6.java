package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class w6 extends org.telegram.ui.Components.zc {
    public final org.telegram.ui.ActionBar.d6 P;
    public String Q;
    public int R;

    public w6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.P = d6Var;
        setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, k2 k2Var) {
        ah.o oVar;
        if (str == this.Q && this.R == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String H0 = gi.l.H0(i10);
        if (k2Var != null) {
            oVar = new ah.o(this, k2Var, i10, 2);
        } else {
            oVar = null;
        }
        append.append((CharSequence) org.telegram.ui.Components.ad.b(H0, oVar, this.P, null));
        setText(spannableStringBuilder);
        this.Q = str;
        this.R = i10;
    }
}
