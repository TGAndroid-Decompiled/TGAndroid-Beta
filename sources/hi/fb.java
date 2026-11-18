package hi;

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
import org.telegram.ui.Components.lr;
public final class fb extends View implements n2 {
    public final Drawable f14663a;
    public final int f14664b;
    public Bitmap f14665c;
    public final Paint d;
    public final Paint f14666e;
    public float f14667f;
    public final org.telegram.ui.Components.c6 h;
    public final Path f14668n;

    public fb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(3);
        this.f14666e = paint2;
        this.h = new org.telegram.ui.Components.c6(this, 0L, 350L, lr.h);
        this.f14668n = new Path();
        this.f14663a = activity.getResources().getDrawable(2131231742).mutate();
        this.f14664b = 2131231741;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14665c == null) {
            this.f14665c = BitmapFactory.decodeResource(getResources(), this.f14664b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f14665c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f14665c = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.h.e(false, this.f14667f);
        Drawable drawable = this.f14663a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (e10 <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (e10 < 1.0f) {
            canvas.save();
            Path path = this.f14668n;
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
            Bitmap bitmap = this.f14665c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.f14666e);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f14663a.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.d.setColor(i0.a.f(f10, -1, -16777216));
    }

    public void setValue(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f14667f = f10;
        invalidate();
    }
}
