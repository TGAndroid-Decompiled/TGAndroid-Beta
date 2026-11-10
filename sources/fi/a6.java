package fi;

import android.graphics.PointF;
public final class a6 {
    public final String f11611a;
    public final PointF[] f11612b;
    public final float f11613c;
    public final float d;

    public a6(String str, PointF[] pointFArr) {
        this.f11611a = str;
        this.f11612b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f11613c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
