package fi;

import android.content.Context;
import android.view.View;
public final class u extends org.telegram.ui.Components.d9 {
    public final int f12609e;

    public u(int i7, Context context, boolean z10) {
        super(context, z10);
        this.f12609e = i7;
    }

    @Override
    public void invalidate() {
        switch (this.f12609e) {
            case 0:
                if (v.f12635c) {
                    v.f12634b.add(this);
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
    public void onMeasure(int i7, int i10) {
        int v;
        switch (this.f12609e) {
            case 1:
                int i11 = this.f34245a.f33960n;
                if (i11 == 0) {
                    v = 0;
                } else {
                    v = com.google.android.gms.internal.vision.e2.v(i11, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(v), 1073741824), i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.f12609e) {
            case 0:
                if (v.f12635c) {
                    v.f12634b.add(this);
                    return;
                } else {
                    super.invalidate(i7, i10, i11, i12);
                    return;
                }
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
        }
    }
}
