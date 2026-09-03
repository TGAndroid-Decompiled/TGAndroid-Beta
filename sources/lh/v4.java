package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;
public final class v4 extends sc {
    public final org.telegram.ui.ActionBar.f6 K;
    public String L;
    public int M;

    public v4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.K = f6Var;
        setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, o1 o1Var) {
        ah.a aVar;
        if (str == this.L && this.M == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String G0 = rh.j.G0(i10);
        if (o1Var != null) {
            aVar = new ah.a(this, o1Var, i10, 8);
        } else {
            aVar = null;
        }
        append.append((CharSequence) tc.b(G0, aVar, this.K, null));
        setText(spannableStringBuilder);
        this.L = str;
        this.M = i10;
    }
}
