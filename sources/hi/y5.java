package hi;

import android.graphics.PointF;
public final class y5 {
    public final String f15770a;
    public final PointF[] f15771b;
    public final float f15772c;
    public final float d;

    public y5(String str, PointF[] pointFArr) {
        this.f15770a = str;
        this.f15771b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f15772c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
