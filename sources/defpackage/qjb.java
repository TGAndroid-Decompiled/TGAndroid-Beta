package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class qjb extends Drawable {
    public final RectF a = new RectF();
    public final View b;
    public final View c;
    public final int d;
    public final Paint e;

    public qjb(View view, View view2, int i, Paint paint) {
        this.b = view;
        this.c = view2;
        this.d = i;
        this.e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        bkb.s(this.b, this.c, null);
        float f = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = bkb.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f, f, paint);
        if (bkb.b1()) {
            canvas.drawRoundRect(rectF, f, f, bkb.T0("paintChatActionBackgroundDarken"));
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
