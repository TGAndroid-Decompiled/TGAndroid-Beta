package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c8.ic;
import org.telegram.messenger.ou;
public final class t {
    public final TextView f19841a;
    public final ou f19842b;

    public t(TextView textView) {
        this.f19841a = textView;
        this.f19842b = new ou(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f19841a.getContext().obtainStyledAttributes(attributeSet, f.a.f10677i, i7, 0);
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
        ((ic) this.f19842b.f25804b).b(z10);
    }

    public final void c(boolean z10) {
        ((ic) this.f19842b.f25804b).c(z10);
    }
}
