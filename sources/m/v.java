package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.n6;
public final class v {
    public final TextView f14994a;
    public final h f14995b;

    public v(TextView textView) {
        this.f14994a = textView;
        this.f14995b = new h(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f14994a.getContext().obtainStyledAttributes(attributeSet, f.a.f8810i, i10, 0);
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
        ((n6) this.f14995b.f14848b).b(z10);
    }

    public final void c(boolean z10) {
        ((n6) this.f14995b.f14848b).c(z10);
    }
}
