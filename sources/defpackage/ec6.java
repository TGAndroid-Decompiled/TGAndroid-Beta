package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
public final class ec6 implements InputFilter {
    public final byte a;

    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (charSequence2.contains("\n")) {
                        return charSequence2.replaceAll("\n", "");
                    }
                }
                return null;
            default:
                return String.valueOf(charSequence).replaceAll("[^\\d_\\p{L}\\x{200c}\\x{00b7}\\x{0d80}-\\x{0dff}]", "");
        }
    }
}
