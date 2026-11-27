package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
public abstract class yk2 implements InputFilter {
    public final short a;

    public yk2(int i) {
        this.a = i;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int codePointCount = this.a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i3, i4));
        if (codePointCount > 0) {
            if (codePointCount >= Character.codePointCount(charSequence, i, i2)) {
                return null;
            }
            int i5 = codePointCount + i;
            if (Character.isHighSurrogate(charSequence.charAt(i5 - 1)) && i5 - 1 == i) {
                return "";
            }
            return charSequence.subSequence(i, i5);
        }
        return "";
    }
}
