package d4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
public final class d {
    public static final a3.c f8140c = new a3.c(18);
    public final g2.b f8141a;
    public final int f8142b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i7, float f11, int i10, boolean z9, int i11, int i12) {
        int i13;
        if (z9) {
            i13 = i11;
        } else {
            i13 = -16777216;
        }
        this.f8141a = new g2.b(spannableStringBuilder, alignment, null, null, f10, 0, i7, f11, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z9, i13, Integer.MIN_VALUE, 0.0f, 0);
        this.f8142b = i12;
    }
}
