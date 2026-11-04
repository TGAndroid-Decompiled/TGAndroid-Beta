package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import org.telegram.ui.Components.y00;
public final class t {
    public final TextView f18729a;
    public final y00 f18730b;

    public t(TextView textView) {
        this.f18729a = textView;
        ?? obj = new Object();
        obj.f40562a = new s1.g(textView);
        this.f18730b = obj;
    }

    public final void a(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = this.f18729a.getContext().obtainStyledAttributes(attributeSet, f.a.f11313i, i3, 0);
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
        ((x7.p) this.f18730b.f40562a).b(z10);
    }

    public final void c(boolean z10) {
        ((x7.p) this.f18730b.f40562a).c(z10);
    }
}
