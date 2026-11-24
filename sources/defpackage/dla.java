package defpackage;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class dla {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final ela g;

    public dla(ela elaVar) {
        this.g = elaVar;
    }

    public final void a(long j, boolean z) {
        RectF rectF;
        ela elaVar = this.g;
        RectF rectF2 = elaVar.a;
        yyc yycVar = Utilities.c;
        this.e = j + 2000 + yycVar.nextInt(1000);
        if (z) {
            rectF = elaVar.b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) yycVar.nextLong()) % rectF.width()) + rectF.left;
        float f = rectF.top;
        this.a = abs;
        this.b = Math.abs(((int) yycVar.nextLong()) % rectF.height()) + f;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.b - rectF2.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        yycVar.nextInt(50);
        this.f = 0.0f;
    }
}
