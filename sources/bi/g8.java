package bi;

import android.graphics.PointF;
public final class g8 {
    public final String f2750a;
    public final PointF[] f2751b;
    public final float f2752c;
    public final float d;

    public g8(String str, PointF[] pointFArr) {
        this.f2750a = str;
        this.f2751b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f2752c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
