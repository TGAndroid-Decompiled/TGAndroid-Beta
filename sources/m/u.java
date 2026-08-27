package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import h7.n6;

public final class u {

    public final TextView f17478a;

    public final n2.b0 f17479b;

    public u(TextView textView) {
        this.f17478a = textView;
        this.f17479b = new n2.b0(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f17478a.getContext().obtainStyledAttributes(attributeSet, f.a.f5580i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z10) {
        ((n6) this.f17479b.f18130b).b(z10);
    }

    public final void c(boolean z10) {
        ((n6) this.f17479b.f18130b).c(z10);
    }
}
