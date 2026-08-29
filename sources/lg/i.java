package lg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class i extends Drawable {
    public og.a f15282a;
    public int f15283b;
    public int f15284c;
    public int f15286f;
    public boolean f15289j;
    public float f15290k;
    public float d = 1.0f;
    public final RectF f15285e = new RectF();
    public final Paint f15287g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f15288i = new Paint(1);

    public final void a(og.a aVar) {
        this.f15282a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f15288i.setStyle(style);
        b();
    }

    public final void b() {
        og.a aVar = this.f15282a;
        if (aVar == null) {
            return;
        }
        this.f15283b = g6.l1(this.d, aVar.h());
        this.f15284c = g6.l1(this.d, this.f15282a.m());
        int i10 = this.f15283b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f15284c;
        Paint paint2 = this.f15288i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f15286f;
        RectF rectF = this.f15285e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f15289j) {
            rectF.set(getBounds());
            min = this.f15290k;
        }
        float f9 = min;
        Paint paint = this.f15287g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f9, paint);
        }
        if (this.f15283b != 0) {
            canvas2 = canvas;
            ng.d.f(canvas2, rectF, f9, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f15284c != 0) {
            ng.d.f(canvas2, rectF, f9, AndroidUtilities.dpf2(0.6666667f), false, this.f15288i);
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
