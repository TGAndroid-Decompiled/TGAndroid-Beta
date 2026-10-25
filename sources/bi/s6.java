package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class s6 extends org.telegram.ui.Components.yc {
    public final org.telegram.ui.ActionBar.u6 P;
    public String Q;
    public int R;

    public s6(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.P = u6Var;
        org.telegram.ui.ActionBar.f7.V(this, org.telegram.ui.ActionBar.y6.G6, u6Var);
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, j2 j2Var) {
        ai.h0 h0Var;
        if (str == this.Q && this.R == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String F0 = hi.k.F0(i10);
        if (j2Var != null) {
            h0Var = new ai.h0(this, j2Var, i10, 3);
        } else {
            h0Var = null;
        }
        append.append((CharSequence) org.telegram.ui.Components.zc.b(F0, h0Var, this.P, null));
        setText(spannableStringBuilder);
        this.Q = str;
        this.R = i10;
    }
}
