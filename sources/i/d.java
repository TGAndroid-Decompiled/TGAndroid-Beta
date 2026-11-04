package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f14479a;
    public int f14480b;
    public int f14481c;

    @Override
    public final float getInterpolation(float f10) {
        float f11;
        int i3 = (int) ((f10 * this.f14481c) + 0.5f);
        int i10 = this.f14480b;
        int[] iArr = this.f14479a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i3 < i12) {
                break;
            }
            i3 -= i12;
            i11++;
        }
        if (i11 < i10) {
            f11 = i3 / this.f14481c;
        } else {
            f11 = 0.0f;
        }
        return (i11 / i10) + f11;
    }
}
