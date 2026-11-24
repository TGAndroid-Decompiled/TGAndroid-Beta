package defpackage;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class cba {
    public final ud a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;

    public cba(View view) {
        ud udVar = new ud(view, (byte) 5);
        this.b = System.currentTimeMillis();
        this.a = udVar;
        z0d z0dVar = Utilities.c;
        this.c = gm.R1(5.0f, 9.0f, Utilities.l(z0dVar.nextFloat()));
        this.d = gm.R1(2.5f, 5.0f, Utilities.l(z0dVar.nextFloat()));
        this.e = gm.R1(2.5f, 5.2f, Utilities.l(z0dVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f) {
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * gm.L(0.5f) * f, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * gm.L(0.5f) * f);
        canvas.translate(-0.0f, -0.0f);
        if (f > 0.0f) {
            this.a.run();
        }
    }
}
