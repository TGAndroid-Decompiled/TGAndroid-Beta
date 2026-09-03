package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f7180a;
    public int f7181b;
    public int f7182c;

    @Override
    public final float getInterpolation(float f10) {
        float f11;
        int i10 = (int) ((f10 * this.f7182c) + 0.5f);
        int i11 = this.f7181b;
        int[] iArr = this.f7180a;
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
            f11 = i10 / this.f7182c;
        } else {
            f11 = 0.0f;
        }
        return (i12 / i11) + f11;
    }
}
