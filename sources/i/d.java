package i;

import android.animation.TimeInterpolator;
public final class d implements TimeInterpolator {
    public int[] f10560a;
    public int f10561b;
    public int f10562c;

    @Override
    public final float getInterpolation(float f7) {
        float f10;
        int i10 = (int) ((f7 * this.f10562c) + 0.5f);
        int i11 = this.f10561b;
        int[] iArr = this.f10560a;
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
            f10 = i10 / this.f10562c;
        } else {
            f10 = 0.0f;
        }
        return (i12 / i11) + f10;
    }
}
