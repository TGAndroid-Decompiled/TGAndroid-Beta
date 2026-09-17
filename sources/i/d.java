package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f11434a;
    public int f11435b;
    public int f11436c;

    @Override
    public final float getInterpolation(float f7) {
        float f10;
        int i10 = (int) ((f7 * this.f11436c) + 0.5f);
        int i11 = this.f11435b;
        int[] iArr = this.f11434a;
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
            f10 = i10 / this.f11436c;
        } else {
            f10 = 0.0f;
        }
        return (i12 / i11) + f10;
    }
}
