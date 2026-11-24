package defpackage;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class ena {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final fna g;

    public ena(fna fnaVar) {
        this.g = fnaVar;
    }

    public final void a(long j, boolean z) {
        RectF rectF;
        fna fnaVar = this.g;
        RectF rectF2 = fnaVar.a;
        z0d z0dVar = Utilities.c;
        this.e = j + 2000 + z0dVar.nextInt(1000);
        if (z) {
            rectF = fnaVar.b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) z0dVar.nextLong()) % rectF.width()) + rectF.left;
        float f = rectF.top;
        this.a = abs;
        this.b = Math.abs(((int) z0dVar.nextLong()) % rectF.height()) + f;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.b - rectF2.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        z0dVar.nextInt(50);
        this.f = 0.0f;
    }
}
