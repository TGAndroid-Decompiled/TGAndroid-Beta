package m;

import a8.nf;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
public final class t {
    public final TextView f17854a;
    public final li.e3 f17855b;

    public t(TextView textView) {
        this.f17854a = textView;
        this.f17855b = new li.e3(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f17854a.getContext().obtainStyledAttributes(attributeSet, f.a.f10029i, i10, 0);
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
        ((nf) this.f17855b.f17209b).b(z10);
    }

    public final void c(boolean z10) {
        ((nf) this.f17855b.f17209b).c(z10);
    }
}
