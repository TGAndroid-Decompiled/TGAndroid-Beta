package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.q6;
public final class t {
    public final TextView f15883a;
    public final n2.c f15884b;

    public t(TextView textView) {
        this.f15883a = textView;
        this.f15884b = new n2.c(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f15883a.getContext().obtainStyledAttributes(attributeSet, f.a.f9520i, i10, 0);
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
        ((q6) this.f15884b.f16523b).b(z10);
    }

    public final void c(boolean z10) {
        ((q6) this.f15884b.f16523b).c(z10);
    }
}
