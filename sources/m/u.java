package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c8.gc;
import org.telegram.ui.Components.uy;
public final class u {
    public final TextView f19258a;
    public final uy f19259b;

    public u(TextView textView) {
        this.f19258a = textView;
        this.f19259b = new uy(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f19258a.getContext().obtainStyledAttributes(attributeSet, f.a.f10861i, i7, 0);
        try {
            boolean z9 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z9 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z9);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z9) {
        ((gc) this.f19259b.f38750b).b(z9);
    }

    public final void c(boolean z9) {
        ((gc) this.f19259b.f38750b).c(z9);
    }
}
