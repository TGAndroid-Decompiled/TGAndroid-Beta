package mi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import w7.z;
public final class b extends z {
    public final RenderNode f16447a = ah.f.n();
    public final Paint f16448b = new Paint(1);
    public final f f16449c;

    public b(f fVar) {
        this.f16449c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f7;
        f fVar = this.f16449c;
        if (!fVar.f16470k && this.f16447a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i10 = fVar.f16471l;
        if (i10 != 1 && i10 != 4) {
            f7 = width;
        } else {
            f7 = height;
        }
        float f10 = f7;
        g gVar = fVar.f16474o;
        gVar.getClass();
        LinearGradient m10 = f.m(fVar, gVar, f10, 0, fVar.f16478s, 1);
        Paint paint = this.f16448b;
        paint.setShader(m10);
        this.f16447a.setPosition(0, 0, width, height);
        this.f16447a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f16447a.endRecording();
        paint.setShader(null);
        fVar.f16470k = false;
    }

    @Override
    public final void b() {
        this.f16447a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f16447a);
    }

    @Override
    public final boolean d() {
        return this.f16447a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f16447a.setAlpha(f7);
    }
}
