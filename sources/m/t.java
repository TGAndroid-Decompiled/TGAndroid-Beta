package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import w7.o6;
public final class t {
    public final TextView f13148a;
    public final g3 f13149b;

    public t(TextView textView) {
        this.f13148a = textView;
        this.f13149b = new g3(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f13148a.getContext().obtainStyledAttributes(attributeSet, f.a.f7650i, i10, 0);
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
        ((o6) this.f13149b.f13018b).b(z10);
    }

    public final void c(boolean z10) {
        ((o6) this.f13149b.f13018b).c(z10);
    }
}
