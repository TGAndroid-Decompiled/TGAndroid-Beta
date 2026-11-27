package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zv1 implements InputFilter {
    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5 = ChatActivityEnterView.X7;
        for (int i6 = i; i6 < i2; i6++) {
            char charAt = charSequence.charAt(i6);
            if (charAt == '\n' || charAt == '\r') {
                StringBuilder sb = new StringBuilder(i2 - i);
                while (i < i2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 != '\n' && charAt2 != '\r') {
                        sb.append(charAt2);
                    }
                    i++;
                }
                return sb;
            }
        }
        return null;
    }
}
