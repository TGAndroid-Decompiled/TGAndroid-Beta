package ei;

import android.graphics.PointF;
public final class t6 {
    public final String f9867a;
    public final PointF[] f9868b;
    public final float f9869c;
    public final float d;

    public t6(String str, PointF[] pointFArr) {
        this.f9867a = str;
        this.f9868b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f9869c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
