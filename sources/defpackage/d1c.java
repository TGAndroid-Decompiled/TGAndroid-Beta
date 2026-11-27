package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class d1c extends Drawable {
    public final Drawable a;
    public final Paint b = new Paint(1);
    public final RectF c = new RectF();

    public d1c(Context context) {
        this.a = c00.e(context, 2131231908);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.b;
        canvas.drawRoundRect(this.c, hl.L(10.0f), hl.L(10.0f), paint);
        this.a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(rect);
        int centerX = rect.centerX() - hl.L(12.0f);
        int centerY = rect.centerY() - hl.L(12.0f);
        this.a.setBounds(centerX, centerY, hl.L(24.0f) + centerX, hl.L(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.a.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
