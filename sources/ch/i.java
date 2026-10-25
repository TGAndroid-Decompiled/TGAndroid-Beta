package ch;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
public final class i extends Drawable {
    public fh.a f6351a;
    public int f6352b;
    public int f6353c;
    public int f6354f;
    public boolean f6358k;
    public float f6359l;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f6355g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f6356i = new Paint(1);
    public int f6357j = f7.f22626b;

    public final void a(fh.a aVar) {
        this.f6351a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f6356i.setStyle(style);
        b();
    }

    public final void b() {
        this.f6357j = f7.f22626b;
        fh.a aVar = this.f6351a;
        if (aVar == null) {
            return;
        }
        this.f6352b = y6.o1(this.d, aVar.t());
        this.f6353c = y6.o1(this.d, this.f6351a.A());
        int i10 = this.f6352b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f6353c;
        Paint paint2 = this.f6356i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        if (this.f6357j != f7.f22626b) {
            try {
                b();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f6354f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f6358k) {
            rectF.set(getBounds());
            min = this.f6359l;
        }
        float f7 = min;
        Paint paint = this.f6355g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f6352b != 0) {
            canvas2 = canvas;
            eh.d.p(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f6353c != 0) {
            eh.d.p(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f6356i);
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
