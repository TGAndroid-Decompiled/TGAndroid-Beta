package ah;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
public final class n1 extends di.d {
    public SpannableStringBuilder f646h0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f646h0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i10, new Object[0]));
        f(spannableStringBuilder, true);
    }
}
