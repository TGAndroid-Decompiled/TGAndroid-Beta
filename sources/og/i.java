package og;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
public final class i extends Drawable {
    public rg.a f16814a;
    public int f16815b;
    public int f16816c;
    public int f16818f;
    public boolean f16821j;
    public float f16822k;
    public float d = 1.0f;
    public final RectF f16817e = new RectF();
    public final Paint f16819g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f16820i = new Paint(1);

    public final void a(rg.a aVar) {
        this.f16814a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f16820i.setStyle(style);
        b();
    }

    public final void b() {
        rg.a aVar = this.f16814a;
        if (aVar == null) {
            return;
        }
        this.f16815b = k6.l1(this.d, aVar.k());
        this.f16816c = k6.l1(this.d, this.f16814a.x());
        int i10 = this.f16815b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f16816c;
        Paint paint2 = this.f16820i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f16818f;
        RectF rectF = this.f16817e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f16821j) {
            rectF.set(getBounds());
            min = this.f16822k;
        }
        float f10 = min;
        Paint paint = this.f16819g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f10, paint);
        }
        if (this.f16815b != 0) {
            canvas2 = canvas;
            qg.b.f(canvas2, rectF, f10, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f16816c != 0) {
            qg.b.f(canvas2, rectF, f10, AndroidUtilities.dpf2(0.6666667f), false, this.f16820i);
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
