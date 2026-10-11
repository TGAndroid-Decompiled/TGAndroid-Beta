package ci;

import android.graphics.PointF;
public final class d7 {
    public final String f4942a;
    public final PointF[] f4943b;
    public final float f4944c;
    public final float d;

    public d7(String str, PointF[] pointFArr) {
        this.f4942a = str;
        this.f4943b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f4944c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
