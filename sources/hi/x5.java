package hi;

import android.graphics.PointF;
public final class x5 {
    public final String f15747a;
    public final PointF[] f15748b;
    public final float f15749c;
    public final float d;

    public x5(String str, PointF[] pointFArr) {
        this.f15747a = str;
        this.f15748b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f15749c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
