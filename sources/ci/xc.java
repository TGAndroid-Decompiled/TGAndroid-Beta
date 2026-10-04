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
import org.telegram.ui.Components.tr;
public final class xc extends View implements w2 {
    public final Drawable f6318a;
    public final int f6319b;
    public Bitmap f6320c;
    public final Paint d;
    public final Paint f6321e;
    public float f6322f;
    public final org.telegram.ui.Components.e6 h;
    public final Path f6323n;

    public xc(Activity activity, int i10, int i11) {
        super(activity);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(3);
        this.f6321e = paint2;
        this.h = new org.telegram.ui.Components.e6(this, 0L, 350L, tr.h);
        this.f6323n = new Path();
        this.f6318a = activity.getResources().getDrawable(i10).mutate();
        this.f6319b = i11;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6320c == null) {
            this.f6320c = BitmapFactory.decodeResource(getResources(), this.f6319b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f6320c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f6320c = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.h.d(this.f6322f, false);
        Drawable drawable = this.f6318a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (d <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (d < 1.0f) {
            canvas.save();
            Path path = this.f6323n;
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
            Bitmap bitmap = this.f6320c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.f6321e);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f6318a.setColorFilter(new PorterDuffColorFilter(i0.a.d(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.d.setColor(i0.a.d(f7, -1, -16777216));
    }

    public void setValue(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f6322f = f7;
        invalidate();
    }
}
