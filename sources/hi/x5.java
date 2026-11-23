package hi;

import android.graphics.PointF;
public final class x5 {
    public final String f15750a;
    public final PointF[] f15751b;
    public final float f15752c;
    public final float d;

    public x5(String str, PointF[] pointFArr) {
        this.f15750a = str;
        this.f15751b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f15752c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
