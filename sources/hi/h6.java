package hi;

import android.graphics.PointF;
public final class h6 {
    public final String f14583a;
    public final PointF[] f14584b;
    public final float f14585c;
    public final float d;

    public h6(String str, PointF[] pointFArr) {
        this.f14583a = str;
        this.f14584b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f14585c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
