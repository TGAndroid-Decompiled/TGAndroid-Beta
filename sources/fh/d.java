package fh;

import a8.ea;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import c8.q0;
import org.telegram.ui.ActionBar.m6;
public final class d extends ea {
    public NinePatchDrawable d;
    public long f11656e;
    public final g f11658g;
    public final dh.a f11653a = new Object();
    public final Paint f11654b = new Paint(1);
    public final Rect f11655c = new Rect();
    public final Bitmap[] f11657f = new Bitmap[1];

    public d(g gVar) {
        this.f11658g = gVar;
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        int i7;
        ui.a v = g.v(aVar);
        g gVar = this.f11658g;
        if (Color.alpha(gVar.f11705y) != 255 && (v instanceof ui.c)) {
            i7 = ((ui.c) v).f59041b;
        } else {
            i7 = 0;
        }
        c(canvas, i0.a.k(gVar.f11705y, i7));
    }

    public final void c(Canvas canvas, int i7) {
        long j3;
        int i10;
        g gVar = this.f11658g;
        f fVar = gVar.R;
        if (Color.alpha(i7) == 0 && Color.alpha(gVar.f11704x) == 0) {
            return;
        }
        if (fVar.e()) {
            float f10 = gVar.f56716c / 255.0f;
            int r12 = m6.r1(f10, i7);
            Paint paint = this.f11654b;
            paint.setColor(r12);
            int r13 = m6.r1(f10 * gVar.W, gVar.f11704x);
            if (Color.alpha(r13) != 0) {
                paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r13);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(fVar.f11676k, paint);
            return;
        }
        dh.a aVar = this.f11653a;
        aVar.f8402b = 0L;
        aVar.f8401a = false;
        aVar.a(i7);
        aVar.a(gVar.f11704x);
        for (float f11 : fVar.f11669b) {
            aVar.c(f11);
        }
        aVar.c(gVar.U);
        aVar.c(0.0f);
        aVar.c(gVar.V);
        if (aVar.f8401a) {
            j3 = -1;
        } else {
            j3 = aVar.f8402b;
        }
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.f11655c;
        if (ninePatchDrawable == null || this.f11656e != j3) {
            this.f11656e = j3;
            if (Color.alpha(i7) == 255) {
                i10 = i7;
            } else {
                i10 = 1;
            }
            NinePatchDrawable b10 = q0.b(this.f11657f, i7, fVar.f11669b, gVar.U, gVar.f11704x, gVar.V, i10);
            this.d = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = fVar.f11678m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(gVar.f56716c);
        ninePatchDrawable2.draw(canvas);
    }
}
