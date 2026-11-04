package gh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import b8.ld;
import b8.mc;
import org.telegram.ui.ActionBar.k6;
public final class d extends mc {
    public NinePatchDrawable d;
    public long f12287e;
    public final g f12289g;
    public final eh.a f12284a = new Object();
    public final Paint f12285b = new Paint(1);
    public final Rect f12286c = new Rect();
    public final Bitmap[] f12288f = new Bitmap[1];

    public d(g gVar) {
        this.f12289g = gVar;
    }

    @Override
    public final void b(Canvas canvas, si.a aVar) {
        int i3;
        si.a v = g.v(aVar);
        g gVar = this.f12289g;
        if (Color.alpha(gVar.f12336y) != 255 && (v instanceof si.c)) {
            i3 = ((si.c) v).f54747b;
        } else {
            i3 = 0;
        }
        c(canvas, i0.a.k(gVar.f12336y, i3));
    }

    public final void c(Canvas canvas, int i3) {
        long j10;
        int i10;
        g gVar = this.f12289g;
        f fVar = gVar.R;
        if (Color.alpha(i3) == 0 && Color.alpha(gVar.f12335x) == 0) {
            return;
        }
        if (fVar.e()) {
            float f10 = gVar.f53579c / 255.0f;
            int r12 = k6.r1(f10, i3);
            Paint paint = this.f12285b;
            paint.setColor(r12);
            int r13 = k6.r1(f10 * gVar.W, gVar.f12335x);
            if (Color.alpha(r13) != 0) {
                paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r13);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(fVar.f12307k, paint);
            return;
        }
        eh.a aVar = this.f12284a;
        aVar.f9979b = 0L;
        aVar.f9978a = false;
        aVar.a(i3);
        aVar.a(gVar.f12335x);
        for (float f11 : fVar.f12300b) {
            aVar.c(f11);
        }
        aVar.c(gVar.U);
        aVar.c(0.0f);
        aVar.c(gVar.V);
        if (aVar.f9978a) {
            j10 = -1;
        } else {
            j10 = aVar.f9979b;
        }
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.f12286c;
        if (ninePatchDrawable == null || this.f12287e != j10) {
            this.f12287e = j10;
            if (Color.alpha(i3) == 255) {
                i10 = i3;
            } else {
                i10 = 1;
            }
            NinePatchDrawable b10 = ld.b(this.f12288f, i3, fVar.f12300b, gVar.U, gVar.f12335x, gVar.V, i10);
            this.d = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = fVar.f12309m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(gVar.f53579c);
        ninePatchDrawable2.draw(canvas);
    }
}
