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
    public rg.a f16812a;
    public int f16813b;
    public int f16814c;
    public int f16816f;
    public boolean f16819j;
    public float f16820k;
    public float d = 1.0f;
    public final RectF f16815e = new RectF();
    public final Paint f16817g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f16818i = new Paint(1);

    public final void a(rg.a aVar) {
        this.f16812a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f16818i.setStyle(style);
        b();
    }

    public final void b() {
        rg.a aVar = this.f16812a;
        if (aVar == null) {
            return;
        }
        this.f16813b = k6.l1(this.d, aVar.k());
        this.f16814c = k6.l1(this.d, this.f16812a.x());
        int i10 = this.f16813b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f16814c;
        Paint paint2 = this.f16818i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f16816f;
        RectF rectF = this.f16815e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f16819j) {
            rectF.set(getBounds());
            min = this.f16820k;
        }
        float f10 = min;
        Paint paint = this.f16817g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f10, paint);
        }
        if (this.f16813b != 0) {
            canvas2 = canvas;
            qg.b.f(canvas2, rectF, f10, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f16814c != 0) {
            qg.b.f(canvas2, rectF, f10, AndroidUtilities.dpf2(0.6666667f), false, this.f16818i);
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
