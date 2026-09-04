package di;

import android.graphics.PointF;
public final class f7 {
    public final String f7234a;
    public final PointF[] f7235b;
    public final float f7236c;
    public final float d;

    public f7(String str, PointF[] pointFArr) {
        this.f7234a = str;
        this.f7235b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f7236c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
