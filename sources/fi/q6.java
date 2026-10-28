package fi;

import android.graphics.PointF;
public final class q6 {
    public final String f11485a;
    public final PointF[] f11486b;
    public final float f11487c;
    public final float d;

    public q6(String str, PointF[] pointFArr) {
        this.f11485a = str;
        this.f11486b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f11487c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
