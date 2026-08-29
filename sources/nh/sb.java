package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class sb extends View implements o2 {
    public final Drawable f18557a;
    public final int f18558b;
    public Bitmap f18559c;
    public final Paint d;
    public final Paint f18560e;
    public float f18561f;
    public final org.telegram.ui.Components.d6 h;
    public final Path f18562n;

    public sb(Activity activity, int i10, int i11) {
        super(activity);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(3);
        this.f18560e = paint2;
        this.h = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        this.f18562n = new Path();
        this.f18557a = activity.getResources().getDrawable(i10).mutate();
        this.f18558b = i11;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18559c == null) {
            this.f18559c = BitmapFactory.decodeResource(getResources(), this.f18558b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f18559c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f18559c = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.h.d(this.f18561f, false);
        Drawable drawable = this.f18557a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (d <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (d < 1.0f) {
            canvas.save();
            Path path = this.f18562n;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * d, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            drawable.setBounds(rect);
            drawable.draw(canvas);
            canvas.restore();
        }
        if (d > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * d, this.d);
            canvas.save();
            Bitmap bitmap = this.f18559c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.f18560e);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void setInvert(float f9) {
        this.f18557a.setColorFilter(new PorterDuffColorFilter(i0.a.d(f9, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.d.setColor(i0.a.d(f9, -1, -16777216));
    }

    public void setValue(boolean z10) {
        float f9;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f18561f = f9;
        invalidate();
    }
}
