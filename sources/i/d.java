package i;

import android.animation.TimeInterpolator;

public final class d implements TimeInterpolator {

    public int[] f10473a;

    public int f10474b;

    public int f10475c;

    @Override
    public final float getInterpolation(float f10) {
        int i10 = (int) ((f10 * this.f10475c) + 0.5f);
        int i11 = this.f10474b;
        int[] iArr = this.f10473a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        return (i12 / i11) + (i12 < i11 ? i10 / this.f10475c : 0.0f);
    }
}
