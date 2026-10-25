package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f13436a;
    public int f13437b;
    public int f13438c;

    @Override
    public final float getInterpolation(float f7) {
        float f10;
        int i10 = (int) ((f7 * this.f13438c) + 0.5f);
        int i11 = this.f13437b;
        int[] iArr = this.f13436a;
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
            f10 = i10 / this.f13438c;
        } else {
            f10 = 0.0f;
        }
        return (i12 / i11) + f10;
    }
}
