package ei;

import android.content.Context;
import android.view.View;
public final class v extends org.telegram.ui.Components.x8 {
    public final int f11104e;

    public v(int i3, Context context, boolean z10) {
        super(context, z10);
        this.f11104e = i3;
    }

    @Override
    public void invalidate() {
        switch (this.f11104e) {
            case 0:
                if (w.f11144c) {
                    w.f11143b.add(this);
                    return;
                } else {
                    super.invalidate();
                    return;
                }
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int e10;
        switch (this.f11104e) {
            case 1:
                int i11 = this.f40266a.f39958n;
                if (i11 == 0) {
                    e10 = 0;
                } else {
                    e10 = com.google.android.recaptcha.internal.a.e(i11, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(e10), 1073741824), i10);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void invalidate(int i3, int i10, int i11, int i12) {
        switch (this.f11104e) {
            case 0:
                if (w.f11144c) {
                    w.f11143b.add(this);
                    return;
                } else {
                    super.invalidate(i3, i10, i11, i12);
                    return;
                }
            default:
                super.invalidate(i3, i10, i11, i12);
                return;
        }
    }
}
