package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v extends org.telegram.ui.Components.m9 {
    public final int e;

    public v(int i10, Context context, boolean z10) {
        super(context, z10);
        this.e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.e) {
            case 0:
                if (w.f9282c) {
                    w.f9281b.add(this);
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
        switch (this.e) {
            case 1:
                int i12 = this.f30457a.f30117n;
                if (i12 == 0) {
                    w10 = 0;
                } else {
                    w10 = c3.h0.w(i12, 1, 20, 24);
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
        switch (this.e) {
            case 0:
                if (w.f9282c) {
                    w.f9281b.add(this);
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
