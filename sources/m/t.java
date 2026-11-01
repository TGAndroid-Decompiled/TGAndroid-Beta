package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.r6;
public final class t {
    public final TextView f12550a;
    public final k2.m0 f12551b;

    public t(TextView textView) {
        this.f12550a = textView;
        ?? obj = new Object();
        obj.f10701a = new q1.g(textView);
        this.f12551b = obj;
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f12550a.getContext().obtainStyledAttributes(attributeSet, f.a.f6700i, i10, 0);
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
        ((r6) this.f12551b.f10701a).b(z10);
    }

    public final void c(boolean z10) {
        ((r6) this.f12551b.f10701a).c(z10);
    }
}
