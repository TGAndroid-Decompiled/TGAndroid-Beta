package ag;

import android.text.InputFilter;
import android.text.Spanned;
public final class b2 implements InputFilter {
    public final int f470a;

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.f470a) {
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
