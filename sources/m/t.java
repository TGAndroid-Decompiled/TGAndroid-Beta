package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.p6;
public final class t {
    public final TextView f14548a;
    public final k2.e f14549b;

    public t(TextView textView) {
        this.f14548a = textView;
        this.f14549b = new k2.e(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f14548a.getContext().obtainStyledAttributes(attributeSet, f.a.f8770i, i10, 0);
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
        ((p6) this.f14549b.f13244b).b(z10);
    }

    public final void c(boolean z10) {
        ((p6) this.f14549b.f13244b).c(z10);
    }
}
