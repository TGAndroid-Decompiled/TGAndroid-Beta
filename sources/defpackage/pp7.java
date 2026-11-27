package defpackage;

import android.widget.ImageView;
public final class pp7 extends skb {
    public ImageView a0;

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (ob6.a0) {
            L = hl.L(17.0f);
        } else {
            L = i5 - hl.L(41.0f);
        }
        int D = ik8.D(24.0f, i4 - i2, 2);
        this.a0.layout(L, D, hl.L(24.0f) + L, hl.L(24.0f) + D);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a0.measure(i, i2);
    }
}
