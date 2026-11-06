package fh;

import a8.aa;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import c8.n0;
import org.telegram.ui.ActionBar.k6;
public final class d extends aa {
    public NinePatchDrawable d;
    public long f11493e;
    public final g f11495g;
    public final dh.a f11490a = new Object();
    public final Paint f11491b = new Paint(1);
    public final Rect f11492c = new Rect();
    public final Bitmap[] f11494f = new Bitmap[1];

    public d(g gVar) {
        this.f11495g = gVar;
    }

    @Override
    public final void b(Canvas canvas, ri.a aVar) {
        int i7;
        ri.a v = g.v(aVar);
        g gVar = this.f11495g;
        if (Color.alpha(gVar.f11541y) != 255 && (v instanceof ri.c)) {
            i7 = ((ri.c) v).f54447b;
        } else {
            i7 = 0;
        }
        c(canvas, i0.a.k(gVar.f11541y, i7));
    }

    public final void c(Canvas canvas, int i7) {
        long j3;
        int i10;
        g gVar = this.f11495g;
        f fVar = gVar.Q;
        if (Color.alpha(i7) == 0 && Color.alpha(gVar.f11540x) == 0) {
            return;
        }
        if (fVar.e()) {
            float f10 = gVar.f21073c / 255.0f;
            int r12 = k6.r1(f10, i7);
            Paint paint = this.f11491b;
            paint.setColor(r12);
            int r13 = k6.r1(f10 * gVar.V, gVar.f11540x);
            if (Color.alpha(r13) != 0) {
                paint.setShadowLayer(gVar.T, 0.0f, gVar.U, r13);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(fVar.f11513k, paint);
            return;
        }
        dh.a aVar = this.f11490a;
        aVar.f8701b = 0L;
        aVar.f8700a = false;
        aVar.a(i7);
        aVar.a(gVar.f11540x);
        for (float f11 : fVar.f11506b) {
            aVar.c(f11);
        }
        aVar.c(gVar.T);
        aVar.c(0.0f);
        aVar.c(gVar.U);
        if (aVar.f8700a) {
            j3 = -1;
        } else {
            j3 = aVar.f8701b;
        }
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.f11492c;
        if (ninePatchDrawable == null || this.f11493e != j3) {
            this.f11493e = j3;
            if (Color.alpha(i7) == 255) {
                i10 = i7;
            } else {
                i10 = 1;
            }
            NinePatchDrawable b10 = n0.b(this.f11494f, i7, fVar.f11506b, gVar.T, gVar.f11540x, gVar.U, i10);
            this.d = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = fVar.f11515m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(gVar.f21073c);
        ninePatchDrawable2.draw(canvas);
    }
}
