package fh;

import a8.ea;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import c8.q0;
import org.telegram.ui.ActionBar.n6;
public final class d extends ea {
    public NinePatchDrawable d;
    public long f11624e;
    public final g f11626g;
    public final dh.a f11621a = new Object();
    public final Paint f11622b = new Paint(1);
    public final Rect f11623c = new Rect();
    public final Bitmap[] f11625f = new Bitmap[1];

    public d(g gVar) {
        this.f11626g = gVar;
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        int i7;
        ui.a v = g.v(aVar);
        g gVar = this.f11626g;
        if (Color.alpha(gVar.f11673y) != 255 && (v instanceof ui.c)) {
            i7 = ((ui.c) v).f58999b;
        } else {
            i7 = 0;
        }
        c(canvas, i0.a.k(gVar.f11673y, i7));
    }

    public final void c(Canvas canvas, int i7) {
        long j3;
        int i10;
        g gVar = this.f11626g;
        f fVar = gVar.R;
        if (Color.alpha(i7) == 0 && Color.alpha(gVar.f11672x) == 0) {
            return;
        }
        if (fVar.e()) {
            float f10 = gVar.f56671c / 255.0f;
            int r12 = n6.r1(f10, i7);
            Paint paint = this.f11622b;
            paint.setColor(r12);
            int r13 = n6.r1(f10 * gVar.W, gVar.f11672x);
            if (Color.alpha(r13) != 0) {
                paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r13);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(fVar.f11644k, paint);
            return;
        }
        dh.a aVar = this.f11621a;
        aVar.f8370b = 0L;
        aVar.f8369a = false;
        aVar.a(i7);
        aVar.a(gVar.f11672x);
        for (float f11 : fVar.f11637b) {
            aVar.c(f11);
        }
        aVar.c(gVar.U);
        aVar.c(0.0f);
        aVar.c(gVar.V);
        if (aVar.f8369a) {
            j3 = -1;
        } else {
            j3 = aVar.f8370b;
        }
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.f11623c;
        if (ninePatchDrawable == null || this.f11624e != j3) {
            this.f11624e = j3;
            if (Color.alpha(i7) == 255) {
                i10 = i7;
            } else {
                i10 = 1;
            }
            NinePatchDrawable b10 = q0.b(this.f11625f, i7, fVar.f11637b, gVar.U, gVar.f11672x, gVar.V, i10);
            this.d = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = fVar.f11646m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(gVar.f56671c);
        ninePatchDrawable2.draw(canvas);
    }
}
