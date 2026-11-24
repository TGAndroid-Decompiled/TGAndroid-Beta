package defpackage;

import android.widget.ImageView;
public final class pm7 extends wgb {
    public ImageView a0;

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (k96.a0) {
            L = gl.L(17.0f);
        } else {
            L = i5 - gl.L(41.0f);
        }
        int D = ug8.D(24.0f, i4 - i2, 2);
        this.a0.layout(L, D, gl.L(24.0f) + L, gl.L(24.0f) + D);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a0.measure(i, i2);
    }
}
