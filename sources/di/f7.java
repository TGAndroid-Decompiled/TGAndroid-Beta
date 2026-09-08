package di;

import android.graphics.PointF;
public final class f7 {
    public final String f7262a;
    public final PointF[] f7263b;
    public final float f7264c;
    public final float d;

    public f7(String str, PointF[] pointFArr) {
        this.f7262a = str;
        this.f7263b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f7264c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
