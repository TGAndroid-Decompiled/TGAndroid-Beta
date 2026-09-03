package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import k7.k6;
import org.telegram.ui.Components.zz;
public final class t {
    public final TextView f13629a;
    public final zz f13630b;

    public t(TextView textView) {
        this.f13629a = textView;
        this.f13630b = new zz(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f13629a.getContext().obtainStyledAttributes(attributeSet, f.a.f5613i, i10, 0);
        try {
            boolean z4 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z4 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z4);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z4) {
        ((k6) this.f13630b.f31508b).b(z4);
    }

    public final void c(boolean z4) {
        ((k6) this.f13630b.f31508b).c(z4);
    }
}
