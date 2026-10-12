package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f11556a;
    public int f11557b;
    public int f11558c;

    @Override
    public final float getInterpolation(float f7) {
        float f10;
        int i10 = (int) ((f7 * this.f11558c) + 0.5f);
        int i11 = this.f11557b;
        int[] iArr = this.f11556a;
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
            f10 = i10 / this.f11558c;
        } else {
            f10 = 0.0f;
        }
        return (i12 / i11) + f10;
    }
}
