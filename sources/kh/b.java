package kh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d9;
public final class b extends d9 {
    public final int f11235e;

    public b(int i10, Context context, boolean z4) {
        super(context, z4);
        this.f11235e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.f11235e) {
            case 1:
                if (oh.t.f17753c) {
                    oh.t.f17752b.add(this);
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
        int e6;
        switch (this.f11235e) {
            case 0:
                int i12 = this.f26228a.f25875n;
                if (i12 == 0) {
                    e6 = 0;
                } else {
                    e6 = e2.c.e(i12, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(e6), 1073741824), i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f11235e) {
            case 1:
                if (oh.t.f17753c) {
                    oh.t.f17752b.add(this);
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
