package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c8.lc;
import org.telegram.ui.Components.jn;
public final class t {
    public final TextView f20233a;
    public final jn f20234b;

    public t(TextView textView) {
        this.f20233a = textView;
        this.f20234b = new jn(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f20233a.getContext().obtainStyledAttributes(attributeSet, f.a.f11023i, i7, 0);
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
        ((lc) this.f20234b.f36572b).b(z10);
    }

    public final void c(boolean z10) {
        ((lc) this.f20234b.f36572b).c(z10);
    }
}
