package hi;

import android.graphics.PointF;
public final class z5 {
    public final String f15503a;
    public final PointF[] f15504b;
    public final float f15505c;
    public final float d;

    public z5(String str, PointF[] pointFArr) {
        this.f15503a = str;
        this.f15504b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f15505c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
