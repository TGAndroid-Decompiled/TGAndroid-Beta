package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f7752a;
    public int f7753b;
    public int f7754c;

    @Override
    public final float getInterpolation(float f7) {
        float f10;
        int i10 = (int) ((f7 * this.f7754c) + 0.5f);
        int i11 = this.f7753b;
        int[] iArr = this.f7752a;
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
            f10 = i10 / this.f7754c;
        } else {
            f10 = 0.0f;
        }
        return (i12 / i11) + f10;
    }
}
