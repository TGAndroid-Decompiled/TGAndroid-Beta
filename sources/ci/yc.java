package ci;

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
import org.telegram.ui.Components.is;
public final class yc extends View implements v2 {
    public final Drawable f6375a;
    public final int f6376b;
    public Bitmap f6377c;
    public final Paint d;
    public final Paint f6378e;
    public float f6379f;
    public final org.telegram.ui.Components.g6 h;
    public final Path f6380n;

    public yc(Activity activity, int i10, int i11) {
        super(activity);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(3);
        this.f6378e = paint2;
        this.h = new org.telegram.ui.Components.g6(this, 0L, 350L, is.h);
        this.f6380n = new Path();
        this.f6375a = activity.getResources().getDrawable(i10).mutate();
        this.f6376b = i11;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6377c == null) {
            this.f6377c = BitmapFactory.decodeResource(getResources(), this.f6376b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f6377c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f6377c = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.h.d(this.f6379f, false);
        Drawable drawable = this.f6375a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (d <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (d < 1.0f) {
            canvas.save();
            Path path = this.f6380n;
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
            Bitmap bitmap = this.f6377c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.f6378e);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f6375a.setColorFilter(new PorterDuffColorFilter(i0.a.d(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.d.setColor(i0.a.d(f7, -1, -16777216));
    }

    public void setValue(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f6379f = f7;
        invalidate();
    }
}
