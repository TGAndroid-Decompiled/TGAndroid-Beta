package fh;

import a8.fa;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import c8.r0;
import org.telegram.ui.ActionBar.m6;
public final class d extends fa {
    public NinePatchDrawable d;
    public long f11619e;
    public final g f11621g;
    public final dh.a f11616a = new Object();
    public final Paint f11617b = new Paint(1);
    public final Rect f11618c = new Rect();
    public final Bitmap[] f11620f = new Bitmap[1];

    public d(g gVar) {
        this.f11621g = gVar;
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        int i7;
        ui.a v = g.v(aVar);
        g gVar = this.f11621g;
        if (Color.alpha(gVar.f11668y) != 255 && (v instanceof ui.c)) {
            i7 = ((ui.c) v).f59006b;
        } else {
            i7 = 0;
        }
        c(canvas, i0.a.k(gVar.f11668y, i7));
    }

    public final void c(Canvas canvas, int i7) {
        long j3;
        int i10;
        g gVar = this.f11621g;
        f fVar = gVar.R;
        if (Color.alpha(i7) == 0 && Color.alpha(gVar.f11667x) == 0) {
            return;
        }
        if (fVar.e()) {
            float f10 = gVar.f56681c / 255.0f;
            int r12 = m6.r1(f10, i7);
            Paint paint = this.f11617b;
            paint.setColor(r12);
            int r13 = m6.r1(f10 * gVar.W, gVar.f11667x);
            if (Color.alpha(r13) != 0) {
                paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r13);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(fVar.f11639k, paint);
            return;
        }
        dh.a aVar = this.f11616a;
        aVar.f8365b = 0L;
        aVar.f8364a = false;
        aVar.a(i7);
        aVar.a(gVar.f11667x);
        for (float f11 : fVar.f11632b) {
            aVar.c(f11);
        }
        aVar.c(gVar.U);
        aVar.c(0.0f);
        aVar.c(gVar.V);
        if (aVar.f8364a) {
            j3 = -1;
        } else {
            j3 = aVar.f8365b;
        }
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.f11618c;
        if (ninePatchDrawable == null || this.f11619e != j3) {
            this.f11619e = j3;
            if (Color.alpha(i7) == 255) {
                i10 = i7;
            } else {
                i10 = 1;
            }
            NinePatchDrawable b10 = r0.b(this.f11620f, i7, fVar.f11632b, gVar.U, gVar.f11667x, gVar.V, i10);
            this.d = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = fVar.f11641m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(gVar.f56681c);
        ninePatchDrawable2.draw(canvas);
    }
}
