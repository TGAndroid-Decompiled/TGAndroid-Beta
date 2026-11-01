package kg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class c2 {
    public float f11019a;
    public float f11020b;
    public float f11021c;
    public float d;
    public long e;
    public float f11022f;
    public final d2 f11023g;

    public c2(d2 d2Var) {
        this.f11023g = d2Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        d2 d2Var = this.f11023g;
        RectF rectF2 = d2Var.f11034a;
        long j11 = j10 + d2Var.h;
        d5.a aVar = Utilities.f14521c;
        this.e = j11 + aVar.nextInt(1000);
        if (z10) {
            rectF = d2Var.f11035b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f11019a = abs;
        this.f11020b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f11020b - rectF2.centerY());
        this.f11021c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f11022f = 0.0f;
    }
}
