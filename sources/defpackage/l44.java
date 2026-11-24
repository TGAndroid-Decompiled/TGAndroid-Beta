package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
public final class l44 extends InputFilter.LengthFilter {
    public final n44 a;

    public l44(n44 n44Var) {
        super(128);
        this.a = n44Var;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && filter.length() == 0) {
            gm.z3(this.a.a);
            xx0.APP_ERROR.a();
        }
        return filter;
    }
}
