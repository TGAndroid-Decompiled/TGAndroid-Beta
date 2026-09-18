package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.p6;
public final class t {
    public final TextView f14497a;
    public final k2.u f14498b;

    public t(TextView textView) {
        this.f14497a = textView;
        this.f14498b = new k2.u(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f14497a.getContext().obtainStyledAttributes(attributeSet, f.a.f8770i, i10, 0);
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
        ((p6) this.f14498b.f13383b).b(z10);
    }

    public final void c(boolean z10) {
        ((p6) this.f14498b.f13383b).c(z10);
    }
}
