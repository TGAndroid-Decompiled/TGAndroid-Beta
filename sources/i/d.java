package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f8170a;
    public int f8171b;
    public int f8172c;

    @Override
    public final float getInterpolation(float f9) {
        float f10;
        int i10 = (int) ((f9 * this.f8172c) + 0.5f);
        int i11 = this.f8171b;
        int[] iArr = this.f8170a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        if (i12 < i11) {
            f10 = i10 / this.f8172c;
        } else {
            f10 = 0.0f;
        }
        return (i12 / i11) + f10;
    }
}
