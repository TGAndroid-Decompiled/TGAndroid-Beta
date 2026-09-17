package a4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
public final class f {
    public static final e f247c = new e(0);
    public final d2.b f248a;
    public final int f249b;

    public f(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f7, int i10, float f10, int i11, boolean z10, int i12, int i13) {
        int i14;
        if (z10) {
            i14 = i12;
        } else {
            i14 = -16777216;
        }
        this.f248a = new d2.b(spannableStringBuilder, alignment, null, null, f7, 0, i10, f10, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i14, Integer.MIN_VALUE, 0.0f, 0);
        this.f249b = i13;
    }
}
