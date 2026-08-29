package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import i7.v6;
import nh.d6;
public final class u {
    public final TextView f16701a;
    public final d6 f16702b;

    public u(TextView textView) {
        this.f16701a = textView;
        this.f16702b = new d6(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f16701a.getContext().obtainStyledAttributes(attributeSet, f.a.f6237i, i10, 0);
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
        ((v6) this.f16702b.f17533b).b(z10);
    }

    public final void c(boolean z10) {
        ((v6) this.f16702b.f17533b).c(z10);
    }
}
