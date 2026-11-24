package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class o96 extends View {
    public final Drawable a;
    public final Paint b;
    public final Paint c;
    public final ln d;
    public boolean e;

    public o96(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = new ln(this, 0L, 320L, d53.h);
        rve.a(this);
        this.a = context.getResources().getDrawable(2131231752).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    public final void a(boolean z, boolean z2) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (!z2) {
            this.d.a(z);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(!this.e);
        int width = getWidth();
        Drawable drawable = this.a;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float width2 = (bounds.width() * 0.325f) + bounds.left;
        float height = (bounds.height() * 0.152f) + bounds.top;
        float height2 = bounds.bottom - (bounds.height() * 0.152f);
        float width3 = bounds.right - (bounds.width() * 0.101f);
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i > 0) {
            Paint paint = this.c;
            paint.setStrokeWidth(gm.L(4.0f));
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.draw(canvas);
            if (this.e) {
                canvas.drawLine(width3 - gm.L(4.0f), height2 - gm.L(4.0f), gm.R1(width3 - gm.L(4.0f), gm.L(4.0f) + width2, d), gm.R1(height2 - gm.L(4.0f), gm.L(4.0f) + height, d), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(width2 + gm.L(4.0f), height + gm.L(4.0f), gm.R1(gm.L(4.0f) + width2, width3 - gm.L(4.0f), d), gm.R1(gm.L(4.0f) + height, height2 - gm.L(4.0f), d), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (i > 0) {
            Paint paint2 = this.b;
            paint2.setStrokeWidth(gm.L(2.0f));
            if (this.e) {
                canvas2.drawLine(width3, height2, gm.R1(width3, width2, d), gm.R1(height2, height, d), paint2);
                return;
            }
            canvas.drawLine(width2, height, gm.R1(width2, width3, d), gm.R1(height, height2, d), paint2);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(45.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(45.0f), 1073741824));
    }
}
