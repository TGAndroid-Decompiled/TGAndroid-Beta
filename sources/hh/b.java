package hh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h9;
public final class b extends h9 {
    public final int f8051e;

    public b(int i10, Context context, boolean z10) {
        super(context, z10);
        this.f8051e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.f8051e) {
            case 1:
                if (lh.t.f16248c) {
                    lh.t.f16247b.add(this);
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
        int f9;
        switch (this.f8051e) {
            case 0:
                int i12 = this.f29141a.f28834n;
                if (i12 == 0) {
                    f9 = 0;
                } else {
                    f9 = com.google.android.recaptcha.internal.a.f(i12, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824), i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f8051e) {
            case 1:
                if (lh.t.f16248c) {
                    lh.t.f16247b.add(this);
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
