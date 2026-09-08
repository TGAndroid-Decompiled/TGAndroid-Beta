package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.l6;
public final class t {
    public final TextView f15694a;
    public final l.d f15695b;

    public t(TextView textView) {
        this.f15694a = textView;
        this.f15695b = new l.d(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f15694a.getContext().obtainStyledAttributes(attributeSet, f.a.f9171i, i10, 0);
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
        ((l6) this.f15695b.f15098b).b(z10);
    }

    public final void c(boolean z10) {
        ((l6) this.f15695b.f15098b).c(z10);
    }
}
