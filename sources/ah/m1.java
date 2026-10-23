package ah;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
public final class m1 extends ei.d {
    public SpannableStringBuilder f831k0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f831k0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i10, new Object[0]));
        g(spannableStringBuilder, true);
    }
}
