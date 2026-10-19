package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.l6;
public final class u {
    public final TextView f16347a;
    public final k2.w0 f16348b;

    public u(TextView textView) {
        this.f16347a = textView;
        this.f16348b = new k2.w0(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f16347a.getContext().obtainStyledAttributes(attributeSet, f.a.f10256i, i10, 0);
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
        ((l6) this.f16348b.f14832b).b(z10);
    }

    public final void c(boolean z10) {
        ((l6) this.f16348b.f14832b).c(z10);
    }
}
