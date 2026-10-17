package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.o6;
public final class u {
    public final TextView f16339a;
    public final l2.f f16340b;

    public u(TextView textView) {
        this.f16339a = textView;
        this.f16340b = new l2.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f16339a.getContext().obtainStyledAttributes(attributeSet, f.a.f10255i, i10, 0);
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
        ((o6) this.f16340b.f15837b).b(z10);
    }

    public final void c(boolean z10) {
        ((o6) this.f16340b.f15837b).c(z10);
    }
}
