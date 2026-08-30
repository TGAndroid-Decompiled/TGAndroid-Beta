package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import k7.k6;
public final class t {
    public final TextView f13645a;
    public final org.telegram.ui.Cells.f1 f13646b;

    public t(TextView textView) {
        this.f13645a = textView;
        this.f13646b = new org.telegram.ui.Cells.f1(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f13645a.getContext().obtainStyledAttributes(attributeSet, f.a.f5624i, i10, 0);
        try {
            boolean z4 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z4 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z4);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z4) {
        ((k6) this.f13646b.f21045b).b(z4);
    }

    public final void c(boolean z4) {
        ((k6) this.f13646b.f21045b).c(z4);
    }
}
