package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
public final class fm0 extends pqd {
    public NinePatchDrawable d;
    public long e;
    public final im0 g;
    public final ucb a = new Object();
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Bitmap[] f = new Bitmap[1];

    public fm0(im0 im0Var) {
        this.g = im0Var;
    }

    @Override
    public final void b(Canvas canvas, iz4 iz4Var) {
        int i;
        iz4 v = im0.v(iz4Var);
        im0 im0Var = this.g;
        if (Color.alpha(im0Var.y) != 255 && (v instanceof kz4)) {
            i = ((kz4) v).b;
        } else {
            i = 0;
        }
        c(canvas, on2.l(im0Var.y, i));
    }

    public final void c(Canvas canvas, int i) {
        long j;
        int i2;
        im0 im0Var = this.g;
        hm0 hm0Var = im0Var.S;
        if (Color.alpha(i) == 0 && Color.alpha(im0Var.x) == 0) {
            return;
        }
        if (hm0Var.e()) {
            float f = im0Var.c / 255.0f;
            int p1 = cmb.p1(f, i);
            Paint paint = this.b;
            paint.setColor(p1);
            int p12 = cmb.p1(f * im0Var.X, im0Var.x);
            if (Color.alpha(p12) != 0) {
                paint.setShadowLayer(im0Var.V, 0.0f, im0Var.W, p12);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(hm0Var.k, paint);
            return;
        }
        ucb ucbVar = this.a;
        ucbVar.a = 0L;
        ucbVar.b = false;
        ucbVar.a(i);
        ucbVar.a(im0Var.x);
        for (float f2 : hm0Var.b) {
            ucbVar.c(f2);
        }
        ucbVar.c(im0Var.V);
        ucbVar.c(0.0f);
        ucbVar.c(im0Var.W);
        if (ucbVar.b) {
            j = -1;
        } else {
            j = ucbVar.a;
        }
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.c;
        if (ninePatchDrawable == null || this.e != j) {
            this.e = j;
            if (Color.alpha(i) == 255) {
                i2 = i;
            } else {
                i2 = 1;
            }
            NinePatchDrawable b = ure.b(this.f, i, hm0Var.b, im0Var.V, im0Var.x, im0Var.W, i2);
            this.d = b;
            b.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = hm0Var.m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(im0Var.c);
        ninePatchDrawable2.draw(canvas);
    }
}
