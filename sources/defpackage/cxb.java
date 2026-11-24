package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class cxb extends Drawable {
    public final Drawable a;
    public final Paint b = new Paint(1);
    public final RectF c = new RectF();

    public cxb(Context context) {
        this.a = b00.d(context, 2131231908);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.b;
        canvas.drawRoundRect(this.c, gl.L(10.0f), gl.L(10.0f), paint);
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
        int centerX = rect.centerX() - gl.L(12.0f);
        int centerY = rect.centerY() - gl.L(12.0f);
        this.a.setBounds(centerX, centerY, gl.L(24.0f) + centerX, gl.L(24.0f) + centerY);
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
