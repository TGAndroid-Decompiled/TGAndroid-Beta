package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.l6;
public final class u {
    public final TextView f16345a;
    public final k2.w0 f16346b;

    public u(TextView textView) {
        this.f16345a = textView;
        this.f16346b = new k2.w0(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f16345a.getContext().obtainStyledAttributes(attributeSet, f.a.f10254i, i10, 0);
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
        ((l6) this.f16346b.f14830b).b(z10);
    }

    public final void c(boolean z10) {
        ((l6) this.f16346b.f14830b).c(z10);
    }
}
