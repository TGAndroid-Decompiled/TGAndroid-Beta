package hi;

import android.animation.ValueAnimator;
import android.content.Context;
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
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.lr;
public class eb extends View implements n2 {
    public final Path f14598a;
    public final Paint f14599b;
    public final Paint f14600c;
    public boolean d;
    public final org.telegram.ui.Components.c6 f14601e;
    public Drawable f14602f;
    public Bitmap h;
    public int f14603n;
    public ValueAnimator f14604r;

    public eb(Context context) {
        super(context);
        this.f14598a = new Path();
        Paint paint = new Paint(1);
        this.f14599b = paint;
        Paint paint2 = new Paint(3);
        this.f14600c = paint2;
        this.f14601e = new org.telegram.ui.Components.c6(this, 0L, 380L, lr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(v vVar, boolean z10) {
        if (this.f14602f == vVar) {
            return;
        }
        ValueAnimator valueAnimator = this.f14604r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14604r = null;
        }
        if (z10) {
            this.f14604r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f14604r.addUpdateListener(new fi.z2(this, new AtomicBoolean(), vVar, 2));
            this.f14604r.start();
            return;
        }
        setDrawable(vVar);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        this.d = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f14601e.e(true, f10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f14602f != null) {
            float d = this.f14601e.d(this.d);
            int intrinsicWidth = this.f14602f.getIntrinsicWidth();
            int intrinsicHeight = this.f14602f.getIntrinsicHeight();
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (d <= 0.0f) {
                this.f14602f.setBounds(rect);
                this.f14602f.draw(canvas);
            } else if (d < 1.0f) {
                canvas.save();
                Path path = this.f14598a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f14602f.setBounds(rect);
                this.f14602f.draw(canvas);
                canvas.restore();
            }
            if (d > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, this.f14599b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f14600c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f14603n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f14603n);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
    }

    public void setDrawable(int i7) {
        this.f14602f = getContext().getResources().getDrawable(i7).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i7 != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i7);
        }
        invalidate();
    }

    @Override
    public void setInvert(float f10) {
        Drawable drawable = this.f14602f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f14599b.setColor(i0.a.f(f10, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f14602f = drawable;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.h = createBitmap;
            drawable.setBounds(0, 0, createBitmap.getWidth(), this.h.getHeight());
            drawable.draw(new Canvas(this.h));
        }
        invalidate();
    }
}
