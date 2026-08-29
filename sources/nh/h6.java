package nh;

import android.graphics.PointF;
public final class h6 {
    public final String f17844a;
    public final PointF[] f17845b;
    public final float f17846c;
    public final float d;

    public h6(String str, PointF[] pointFArr) {
        this.f17844a = str;
        this.f17845b = pointFArr;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f9 += pointF.x;
            f10 += pointF.y;
        }
        this.f17846c = f9 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
