package ag;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;

public final class g3 {

    public float f400a;

    public float f401b;

    public float f402c;
    public float d;

    public long f403e;

    public float f404f;

    public final h3 f405g;

    public g3(h3 h3Var) {
        this.f405g = h3Var;
    }

    public final void a(long j10, boolean z10) {
        h3 h3Var = this.f405g;
        RectF rectF = h3Var.f418a;
        this.f403e = j10 + h3Var.h + ((long) Utilities.fastRandom.nextInt(1000));
        RectF rectF2 = z10 ? h3Var.f419b : rectF;
        float fAbs = Math.abs(Utilities.fastRandom.nextInt() % rectF2.width()) + rectF2.left;
        float fAbs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF2.height()) + rectF2.top;
        this.f400a = fAbs;
        this.f401b = fAbs2;
        double dAtan2 = Math.atan2(fAbs - rectF.centerX(), this.f401b - rectF.centerY());
        this.f402c = (float) Math.sin(dAtan2);
        this.d = (float) Math.cos(dAtan2);
        Utilities.fastRandom.nextInt(50);
        this.f404f = 0.0f;
    }
}
