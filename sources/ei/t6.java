package ei;

import android.graphics.PointF;
public final class t6 {
    public final String f9852a;
    public final PointF[] f9853b;
    public final float f9854c;
    public final float d;

    public t6(String str, PointF[] pointFArr) {
        this.f9852a = str;
        this.f9853b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f9854c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
