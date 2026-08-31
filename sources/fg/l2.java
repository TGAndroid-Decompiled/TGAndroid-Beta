package fg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class l2 {
    public float f6381a;
    public float f6382b;
    public float f6383c;
    public float d;
    public long f6384e;
    public float f6385f;
    public final m2 f6386g;

    public l2(m2 m2Var) {
        this.f6386g = m2Var;
    }

    public final void a(long j10, boolean z4) {
        RectF rectF;
        m2 m2Var = this.f6386g;
        RectF rectF2 = m2Var.f6396a;
        this.f6384e = j10 + m2Var.h + Utilities.fastRandom.nextInt(1000);
        if (z4) {
            rectF = m2Var.f6397b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f6381a = abs;
        this.f6382b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f6382b - rectF2.centerY());
        this.f6383c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f6385f = 0.0f;
    }
}
