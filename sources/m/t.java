package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c8.mc;
import org.telegram.ui.Components.nd0;
public final class t {
    public final TextView f20298a;
    public final nd0 f20299b;

    public t(TextView textView) {
        this.f20298a = textView;
        this.f20299b = new nd0(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f20298a.getContext().obtainStyledAttributes(attributeSet, f.a.f10987i, i7, 0);
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
        ((mc) this.f20299b.f37766b).b(z10);
    }

    public final void c(boolean z10) {
        ((mc) this.f20299b.f37766b).c(z10);
    }
}
