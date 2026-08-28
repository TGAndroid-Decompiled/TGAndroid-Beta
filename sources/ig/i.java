package ig;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class i extends Drawable {
    public lg.a f11189a;
    public int f11190b;
    public int f11191c;
    public int f11193f;
    public boolean f11196j;
    public float f11197k;
    public float d = 1.0f;
    public final RectF f11192e = new RectF();
    public final Paint f11194g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f11195i = new Paint(1);

    public final void a(lg.a aVar) {
        this.f11189a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f11195i.setStyle(style);
        b();
    }

    public final void b() {
        lg.a aVar = this.f11189a;
        if (aVar == null) {
            return;
        }
        this.f11190b = f6.l1(this.d, aVar.e());
        this.f11191c = f6.l1(this.d, this.f11189a.g());
        int i9 = this.f11190b;
        Paint paint = this.h;
        paint.setColor(i9);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i10 = this.f11191c;
        Paint paint2 = this.f11195i;
        paint2.setColor(i10);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f11193f;
        RectF rectF = this.f11192e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f11196j) {
            rectF.set(getBounds());
            min = this.f11197k;
        }
        float f10 = min;
        Paint paint = this.f11194g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f10, paint);
        }
        if (this.f11190b != 0) {
            canvas2 = canvas;
            kg.d.f(canvas2, rectF, f10, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f11191c != 0) {
            kg.d.f(canvas2, rectF, f10, AndroidUtilities.dpf2(0.6666667f), false, this.f11195i);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.d = i9 / 255.0f;
        b();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
