package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.o6;
public final class t {
    public final TextView f15824a;
    public final l2.f f15825b;

    public t(TextView textView) {
        this.f15824a = textView;
        this.f15825b = new l2.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f15824a.getContext().obtainStyledAttributes(attributeSet, f.a.f9532i, i10, 0);
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
        ((o6) this.f15825b.f15335b).b(z10);
    }

    public final void c(boolean z10) {
        ((o6) this.f15825b.f15335b).c(z10);
    }
}
