package ng;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
public final class t0 extends qh.d {
    public SpannableStringBuilder f16220e0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f16220e0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i10, new Object[0]));
        f(spannableStringBuilder, true);
    }
}
