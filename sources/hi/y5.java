package hi;

import android.graphics.PointF;
public final class y5 {
    public final String f15723a;
    public final PointF[] f15724b;
    public final float f15725c;
    public final float d;

    public y5(String str, PointF[] pointFArr) {
        this.f15723a = str;
        this.f15724b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f15725c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
