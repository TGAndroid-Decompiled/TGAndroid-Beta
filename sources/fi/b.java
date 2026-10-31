package fi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import v7.i7;
public final class b extends i7 {
    public final RenderNode f7108a = w.k();
    public final Paint f7109b = new Paint(1);
    public final f f7110c;

    public b(f fVar) {
        this.f7110c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f7;
        f fVar = this.f7110c;
        if (!fVar.f7129x && this.f7108a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i10 = fVar.f7130y;
        if (i10 != 1 && i10 != 4) {
            f7 = width;
        } else {
            f7 = height;
        }
        float f10 = f7;
        g gVar = fVar.F;
        gVar.getClass();
        LinearGradient l4 = f.l(fVar, gVar, f10, 0, fVar.J, 1);
        Paint paint = this.f7109b;
        paint.setShader(l4);
        this.f7108a.setPosition(0, 0, width, height);
        this.f7108a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f7108a.endRecording();
        paint.setShader(null);
        fVar.f7129x = false;
    }

    @Override
    public final void b() {
        this.f7108a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f7108a);
    }

    @Override
    public final boolean d() {
        return this.f7108a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f7108a.setAlpha(f7);
    }
}
