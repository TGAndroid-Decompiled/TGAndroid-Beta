package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c8.lc;
import org.telegram.ui.Components.hn;
public final class t {
    public final TextView f20208a;
    public final hn f20209b;

    public t(TextView textView) {
        this.f20208a = textView;
        this.f20209b = new hn(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f20208a.getContext().obtainStyledAttributes(attributeSet, f.a.f10997i, i7, 0);
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
        ((lc) this.f20209b.f35933b).b(z10);
    }

    public final void c(boolean z10) {
        ((lc) this.f20209b.f35933b).c(z10);
    }
}
