package ci;

import android.graphics.PointF;
public final class f7 {
    public final String f4659a;
    public final PointF[] f4660b;
    public final float f4661c;
    public final float d;

    public f7(String str, PointF[] pointFArr) {
        this.f4659a = str;
        this.f4660b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f4661c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
