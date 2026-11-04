package dh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.bd;
public final class q0 extends gi.d {
    public SpannableStringBuilder f9139l0;

    public void setLvlRequiredState(int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f9139l0).append((CharSequence) bd.G(i3, "ReactionLevelRequiredBtn", new Object[0]));
        g(spannableStringBuilder, true);
    }
}
