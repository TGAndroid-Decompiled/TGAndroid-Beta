package ch;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.id;
public final class r0 extends fi.d {
    public SpannableStringBuilder f6393k0;

    public void setLvlRequiredState(int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f6393k0).append((CharSequence) id.G(i7, "ReactionLevelRequiredBtn", new Object[0]));
        g(spannableStringBuilder, true);
    }
}
