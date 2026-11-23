package ch;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.hd;
public final class t0 extends hi.e {
    public SpannableStringBuilder m0;

    public void setLvlRequiredState(int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.m0).append((CharSequence) hd.G(i7, "ReactionLevelRequiredBtn", new Object[0]));
        g(spannableStringBuilder, true);
    }
}
