package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.p6;
public final class t {
    public final TextView f14580a;
    public final k2.u f14581b;

    public t(TextView textView) {
        this.f14580a = textView;
        ?? obj = new Object();
        obj.f13371a = new q1.g(textView);
        this.f14581b = obj;
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f14580a.getContext().obtainStyledAttributes(attributeSet, f.a.f8756i, i10, 0);
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
        ((p6) this.f14581b.f13371a).b(z10);
    }

    public final void c(boolean z10) {
        ((p6) this.f14581b.f13371a).c(z10);
    }
}
