package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
public final class xoc extends va6 {
    public final Paint M;
    public final zoc N;

    public xoc(zoc zocVar, vnb vnbVar) {
        super(vnbVar);
        this.N = zocVar;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        zoc zocVar = this.N;
        RectF rectF = zocVar.f;
        if (zocVar.o0 != null) {
            canvas.saveLayer(rectF, null);
            zocVar.o0.c((hl.L(206.0f) - zocVar.o0.j()) / 2.0f, (rectF.bottom - hl.L(7.0f)) - zocVar.o0.h(), 1.0f, -1, canvas);
            Shader shader = this.x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.a.invalidate();
    }
}
