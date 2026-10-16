package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a0 extends org.telegram.ui.Components.n9 {
    public final int e;

    public a0(int i10, Context context, boolean z10) {
        super(context, z10);
        this.e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.e) {
            case 0:
                if (b0.f2853c) {
                    b0.f2852b.add(this);
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
        int v;
        switch (this.e) {
            case 1:
                int i12 = this.f27318a.f27018n;
                if (i12 == 0) {
                    v = 0;
                } else {
                    v = com.google.android.gms.internal.play_billing.k3.v(i12, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(v), 1073741824), i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.e) {
            case 0:
                if (b0.f2853c) {
                    b0.f2852b.add(this);
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
