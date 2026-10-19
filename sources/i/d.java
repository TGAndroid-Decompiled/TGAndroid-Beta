package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f12271a;
    public int f12272b;
    public int f12273c;

    @Override
    public final float getInterpolation(float f7) {
        float f10;
        int i10 = (int) ((f7 * this.f12273c) + 0.5f);
        int i11 = this.f12272b;
        int[] iArr = this.f12271a;
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
            f10 = i10 / this.f12273c;
        } else {
            f10 = 0.0f;
        }
        return (i12 / i11) + f10;
    }
}
