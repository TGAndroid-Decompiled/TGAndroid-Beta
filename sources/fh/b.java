package fh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b9;

public final class b extends b9 {

    public final int f6104e;

    public b(int i10, Context context, boolean z10) {
        super(context, z10);
        this.f6104e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.f6104e) {
            case 1:
                if (!jh.t.f13983c) {
                    super.invalidate();
                } else {
                    jh.t.f13982b.add(this);
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f6104e) {
            case 0:
                int i12 = this.f27049a.f26673n;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 == 0 ? 0 : i0.a.e(i12, 1, 20, 24)), 1073741824), i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f6104e) {
            case 1:
                if (jh.t.f13983c) {
                    jh.t.f13982b.add(this);
                } else {
                    super.invalidate(i10, i11, i12, i13);
                }
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
