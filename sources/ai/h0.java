package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h0 extends org.telegram.ui.Components.j9 {
    public final int e;

    public h0(int i10, Context context, boolean z10) {
        super(context, z10);
        this.e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.e) {
            case 0:
                if (i0.f968c) {
                    i0.f967b.add(this);
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
        int f7;
        switch (this.e) {
            case 1:
                int i12 = this.f25302a.f24956n;
                if (i12 == 0) {
                    f7 = 0;
                } else {
                    f7 = hg.k0.f(i12, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824), i11);
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
                if (i0.f968c) {
                    i0.f967b.add(this);
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
