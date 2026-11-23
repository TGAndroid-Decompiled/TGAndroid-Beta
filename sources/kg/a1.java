package kg;

import android.text.InputFilter;
import android.text.Spanned;
public final class a1 implements InputFilter {
    public final int f18336a;

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f18336a) {
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
