package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f15557a;
    public int f15558b;
    public int f15559c;

    @Override
    public final float getInterpolation(float f10) {
        float f11;
        int i7 = (int) ((f10 * this.f15559c) + 0.5f);
        int i10 = this.f15558b;
        int[] iArr = this.f15557a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i7 < i12) {
                break;
            }
            i7 -= i12;
            i11++;
        }
        if (i11 < i10) {
            f11 = i7 / this.f15559c;
        } else {
            f11 = 0.0f;
        }
        return (i11 / i10) + f11;
    }
}
