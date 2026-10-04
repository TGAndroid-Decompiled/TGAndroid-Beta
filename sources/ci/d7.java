package ci;

import android.graphics.PointF;
public final class d7 {
    public final String f4910a;
    public final PointF[] f4911b;
    public final float f4912c;
    public final float d;

    public d7(String str, PointF[] pointFArr) {
        this.f4910a = str;
        this.f4911b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f4912c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
