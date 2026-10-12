package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.n6;
public final class t {
    public final TextView f15577a;
    public final y0 f15578b;

    public t(TextView textView) {
        this.f15577a = textView;
        this.f15578b = new y0(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f15577a.getContext().obtainStyledAttributes(attributeSet, f.a.f9529i, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z10) {
        ((n6) this.f15578b.f15628b).b(z10);
    }

    public final void c(boolean z10) {
        ((n6) this.f15578b.f15628b).c(z10);
    }
}
