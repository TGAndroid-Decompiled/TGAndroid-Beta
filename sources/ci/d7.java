package ci;

import android.graphics.PointF;
public final class d7 {
    public final String f4524a;
    public final PointF[] f4525b;
    public final float f4526c;
    public final float d;

    public d7(String str, PointF[] pointFArr) {
        this.f4524a = str;
        this.f4525b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f4526c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
