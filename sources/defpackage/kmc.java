package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
public final class kmc extends qa6 {
    public final Paint M;
    public final mmc N;

    public kmc(mmc mmcVar, ylb ylbVar) {
        super(ylbVar);
        this.N = mmcVar;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        mmc mmcVar = this.N;
        RectF rectF = mmcVar.f;
        if (mmcVar.o0 != null) {
            canvas.saveLayer(rectF, null);
            mmcVar.o0.c((gm.L(206.0f) - mmcVar.o0.j()) / 2.0f, (rectF.bottom - gm.L(7.0f)) - mmcVar.o0.h(), 1.0f, -1, canvas);
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
