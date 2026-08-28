package eh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c9;
public final class b extends c9 {
    public final int f5173e;

    public b(int i9, Context context, boolean z10) {
        super(context, z10);
        this.f5173e = i9;
    }

    @Override
    public void invalidate() {
        switch (this.f5173e) {
            case 1:
                if (ih.v.f12218c) {
                    ih.v.f12217b.add(this);
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
    public void onMeasure(int i9, int i10) {
        int e10;
        switch (this.f5173e) {
            case 0:
                int i11 = this.f27425a.f27085n;
                if (i11 == 0) {
                    e10 = 0;
                } else {
                    e10 = e2.c.e(i11, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(e10), 1073741824), i10);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.f5173e) {
            case 1:
                if (ih.v.f12218c) {
                    ih.v.f12217b.add(this);
                    return;
                } else {
                    super.invalidate(i9, i10, i11, i12);
                    return;
                }
            default:
                super.invalidate(i9, i10, i11, i12);
                return;
        }
    }
}
