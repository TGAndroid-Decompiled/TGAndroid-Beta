package ng;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class i extends Drawable {
    public qg.a f15023a;
    public int f15024b;
    public int f15025c;
    public int f15026f;
    public boolean f15029j;
    public float f15030k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f15027g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f15028i = new Paint(1);

    public final void a(qg.a aVar) {
        this.f15023a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f15028i.setStyle(style);
        b();
    }

    public final void b() {
        qg.a aVar = this.f15023a;
        if (aVar == null) {
            return;
        }
        this.f15024b = j6.l1(this.d, aVar.x0());
        this.f15025c = j6.l1(this.d, this.f15023a.X0());
        int i10 = this.f15024b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f15025c;
        Paint paint2 = this.f15028i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f15026f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f15029j) {
            rectF.set(getBounds());
            min = this.f15030k;
        }
        float f10 = min;
        Paint paint = this.f15027g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f10, paint);
        }
        if (this.f15024b != 0) {
            canvas2 = canvas;
            pg.b.f(canvas2, rectF, f10, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f15025c != 0) {
            pg.b.f(canvas2, rectF, f10, AndroidUtilities.dpf2(0.6666667f), false, this.f15028i);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        b();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
