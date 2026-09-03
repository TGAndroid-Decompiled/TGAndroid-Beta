package eg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class m2 {
    public float f5346a;
    public float f5347b;
    public float f5348c;
    public float d;
    public long e;
    public float f5349f;
    public final n2 f5350g;

    public m2(n2 n2Var) {
        this.f5350g = n2Var;
    }

    public final void a(long j10, boolean z4) {
        RectF rectF;
        n2 n2Var = this.f5350g;
        RectF rectF2 = n2Var.f5362a;
        this.e = j10 + n2Var.h + Utilities.fastRandom.nextInt(1000);
        if (z4) {
            rectF = n2Var.f5363b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f5346a = abs;
        this.f5347b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f5347b - rectF2.centerY());
        this.f5348c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f5349f = 0.0f;
    }
}
