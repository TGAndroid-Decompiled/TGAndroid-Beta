package eg;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

public final class k extends InputFilter.LengthFilter {

    public final m f5423a;

    public k(m mVar) {
        super(128);
        this.f5423a = mVar;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence charSequenceFilter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (charSequenceFilter != null && charSequenceFilter.length() == 0) {
            AndroidUtilities.shakeView(this.f5423a.f5424a);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        return charSequenceFilter;
    }
}
