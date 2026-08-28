package kh;

import android.graphics.PointF;
public final class t6 {
    public final String f16089a;
    public final PointF[] f16090b;
    public final float f16091c;
    public final float d;

    public t6(String str, PointF[] pointFArr) {
        this.f16089a = str;
        this.f16090b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f16091c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
