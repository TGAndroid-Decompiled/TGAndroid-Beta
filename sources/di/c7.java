package di;

import android.graphics.PointF;
public final class c7 {
    public final String f6708a;
    public final PointF[] f6709b;
    public final float f6710c;
    public final float d;

    public c7(String str, PointF[] pointFArr) {
        this.f6708a = str;
        this.f6709b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f6710c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
