package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.l6;
public final class t {
    public final TextView f15667a;
    public final l.d f15668b;

    public t(TextView textView) {
        this.f15667a = textView;
        this.f15668b = new l.d(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f15667a.getContext().obtainStyledAttributes(attributeSet, f.a.f9143i, i10, 0);
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
        ((l6) this.f15668b.f15072b).b(z10);
    }

    public final void c(boolean z10) {
        ((l6) this.f15668b.f15072b).c(z10);
    }
}
