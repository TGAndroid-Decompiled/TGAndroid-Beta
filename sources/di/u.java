package di;

import android.content.Context;
import android.view.View;
public final class u extends org.telegram.ui.Components.z8 {
    public final int f9808e;

    public u(int i7, Context context, boolean z9) {
        super(context, z9);
        this.f9808e = i7;
    }

    @Override
    public void invalidate() {
        switch (this.f9808e) {
            case 0:
                if (v.f9858c) {
                    v.f9857b.add(this);
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
    public void onMeasure(int i7, int i10) {
        int e10;
        switch (this.f9808e) {
            case 1:
                int i11 = this.f40861a.f40556n;
                if (i11 == 0) {
                    e10 = 0;
                } else {
                    e10 = com.google.android.recaptcha.internal.a.e(i11, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(e10), 1073741824), i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.f9808e) {
            case 0:
                if (v.f9858c) {
                    v.f9857b.add(this);
                    return;
                } else {
                    super.invalidate(i7, i10, i11, i12);
                    return;
                }
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
        }
    }
}
