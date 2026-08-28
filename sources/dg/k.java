package dg;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class k extends InputFilter.LengthFilter {
    public final m f4532a;

    public k(m mVar) {
        super(128);
        this.f4532a = mVar;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i9, i10, spanned, i11, i12);
        if (filter != null && filter.length() == 0) {
            AndroidUtilities.shakeView(this.f4532a.f4533a);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        return filter;
    }
}
