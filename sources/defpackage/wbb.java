package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
public final class wbb extends Drawable {
    public bm0 a;
    public int b;
    public int c;
    public int f;
    public dz4 j;
    public boolean l;
    public float m;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint g = new Paint(1);
    public final gz4 h = new gz4();
    public final float[] i = new float[8];
    public int k = anb.b;

    public final void a() {
        this.k = anb.b;
        bm0 bm0Var = this.a;
        if (bm0Var == null) {
            return;
        }
        this.b = cmb.p1(this.d, bm0Var.V());
        this.c = cmb.p1(this.d, this.a.u0());
        this.j = new dz4(gm.N(1.0f), this.b, gm.N(0.6666667f), this.c, 0.0f, 0, 1.0f, 1.0f, 1.0f, 0.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.k != anb.b) {
            try {
                a();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.l) {
            rectF.set(getBounds());
            min = this.m;
        }
        Paint paint = this.g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.j != null) {
            Arrays.fill(this.i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.i, this.j, 1.0f);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.d = i / 255.0f;
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
