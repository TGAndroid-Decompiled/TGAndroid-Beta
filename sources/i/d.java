package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f12269a;
    public int f12270b;
    public int f12271c;

    @Override
    public final float getInterpolation(float f7) {
        float f10;
        int i10 = (int) ((f7 * this.f12271c) + 0.5f);
        int i11 = this.f12270b;
        int[] iArr = this.f12269a;
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
            f10 = i10 / this.f12271c;
        } else {
            f10 = 0.0f;
        }
        return (i12 / i11) + f10;
    }
}
