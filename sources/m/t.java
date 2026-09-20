package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.q6;
public final class t {
    public final TextView f14533a;
    public final k2.u f14534b;

    public t(TextView textView) {
        this.f14533a = textView;
        this.f14534b = new k2.u(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f14533a.getContext().obtainStyledAttributes(attributeSet, f.a.f8771i, i10, 0);
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
        ((q6) this.f14534b.f13384b).b(z10);
    }

    public final void c(boolean z10) {
        ((q6) this.f14534b.f13384b).c(z10);
    }
}
