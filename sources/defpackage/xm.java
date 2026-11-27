package defpackage;

import android.animation.TimeInterpolator;
public final class xm implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    @Override
    public final float getInterpolation(float f) {
        float f2;
        int i = (int) ((f * this.c) + 0.5f);
        int i2 = this.b;
        int[] iArr = this.a;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i >= i4) {
                    i -= i4;
                    i3++;
                } else {
                    f2 = i / this.c;
                    break;
                }
            } else {
                f2 = 0.0f;
                break;
            }
        }
        return (i3 / i2) + f2;
    }
}
