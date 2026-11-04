package c4;

import a3.u;
import android.text.Layout;
import android.text.SpannableStringBuilder;
public final class d {
    public static final u f4163c = new u(2);
    public final f2.b f4164a;
    public final int f4165b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i3, float f11, int i10, boolean z10, int i11, int i12) {
        int i13;
        if (z10) {
            i13 = i11;
        } else {
            i13 = -16777216;
        }
        this.f4164a = new f2.b(spannableStringBuilder, alignment, null, null, f10, 0, i3, f11, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i13, Integer.MIN_VALUE, 0.0f, 0);
        this.f4165b = i12;
    }
}
