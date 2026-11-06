package fi;

import android.graphics.PointF;
public final class a6 {
    public final String f11606a;
    public final PointF[] f11607b;
    public final float f11608c;
    public final float d;

    public a6(String str, PointF[] pointFArr) {
        this.f11606a = str;
        this.f11607b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f11608c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
