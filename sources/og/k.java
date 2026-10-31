package og;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.i0;
import org.telegram.messenger.t2;
public final class k extends InputFilter.LengthFilter {
    public final m f14206a;

    public k(m mVar) {
        super(128);
        this.f14206a = mVar;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && filter.length() == 0) {
            i0.E3(this.f14206a.f14207a);
            t2.APP_ERROR.a();
        }
        return filter;
    }
}
