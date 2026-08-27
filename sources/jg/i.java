package jg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

public final class i extends Drawable {

    public mg.a f13001a;

    public int f13002b;

    public int f13003c;

    public int f13005f;

    public boolean f13008j;

    public float f13009k;
    public float d = 1.0f;

    public final RectF f13004e = new RectF();

    public final Paint f13006g = new Paint(1);
    public final Paint h = new Paint(1);

    public final Paint f13007i = new Paint(1);

    public final void a(mg.a aVar) {
        this.f13001a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f13007i.setStyle(style);
        b();
    }

    public final void b() {
        mg.a aVar = this.f13001a;
        if (aVar == null) {
            return;
        }
        this.f13002b = g6.l1(this.d, aVar.h0());
        this.f13003c = g6.l1(this.d, this.f13001a.K0());
        int i10 = this.f13002b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f13003c;
        Paint paint2 = this.f13007i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        float fMin = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f13005f;
        RectF rectF = this.f13004e;
        rectF.set(fCenterX - fMin, fCenterY - fMin, fCenterX + fMin, fCenterY + fMin);
        if (this.f13008j) {
            rectF.set(getBounds());
            fMin = this.f13009k;
        }
        float f10 = fMin;
        Paint paint = this.f13006g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(fCenterX, fCenterY, f10, paint);
        }
        if (this.f13002b != 0) {
            canvas2 = canvas;
            lg.d.f(canvas2, rectF, f10, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f13003c != 0) {
            lg.d.f(canvas2, rectF, f10, AndroidUtilities.dpf2(0.6666667f), false, this.f13007i);
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
