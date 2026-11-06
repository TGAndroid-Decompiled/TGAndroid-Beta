package fi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.xq;
public final class hb extends View implements o2 {
    public final Drawable f12147a;
    public final int f12148b;
    public Bitmap f12149c;
    public final Paint d;
    public final Paint f12150e;
    public float f12151f;
    public final org.telegram.ui.Components.w5 h;
    public final Path f12152n;

    public hb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(3);
        this.f12150e = paint2;
        this.h = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        this.f12152n = new Path();
        this.f12147a = activity.getResources().getDrawable(2131231741).mutate();
        this.f12148b = 2131231740;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12149c == null) {
            this.f12149c = BitmapFactory.decodeResource(getResources(), this.f12148b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f12149c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f12149c = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.h.e(false, this.f12151f);
        Drawable drawable = this.f12147a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (e10 <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (e10 < 1.0f) {
            canvas.save();
            Path path = this.f12152n;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * e10, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            drawable.setBounds(rect);
            drawable.draw(canvas);
            canvas.restore();
        }
        if (e10 > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * e10, this.d);
            canvas.save();
            Bitmap bitmap = this.f12149c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.f12150e);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f12147a.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.d.setColor(i0.a.f(f10, -1, -16777216));
    }

    public void setValue(boolean z9) {
        float f10;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f12151f = f10;
        invalidate();
    }
}
