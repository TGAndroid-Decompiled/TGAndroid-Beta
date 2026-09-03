package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import k7.l6;
import org.telegram.ui.Components.ai;
public final class t {
    public final TextView f13342a;
    public final ai f13343b;

    public t(TextView textView) {
        this.f13342a = textView;
        this.f13343b = new ai(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f13342a.getContext().obtainStyledAttributes(attributeSet, f.a.f5694i, i10, 0);
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
        ((l6) this.f13343b.f25257b).b(z4);
    }

    public final void c(boolean z4) {
        ((l6) this.f13343b.f25257b).c(z4);
    }
}
