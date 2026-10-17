package ah;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
public final class m1 extends ei.d {
    public SpannableStringBuilder f832h0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f832h0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i10, new Object[0]));
        f(spannableStringBuilder, true);
    }
}
