package defpackage;

import android.content.Context;
import android.view.View;
public final class h02 extends hd0 {
    public final byte e;

    public h02(byte b, Context context, boolean z) {
        super(context, z);
        this.e = b;
    }

    @Override
    public final void invalidate() {
        switch (this.e) {
            case 1:
                if (pi5.c) {
                    pi5.b.add(this);
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
    public final void onMeasure(int i, int i2) {
        int h;
        switch (this.e) {
            case 0:
                int i3 = this.a.n;
                if (i3 == 0) {
                    h = 0;
                } else {
                    h = aq1.h(i3, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(h), 1073741824), i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        switch (this.e) {
            case 1:
                if (pi5.c) {
                    pi5.b.add(this);
                    return;
                } else {
                    super.invalidate(i, i2, i3, i4);
                    return;
                }
            default:
                super.invalidate(i, i2, i3, i4);
                return;
        }
    }
}
