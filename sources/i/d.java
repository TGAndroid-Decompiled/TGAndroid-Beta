package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f10832a;
    public int f10833b;
    public int f10834c;

    @Override
    public final float getInterpolation(float f10) {
        float f11;
        int i9 = (int) ((f10 * this.f10834c) + 0.5f);
        int i10 = this.f10833b;
        int[] iArr = this.f10832a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i9 < i12) {
                break;
            }
            i9 -= i12;
            i11++;
        }
        if (i11 < i10) {
            f11 = i9 / this.f10834c;
        } else {
            f11 = 0.0f;
        }
        return (i11 / i10) + f11;
    }
}
