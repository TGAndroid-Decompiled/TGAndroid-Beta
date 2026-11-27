package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
public final class w34 extends InputFilter.LengthFilter {
    public final y34 a;

    public w34(y34 y34Var) {
        super(128);
        this.a = y34Var;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && filter.length() == 0) {
            hl.z3(this.a.a);
            yw0.APP_ERROR.a();
        }
        return filter;
    }
}
