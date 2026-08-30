package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d9;
public final class b extends d9 {
    public final int e;

    public b(int i10, Context context, boolean z4) {
        super(context, z4);
        this.e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.e) {
            case 1:
                if (nh.u.f15945c) {
                    nh.u.f15944b.add(this);
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
        int e;
        switch (this.e) {
            case 0:
                int i12 = this.f24206a.f23932n;
                if (i12 == 0) {
                    e = 0;
                } else {
                    e = e2.c.e(i12, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(e), 1073741824), i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.e) {
            case 1:
                if (nh.u.f15945c) {
                    nh.u.f15944b.add(this);
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
