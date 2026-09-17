package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import org.telegram.ui.Cells.ia;
import w7.o6;
public final class t {
    public final TextView f14322a;
    public final ia f14323b;

    public t(TextView textView) {
        this.f14322a = textView;
        this.f14323b = new ia(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f14322a.getContext().obtainStyledAttributes(attributeSet, f.a.f8771i, i10, 0);
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
        ((o6) this.f14323b.f20290b).b(z10);
    }

    public final void c(boolean z10) {
        ((o6) this.f14323b.f20290b).c(z10);
    }
}
