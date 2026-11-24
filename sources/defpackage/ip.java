package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
public final class ip {
    public final TextView a;
    public final gi3 b;

    public ip(TextView textView) {
        this.a = textView;
        ?? obj = new Object();
        obj.a = new ey3(textView);
        this.b = obj;
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, jy8.i, i, 0);
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
        ((efe) this.b.a).b(z);
    }

    public final void c(boolean z) {
        ((efe) this.b.a).c(z);
    }
}
