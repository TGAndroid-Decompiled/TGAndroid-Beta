package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import g7.q6;
public final class u {
    public final TextView f17103a;
    public final n5.e0 f17104b;

    public u(TextView textView) {
        this.f17103a = textView;
        this.f17104b = new n5.e0(textView);
    }

    public final void a(AttributeSet attributeSet, int i9) {
        TypedArray obtainStyledAttributes = this.f17103a.getContext().obtainStyledAttributes(attributeSet, f.a.f5275i, i9, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z10) {
        ((q6) this.f17104b.f18488b).b(z10);
    }

    public final void c(boolean z10) {
        ((q6) this.f17104b.f18488b).c(z10);
    }
}
