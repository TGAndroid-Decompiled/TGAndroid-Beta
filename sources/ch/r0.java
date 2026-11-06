package ch;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.hd;
public final class r0 extends fi.d {
    public SpannableStringBuilder f6395k0;

    public void setLvlRequiredState(int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f6395k0).append((CharSequence) hd.G(i7, "ReactionLevelRequiredBtn", new Object[0]));
        g(spannableStringBuilder, true);
    }
}
