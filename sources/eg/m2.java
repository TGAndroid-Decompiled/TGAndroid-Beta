package eg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class m2 {
    public float f5357a;
    public float f5358b;
    public float f5359c;
    public float d;
    public long e;
    public float f5360f;
    public final n2 f5361g;

    public m2(n2 n2Var) {
        this.f5361g = n2Var;
    }

    public final void a(long j10, boolean z4) {
        RectF rectF;
        n2 n2Var = this.f5361g;
        RectF rectF2 = n2Var.f5373a;
        this.e = j10 + n2Var.h + Utilities.fastRandom.nextInt(1000);
        if (z4) {
            rectF = n2Var.f5374b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f5357a = abs;
        this.f5358b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f5358b - rectF2.centerY());
        this.f5359c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f5360f = 0.0f;
    }
}
