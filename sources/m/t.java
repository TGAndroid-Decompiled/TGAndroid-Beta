package m;

import a8.nf;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
public final class t {
    public final TextView f17855a;
    public final li.e3 f17856b;

    public t(TextView textView) {
        this.f17855a = textView;
        this.f17856b = new li.e3(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f17855a.getContext().obtainStyledAttributes(attributeSet, f.a.f10030i, i10, 0);
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
        ((nf) this.f17856b.f17210b).b(z10);
    }

    public final void c(boolean z10) {
        ((nf) this.f17856b.f17210b).c(z10);
    }
}
