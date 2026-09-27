package ci;

import android.graphics.PointF;
public final class d7 {
    public final String f4544a;
    public final PointF[] f4545b;
    public final float f4546c;
    public final float d;

    public d7(String str, PointF[] pointFArr) {
        this.f4544a = str;
        this.f4545b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f4546c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
