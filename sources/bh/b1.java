package bh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
public final class b1 extends fi.d {
    public SpannableStringBuilder f3994k0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f3994k0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i10, new Object[0]));
        g(spannableStringBuilder, true);
    }
}
