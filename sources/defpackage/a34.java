package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
public final class a34 extends InputFilter.LengthFilter {
    public final c34 a;

    public a34(c34 c34Var) {
        super(128);
        this.a = c34Var;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && filter.length() == 0) {
            gl.A3(this.a.a);
            pw0.APP_ERROR.a();
        }
        return filter;
    }
}
