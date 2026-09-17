package ci;

import android.graphics.PointF;
public final class f7 {
    public final String f4662a;
    public final PointF[] f4663b;
    public final float f4664c;
    public final float d;

    public f7(String str, PointF[] pointFArr) {
        this.f4662a = str;
        this.f4663b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f4664c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
