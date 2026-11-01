package fi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import v7.i7;
public final class c extends i7 {
    public final RenderNode f7109a = w.k();
    public final Paint f7110b = new Paint(1);
    public final g f7111c;

    public c(g gVar) {
        this.f7111c = gVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f7;
        g gVar = this.f7111c;
        if (!gVar.f7130x && this.f7109a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i10 = gVar.f7131y;
        if (i10 != 1 && i10 != 4) {
            f7 = width;
        } else {
            f7 = height;
        }
        float f10 = f7;
        h hVar = gVar.F;
        hVar.getClass();
        LinearGradient k10 = g.k(gVar, hVar, f10, 0, gVar.J, 1);
        Paint paint = this.f7110b;
        paint.setShader(k10);
        this.f7109a.setPosition(0, 0, width, height);
        this.f7109a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f7109a.endRecording();
        paint.setShader(null);
        gVar.f7130x = false;
    }

    @Override
    public final void b() {
        this.f7109a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f7109a);
    }

    @Override
    public final boolean d() {
        return this.f7109a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f7109a.setAlpha(f7);
    }
}
