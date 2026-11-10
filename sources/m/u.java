package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c8.gc;
import org.telegram.ui.Components.uy;
public final class u {
    public final TextView f19266a;
    public final uy f19267b;

    public u(TextView textView) {
        this.f19266a = textView;
        this.f19267b = new uy(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f19266a.getContext().obtainStyledAttributes(attributeSet, f.a.f10866i, i7, 0);
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
        ((gc) this.f19267b.f38776b).b(z9);
    }

    public final void c(boolean z9) {
        ((gc) this.f19267b.f38776b).c(z9);
    }
}
