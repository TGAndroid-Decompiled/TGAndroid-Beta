package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import org.telegram.ui.Cells.ja;
import w7.o6;
public final class t {
    public final TextView f14300a;
    public final ja f14301b;

    public t(TextView textView) {
        this.f14300a = textView;
        this.f14301b = new ja(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f14300a.getContext().obtainStyledAttributes(attributeSet, f.a.f8754i, i10, 0);
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
        ((o6) this.f14301b.f20300b).b(z10);
    }

    public final void c(boolean z10) {
        ((o6) this.f14301b.f20300b).c(z10);
    }
}
