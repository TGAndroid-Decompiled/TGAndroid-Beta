package defpackage;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class apa {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final bpa g;

    public apa(bpa bpaVar) {
        this.g = bpaVar;
    }

    public final void a(long j, boolean z) {
        RectF rectF;
        bpa bpaVar = this.g;
        RectF rectF2 = bpaVar.a;
        o3d o3dVar = Utilities.c;
        this.e = j + 2000 + o3dVar.nextInt(1000);
        if (z) {
            rectF = bpaVar.b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) o3dVar.nextLong()) % rectF.width()) + rectF.left;
        float f = rectF.top;
        this.a = abs;
        this.b = Math.abs(((int) o3dVar.nextLong()) % rectF.height()) + f;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.b - rectF2.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        o3dVar.nextInt(50);
        this.f = 0.0f;
    }
}
