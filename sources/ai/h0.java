package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h0 extends org.telegram.ui.Components.m9 {
    public final int f1067e;

    public h0(int i10, Context context, boolean z10) {
        super(context, z10);
        this.f1067e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.f1067e) {
            case 0:
                if (i0.f1118c) {
                    i0.f1117b.add(this);
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
        int g10;
        switch (this.f1067e) {
            case 1:
                int i12 = this.f28440a.f28105n;
                if (i12 == 0) {
                    g10 = 0;
                } else {
                    g10 = hg.c.g(i12, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(g10), 1073741824), i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f1067e) {
            case 0:
                if (i0.f1118c) {
                    i0.f1117b.add(this);
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
