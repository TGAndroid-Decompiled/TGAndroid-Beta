package fh;

import a8.ca;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import c8.o0;
import org.telegram.ui.ActionBar.j6;
public final class d extends ca {
    public NinePatchDrawable d;
    public long f11307e;
    public final g f11309g;
    public final dh.a f11304a = new Object();
    public final Paint f11305b = new Paint(1);
    public final Rect f11306c = new Rect();
    public final Bitmap[] f11308f = new Bitmap[1];

    public d(g gVar) {
        this.f11309g = gVar;
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        int i7;
        ui.a v = g.v(aVar);
        g gVar = this.f11309g;
        if (Color.alpha(gVar.f11356y) != 255 && (v instanceof ui.c)) {
            i7 = ((ui.c) v).f58431b;
        } else {
            i7 = 0;
        }
        c(canvas, i0.a.k(gVar.f11356y, i7));
    }

    public final void c(Canvas canvas, int i7) {
        long j3;
        int i10;
        g gVar = this.f11309g;
        f fVar = gVar.R;
        if (Color.alpha(i7) == 0 && Color.alpha(gVar.f11355x) == 0) {
            return;
        }
        if (fVar.e()) {
            float f10 = gVar.f56097c / 255.0f;
            int r12 = j6.r1(f10, i7);
            Paint paint = this.f11305b;
            paint.setColor(r12);
            int r13 = j6.r1(f10 * gVar.W, gVar.f11355x);
            if (Color.alpha(r13) != 0) {
                paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r13);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(fVar.f11327k, paint);
            return;
        }
        dh.a aVar = this.f11304a;
        aVar.f8091b = 0L;
        aVar.f8090a = false;
        aVar.a(i7);
        aVar.a(gVar.f11355x);
        for (float f11 : fVar.f11320b) {
            aVar.c(f11);
        }
        aVar.c(gVar.U);
        aVar.c(0.0f);
        aVar.c(gVar.V);
        if (aVar.f8090a) {
            j3 = -1;
        } else {
            j3 = aVar.f8091b;
        }
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.f11306c;
        if (ninePatchDrawable == null || this.f11307e != j3) {
            this.f11307e = j3;
            if (Color.alpha(i7) == 255) {
                i10 = i7;
            } else {
                i10 = 1;
            }
            NinePatchDrawable b10 = o0.b(this.f11308f, i7, fVar.f11320b, gVar.U, gVar.f11355x, gVar.V, i10);
            this.d = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = fVar.f11329m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(gVar.f56097c);
        ninePatchDrawable2.draw(canvas);
    }
}
