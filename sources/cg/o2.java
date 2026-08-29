package cg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class o2 {
    public float f3245a;
    public float f3246b;
    public float f3247c;
    public float d;
    public long f3248e;
    public float f3249f;
    public final p2 f3250g;

    public o2(p2 p2Var) {
        this.f3250g = p2Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        p2 p2Var = this.f3250g;
        RectF rectF2 = p2Var.f3273a;
        this.f3248e = j10 + p2Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = p2Var.f3274b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f9 = rectF.top;
        this.f3245a = abs;
        this.f3246b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f9;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f3246b - rectF2.centerY());
        this.f3247c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f3249f = 0.0f;
    }
}
