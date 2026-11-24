package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
public final class iq {
    public final TextView a;
    public final fk3 b;

    public iq(TextView textView) {
        this.a = textView;
        ?? obj = new Object();
        obj.a = new oz3(textView);
        this.b = obj;
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, k09.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        ((fhe) this.b.a).b(z);
    }

    public final void c(boolean z) {
        ((fhe) this.b.a).c(z);
    }
}
