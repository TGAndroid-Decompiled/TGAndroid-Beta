package mi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import w7.z;
public final class b extends z {
    public final RenderNode f16437a = ah.f.n();
    public final Paint f16438b = new Paint(1);
    public final f f16439c;

    public b(f fVar) {
        this.f16439c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f7;
        f fVar = this.f16439c;
        if (!fVar.f16460k && this.f16437a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i10 = fVar.f16461l;
        if (i10 != 1 && i10 != 4) {
            f7 = width;
        } else {
            f7 = height;
        }
        float f10 = f7;
        g gVar = fVar.f16464o;
        gVar.getClass();
        LinearGradient m10 = f.m(fVar, gVar, f10, 0, fVar.f16468s, 1);
        Paint paint = this.f16438b;
        paint.setShader(m10);
        this.f16437a.setPosition(0, 0, width, height);
        this.f16437a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f16437a.endRecording();
        paint.setShader(null);
        fVar.f16460k = false;
    }

    @Override
    public final void b() {
        this.f16437a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f16437a);
    }

    @Override
    public final boolean d() {
        return this.f16437a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f16437a.setAlpha(f7);
    }
}
