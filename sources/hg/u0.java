package hg;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
public final class u0 extends kh.d {
    public SpannableStringBuilder f10760d0;

    public void setLvlRequiredState(int i9) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f10760d0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i9, new Object[0]));
        f(spannableStringBuilder, true);
    }
}
