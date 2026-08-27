package lh;

import android.graphics.PointF;

public final class s6 {

    public final String f16727a;

    public final PointF[] f16728b;

    public final float f16729c;
    public final float d;

    public s6(String str, PointF[] pointFArr) {
        this.f16727a = str;
        this.f16728b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        float length = f10 / pointFArr.length;
        float length2 = f11 / pointFArr.length;
        this.f16729c = length;
        this.d = length2;
    }
}
