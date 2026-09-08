package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a0 extends org.telegram.ui.Components.l9 {
    public final int f2758e;

    public a0(int i10, Context context, boolean z10) {
        super(context, z10);
        this.f2758e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.f2758e) {
            case 0:
                if (b0.f2813c) {
                    b0.f2812b.add(this);
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
    public void onMeasure(int i10, int i11) {
        int w10;
        switch (this.f2758e) {
            case 1:
                int i12 = this.f28147a.f27794n;
                if (i12 == 0) {
                    w10 = 0;
                } else {
                    w10 = com.google.android.gms.internal.vision.e2.w(i12, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w10), 1073741824), i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f2758e) {
            case 0:
                if (b0.f2813c) {
                    b0.f2812b.add(this);
                    return;
                } else {
                    super.invalidate(i10, i11, i12, i13);
                    return;
                }
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
