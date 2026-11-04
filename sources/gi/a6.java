package gi;

import android.graphics.PointF;
public final class a6 {
    public final String f12390a;
    public final PointF[] f12391b;
    public final float f12392c;
    public final float d;

    public a6(String str, PointF[] pointFArr) {
        this.f12390a = str;
        this.f12391b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f12392c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
