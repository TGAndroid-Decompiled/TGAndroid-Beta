package fi;

import android.graphics.PointF;
public final class q6 {
    public final String f11486a;
    public final PointF[] f11487b;
    public final float f11488c;
    public final float d;

    public q6(String str, PointF[] pointFArr) {
        this.f11486a = str;
        this.f11487b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f11488c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
