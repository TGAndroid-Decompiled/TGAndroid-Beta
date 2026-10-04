package ci;

import android.graphics.PointF;
public final class d7 {
    public final String f4911a;
    public final PointF[] f4912b;
    public final float f4913c;
    public final float d;

    public d7(String str, PointF[] pointFArr) {
        this.f4911a = str;
        this.f4912b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f4913c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
